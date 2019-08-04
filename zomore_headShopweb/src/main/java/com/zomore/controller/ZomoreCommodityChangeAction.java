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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//商品变动明细
@Controller("zomoreCommodityChangeAction")
@RequestMapping("zomoreCommodityChange")
public class ZomoreCommodityChangeAction {
    @Resource
    private ZomoreCommodityChangeService zomoreCommodityChangeServiceImpl;

    @Resource
    private ZomoreCommoditySaleService zomoreCommoditySaleServiceImpl;
    @Resource
    private ZomoreCommoditySaleCommoditService zomoreCommoditySaleCommoditServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityIntogoodsHistoryService zomoreCommodityIntogoodsHistoryServiceImpl;
    @Resource
    private ZomoreCommoditySaleThService zomoreCommoditySaleThServiceImpl;
    @Resource
    private ZomoreCommodityIntogoodsService zomoreCommodityIntogoodsServiceImpl;
    @Resource
    private ZomoreInventoryhistoryService zomoreInventoryhistoryServiceImpl;
    @Resource
    private ZomoreStocktakingService zomoreStocktakingServiceImpl;
    @Resource
    private ZomoreCommodityLossService zomoreCommodityLossServiceImpl;
    @Resource
    private ZomoreCommodityLossCommodityService zomoreCommodityLossCommodityServiceImpl;
    @Resource
    private ZomoreCommodityTransferService zomoreCommodityTransferService;
    @Resource
    private HttpSession session;

    //查询商品变得明细
    @RequestMapping("list")
    public String select(PageResult<ZomoreCommodityChange> page, Model model) {

        model.addAttribute("result", zomoreCommodityChangeServiceImpl.select(page,session.getAttribute("shopName")+""));
        return "forward:/pages/zomoreCommodityChange.jsp";
    }

    //查询商品变得明细
    @RequestMapping("listAjax")
    @ResponseBody
    public PageResult<ZomoreCommodityChange> listAjax(PageResult<ZomoreCommodityChange> page) {
        return zomoreCommodityChangeServiceImpl.select(page,session.getAttribute("shopName")+"");
    }

    //根据时间段，类型和订单号，查找变动明细
    @RequestMapping("search")
    public String search(PageResult<ZomoreCommodityChange> page, String type, String starttime, String endtime, String name, Model model) {
        Date date = null, date1 = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (!starttime.equals(",") && !starttime.equals("")) {
            try {
                date = format.parse(starttime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (!endtime.equals(",") && !endtime.equals("")) {
            try {
                date1 = format.parse(endtime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        model.addAttribute("result", zomoreCommodityChangeServiceImpl.select(page, type, date, date1, name,session.getAttribute("shopName")+""));
        model.addAttribute("type", type);
        model.addAttribute("startime", starttime.substring(0, starttime.length() - 1));
        model.addAttribute("endtime", endtime.substring(0, endtime.length() - 1));
        model.addAttribute("name", name);
        return "forward:/pages/zomoreCommodityChange.jsp";
    }

    //根据时间段，类型和订单号，查找变动明细
    @RequestMapping("searchAjax")
    @ResponseBody
    public PageResult<ZomoreCommodityChange> searchAjax(PageResult<ZomoreCommodityChange> page, String type, String starttime, String endtime, String name) {
        Date date = null, date1 = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (!starttime.equals(",") && !starttime.equals("")) {
            try {
                date = format.parse(starttime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (!endtime.equals(",") && !endtime.equals("")) {
            try {
                date1 = format.parse(endtime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return zomoreCommodityChangeServiceImpl.select(page, type, date, date1, name,session.getAttribute("shopName")+"");
    }



    //商品变动详情
    @RequestMapping("listAll")
    public String listAll(PageResult<ZomoreCommodityChange> page, String type, String id, Model model) {
        //根据变得类型不同查找不同的数据表
        List list = new ArrayList();
        if (type.equals("商品销售")) {
            //销售单据表
            ZomoreCommoditySale select = zomoreCommoditySaleServiceImpl.select(id);
            //销售单据商品表
            List<ZomoreCommoditySaleCommodit> commodits = zomoreCommoditySaleCommoditServiceImpl.select(id);
            if (commodits != null && commodits.size() > 0) {
                for (ZomoreCommoditySaleCommodit commodit : commodits) {
                    Map map = new LinkedHashMap();
                    //根据商品资料表
                    ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(commodit.getZomoreCommodityName());
                    if (commodity != null) {
                        map.put("time", select.getZomoreCommoditySaleTime());
                        map.put("code", commodity.getZomoreCommodityCode());
                        map.put("name", commodity.getZomoreCommodityName());
                        map.put("sale", commodity.getZomoreCommodityOut());
                        double d = commodit.getZomoreCommodityNum() * Double.parseDouble(commodity.getZomoreCommodityOut());
                        double d1 = commodit.getZomoreCommodityMoney();
                        map.put("zherang", sub(d, d1));
                    }
                    map.put("type", "商品销售");
                    map.put("syt", select.getZomoreCommoditySaleName());
                    map.put("member", select.getZomoreCommoditySaleMember());
                    map.put("num", commodit.getZomoreCommodityNum());
                    map.put("shishou", commodit.getZomoreCommodityMoney());
                    map.put("daogou", select.getZomoreCommoditySaleGuide());
                    map.put("paytype", changeType(Integer.parseInt(select.getZomoreCommoditySaleType())));
                    list.add(map);
                }
            }
            model.addAttribute("result", list);
        } else if (type.equals("客户退货")) {
            List<ZomoreCommoditySaleTh> zomoreCommoditySaleThs = zomoreCommoditySaleThServiceImpl.selectByid(id);
            if (zomoreCommoditySaleThs != null && zomoreCommoditySaleThs.size() > 0) {
                ZomoreCommoditySale select = zomoreCommoditySaleServiceImpl.select(zomoreCommoditySaleThs.get(0).getZomoreCommoditySaleId());
                for (ZomoreCommoditySaleTh commodit : zomoreCommoditySaleThs) {
                    Map map = new LinkedHashMap();
                    //根据商品资料表
                    ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(commodit.getZomoreCommodityName());
                    if (commodity != null) {
                        map.put("time", select.getZomoreCommoditySaleTime());
                        map.put("code", commodity.getZomoreCommodityCode());
                        map.put("name", commodity.getZomoreCommodityName());
                        map.put("sale", commodity.getZomoreCommodityOut());
                        double d = commodit.getZomoreCommodityNum() * Double.parseDouble(commodity.getZomoreCommodityOut());
                        double d1 = commodit.getZomoreCommodityMoney();
                        map.put("zherang", sub(d, d1));
                    }
                    map.put("type", "客户退货");
                    map.put("syt", select.getZomoreCommoditySaleName());
                    map.put("member", select.getZomoreCommoditySaleMember());
                    map.put("num", commodit.getZomoreCommodityNum());
                    map.put("shishou", commodit.getZomoreCommodityMoney());
                    map.put("daogou", select.getZomoreCommoditySaleGuide());
                    map.put("paytype", changeType(Integer.parseInt(select.getZomoreCommoditySaleType())));
                    list.add(map);
                }
            }
            model.addAttribute("result", list);
        } else if (type.equals("货流进货")) {
            ZomoreCommodityIntogoodsHistory select = zomoreCommodityIntogoodsHistoryServiceImpl.select(id);
            List<ZomoreCommodityIntogoods> zomoreCommoditySaleThs = zomoreCommodityIntogoodsServiceImpl.selectByMainid(id);
            if (zomoreCommoditySaleThs != null && zomoreCommoditySaleThs.size() > 0) {
                for (ZomoreCommodityIntogoods commodit : zomoreCommoditySaleThs) {
                    Map map = new LinkedHashMap();
                    //根据商品资料表
                    ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(commodit.getZomoreCommodityIntogoodsName());
                    if (commodity != null) {
                        map.put("time", select.getTime());
                        map.put("code", commodity.getZomoreCommodityCode());
                        map.put("name", commodity.getZomoreCommodityName());
                        map.put("sale", commodity.getZomoreCommodityOut());
                        map.put("zherang", 0);
                    }
                    map.put("type", "货流进货");
                    map.put("syt", select.getPeople());
                    map.put("member", "");
                    map.put("num", commodit.getZomoreCommodityIntogoodsNum());
                    Double a = Double.parseDouble(commodit.getZomoreCommodityIntogoodsAvgprivice());
                    map.put("shishou", a * commodit.getZomoreCommodityIntogoodsNum());
                    map.put("daogou", "");
                    map.put("paytype", changeType(0));
                    list.add(map);
                }
            }
            model.addAttribute("result", list);

        } else if (type.equals("库存盘点")) {
            ZomoreInventoryhistory select = zomoreInventoryhistoryServiceImpl.select(id);
            List<ZomoreStocktaking> commodits = zomoreStocktakingServiceImpl.select(id);
            if (commodits != null && commodits.size() > 0) {
                for (ZomoreStocktaking commodit : commodits) {
                    Map map = new LinkedHashMap();
                    //根据商品资料表
                    ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(commodit.getStocktakingCommodityname());
                    if (commodity != null) {
                        map.put("time", select.getInventoryhistoryDate());
                        map.put("code", commodity.getZomoreCommodityCode());
                        map.put("name", commodity.getZomoreCommodityName());
                        map.put("sale", commodity.getZomoreCommodityOut());
                        map.put("zherang", 0);
                    }
                    map.put("type", "库存盘点");
                    map.put("syt", select.getInventoryhistoryPersonnel());
                    map.put("member", "");
                    map.put("num", commodit.getStocktakingNetreceipts());
                    map.put("shishou", "");
                    map.put("daogou", "");
                    map.put("paytype", "");
                    list.add(map);
                }
            }
            model.addAttribute("result", list);
        } else if (type.equals("商品报损")) {
            ZomoreCommodityLoss select = zomoreCommodityLossServiceImpl.select(id);
            List<ZomoreCommodityLossCommodity> commodits = zomoreCommodityLossCommodityServiceImpl.select(id);
            if (commodits != null && commodits.size() > 0) {
                for (ZomoreCommodityLossCommodity commodit : commodits) {
                    Map map = new LinkedHashMap();
                    //根据商品资料表
                    ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(commodit.getZomoreCommodityLossName());
                    if (commodity != null) {
                        map.put("time", select.getZomoreCommodityLossTime());
                        map.put("code", commodity.getZomoreCommodityCode());
                        map.put("name", commodity.getZomoreCommodityName());
                        map.put("sale", commodity.getZomoreCommodityOut());
                        map.put("zherang", 0);
                    }
                    map.put("type", "商品报损");
                    map.put("syt", select.getZomoreCashierName());
                    map.put("member", "");
                    map.put("num", commodit.getZomoreCommodityLossNum());
                    map.put("shishou", "");
                    map.put("daogou", "");
                    map.put("paytype", "");
                    list.add(map);
                }
            }
            model.addAttribute("result", list);
        } else if (type.equals("货流调出")) {
            //销售单据表
            ZomoreCommodityTransfer select = zomoreCommodityTransferService.select(id);
            //销售单据商品表
            List<ZomoreCommodityTransferCommodity> commodits = zomoreCommodityTransferService.selectByTranId(id);
            if (commodits != null && commodits.size() > 0) {
                for (ZomoreCommodityTransferCommodity commodit : commodits) {
                    Map map = new LinkedHashMap();
                    //根据商品资料表
                    ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(commodit.getZomoreCommodityTransferName());
                    if (commodity != null) {
                        map.put("time", select.getZomoreCommodityTransferDatetime());
                        map.put("code", commodity.getZomoreCommodityCode());
                        map.put("name", commodity.getZomoreCommodityName());
                        map.put("sale", commodity.getZomoreCommodityOut());
                        map.put("zherang", 0);
                    }
                    map.put("type", "货流调出");
                    map.put("syt", "");
                    map.put("member", "");
                    map.put("num", commodit.getZomoreCommodityTransferNum());
                    map.put("shishou", commodit.getZomoreCommodityTransferNum() * Double.parseDouble(commodit.getZomoreCommodityTransferPrice()));
                    map.put("daogou", "");
                    map.put("paytype", "");
                    list.add(map);
                }
            }
            model.addAttribute("result", list);
        }
        return "forward:/pages/zomoreCommodityChangeAll.jsp";
    }

    public Double sub(Double v1, Double v2) {
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return b1.subtract(b2).doubleValue();
    }

    //支付类型转换
    public String changeType(Integer indes) {
        String str = "";
        switch (indes) {
            case 0:
                str = "现金";
                break;
            case 1:
                str = "储值卡";
                break;
            case 2:
                str = "微信";
                break;
            case 3:
                str = "银联卡";
                break;
            case 4:
                str = "支付宝";
                break;
            case 5:
                str = "预售卡";
                break;
            case 6:
                str = "优惠券";
                break;
            default:
                str = "其他";
        }
        return str;
    }
}
