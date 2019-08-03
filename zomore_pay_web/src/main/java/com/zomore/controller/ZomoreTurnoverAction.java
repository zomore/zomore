package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.service.*;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//交接班记录
@Controller("zomoreTurnoverAction")
@RequestMapping("zomoreTurnover")
public class ZomoreTurnoverAction {
    @Resource
    private ZomoreTurnoverService zomoreTurnoverServiceImpl;
    @Autowired
    private HeadShopService headShopService;
    @Resource
    private ZomoreCommoditySaleService zomoreCommoditySaleServiceImpl;
    @Resource
    private HttpSession session;
    @Resource
    private ZomoreServiceCommodityorderService zomoreServiceCommodityorderServiceImpl;
    @Resource
    private ZomoreMemberInputRecordService zomoreMemberInputRecordServiceImpl;

    //交接班，下班
    @RequestMapping("changePeople")
    public String changePeople(String money) {
        Turnover turnover = new Turnover();
        Date date = new Date();
        turnover.setDuetime(date);
        turnover.setCreatetime((Date) session.getAttribute("loginTime"));
        turnover.setPaidamount(money);
        turnover.setCashier(session.getAttribute("cashierName") + "");
        String readcash=session.getAttribute("readycash") + "";
        if (readcash.equals("null")){
            readcash="0";
        }
        //根据时间段统计收银方式
        List<ZomoreCommoditySale> zomoreCommoditySaleList = null;
        try {
            String shop = session.getAttribute("shopName") + "";
            /*zomoreCommoditySaleList = headShopService.findSale((Date) session.getAttribute("loginTime"), date, shop);*/
            zomoreCommoditySaleList = headShopService.findSale((Date) session.getAttribute("loginTime"), date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        double sum = 0;//实收总额
        double cashsum = 0;//现金
        double unionsum = 0;//银联
        double storagesum = 0;//储蓄卡
        double subcardsum = 0;//次卡
        //普通商品
        for (ZomoreCommoditySale zomoreCommoditySale : zomoreCommoditySaleList) {
            if (zomoreCommoditySale.getZomoreCommodityState() == 1) {
                sum += Double.parseDouble(zomoreCommoditySale.getZomoreCommoditySaleInmoney());
            }

            if (zomoreCommoditySale.getZomoreCommoditySaleType().equals("0") && zomoreCommoditySale.getZomoreCommodityState() == 1) {
                cashsum += Double.parseDouble(zomoreCommoditySale.getZomoreCommoditySaleInmoney());
            }
            if (zomoreCommoditySale.getZomoreCommoditySaleType().equals("3") && zomoreCommoditySale.getZomoreCommodityState() == 1) {
                unionsum += Double.parseDouble(zomoreCommoditySale.getZomoreCommoditySaleInmoney());
            }
            if (zomoreCommoditySale.getZomoreCommoditySaleType().equals("1") && zomoreCommoditySale.getZomoreCommodityState() == 1) {
                storagesum += Double.parseDouble(zomoreCommoditySale.getZomoreCommoditySaleInmoney());
            }
            if (zomoreCommoditySale.getZomoreCommoditySaleType().equals("5") && zomoreCommoditySale.getZomoreCommodityState() == 1) {
                subcardsum += Double.parseDouble(zomoreCommoditySale.getZomoreCommoditySaleInmoney());
            }
        }
        //服务类商品
        List<ZomoreServiceCommodityorder> zomoreServiceCommodityorders = zomoreServiceCommodityorderServiceImpl.select((Date) session.getAttribute("loginTime"), date);
        for (ZomoreServiceCommodityorder zomoreCommoditySale1 : zomoreServiceCommodityorders) {
            if (zomoreCommoditySale1.getZomoreCommodityState() == 1) {
                sum += Double.parseDouble(zomoreCommoditySale1.getZomoreCommoditySaleInmoney());
            }

            if (zomoreCommoditySale1.getZomoreCommoditySaleType().equals("0") && zomoreCommoditySale1.getZomoreCommodityState() == 1) {
                cashsum += Double.parseDouble(zomoreCommoditySale1.getZomoreCommoditySaleInmoney());
            }
            if (zomoreCommoditySale1.getZomoreCommoditySaleType().equals("3") && zomoreCommoditySale1.getZomoreCommodityState() == 1) {
                unionsum += Double.parseDouble(zomoreCommoditySale1.getZomoreCommoditySaleInmoney());
            }
            if (zomoreCommoditySale1.getZomoreCommoditySaleType().equals("1") && zomoreCommoditySale1.getZomoreCommodityState() == 1) {
                storagesum += Double.parseDouble(zomoreCommoditySale1.getZomoreCommoditySaleInmoney());
            }
            if (zomoreCommoditySale1.getZomoreCommoditySaleType().equals("5") && zomoreCommoditySale1.getZomoreCommodityState() == 1) {
                subcardsum += Double.parseDouble(zomoreCommoditySale1.getZomoreCommoditySaleInmoney());
            }
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        String str = df.format(sum);
        String str1 = df.format(cashsum);
        turnover.setTotalmoney(str);
        turnover.setCash(str1);
        turnover.setUnionpay(unionsum + "");
        turnover.setStoragecard(storagesum + "");
        turnover.setSubcard(subcardsum + "");
        turnover.setReadycash(readcash);
        zomoreTurnoverServiceImpl.insert(turnover);
        session.removeAttribute("cashierName");
        session.setAttribute("bank","不存在");
        return "redirect:/pages/shouyintailogin.jsp";
    }
    //保存备用金到session域中
    @RequestMapping("saveReadycash")
    @ResponseBody
    public String  saveReadycash(HttpSession session,String readycash){
        session.setAttribute("bank","已经存在");
        session.setAttribute("readycash",readycash);
        return "success";

    }

    @RequestMapping("list")
    public String jqbList(Model model,String id){
        Date startTime = (Date) session.getAttribute("loginTime");
        String shop = session.getAttribute("shopName")+"";
        //当前收银台收银人员
        String cashierName = session.getAttribute("cashierName") + "";
        Date endTime = new Date();
        List<ZomoreServiceCommodityorder> zomoreServiceCommodityorders = zomoreServiceCommodityorderServiceImpl.select(startTime,endTime);
        List<ZomoreCommoditySale> zomoreCommoditySales = zomoreCommoditySaleServiceImpl.selectByTime(startTime,endTime);
        List<ZomoreMemberInputRecord> zomoreMemberInputRecords = zomoreMemberInputRecordServiceImpl.selectByShopAndTime(shop,startTime,endTime);
        double sum = 0;//总销售额
        double cashierSum = 0;//收银台销售额
        double cashSum = 0;//店内订单现金收款
        double cashierCash = 0;//收银台现金
        int count = 0;//总单据数
        int rightCount = 0;//正常单据
        int nopayCount = 0;//未收银单据
        double memberSum = 0;//会员充值
        double memberCash = 0;//会员现金充值
        int gudanNum = 0;//挂单数
        //遍历项目订单信息
        for (ZomoreServiceCommodityorder order:zomoreServiceCommodityorders)  {

            //正常订单
            if(order.getZomoreCommodityState()==1){//计算
                sum = sum + Double.parseDouble(order.getZomoreCommoditySaleInmoney());
                //现金交易方式
                if ("0".equals(order.getZomoreCommoditySaleType())){
                    //店内现金支付
                    cashSum = cashSum + Double.parseDouble(order.getZomoreCommoditySaleInmoney());
                    if(cashierName.equals(order.getZomoreCommoditySaleName())){
                        //收银台现金
                        cashierCash = cashierCash + Double.parseDouble(order.getZomoreCommoditySaleInmoney());
                    }
                }
                //收银台当段时间内销售总额及订单数
                if(cashierName.equals(order.getZomoreCommoditySaleName())){
                    rightCount++;
                    cashierSum = cashierSum + Double.parseDouble(order.getZomoreCommoditySaleInmoney());
                }
            }else if(order.getZomoreCommodityState()==0&&cashierName.equals(order.getZomoreCommoditySaleName())){//未支付订单
                nopayCount++;
            }
            if (cashierName.equals(order.getZomoreCommoditySaleName())){
                count++;
            }

        }
        //遍历商品订单
        for (ZomoreCommoditySale sale:zomoreCommoditySales) {

            if(sale.getZomoreCommodityState()==1){
                sum = sum + Double.parseDouble(sale.getZomoreCommoditySaleInmoney());

                if ("0".equals(sale.getZomoreCommoditySaleType())){
                    //店内现金支付
                    cashSum = cashSum + Double.parseDouble(sale.getZomoreCommoditySaleInmoney());
                    if(cashierName.equals(sale.getZomoreCommoditySaleName())){
                        //收银台现金
                        cashierCash = cashierCash + Double.parseDouble(sale.getZomoreCommoditySaleInmoney());
                    }
                }
                //收银台当段时间内销售总额及订单数
                if(cashierName.equals(sale.getZomoreCommoditySaleName())){
                    rightCount++;
                    cashierSum = cashierSum + Double.parseDouble(sale.getZomoreCommoditySaleInmoney());
                }
            }else if(sale.getZomoreCommodityState()==0&&cashierName.equals(sale.getZomoreCommoditySaleName())){
                nopayCount++;
            }
            //当前时间段收银员总订单
            if (cashierName.equals(sale.getZomoreCommoditySaleName())){
                count++;
            }
            //判断是否挂单
            if(sale.getZomoreCommodityGuadannum()!=null&&!"".equals(sale.getZomoreCommodityGuadannum())&&cashierName.equals(sale.getZomoreCommoditySaleName())){
                gudanNum++;
            }
        }

        for (ZomoreMemberInputRecord record: zomoreMemberInputRecords) {
            if (record.getState()==1&&cashierName.equals(record.getCashier())){
                memberSum = memberSum + record.getInputmoney();
                if (record.getType().equals("现金")){
                    memberCash = memberCash + record.getInputmoney();
                }
            }
        }
        //储存现金
        double cash = 0;
        //避免储存现金为null报错
        if ("".equals((session.getAttribute("readycash")+"")) && (session.getAttribute("readycash")+"")!=null){
            cash = cash + Double.parseDouble(session.getAttribute("readycash")+"");
        }
        //收银台所有现金
        cash = cash + cashierCash;
        //时间转化格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        //获得门店地址
        String shopId = session.getAttribute("shopId")+"";
        Shop shop1 = null;
        try {
            shop1 =  headShopService.findShopById(Long.parseLong(shopId));
        }catch (Exception e){

        }

        Map map = new HashMap();
        map.put("sum",sum);
        map.put("cashierSum",cashierSum);
        map.put("cashSum",cashSum);
        map.put("cash",cash);
        map.put("count",count);
        map.put("rightCount",rightCount);
        map.put("nopayCount",nopayCount);
        map.put("memberSum",memberSum);
        map.put("memberCash",memberCash);
        map.put("gudanNum",gudanNum);
        map.put("startTime",dateFormat.format(startTime));
        map.put("endTime",dateFormat.format(endTime));
        map.put("address",shop1.getAddress());
        model.addAttribute("map",map);
        return "forward:/pages/jiaojieban.jsp";
    }



}
