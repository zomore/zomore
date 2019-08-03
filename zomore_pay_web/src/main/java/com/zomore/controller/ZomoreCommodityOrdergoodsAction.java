package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.service.*;
import com.zomore.utils.PageResult;
import org.apache.poi.ss.formula.functions.Odd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

//订货
@Controller("zomoreCommodityOrdergoodsAction")
@RequestMapping("zomoreCommodityOrdergoods")
public class ZomoreCommodityOrdergoodsAction {
    @Resource
    private ZomoreCommodityOrdergoodsService zomoreCommodityOrdergoodsServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityOrdergoodsCommodityService zomoreCommodityOrdergoodsCommodityServiceImpl;
    @Resource
    private ZomoreSupplierService zomoreSupplierServiceImpl;
    @Resource
    private MultipleService multipleServiceImpl;

    //分页查找所有订货记录
    @RequestMapping("list")
    public String listzomoreCommodityOrdergoods(Model model, PageResult page) {
        PageResult<ZomoreCommodityOrdergoods> result = zomoreCommodityOrdergoodsServiceImpl.select(page);
        model.addAttribute("result", result);
        //查询所有商品 (用于添加和编辑选择商品)
        model.addAttribute("commoditys", zomoreCommodityServiceImpl.selectAll());
        return "forward:/pages/zomoreCommodityOrdergoods.jsp";
    }

    //根据状态查找订货记录
    @RequestMapping("listByState")
    public String listzomoreCommodityOrdergoods(Model model, PageResult page, Integer state) {
        PageResult<ZomoreCommodityOrdergoods> result = zomoreCommodityOrdergoodsServiceImpl.select(page, state);
        model.addAttribute("result", result);
        return "forward:/pages/zomoreCommodityOrdergoods.jsp";
    }

    //根据订单号修改订单状态（作用于审核和配货）
    @RequestMapping("transferState")
    public String transferState(String id, Integer state) {
        ZomoreCommodityOrdergoods ordergoods = new ZomoreCommodityOrdergoods();
        ordergoods.setZomoreCommodityOrdergoodsId(id);
        ordergoods.setZomoreCommodityOrdergoodsState(state + 1);
        zomoreCommodityOrdergoodsServiceImpl.update(ordergoods);
        return "redirect:/zomoreCommodityOrdergoods/list.do";
    }


    //根据id查找订货记录（用于编辑数据回显）
    @RequestMapping("editUI")
    public String editUIzomoreCommodityOrdergoods(String id, Model model) {
        model.addAttribute("result", zomoreCommodityOrdergoodsServiceImpl.select(id));
        return "forward:/pages/editzomoreCommodityOrdergoods.jsp";
    }

    //更新订货记录
    @RequestMapping("edit")
    public String editzomoreCommodityOrdergoods(ZomoreCommodityOrdergoods ordergoods) {
        zomoreCommodityOrdergoodsServiceImpl.update(ordergoods);
        return "redirect:/zomoreCommodityOrdergoods/list.do";
    }

    //跳转到订货记录添加页面
    @RequestMapping("addUI")
    public String addUIzomoreCommodityOrdergoods(Model model) {
        model.addAttribute("result", zomoreCommodityServiceImpl.selectAll());
        //查询所有商品
        return "forward:/pages/addzomoreCommodityOrdergoods.jsp";
    }

    //添加订货记录
    @RequestMapping("add")
    public String addzomoreCommodityOrdergoods(ZomoreCommodityOrdergoods ordergoods, String[] commodityId, Integer[] commodityNum) {
 Integer num=0;
        if (commodityId != null && commodityId.length > 0) {
            for (int i = 0; i < commodityId.length; i++) {
                num+=commodityNum[i];
                //保存订货商品信息
                ZomoreCommodityOrdergoodsCommodity commodity = new ZomoreCommodityOrdergoodsCommodity();
                commodity.setZomoreCommodityOrdergoodsId(ordergoods.getZomoreCommodityOrdergoodsId());
                commodity.setZomoreCommodityId(commodityId[i]);
                commodity.setZomoreCommodityNum(commodityNum[i]);
                zomoreCommodityOrdergoodsCommodityServiceImpl.insert(commodity);
            }
        }
        //保存订货信息
        ordergoods.setZomoreCommodityOrdergoodsNum(num+"");
        zomoreCommodityOrdergoodsServiceImpl.insert(ordergoods);
        return "redirect:/zomoreCommodityOrdergoods/list.do";
    }

    //根据id删除订货记录
    @RequestMapping("deleted")
    public String deletedzomoreCommodityOrdergoods(String ids) {
        zomoreCommodityOrdergoodsServiceImpl.deleted(ids);
        return "redirect:/zomoreCommodityOrdergoods/list.do";
    }

    //根据id删除订货记录
    @RequestMapping("gotoDinghuo")
    public String gotoOrderGoods(Model model, HttpSession session) {
        String multipleId= session.getAttribute("multipleId")+"";
        //查询所有的直营店、加盟店
        List<HeadShop> headShopList=multipleServiceImpl.selectHeadshopByMultipleId(multipleId);

        if(headShopList!=null && headShopList.size()>0){
            model.addAttribute("headshop",headShopList.get(0));

        }
        //保存供货商用于编辑和添加动态选择
        model.addAttribute("suppliers", zomoreSupplierServiceImpl.select());
        return "forward:/reception/dinghuo.jsp";
    }

    //根据条件查找供应商
    @RequestMapping("searchLikeCode")
    @ResponseBody
    public List searchLikeCode(String name) {
        List list = new ArrayList();
        List<ZomoreSupplier> zomoreSuppliers = zomoreSupplierServiceImpl.selectByNameLike(name);
        if(zomoreSuppliers!=null&&zomoreSuppliers.size()>0){
            for (int i=0;i<zomoreSuppliers.size();i++){
                Map map = new HashMap();
                map.put("shop", zomoreSuppliers.get(i).getZomoreSupplierName());
                list.add(map);
            }
        }
        return list;
    }

    //批量添加订货订单
    @RequestMapping("insertAll")
    @ResponseBody
    public String insertAll(String[] name, String[] code, Integer[] num, String[] price,String[] outprice,String[] type, ZomoreCommodityOrdergoods zomoreCommodityOrdergoods, HttpSession session) {
        //随机生产批次号
        String zomoreCommodityOrdergoodsId = "dh";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHssmm");
        String orid = format.format(new Date());
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            orid += random.nextInt(10);
        }
        zomoreCommodityOrdergoodsId=zomoreCommodityOrdergoodsId+orid;
        //订货id
        zomoreCommodityOrdergoods.setZomoreCommodityOrdergoodsId(zomoreCommodityOrdergoodsId);
        //订单状态（0审核，1配货，2已配货）
        zomoreCommodityOrdergoods.setZomoreCommodityOrdergoodsState(0);
        //预付款
        zomoreCommodityOrdergoods.setZomoreCommodityOrdergoodsMoney("0");
        zomoreCommodityOrdergoods.setZomoreCommodityOrdergoodsInname(session.getAttribute("shopName")+"");
        //联系人为收银台号
        zomoreCommodityOrdergoods.setZomoreCommodityOrdergoodsName(session.getAttribute("cashierNumber")+"");
        //订货商品总数量
        Integer num2=0;
        ZomoreCommodityOrdergoodsCommodity zomoreCommodityOrdergoodsCommodity =new ZomoreCommodityOrdergoodsCommodity();
        for (int i = 0; i < name.length; i++) {
            //添加订货货记录
            ZomoreCommodity zomoreCommodity =zomoreCommodityServiceImpl.selectByCode2(session.getAttribute("shopName")+"",code[i]);
           //记录商品id
            zomoreCommodityOrdergoodsCommodity.setZomoreCommodityId(zomoreCommodity.getZomoreCommodityId());

            zomoreCommodityOrdergoodsCommodity.setZomoreCommodityOrdergoodsId(zomoreCommodityOrdergoodsId);
            num2=num2+num[i];
            zomoreCommodityOrdergoodsCommodity.setZomoreCommodityNum(num[i]);
            zomoreCommodityOrdergoodsCommodity.setZomoreCommodityName(name[i]);
            zomoreCommodityOrdergoodsCommodity.setZomoreCommodityType(type[i]);
            zomoreCommodityOrdergoodsCommodity.setZomoreCommdityCode(code[i]);
            zomoreCommodityOrdergoodsCommodity.setZomoreCommodityInprice(price[i]);
            zomoreCommodityOrdergoodsCommodity.setZomoreCommodityOutprice(outprice[i]);
            zomoreCommodityOrdergoodsCommodity.setZomoreCommodityOrdergoodsCommodityId(System.currentTimeMillis() + "");

            zomoreCommodityOrdergoodsCommodityServiceImpl.insert(zomoreCommodityOrdergoodsCommodity);


        }
        zomoreCommodityOrdergoods.setZomoreCommodityOrdergoodsNum(String.valueOf(num2));
        zomoreCommodityOrdergoodsServiceImpl.insert2(zomoreCommodityOrdergoods);
        return "success";
    }


}
