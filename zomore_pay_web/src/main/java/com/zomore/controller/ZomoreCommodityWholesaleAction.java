package com.zomore.controller;

import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommodityStore;
import com.zomore.domain.ZomoreCommodityWholesale;
import com.zomore.domain.ZomoreCommodityWholesaleCommodity;
import com.zomore.result.ZomoreCommodityResult;
import com.zomore.result.ZomoreCommodityWholesaleResult;
import com.zomore.service.*;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

//批发
@Controller("zomoreCommodityWholesaleAction")
@RequestMapping("zomoreCommodityWholesale")
public class ZomoreCommodityWholesaleAction {
    @Resource
    private ZomoreCommodityWholesaleService zomoreCommodityWholesaleServiceImpl;
    @Resource
    private ZomoreCommodityWholesaleCommodityService zomoreCommodityWholesaleCommodityServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreCommodityCategoryService zomoreCommodityCategoryServiceImpl;

    //批发
    @RequestMapping("list")
    public String select(Model model) {
        //商品分类
        model.addAttribute("commodityCategoryresult", zomoreCommodityCategoryServiceImpl.selectAll());
        //商品
        model.addAttribute("commodityresult", zomoreCommodityServiceImpl.selectByPage(1, 10));
        return "forward:/pages/zomoreCommodityWholesale.jsp";
    }

    //点击添加商品返回的页面(批发详情页面)
    @RequestMapping("list1")
    public String select1(Model model, HttpSession session, String id, Integer stype) {
        //商品分类
        model.addAttribute("commodityCategoryresult", zomoreCommodityCategoryServiceImpl.selectAll());
        //商品
        model.addAttribute("commodityresult", zomoreCommodityServiceImpl.selectByPage(1, 10));
        //把数据取出显示
        if (id == null) {
            id = session.getAttribute("wholesaleOrderId") + "";
        } else {
            session.setAttribute("wholesaleOrderId", id);
        }
        ZomoreCommodityWholesale zomoreCommodityWholesale=zomoreCommodityWholesaleServiceImpl.select(id);
        if(stype==null){
            stype= zomoreCommodityWholesale.getZomoreCommodityWholesaleCommodityType();
        }
        //批发订单数据
        model.addAttribute("wholesale", zomoreCommodityWholesale);
        //批发商品数据
        model.addAttribute("wholesaleCommodity", zomoreCommodityWholesaleCommodityServiceImpl.selectByorderId(id));
        if (stype == 0) {
            return "forward:/pages/zomoreCommodityWholesale.jsp";
        } else {
            return "forward:/pages/zomoreCommodityWholesaleReturn.jsp";
        }
    }

    //查找所有的批发订单
    @RequestMapping("list2")
    public String select2(Model model, HttpSession session,PageResult<ZomoreCommodityWholesaleResult> page) {
        //查询所有的批发单据
        model.addAttribute("result", zomoreCommodityWholesaleServiceImpl.select(page));
        session.removeAttribute("wholesaleOrderId");
        return "forward:/pages/zomoreCommodityWholesaleList.jsp";
    }
/*

    //批发汇总表
    @RequestMapping("list3")
    public String select3(Model model) {
        model.addAttribute("result", zomoreCommodityWholesaleServiceImpl.select());
        return "forward:/pages/zomoreCommodityWholesaleListAll.jsp";
    }
*/


    //批发退货
    @RequestMapping("list4")
    public String select4(Model model) {
        //商品分类
        model.addAttribute("commodityCategoryresult", zomoreCommodityCategoryServiceImpl.selectAll());
        //商品
        model.addAttribute("commodityresult", zomoreCommodityServiceImpl.selectByPage(1, 10));
        return "forward:/pages/zomoreCommodityWholesaleReturn.jsp";
    }

    //根据商品id修改批发订单商品的批发数量
    @RequestMapping("updateWholesale")
    @ResponseBody
    public String updateWholesale(String commodityid, Integer num) {
        zomoreCommodityWholesaleCommodityServiceImpl.update(commodityid, num);
        return "success";
    }

    //根据商品id修改批发订单商品的批发单价
    @RequestMapping("updateWholesaleprice")
    @ResponseBody
    public String updateWholesaleprice(String commodityid, Double price) {
        zomoreCommodityWholesaleCommodityServiceImpl.update(commodityid, price);
        return "success";
    }

    //根据商品id修改批发订单商品的赠送数量
    @RequestMapping("updateWholesalegivenum")
    @ResponseBody
    public String updateWholesalegivenum(String commodityid, Integer num) {
        zomoreCommodityWholesaleCommodityServiceImpl.updategivenum(commodityid, num);
        return "success";
    }

    //保存批发订单/退货订单
    @RequestMapping("insertWholesale")
    public String insertWholesale(String id) {
        //根据批发单据id查找单据，判断是订货还是退货
        ZomoreCommodityWholesale select = zomoreCommodityWholesaleServiceImpl.select(id);
        Integer type = select.getZomoreCommodityWholesaleCommodityType();

        //根据批发订单id查询所有的批发商品
        List<ZomoreCommodityResult> results = zomoreCommodityWholesaleCommodityServiceImpl.selectByorderId(id);
        Integer store = 0;
        Integer store2 = 0;

        //减少库存
        if (type == 0) {
            for (ZomoreCommodityResult result : results) {
                store = result.getZomoreCommodityWholesaleCommodityNum() + result.getZomoreCommodityWholesaleCommodityGivenum();
                String zomoreCommodityId = result.getZomoreCommodityId();
                ZomoreCommodityStore store1 = zomoreCommodityStoreServiceImpl.selectByCommodityId(zomoreCommodityId);
                store2 = store1.getZomoreCommodityStore() - store;
                store1.setZomoreCommodityStore(store2);
                zomoreCommodityStoreServiceImpl.updateCommodityid(store1);
            }
        } else {//增加库存
            for (ZomoreCommodityResult result : results) {
                store = result.getZomoreCommodityWholesaleCommodityNum() + result.getZomoreCommodityWholesaleCommodityGivenum();
                String zomoreCommodityId = result.getZomoreCommodityId();
                ZomoreCommodityStore store1 = zomoreCommodityStoreServiceImpl.selectByCommodityId(zomoreCommodityId);
                store2 = store1.getZomoreCommodityStore() + store;
                store1.setZomoreCommodityStore(store2);
                zomoreCommodityStoreServiceImpl.updateCommodityid(store1);
            }
        }
        //修改批发单据
        ZomoreCommodityWholesale zomoreCommodityWholesale = new ZomoreCommodityWholesale();
        zomoreCommodityWholesale.setZomoreCommodityWholesaleId(id);
        zomoreCommodityWholesale.setZomoreCommodityWholesaleCommodityState(1);
        zomoreCommodityWholesaleServiceImpl.update(zomoreCommodityWholesale);
        return "redirect:/zomoreCommodityWholesale/list2.do";
    }


    //添加批发订单/退货订单
    @RequestMapping("insert")
    public String insert(ZomoreCommodityWholesale wholesale, String[] ids, Model model, HttpSession session) {
        String id;
        if (wholesale.getZomoreCommodityWholesaleId() == null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            id = format.format(new Date());
            Random r = new Random();
            for (int i = 0; i < 4; i++) {
                id += r.nextInt(10);
            }
            wholesale.setZomoreCommodityWholesaleId(id);
            zomoreCommodityWholesaleServiceImpl.insert(wholesale);
        } else {
            id = wholesale.getZomoreCommodityWholesaleId();
            zomoreCommodityWholesaleServiceImpl.update(wholesale);
        }
        for (int i = 0; i < ids.length; i++) {
            ZomoreCommodityWholesaleCommodity zomoreCommodityWholesaleCommodity = new ZomoreCommodityWholesaleCommodity();
            zomoreCommodityWholesaleCommodity.setZomoreCommodityWholesaleCommoditycode(ids[i]);
            zomoreCommodityWholesaleCommodity.setZomoreCommodityWholesaleId(id);
            zomoreCommodityWholesaleCommodityServiceImpl.insert(zomoreCommodityWholesaleCommodity);
        }
        session.setAttribute("wholesaleOrderId", id);
        return "redirect:/zomoreCommodityWholesale/list1.do";
    }

    //修改批发订单
    @RequestMapping("edit")
    public String edit(ZomoreCommodityWholesale wholesale) {
        zomoreCommodityWholesaleServiceImpl.update(wholesale);
        return "redirect:/zomoreCommodityWholesale/list.do";
    }
    //删除批发订单

    //修改批发订单
    @RequestMapping("deleted")
    public String deleted(String id) {
        zomoreCommodityWholesaleServiceImpl.deleted(id);
        return "redirect:/zomoreCommodityWholesale/list.do";
    }

    //根据体条码查找库存(返回库存数量)
    @RequestMapping("searchByCode")
    @ResponseBody
    public Integer searchByCode(String code) {
        ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
        ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
        return store.getZomoreCommodityStore();
    }


}
