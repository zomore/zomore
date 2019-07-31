package com.zomore.controller;

import com.zomore.domain.HeadShop;
import com.zomore.service.HeadShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    private HeadShopService headShopServiceImpl;

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpSession session) throws Exception {
        request.setCharacterEncoding("UTF-8");
        String headId = request.getParameter("headId");
        HeadShop headShop = headShopServiceImpl.findHeadshopById2(Long.valueOf(headId));
        session.setAttribute("isCommodity",headShop);
        return "redirect:/pages/index.jsp";
    }
}
