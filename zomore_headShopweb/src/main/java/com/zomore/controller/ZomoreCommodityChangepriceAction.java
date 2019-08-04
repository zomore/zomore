package com.zomore.controller;

import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommodityChangeprice;
import com.zomore.domain.ZomoreServiceCommodity;
import com.zomore.domain.ZomoreServiceCommodityChangeprice;
import com.zomore.result.ZomoreCommodityResult;
import com.zomore.result.ZomoreServiceCommodityResult;
import com.zomore.service.ZomoreCommodityCategoryService;
import com.zomore.service.ZomoreCommodityChangepriceService;
import com.zomore.service.ZomoreCommodityService;
import com.zomore.utils.PageResult;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

//调价单
@Controller("zomoreCommodityChangepriceAction")
@RequestMapping("zomoreCommodityChangeprice")
public class ZomoreCommodityChangepriceAction {
    @Resource
    private ZomoreCommodityChangepriceService zomoreCommodityChangepriceServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityService;
    @Resource
    private ZomoreCommodityCategoryService zomoreCommodityCategoryServiceImpl;

    //查询所有调价单
    @RequestMapping("list")
    public String select(PageResult<ZomoreCommodityChangeprice> page, Model model) {
        PageResult<ZomoreCommodityChangeprice> select = zomoreCommodityChangepriceServiceImpl.select(page);

        model.addAttribute("result", select);
        //查询前10条商品
        model.addAttribute("result1", zomoreCommodityService.selectByPage(1, 10));
        //查询所有商品分类
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());

        return "forward:/pages/zomoreCommodityChangeprice.jsp";
    }

    @RequestMapping("listAjax")
    @ResponseBody
    public PageResult<ZomoreCommodityChangeprice> listAjax(PageResult<ZomoreCommodityChangeprice> page) {
        PageResult<ZomoreCommodityChangeprice> select = zomoreCommodityChangepriceServiceImpl.select(page);
        return select;
    }

    //添加调价单
    @RequestMapping("add")
    public String add(ZomoreCommodityChangeprice zomoreCommodityChangeprice, String[] ids, HttpSession session) {
        String id = System.currentTimeMillis() + "";
        zomoreCommodityChangeprice.setId(id);
        String shopName = (String) session.getAttribute("shopName");
        zomoreCommodityChangeprice.setShop(shopName);
        zomoreCommodityChangeprice.setUseshop(shopName);
        zomoreCommodityChangeprice.setEmployee(shopName);
        zomoreCommodityChangeprice.setNum(ids.length);
        zomoreCommodityChangepriceServiceImpl.insert(zomoreCommodityChangeprice, ids);
        session.setAttribute("CommodityChangepriceId", id);
        return "redirect:/zomoreCommodityChangeprice/list1.do";
    }

    @RequestMapping("deleted")
    public String deleted(String id) {
        zomoreCommodityChangepriceServiceImpl.deleted(id);
        return "redirect:/zomoreCommodityChangeprice/list.do";
    }

    //点击详情，根据订单id查看所有的商品
    @RequestMapping("list1")
    public String select1(Model model, HttpSession session, String id) {
        if (id == null) {
            id = session.getAttribute("CommodityChangepriceId") + "";
        }
        ZomoreCommodityChangeprice select = zomoreCommodityChangepriceServiceImpl.select(id);
        List<ZomoreCommodityResult> list = zomoreCommodityChangepriceServiceImpl.selectByChangepriceOrderid(id);
        model.addAttribute("result", list);
        model.addAttribute("result1", select);
        return "forward:/pages/zomoreCommodityChangepricelist.jsp";
    }

    //根据商品id修改零售价
    @RequestMapping("updateprice")
    @ResponseBody
    public String updateprice(String commodityid, Double price, String orderid) {
        zomoreCommodityChangepriceServiceImpl.updateprice(commodityid, price, orderid);
        return "success";
    }

    //点击保存，修改调价单的状态和调价商品的金额
    @RequestMapping("update")
    public String update(ZomoreCommodityChangeprice zomoreCommodityChangeprice) {
        zomoreCommodityChangeprice.setStatus(1);
        zomoreCommodityChangepriceServiceImpl.update(zomoreCommodityChangeprice);
        return "redirect:/zomoreCommodityChangeprice/list.do";
    }

    //根据时间段和门店查询调价单
    @RequestMapping("search")
    public String search(PageResult<ZomoreCommodityChangeprice> page,String starttime, String endtime, HttpSession session, Model model) {
        if (starttime.equals(",")) {
            starttime = null;
        }
        if (endtime.equals(",")) {
            endtime = null;
        }
        String shop =session.getAttribute("shopName")+"";
        PageResult<ZomoreCommodityChangeprice> select = zomoreCommodityChangepriceServiceImpl.select(page,starttime, endtime, shop);
        model.addAttribute("result", select);
        //商品
        model.addAttribute("result1", zomoreCommodityService.selectByPage(1, 10));
        //查询所有商品分类
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        model.addAttribute("starttime", starttime);
        model.addAttribute("endtime", endtime);
        model.addAttribute("shop", shop);
        return "forward:/pages/zomoreCommodityChangeprice.jsp";
    }
    //异步根据时间段和门店查询调价单
    @RequestMapping("searchAjax")
    @ResponseBody
    public PageResult<ZomoreCommodityChangeprice> searchAjax(PageResult<ZomoreCommodityChangeprice> page,String starttime, String endtime, String shop, Model model) {
        if (starttime.equals(",")) {
            starttime = null;
        }
        if (endtime.equals(",")) {
            endtime = null;
        }
        return zomoreCommodityChangepriceServiceImpl.select(page,starttime, endtime, shop);
    }

}
