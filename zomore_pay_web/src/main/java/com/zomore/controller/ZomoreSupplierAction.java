package com.zomore.controller;

import com.zomore.domain.ZomoreSupplier;
import com.zomore.service.ZomoreSupplierService;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.function.Supplier;

//供应商
@Controller("zomoreSupplierAction")
@RequestMapping("zomoreSupplier")
public class ZomoreSupplierAction {
    @Resource
    private ZomoreSupplierService zomoreSupplierServiceImpl;

    //分页查询供应商
    @RequestMapping("list")
    public String selectSupplierByPage(PageResult page, Model model) {
        PageResult select = zomoreSupplierServiceImpl.select(page);
        model.addAttribute("result", page);
        return "forward:/pages/zomoreSupplier.jsp";
    }
    //添加供应商
    @RequestMapping("add")
    public String addSupplier(ZomoreSupplier zomoreSupplier){
        zomoreSupplierServiceImpl.insert(zomoreSupplier);
        return "redirect:/zomoreSupplier/list.do";
    }
    //修改供应商
    @RequestMapping("edit")
    public String editSupplier(ZomoreSupplier zomoreSupplier){
        zomoreSupplierServiceImpl.update(zomoreSupplier);
        return "redirect:/zomoreSupplier/list.do";
    }
    //根据id查找供应商（用于编辑页面的回显）
    @RequestMapping("editUI")
    public String editUISupplier(String id,Model model){
        ZomoreSupplier supplier = zomoreSupplierServiceImpl.select(id);
        model.addAttribute("result",supplier);
        return "forward:/pages/editzomoreSupplier.jsp";
    }
    //异步根据id查找供应商（用于编辑页面的回显）
    @RequestMapping("updateAjax")
    @ResponseBody
    public ZomoreSupplier updateAjax(String id){
        return zomoreSupplierServiceImpl.select(id);

    }
    //根据id删除供应商信息
    @RequestMapping("deleted")
    public String deletedSupplier(String ids){
        zomoreSupplierServiceImpl.deleted(ids);
        return "redirect:/zomoreSupplier/list.do";
    }
}
