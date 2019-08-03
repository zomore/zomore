package com.zomore.controller;

import com.alibaba.fastjson.JSONObject;
import com.zomore.service.FenpingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller("fuping")
@RequestMapping("fuping")
public class FenPingController {

    @Resource
    private FenpingService fenpingServiceImpl;

    @RequestMapping("fenpingInsert")
    @ResponseBody
    public String fenpingInsert(String name,String num,String money,String code){
         fenpingServiceImpl.InsertToTable(name,num,money,code);
         return "";

    }
    @RequestMapping("fenpingUpdate")
    @ResponseBody
    public String fenpingUpdate(String name,String num,String money,String code){
        fenpingServiceImpl.fenpingUpdate(name,num,money,code);
        return "";
    }


    @RequestMapping("fenpingOnlyForMoney")
    @ResponseBody
    public String fenpingOnlyForMoney (String zhekou){

        fenpingServiceImpl.fenpingOnlyForMoney(zhekou);
        return "";
    }
    @RequestMapping("fenpingMoneyAndNum")
    @ResponseBody
    public String fenpingMoneyAndNum (String money,String num,String code){
        fenpingServiceImpl.fenpingMoneyAndNum(money, num, code);
        return "";
    }
    @RequestMapping("fenpingDelAll")
    @ResponseBody
    public  String fenpingDelAll(){
        fenpingServiceImpl.fenpingDelAll();
        return "";
    }

    @RequestMapping("fenpingDelOne")
    @ResponseBody
    public String fenpingDelOne(String code){
        fenpingServiceImpl.fenpingDelOne(code);
        return "";
    }

    @RequestMapping("fenpingGetMsg")
    public String fenpingGetMsg(Model model, HttpSession session){
        List<Map<String,Object>> list = fenpingServiceImpl.fenpingGetMsg();
        /*model.addAttribute("fenping",list);*/
        session.setAttribute("fenping",list);
        return "forward:/reception/fuping.jsp";

    }

    @RequestMapping("fenpingGetMsg1")
    @ResponseBody
    public List<Map<String,Object>> fenpingGetMsg1(Model model, HttpSession session){
        List<Map<String,Object>> list = fenpingServiceImpl.fenpingGetMsg();
        /*model.addAttribute("fenping",list);*/
        session.setAttribute("fenping",list);
        return list;

    }


}
