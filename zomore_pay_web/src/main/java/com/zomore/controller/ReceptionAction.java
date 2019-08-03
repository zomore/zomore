package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.result.ZomoreCommodityStoreResult;
import com.zomore.service.*;
import com.zomore.utils.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller("receptionAction")
@RequestMapping("reception")
public class ReceptionAction {

    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreCommodityCategoryService zomoreCommodityCategoryServiceImpl;
    @Autowired
    private SettingService settingServiceImpl;

    //登录成功，跳转到前台主页
    @RequestMapping("list")
    public String list(Model model, HttpSession session) {
        String index = session.getAttribute("index")+"";
        if(index.equals("null")){
            session.setAttribute("index",1);
            //库存预警
            PageResult<ZomoreCommodityStoreResult> page = new PageResult<>();
            List<ZomoreCommodityStoreResult> list = new ArrayList<ZomoreCommodityStoreResult>();
            List<ZomoreCommodityStore> stores = zomoreCommodityStoreServiceImpl.select1(page.getPageNum(), page.getPageSize());
            for (ZomoreCommodityStore store : stores) {
                ZomoreCommodityStoreResult result = new ZomoreCommodityStoreResult();
                BeanUtils.copyProperties(store, result);
                //根据商品id查找商品
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectById(store.getZomoreCommodityId());
                if (commodity != null) {
                    BeanUtils.copyProperties(commodity, result);
                    //计算到期时间
                    Date zomoreCommodityProductdate = commodity.getZomoreCommodityProductdate();
                    if (zomoreCommodityProductdate != null) {
                        Integer zomoreCommodityTime = commodity.getZomoreCommodityTime();
                        Calendar begin = Calendar.getInstance();
                        begin.setTime(zomoreCommodityProductdate);
                        if (zomoreCommodityTime != null && !zomoreCommodityTime.equals(""))
                            begin.add(Calendar.DAY_OF_MONTH, zomoreCommodityTime);
                        result.setZomoreCommodityProductdate(begin.getTime());
                        Date date = new Date();
                        if (date.getTime() > begin.getTime().getTime()) {
                            result.setZomoreCommodityLaber1("已过期");
                        } else {
                            long daysBetween = (begin.getTime().getTime() - date.getTime() + 1000000) / (60 * 60 * 24 * 1000);
                            result.setZomoreCommodityLaber1("保质期还有" + daysBetween + "天");
                        }
                    } else {
                        result.setZomoreCommodityLaber1("-");
                    }
                }

                list.add(result);
            }
            page.setItems(list);
            model.addAttribute("result", page);
        }else {
            session.setAttribute("index",Integer.parseInt(index)+1);
        }
        //启动交接班弹窗
        String shop=""+session.getAttribute("shopName");
        String number=""+session.getAttribute("cashierNumber");
        //备用金
        String readycash=session.getAttribute("bank")+"";
        if(readycash.equals("已经存在")){
            CashierGenralSetting cashierGenralSetting= new CashierGenralSetting();
            cashierGenralSetting.setStandbyfund(0);
            model.addAttribute("cashierGenralSetting",cashierGenralSetting);
        }
        else{
            CashierGenralSetting cashierGenralSetting=settingServiceImpl.selectAllGenralSetting(shop,number);
            model.addAttribute("cashierGenralSetting",cashierGenralSetting);
            session.setAttribute("shoppingguide",cashierGenralSetting.getShoppingguide());
            session.setAttribute("setrepeat",cashierGenralSetting.getSetrepeat());
            //会员生日提醒
            CashierFunctionSetting cashierFunctionSetting =settingServiceImpl.selectAllFunctionSetting(shop,number);
            session.setAttribute("itemNum",cashierFunctionSetting.getItemNum());
            session.setAttribute("memberBirthday",cashierFunctionSetting.getMemberBirthday()+"");
            CashierPrintSetting cashierPrintSetting =settingServiceImpl.selectAllPrintSetting(shop,number);
            session.setAttribute("printnumber",cashierPrintSetting.getPrintnumber()+"");
        }

        List<ZomoreMember> zomoreMemberList=zomoreMemberServiceImpl.selectMemberGetBirthday();
        model.addAttribute("memberbirthdayNum",zomoreMemberList.size());

        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        return "forward:/reception/index.jsp";
    }


}
