package com.zomore.controller;

import com.zomore.domain.ZomoreCommodityIntogoods;
import com.zomore.service.ZomoreCommodityIntogoodsService;
import com.zomore.service.ZomoreCommodityService;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

//进货
@Controller("zomoreCommodityIntogoodsAction")
@RequestMapping("zomoreCommodityIntogoods")
public class ZomoreCommodityIntogoodsAction {
    @Resource
    private ZomoreCommodityIntogoodsService zomoreCommodityIntogoodsServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    //分页查询进货
    @RequestMapping("list")
    public String selectedcByPage(PageResult page,Model model){
        PageResult<ZomoreCommodityIntogoods> result= zomoreCommodityIntogoodsServiceImpl.select(page);
        model.addAttribute("result",result);
        //查询所有商品 (用于添加和编辑选择商品)
        model.addAttribute("commoditys",zomoreCommodityServiceImpl.selectAll());
        return"forward:/pages/zomoreCommodityIntogoods.jsp";
    }
    @RequestMapping("add")
    public String add(ZomoreCommodityIntogoods zomoreCommodityIntogoods){
        zomoreCommodityIntogoodsServiceImpl.insert(zomoreCommodityIntogoods);
        return "redirect:/zomoreCommodityIntogoods/list.do";
    }
    //根据id查找进货信息
    @RequestMapping("updateAjax")
    @ResponseBody
    public ZomoreCommodityIntogoods selectedById(String id){
        return zomoreCommodityIntogoodsServiceImpl.select(id);
    }
    //根据id删除进货信息
    @RequestMapping("deleted")
    public String deletedById(String ids) {
        zomoreCommodityIntogoodsServiceImpl.deleted(ids);
        return "redirect:/zomoreCommodityIntogoods/list.do";
    }
    //根据id更新进货信息
    @RequestMapping("update")
    public  String update(ZomoreCommodityIntogoods zomoreCommodityIntogoods){
        zomoreCommodityIntogoodsServiceImpl.update(zomoreCommodityIntogoods);
        return "redirect:/zomoreCommodityIntogoods/list.do";
    }
}
