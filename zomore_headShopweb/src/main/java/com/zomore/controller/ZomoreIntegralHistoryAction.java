package com.zomore.controller;

import com.zomore.domain.ZomoreIntegralHistory;
import com.zomore.service.ZomoreIntegralHistoryService;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

//积分兑换记录
@Controller("zomoreIntegralHistoryAction")
@RequestMapping("zomoreIntegralHistory")
public class ZomoreIntegralHistoryAction {
    @Resource
    private ZomoreIntegralHistoryService zomoreIntegralHistoryServiceImpl;

    //查询所有的积分记录
    @RequestMapping("list")
    public String select(PageResult<ZomoreIntegralHistory> page, Model model, HttpSession session) {
        String shop = session.getAttribute("shopName") + "";
        model.addAttribute("result", zomoreIntegralHistoryServiceImpl.select(page, shop));
        return "forward:/pages/zomoreIntegralHistory.jsp";
    }

    @RequestMapping("listAjax")
    @ResponseBody
    public PageResult<ZomoreIntegralHistory> listAjax(PageResult<ZomoreIntegralHistory> page, HttpSession session) {
        String shop = session.getAttribute("shopName") + "";
        return zomoreIntegralHistoryServiceImpl.select(page, shop);

    }

    //根据兑换类型，时间段和门店查询积分兑换记录
    @RequestMapping("searchAjax")
    @ResponseBody
    public PageResult<ZomoreIntegralHistory> searchAjax(PageResult<ZomoreIntegralHistory> page, String type, String startime, String endtime, String name, HttpSession session) {
        if (startime.equals(",")) {
            startime = null;
        }
        if (endtime.equals(",")) {
            endtime = null;
        }
        String shop = session.getAttribute("shopName") + "";
        return zomoreIntegralHistoryServiceImpl.search(page, type, startime, endtime,name, shop);
    }

    @RequestMapping("search")
    public String search(PageResult<ZomoreIntegralHistory> page, String type, String startime, String endtime,String name, Model model, HttpSession session) {
        if (startime.equals(",")) {
            startime = null;
        }
        if (endtime.equals(",")) {
            endtime = null;
        }
        String shop = session.getAttribute("shopName") + "";
        model.addAttribute("result", zomoreIntegralHistoryServiceImpl.search(page, type, startime, endtime,name, shop));
        model.addAttribute("type", type);
        model.addAttribute("name", name);
        return "forward:/pages/zomoreIntegralHistory.jsp";
    }
}
