package com.zomore.controller;

import com.zomore.dao.HeadShopDao;
import com.zomore.domain.HeadShop;
import com.zomore.domain.Shop;
import com.zomore.service.AdminService;
import com.zomore.service.HeadShopService;
import com.zomore.service.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/headShop")
public class HeadShopController {
    @Autowired
    private HeadShopService headShopService;

    @Autowired
    private HeadShopDao headShopDao;
    @Autowired
    private AdminService adminService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private SuperAdminService superAdminService;

    //根据角色查询直营店信息
    @RequestMapping("/findByRole2.do")
    public ModelAndView findByRole2(Integer role) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<HeadShop> userlist = headShopService.findByRole2(role);
        mv.addObject("headShop", userlist);
        mv.setViewName("shop1-list");
        return mv;
    }

    //根据角色查询加盟店信息
    @RequestMapping("/findByRole3.do")
    public ModelAndView findByRole3(Integer role) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<HeadShop> userlist = headShopService.findByRole3(role);
        mv.addObject("headShop", userlist);
        mv.setViewName("shop2-list");
        return mv;
    }

    //登陆成功后根据role权限跳转不同管理系统 已修改
    @RequestMapping("/login.do")
    public String login(HeadShop headShop, HttpSession session) throws Exception {
        //获取登录人信息
        SecurityContext sc = SecurityContextHolder.getContext();
        Authentication auth = sc.getAuthentication();
        User user = (User) auth.getPrincipal();
        String username = user.getUsername();
        HeadShop byUsername = headShopDao.findByUsername(username);
        String shopName = byUsername.getShopName();
        session.setAttribute("shopName", shopName);
        session.setAttribute("shop", byUsername);
        Long multipleId = byUsername.getMultipleId();
        session.setAttribute("multipleId", multipleId);
        Long shopId = byUsername.getShopId();
        session.setAttribute("shopId", shopId);
        //获取登录人角色
        Integer role = byUsername.getRole();
        if (role == 1) {
            return "redirect:/pages/index.jsp";
            /* return "forward:/pages/main-head.jsp";*/
        } else if (role > 1 && role <= 4) {
            return "redirect:/loginController/select.do";
        } else {
            return "foward:/pages/failer.jsp";
        }

    }

    //*退出当前店铺
    @RequestMapping("/logout.do")
    public String logout(HttpSession session) {
        Enumeration e = session.getAttributeNames();
        while (e.hasMoreElements()){
            String sessionName = (String) e.nextElement();
            session.removeAttribute(sessionName);
        }
        return "redirect:/pages/login.jsp";
    }
   /* //查询所有门店 已修改
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception{
        ModelAndView mv = new ModelAndView();
        List<HeadShop> headShopList = headShopService.findAll();
        mv.addObject("headShopList",headShopList);
        mv.setViewName("main-head");
        return mv;
    }*/

    /* //新增门店 已修改
     @RequestMapping("/save.do")
     public String save(HeadShop headShop) throws Exception{
         Long l = System.currentTimeMillis();
         headShop.setHeadId(l);
          headShopService.save(headShop);
         Long multipleId = headShop.getMultipleId();
         return "redirect:findShopByMultipleId.do?multipleId="+multipleId;
     }*/
    //新增属于自己旗下的店铺
    @RequestMapping("/saveShopBelongMultiple.do")
    public String saveShopBelongMultiple(Shop shop, HeadShop headShop) throws Exception {
        Long multipleId = shop.getMultipleId();
        shop.setMultipleId(multipleId);
        headShop.setMultipleId(multipleId);
        Long l = System.currentTimeMillis();
        shop.setShopId(l);
        headShop.setShopId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        headShop.setHeadId(g);
        shop.setPassword(passwordEncoder.encode(shop.getPassword()));
        headShop.setPassword(passwordEncoder.encode(headShop.getPassword()));
        superAdminService.saveHead(headShop);
        superAdminService.saveShopBelongMultiple(shop);
        ModelAndView mv = new ModelAndView();
        mv.addObject("multipleId", multipleId);
        return "redirect:findShopByMultipleId.do?multipleId=" + multipleId;
    }

    //修改店铺信息  已修改
    @RequestMapping("/updateShopById.do")
    public String updateShopById(Shop shop, HeadShop headShop) throws Exception {
        headShop.setPassword(passwordEncoder.encode(headShop.getPassword()));
        shop.setPassword(passwordEncoder.encode(shop.getPassword()));
        headShopService.updateShopById(headShop);
        headShopService.updateShopshopById(shop);
        Long multipleId = shop.getMultipleId();
        return "redirect:findShopByMultipleId.do?multipleId=" + multipleId;


    }

    //根据ID回显店铺信息  已修改
    @RequestMapping("/findShopByShopId.do")
    public String findShopByShopId(Model model, Long shopId) throws Exception {
        Shop shop = headShopService.findShopByShopId(shopId);
        model.addAttribute("shop", shop);
        Long multipleId = shop.getMultipleId();

        return "forward:/pages/shop-update.jsp";
    }

    //返回属于自己旗下的门店
    @RequestMapping("/findShopByMultipleId.do")
    public ModelAndView findShopByMultipleId(Long multipleId) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Shop> shopList = headShopService.findShopByMultipleId(multipleId);
        mv.addObject("shopList", shopList);
        mv.setViewName("main-head");
        return mv;


    }


}
