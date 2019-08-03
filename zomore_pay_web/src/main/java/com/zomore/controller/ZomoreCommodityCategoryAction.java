package com.zomore.controller;

import com.zomore.domain.ZomoreCommodityCategory;
import com.zomore.service.ZomoreCommodityCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
//商品分类
@Controller("ZomoreCommodityCategoryAction")
@RequestMapping("zomoreCommodityCategory")
public class ZomoreCommodityCategoryAction {
    @Resource
    private ZomoreCommodityCategoryService zomoreCommodityCategoryServiceImpl;

    //查找所有商品目录
    @RequestMapping("list")
    public String selectOne(Model model) {
        List<ZomoreCommodityCategory> zomoreCommodityCategories = zomoreCommodityCategoryServiceImpl.selectAll();
        model.addAttribute("result", zomoreCommodityCategories);
        return "forward:/pages/zomoreCommodityCategory.jsp";
    }
    //根据id查找商品类目
    @RequestMapping("updateAjax")
    @ResponseBody
    public ZomoreCommodityCategory updateAjax(String id){
        return zomoreCommodityCategoryServiceImpl.selectById(id);
    }
    //修改商品目录信息
    @RequestMapping("edit")
    public String update(ZomoreCommodityCategory zomoreCommodityCategory){
        zomoreCommodityCategoryServiceImpl.updateByid(zomoreCommodityCategory);
        return "redirect:/zomoreCommodityCategory/list.do";
    }
    //添加商品目录
    @RequestMapping("add")
    public  String add(ZomoreCommodityCategory zomoreCommodityCategory){
        zomoreCommodityCategoryServiceImpl.insert(zomoreCommodityCategory);
        return "redirect:/zomoreCommodityCategory/list.do";
    }
    //删除商品目录
    @RequestMapping("deleted")
    public  String deleted(String ids){
        zomoreCommodityCategoryServiceImpl.deletedByid(ids);
        return "redirect:/zomoreCommodityCategory/list.do";
    }

}
