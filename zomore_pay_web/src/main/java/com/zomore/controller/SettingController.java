package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("setting")
public class SettingController {
    @Autowired
    private SettingService settingServiceImpl;

    //查询设置
@RequestMapping("/settingIndex.do")
    public String selectAllSetting(HttpSession session, Model model){
    String shop=""+session.getAttribute("shopName");
    String number=""+session.getAttribute("cashierNumber");
    //查询通用设置
    CashierGenralSetting cashierGenralSetting=settingServiceImpl.selectAllGenralSetting(shop,number);
    model.addAttribute("cashierGenralSetting",cashierGenralSetting);
    //查询功能设置
    CashierFunctionSetting cashierFunctionSetting=settingServiceImpl.selectAllFunctionSetting(shop,number);
    model.addAttribute("cashierFunctionSetting",cashierFunctionSetting);
    //查询小票打印设置
    CashierPrintSetting cashierPrintSetting=settingServiceImpl.selectAllPrintSetting(shop,number);
    model.addAttribute("cashierPrintSetting",cashierPrintSetting);
    //查询广告设置
    CashierAdvertSetting cashierAdvertSetting=settingServiceImpl.selectAllAdvertSetting(shop,number);
    model.addAttribute("cashierAdvertSetting",cashierAdvertSetting);
    return "forward:/reception/settings.jsp";
}
//更新通用设置到数据库
@RequestMapping("updataGenral")
@ResponseBody
    public String updataGenral(CashierGenralSetting genralSetting,HttpSession session){
    settingServiceImpl.updataGenralSetting(genralSetting);
    if(genralSetting.getShoppingguide()!=null){
        session.setAttribute("shoppingguide",genralSetting.getShoppingguide());
    }
    if(genralSetting.getSetrepeat()!=null){
        session.setAttribute("setrepeat",genralSetting.getSetrepeat());
    }
    return "success";
}

    //更新通用设置到数据库
    @RequestMapping("updataFunction")
    @ResponseBody
    public String updataFunction(CashierFunctionSetting functionSetting,HttpSession session){
        settingServiceImpl.updataFunctionSetting(functionSetting);
        if (functionSetting.getMemberBirthday()!=null){
            session.setAttribute("memberBirthday",functionSetting.getMemberBirthday());
        }
        if (functionSetting.getItemNum()!=null){
            session.setAttribute("itemNum",functionSetting.getItemNum());
        }
        return "success";
    }

    //查询小票打印设置
    //更新通用设置到数据库
    @RequestMapping("updataPrint")
    @ResponseBody
    public String updataPrint(CashierPrintSetting cashierPrintSetting,HttpSession session){
        settingServiceImpl.updataPrintSetting(cashierPrintSetting);
        if (cashierPrintSetting.getPrintnumber()!=null){
            session.setAttribute("memberBirthday",cashierPrintSetting.getPrintnumber());
        }
        return "success";
    }
    //查询广告设置

    @RequestMapping("updataSession")
    @ResponseBody
    public String updataSession(HttpSession session){

         //同步权限设置
        String CashierNumber = session.getAttribute("cashierNumber")+"";
        String headshopaccount= session.getAttribute("shopAccount")+"";
        ZomoreCashierBeforeRight zomoreCashierBeforeRight = new ZomoreCashierBeforeRight();
        zomoreCashierBeforeRight.setCashiernum(CashierNumber);
        zomoreCashierBeforeRight.setHeadshopnum(headshopaccount);
        List<ZomoreCashierBeforeRight> zomoreCashierBeforeRights = settingServiceImpl.selectCashierBeforeRight(zomoreCashierBeforeRight);
        if(zomoreCashierBeforeRights!=null&zomoreCashierBeforeRights.size()>0){
            session.setAttribute("zomoreCashierBeforeRight",zomoreCashierBeforeRights.get(0));
        }

    return "success";
    }




}
