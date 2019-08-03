package com.zomore.controller;
/*
 * 2019/3/11
 * 禤文豪
 * */

import com.zomore.domain.*;
import com.zomore.service.AdminService;
import com.zomore.service.HeadShopService;
import com.zomore.service.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/superAdmin")
public class SuperAdminController {

    @Autowired
    private SuperAdminService superAdminService;
    @Autowired
    private HeadShopService headShopService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    //查询所有管理员 已修改
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Admin> adminList = superAdminService.findAll();
        mv.addObject("adminList", adminList);
        mv.setViewName("admin-main");
        return mv;
    }

    //查找所有连锁总部
    @RequestMapping("/findAllMultiple.do")
    public ModelAndView findAllMultiple() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Multiple> multipleList = superAdminService.findAllMultiple();
        mv.addObject("multipleList", multipleList);
        mv.setViewName("multiple-main");
        return mv;
    }

    //查询所有商铺
    @RequestMapping("/findAllShop.do")
    public ModelAndView findAllShop() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Shop> shopList = superAdminService.findAllShop();
        mv.addObject("shopList", shopList);
        mv.setViewName("shop-main");
        return mv;

    }

    //超管开通管理员账号 已修改
    @RequestMapping("/saveAdmin.do")
    public String saveAdmin(Admin admin) throws Exception {
        superAdminService.saveAdmin(admin);
        return "redirect:findAll.do";


    }

    //新增店铺账号  已修改
    @RequestMapping("/saveHead.do")
    public String saveHead(HeadShop headShop) throws Exception {

        adminService.saveHead(headShop);
        return "redirect:findAllShop.do";

    }


    /* //开通单店管理员账号
     @RequestMapping("/saveShop")
     public String saveShop(Users users) throws Exception {
         superAdminService.saveShop(users);
         return "redirect:findAll.do";
     }
 */
    //根据level查询不同等级的管理员信息 已修改
    @RequestMapping("/findByLevel.do")
    public ModelAndView findByLevel(Integer level) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Admin> adminList = superAdminService.findByLevel(level);
        mv.addObject("adminList", adminList);
        mv.setViewName("admin-list");
        return mv;
    }

    /* //查询所有商铺 已修改
     @RequestMapping("/findAllShop.do")
     public ModelAndView findAllShop() throws Exception{
         ModelAndView mv = new ModelAndView();
         List<HeadShop> headShopList = adminService.findAllHead();
         mv.addObject("headList",headShopList);
         mv.setViewName("shop-main");
         return mv;

     }*/
    //根据角色查询门店信息 已修改
    @RequestMapping("/findByRole")
    public ModelAndView findByRole(@RequestParam(name = "role", required = true) String role) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Shop> shopList = adminService.findByRole(role);
        mv.addObject("shopList", shopList);
        mv.setViewName("shop-main");
        return mv;

    }

    //根据ID回显连锁店信息  已修改
    @RequestMapping("/findMultipleById.do")
    public String findMultipleById(Model model, Long multipleId) throws Exception {
        Multiple multiple = headShopService.findMultipleById(multipleId);
        model.addAttribute("multiple", multiple);
        return "forward:/pages/multiple-update.jsp";
    }

    //根据ID回显商铺信息  已修改
    @RequestMapping("/findShopById.do")
    public String findShopById(Model model, Long shopId) throws Exception {
        Shop shop = headShopService.findShopById(shopId);
        model.addAttribute("shop", shop);
        return "forward:/pages/shop-update.jsp";
    }

    //修改商铺信息  已修改
    @RequestMapping("/updateShopById.do")
    public String updateShopById(Shop shop, HeadShop headShop) throws Exception {
        headShop.setPassword(passwordEncoder.encode(headShop.getPassword()));
        shop.setPassword(passwordEncoder.encode(shop.getPassword()));
        headShopService.updateShopshopById(shop);
        headShopService.updateShopById(headShop);
        Long multipleId = shop.getMultipleId();
        return "redirect:findShopBymultipleId.do?multipleId="+multipleId;


    }

    //修改连锁店信息  已修改
    @RequestMapping("/updateMultipleById.do")
    public String updateMultipleById(Multiple multiple, HeadShop headShop) throws Exception {
        headShop.setPassword(passwordEncoder.encode(headShop.getPassword()));
        multiple.setPassword(passwordEncoder.encode(multiple.getPassword()));
        headShopService.updateMultipleById(multiple);
        headShopService.updateHeadById(headShop);
        return "redirect:findAllMultiple.do";


    }

    //根据ID回显管理员信息  已修改
    @RequestMapping("/findAdminById.do")
    public String findAdminById(Model model, Long adminId) throws Exception {
        Admin admin = adminService.findAdminById(adminId);
        model.addAttribute("admin", admin);


        return "forward:/pages/admin-update.jsp";
    }

    //修改管理员信息  已修改
    @RequestMapping("/updateAdminById.do")
    public String updateAdminById(Admin admin) throws Exception {
        adminService.updateAdminById(admin);
        return "redirect:findAll.do";
    }


    //新增连锁总部账号
    @RequestMapping("/saveMultiple.do")
    public String saveMultiple(Multiple multiple, HeadShop headShop) throws Exception {
        multiple.setPassword(passwordEncoder.encode(multiple.getPassword()));
        headShop.setPassword(passwordEncoder.encode(headShop.getPassword()));
        Long l = System.currentTimeMillis();
        multiple.setMultipleId(l);
        headShop.setMultipleId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        headShop.setHeadId(g);
        adminService.saveHead(headShop);
        superAdminService.saveMultiple(multiple);
        return "redirect:findAllMultiple.do";


    }

    //新增单店账号
    @RequestMapping("/saveSingleShop.do")
    public String saveSingleShop(Shop shop, HeadShop headShop) throws Exception {
        shop.setPassword(passwordEncoder.encode(shop.getPassword()));
        headShop.setPassword(passwordEncoder.encode(headShop.getPassword()));
        Long l = System.currentTimeMillis();
        headShop.setShopId(l);
        shop.setShopId(l);
        Long g = System.currentTimeMillis();
        headShop.setHeadId(g);
        adminService.saveHead(headShop);
        superAdminService.saveSingleShop(shop);
        return "redirect:findAllShop.do";


    }

    //新增关联连锁总部的商铺
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
        return "redirect:findShopBymultipleId.do?multipleId="+multipleId;
    }

    //查询各个连锁总部所属店铺
    @RequestMapping("/findShopBymultipleId.do")
    public ModelAndView findShopByMultipleId(Long multipleId) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Shop> shopList = superAdminService.findShopByMultipleId(multipleId);
        mv.addObject("multipleId", multipleId);
        mv.addObject("shopList", shopList);
        mv.setViewName("multiple-shop-main");
        return mv;


    }


}
