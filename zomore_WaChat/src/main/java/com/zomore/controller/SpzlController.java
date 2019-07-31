package com.zomore.controller;

import com.zomore.result.ZomoreCommodityResult;
import com.zomore.service.WaChatService;
import com.zomore.service.ZomoreCommodityCategoryService;
import com.zomore.service.ZomoreCommodityService;
import com.zomore.service.ZomoreSupplierService;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("spzlController")
public class SpzlController {
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityCategoryService zomoreCommodityCategoryServiceImpl;
    @Resource
    private ZomoreSupplierService zomoreSupplierServiceImpl;

    @Resource
    private WaChatService waChatServiceImpl;

    @RequestMapping("list")
    public String selectByPage(/*PageResult<ZomoreCommodityResult> page,*/ Model model){
       /* PageResult<ZomoreCommodityResult> results = waChatServiceImpl.selectByPage(page);*/
        List<Map<String,Objects>> results = waChatServiceImpl.selectSimple();
     /*  PageResult<ZomoreCommodityResult> results = zomoreCommodityServiceImpl.selectByPage(page);*/
    /*    if(page.getPageSize()>0){
            page.setPageSize((int)page.getTotalCount());
        }*/
      model.addAttribute("result",results);
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        //保存供货商用于编辑和添加动态选择
        model.addAttribute("suppliers", zomoreSupplierServiceImpl.select());
        return "forward:/pages/spzl.jsp";
    }

    @RequestMapping("listAjax")
    @ResponseBody
    public PageResult<ZomoreCommodityResult> listAjax(PageResult<ZomoreCommodityResult> page){
        System.out.print("测试");
        return zomoreCommodityServiceImpl.selectByPage(page);
    }

    //按条件查询库存信息
/*    @RequestMapping("selectBytype")
    public String selectBytype(PageResult<ZomoreCommodityResult>  page, String type, Model model, String code, String suplier) {
        if (type.equals("") || type == null) {
            if (code == null||code.equals(""))
                return "redirect:/spzlController/list.do";
        }
        PageResult<ZomoreCommodityResult> results = zomoreCommodityServiceImpl.selectByType(page, type, code, suplier);
        model.addAttribute("result", page);
        model.addAttribute("type", type);
        model.addAttribute("code", code);
        model.addAttribute("supplier", suplier);

        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        //保存供货商用于编辑和添加动态选择
        model.addAttribute("suppliers", zomoreSupplierServiceImpl.select());
        return "forward:/pages/Spzl.jsp";
    }*/
    @RequestMapping("selectBytype")
    public String SelectBytype(HttpServletRequest request, Model model)throws  Exception{
        request.setCharacterEncoding("utf-8");
        String selectBytype = request.getParameter("selectBytype");
        //String selectBytype = new String(request.getParameter("selectBytype").getBytes("ISO8859-1"), "UTF-8");
        //selectBytype = new String(selectBytype.getBytes("ISO8859-1"), "UTF-8");
        List<Map<String,Objects>> results = waChatServiceImpl.selectBytype(selectBytype);
        model.addAttribute("type",selectBytype);
        model.addAttribute("result",results);
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        return "forward:/pages/spzl.jsp";
    }

    @RequestMapping("selectNum")
    public String SelectNumCode(String code, Model model)throws  Exception{
        code = new String(code.getBytes("ISO8859_1"), "UTF-8");
        List<Map<String,Objects>> results = waChatServiceImpl.selectSimpleNum(code);
        model.addAttribute("result",results);
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        return "forward:/pages/spzl.jsp";
    }

    @RequestMapping("selectWord")
    public String SelectWordCode(String code, Model model)throws  Exception{
         code = new String(code.getBytes("ISO8859_1"), "UTF-8");

        List<Map<String,Objects>> results = waChatServiceImpl.selectSimpleWord(code);
        model.addAttribute("result",results);
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        return "forward:/pages/spzl.jsp";
    }
/*

    //按条件查询库存信息
    @RequestMapping("selectBytypeAjax")
    @ResponseBody
    public PageResult<ZomoreCommodityResult> selectBytypeAjax(PageResult<ZomoreCommodityResult>  page, String type, Model model, String code, String suplier) {
        if (type.equals("") || type == null) {
            if (code == null||code.equals(""))
                return zomoreCommodityServiceImpl.selectByPage(page);
        }
        return zomoreCommodityServiceImpl.selectByType(page, type, code, suplier);

    }*/
}
