package com.zomore.controller;
import com.zomore.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller("saleController")
@RequestMapping("saleController")
public class SaleController {
    @Autowired
    private  ZomoreShoppingGuideService zomoreShoppingGuideServiceImpl;
    @Resource
    private EcharService echarServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;
    @Resource
    private WaChatService waChatServiceImpl;



    @RequestMapping("check")
    public String indexMessage(Model model)throws Exception{
        //获取营业额
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format1 = format.format(date);
        date = format.parse(format1);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String format2 = format.format(calendar.getTime());
        Date date1 = format.parse(format2);
        //获取销售额
        Map<String, Object> result = echarServiceImpl.selectShopAllin(date, date1);
        model.addAttribute("ShopAllin",result);
        //获取每日订单数
        Integer result1 = waChatServiceImpl.SelectOrder(date,date1);/*zomoreCommodityServiceImpl*/
        model.addAttribute("Order",result1);
     /*   List<Map<String, Object>> lists = echarServiceImpl.selctSaleOrderfire();
        model.addAttribute("Hot",lists);*/

        //获取五件热销商品
        List<Map<String, Object>> lists = waChatServiceImpl.selctSaleOrderfireDetailed();/*echarServiceImpl*/
        model.addAttribute("Hot",lists);


//        List<Map<String, Object>> lists1 = waChatServiceImpl.selctServiceSaleOrderfireDetailed();/*echarServiceImpl*/
//        model.addAttribute("Hot1",lists);

        //查询会员

        Integer dou1 = waChatServiceImpl.UpMemberForDay(date,date1);/*zomoreMemberServiceImpl*/
        Integer dou2 = waChatServiceImpl.UpMemberInMember();
        if(dou2 == 0){
            Integer dou = 100;
            model.addAttribute("Percentage",dou);
        }else {
            Integer dou = dou1*100/dou2;
            model.addAttribute("Percentage",dou);
        }
        /*Integer dou = dou1*100/dou2;*/
        model.addAttribute("Newmember",dou1);
        model.addAttribute("Member",dou2);
        /*   model.addAttribute("Percentage",dou);*/

        Integer money = waChatServiceImpl.selectProfit(date,date1);
        model.addAttribute("Profit",money);
        return "forward:/pages/sale.jsp";
    }



}
