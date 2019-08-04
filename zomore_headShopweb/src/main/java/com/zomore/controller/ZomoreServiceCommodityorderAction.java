package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.service.*;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//服务类商品订单
@Controller("zomoreServiceCommodityorderAction")
@RequestMapping("zomoreServiceCommodityorder")
public class ZomoreServiceCommodityorderAction {
    @Resource
    private ZomoreServiceCommodityorderService zomoreServiceCommodityorderServiceImpl;
    @Resource
    private ZomoreServiceCommoditySalecommoditService zomoreServiceCommoditySalecommoditService;
    @Resource
    private ZomoreServiceCommodityService zomoreServiceCommodityServiceImpl;
    @Resource
    private ZomoreCommoditySaleService zomoreCommoditySaleServiceImpl;
    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;
    //前台查询所有销售单据（指定是已付款状态的订单）
    @RequestMapping("list1")
    public String list1(PageResult page, Model model) {
        //查询所有已经付款的单据
        model.addAttribute("result", zomoreServiceCommodityorderServiceImpl.select(1));
        return "forward:/reception/xsdjs.jsp";
    }
    //根据流水号查找服务类销售商品（点击详细时作用）
    @RequestMapping("showAllCommodit")
    @ResponseBody
    public List showAllZomoreCommoditySaleCommodit(String id) {
        List list = new ArrayList();
        int index = 1;
        ZomoreServiceCommodityorder select = zomoreServiceCommodityorderServiceImpl.select(id);
        List<ZomoreServiceCommoditySalecommodit> commodits = zomoreServiceCommoditySalecommoditService.selectBynum(id);
        if (commodits != null && commodits.size() > 0) {
            for (ZomoreServiceCommoditySalecommodit commodit : commodits) {
                Map map = new HashMap();
                map.put("name", commodit.getZomoreCommodityName());
                //根据商品名称查找销售价
                ZomoreServiceCommodity commodity = zomoreServiceCommodityServiceImpl.selectByName(commodit.getZomoreCommodityName());
                map.put("price", commodity.getServiceCommodityOutprice());
                //根据流水号找到会员名称，再找到会员折扣
                map.put("cutprice", "-");
                map.put("num", commodit.getZomoreCommodityNum());
                if (index == 1) {
                    //保存总键数和总金额,会员名称
                    map.put("alllnum", select.getZomoreCommoditySaleNum());
                    map.put("alllmoney", select.getZomoreCommoditySaleInmoney());
                    map.put("menber", select.getZomoreCommoditySaleMember());
                    //根据会员名称查找会员电话
                    ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByname(select.getZomoreCommoditySaleMember());
                    if (zomoreMember != null) {
                        //会员手机号码
                        map.put("menberphone", zomoreMember.getMemberPhonenumber());
                        //会员余额
                        map.put("menberBalance", zomoreMember.getMemberBalance());
                    } else {
                        map.put("menberphone", " ");
                        map.put("menberBalance", 0);
                    }
                    index=2;
                }
                list.add(map);
            }
        }
        return list;
    }
    /**
     * 添加服务类销售单据数据
     *
     * @param commodityorder
     * @param commoditNum    服务类商品数量
     * @param commoditName   服务类商品名称
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public String add(ZomoreServiceCommodityorder commodityorder, Integer[] commoditNum, String[] commoditName, HttpSession httpSession) {
        //从session中取流水单号
        String id = (String) httpSession.getAttribute("Aa_servieceorderid");
        commodityorder.setZomoreCommoditySaleId(id);
        Integer num = 0;
        Double inplice = new Double(0);
        //保存销售商品
        if(commoditName != null && commoditName.length > 0)
            for (int i = 0; i < commoditName.length; i++) {
                ZomoreServiceCommoditySalecommodit commodit = new ZomoreServiceCommoditySalecommodit();
                commodit.setZomoreCommoditySaleId(id);
                commodit.setZomoreCommodityNum(commoditNum[i]);
                num += commoditNum[i];
                commodit.setZomoreCommodityName(commoditName[i]);
                zomoreServiceCommoditySalecommoditService.insert(commodit);
                //根据商品名称找到商品进货价
                ZomoreServiceCommodity commodity = zomoreServiceCommodityServiceImpl.selectByName(commoditName[i]);
                if (commodity != null) {
                    BigDecimal a1 = new BigDecimal(inplice);
                    BigDecimal a2 = new BigDecimal(commodity.getServiceCommodityInprice());
                    inplice = a1.add(a2).doubleValue();
                }
            }
        //保存商品总数量
        commodityorder.setZomoreCommoditySaleNum(num);
        //计算让利价
        BigDecimal b1 = new BigDecimal(commodityorder.getZomoreCommoditySaleMoney());
        BigDecimal b2 = new BigDecimal(commodityorder.getZomoreCommoditySaleInmoney());
        Double letmoney = b1.subtract(b2).doubleValue();
        commodityorder.setZomoreCommoditySaleLetmoney(letmoney + "");
        //计算利润
        BigDecimal c1 = new BigDecimal(inplice);
        Double savemoney = b2.subtract(c1).doubleValue();
        commodityorder.setZomoreCommoditySaleSavemoney(savemoney + "");
        //保存销售单据
        zomoreServiceCommodityorderServiceImpl.insert(commodityorder);
        return "success";
    }
    //根据流水号跳转到收款页面
    @RequestMapping("pay")
    public  String toPay(String id , Model model){
        //根据流水号查找销售商品单据和服务商品单据
        ZomoreCommoditySale sale = zomoreCommoditySaleServiceImpl.select(id);
        ZomoreServiceCommodityorder serviceCommodityorder = zomoreServiceCommodityorderServiceImpl.select(id);
        model.addAttribute("result",sale);
        model.addAttribute("result1",serviceCommodityorder);
        return "forward:/reception/sk2.jsp";
    }



}
