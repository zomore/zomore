package com.zomore.controller;

import com.zomore.domain.ZomoreShoppingGuide;
import com.zomore.service.ZomoreCommoditySaleService;
import com.zomore.service.ZomoreShoppingGuideService;
import com.zomore.utils.GuidCommodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller("ShopGuideContrller")
@RequestMapping("shopGuide")
public class ShopGuideContrlller {

    @Autowired
    private ZomoreShoppingGuideService zomoreShoppingGuideServiceImpl;
    @Autowired
    private ZomoreCommoditySaleService zomoreCommoditySaleServiceImpl;

    @RequestMapping("getGuide")
    public String selectGuidData(Model model, HttpSession session ) throws Exception{
        //店内所有员工
        List<ZomoreShoppingGuide> shoppingGuides = zomoreShoppingGuideServiceImpl.selectAll();

        ZomoreShoppingGuide guide = new ZomoreShoppingGuide();
        guide.setShoppingGuideCashierStore(session.getAttribute("shopName")+"");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format1 = format.format(date);
        date = format.parse(format1);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String format2 = format.format(calendar.getTime());
        Date date1 = format.parse(format2);
        //封装排行数据
        List<Map<String,Object>> mapList = new ArrayList<>();
        //今日店内提成排名
        List<GuidCommodity> commodityList = zomoreCommoditySaleServiceImpl.selectGuideTotalSaleComodity(guide,date, date1);

        if(commodityList!=null&&commodityList.size()>0){
            for(int i=0;i<shoppingGuides.size();i++){
                //是否存在标志
                boolean bank =false;
               Map<String,Object> map =new HashMap<>();
                for(int j=0;j<commodityList.size();j++){
                    if(shoppingGuides.get(i).getShoppingGuideName().equals(commodityList.get(j).getGuidName())){
                        map.put("guide",shoppingGuides.get(i));
                        map.put("ticheng",commodityList.get(j).getRoyalty());
                        mapList.add(map);
                        bank=true;
                        break;
                    }
                }
                //该导购今天还没有数据
                if(!bank){
                    map.put("guide",shoppingGuides.get(i));
                    map.put("ticheng","0");
                    mapList.add(map);
                }
            }

        }

        //重新进行排序
        if(mapList.size()>0){
            for(int i=mapList.size()-1;i>0;i--){
                for(int j=0;j<i;j++ ){
                    String ticheng1 =String.valueOf(mapList.get(i).get("ticheng"));
                    String ticheng2 =String.valueOf(mapList.get(j).get("ticheng"));
                    if(Double.parseDouble(ticheng1)>Double.parseDouble(ticheng2)){
                        Map<String,Object> map=mapList.get(j);
                        mapList.set(j,mapList.get(i));
                        mapList.set(i,map);
                    }

                }
            }
        }
        model.addAttribute("mapList",mapList);

        model.addAttribute("commodityList",commodityList);
        model.addAttribute("shoppingGuides",shoppingGuides);

        return "forward:/pages/rankinglist.jsp";

    }
}
