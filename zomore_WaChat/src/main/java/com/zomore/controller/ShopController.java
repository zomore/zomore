package com.zomore.controller;


import com.zomore.dao.HeadShopDao;
import com.zomore.domain.*;
import com.zomore.result.ZomoreCommodityResult;
import com.zomore.service.*;
import com.zomore.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private MarketingPromotionService marketingPromotionService;
    @Autowired
    private MarketingDiscountService marketingDiscountService;
    @Autowired
    private HeadShopDao headShopDao;
    @Autowired
    private MarketingGradientService marketingGradientService;
    @Autowired
    private MarketingFullreturnService marketingFullreturnService;
    @Autowired
    private MarketingRepurchaseService marketingRepurchaseService;
    @Autowired
    private MarketingGiftService marketingGiftService;
    @Autowired
    private MarketingSeconddiscountService marketingSeconddiscountService;
    @Autowired
    private MarketingSetmenuService marketingSetmenuService;
    @Autowired
    private HeadShopService headShopService;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityCategoryService zomoreCommodityCategoryServiceImpl;
    @Resource
    private MarketingPromotionService1 marketingPromotionService1Impl;
    @Resource
    private MarketingCommodityGiveService marketingCommodityGiveServiceImpl;
    @Resource
    private MarketingCommodityTwoService marketingCommodityTwoServiceImpl;
    @Resource
    private MarketingCommodityTdService marketingCommodityTdServiceImpl;
    @Resource
    private MarketingCommodityTcService marketingCommodityTcServiceImpl;
    @Resource
    private MarketingCommodityMefxService marketingCommodityMefxServiceImpl;
    @Resource
    private MarketingCommodityHgcxService marketingCommodityHgcxServiceImpl;
    @Resource
    private HttpSession session;

    //查询所有促销活动
    @RequestMapping("/findAllMarketByShopId.do")
    public ModelAndView findAllMarketByShopId(PageResult<MarketingPromotion> page,Long shopId) throws Exception {
        ModelAndView mv = new ModelAndView();
        String multipleId = session.getAttribute("multipleId") + "";
        if (shopId == null) {//总店
           page= marketingPromotionService.findAllMarketByShopId(page,multipleId);
            List<MarketingPromotion> marketingPromotionList =page.getItems();
            mv.addObject("marketingPromotionList", marketingPromotionList);
        } else {
            //查找当前店铺创建的优惠和总店创建的优惠
            page =marketingPromotionService.findAllMarketByShopId(page,shopId, multipleId);
            List<MarketingPromotion> marketingPromotionList = page.getItems();
            mv.addObject("marketingPromotionList", marketingPromotionList);
        }
        mv.setViewName("marketing");
        return mv;
    }

    //保存梯度优惠
    @RequestMapping("/saveGradient.do")
    public String saveGradient(MarketingPromotion marketingPromotion, MarketingGradient marketingGradient) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingGradient.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingGradient.setGradientId(g);
        //marketingPromotionService.save(marketingPromotion);
        marketingGradientService.save(marketingGradient);
        return "redirect:findAllMarket.do";
    }

    //保存满减活动
    @RequestMapping("/saveFullReturn.do")
    public String saveFullReturn(MarketingPromotion marketingPromotion, MarketingFullreturn marketingFullreturn) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingFullreturn.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingFullreturn.setFullreturnId(g);
        //marketingPromotionService.save(marketingPromotion);
        marketingFullreturnService.save(marketingFullreturn);
        return "redirect:findAllMarket.do";


    }

    //保存换购促销
    @RequestMapping("/saveRepurchase.do")
    public String saveRepurchase(MarketingPromotion marketingPromotion, MarketingRepurchase marketingRepurchase) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingRepurchase.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingRepurchase.setRepurchaseId(g);
        //marketingPromotionService.save(marketingPromotion);
        marketingRepurchaseService.save(marketingRepurchase);
        return "redirect:findAllMarket.do";


    }

    //保存搭赠促销
    @RequestMapping("/saveGift.do")
    public String saveGift(MarketingPromotion marketingPromotion, MarketingGift marketingGift) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingGift.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingGift.setGiftId(g);
        //marketingPromotionService.save(marketingPromotion);
        marketingGiftService.save(marketingGift);
        return "redirect:findAllMarket.do";


    }

    //保存第二件打折
    @RequestMapping("/saveSecondDiscount.do")
    public String saveSecondDiscount(MarketingPromotion marketingPromotion, MarketingSeconddiscount marketingSeconddiscount) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingSeconddiscount.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingSeconddiscount.setSeconddiscountId(g);
        //marketingPromotionService.save(marketingPromotion);
        marketingSeconddiscountService.save(marketingSeconddiscount);
        return "redirect:findAllMarket.do";


    }

    //保存套餐促销
    @RequestMapping("/saveSetMenu.do")
    public String saveSetMenu(MarketingPromotion marketingPromotion, MarketingSetmenu marketingSetmenu) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingSetmenu.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingSetmenu.setSetmenuId(g);
        //marketingPromotionService.save(marketingPromotion);
        marketingSetmenuService.save(marketingSetmenu);
        return "redirect:findAllMarket.do";


    }

    //根据促销类型修改信息
    @RequestMapping("/updatePromotionByPromotionType.do")
    public String updatePromotionByPromotionType(Integer promotionType) throws Exception {


        return "";


    }

    //根据促销类型和状态查找信息
    @RequestMapping("/findByPromotiongTypeAndStatus.do")
    public ModelAndView findByPromotiongTypeAndStatus(Integer promotiontype, Integer status) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<MarketingPromotion> marketingPromotionList = marketingPromotionService.findByPromotiongTypeAndStatus(promotiontype, status);
        mv.addObject("marketingPromotionList", marketingPromotionList);
        mv.setViewName("market-list");
        return mv;
    }

    //回显打折/特价
    @RequestMapping("/1Update.do")
    public String discountUpdate(Long promotionId, Model model) throws Exception {

        MarketingDiscount marketingDiscount = marketingDiscountService.discountUpdate(promotionId);
        model.addAttribute("marketingDiscount", marketingDiscount);

        return "forward:/pages/1-update.jsp";

    }

    //回显梯度优惠
    @RequestMapping("/2Update.do")
    public String gradientUpdate(Long promotionId, Model model) throws Exception {

        MarketingGradient marketingGradient = marketingGradientService.gradientUpdate(promotionId);
        model.addAttribute("marketingGradient", marketingGradient);

        return "forward:/pages/2-update.jsp";

    }

    //回显满减促销
    @RequestMapping("/3Update.do")
    public String fullReturnUpdate(Long promotionId, Model model) throws Exception {

        MarketingFullreturn marketingFullreturn = marketingFullreturnService.fullreturnUpdate(promotionId);
        model.addAttribute("marketingFullreturn", marketingFullreturn);

        return "forward:/pages/3-update.jsp";

    }

    //回显换购促销
    @RequestMapping("/4Update.do")
    public String repurchaseUpdate(Long promotionId, Model model) throws Exception {

        MarketingRepurchase marketingRepurchase = marketingRepurchaseService.repurchaseUpdate(promotionId);
        model.addAttribute("marketingRepurchase", marketingRepurchase);

        return "forward:/pages/4-update.jsp";

    }

    //回显搭赠
    @RequestMapping("/5Update.do")
    public String giftUpdate(Long promotionId, Model model) throws Exception {

        MarketingGift marketingGift = marketingGiftService.giftUpdate(promotionId);
        model.addAttribute("marketingGift", marketingGift);

        return "forward:/pages/5-update.jsp";

    }

    //回显第二件打折
    @RequestMapping("/6Update.do")
    public String secondDiscountUpdate(Long promotionId, Model model) throws Exception {

        MarketingSeconddiscount marketingSeconddiscount = marketingSeconddiscountService.secondDiscountUpdate(promotionId);
        model.addAttribute("marketingSeconddiscount", marketingSeconddiscount);

        return "forward:/pages/6-update.jsp";

    }

    //回显套餐促销
    @RequestMapping("/7Update.do")
    public String setMenuUpdate(Long promotionId, Model model) throws Exception {

        MarketingSetmenu marketingSetmenu = marketingSetmenuService.setMenuUpdate(promotionId);
        model.addAttribute("marketingSetmenu", marketingSetmenu);

        return "forward:/pages/7-update.jsp";

    }

    //修改打折/特价表
    @RequestMapping("/update1.do")
    public String update1(MarketingDiscount marketingDiscount, MarketingPromotion marketingPromotion) throws Exception {
        marketingDiscountService.update1(marketingDiscount);
        marketingPromotionService.update1(marketingPromotion);
        Long shopId = marketingDiscount.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;

    }

    //修改梯度优惠表
    @RequestMapping("/update2.do")
    public String update2(MarketingGradient marketingGradient, MarketingPromotion marketingPromotion) throws Exception {
        marketingGradientService.update1(marketingGradient);
        marketingPromotionService.update1(marketingPromotion);
        Long shopId = marketingGradient.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //修改满减促销表
    @RequestMapping("/update3.do")
    public String update3(MarketingFullreturn marketingFullreturn, MarketingPromotion marketingPromotion) throws Exception {
        marketingFullreturnService.update1(marketingFullreturn);
        marketingPromotionService.update1(marketingPromotion);
        Long shopId = marketingFullreturn.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //修改换购促销表
    @RequestMapping("/update4.do")
    public String update4(MarketingRepurchase marketingRepurchase, MarketingPromotion marketingPromotion) throws Exception {
        marketingRepurchaseService.update1(marketingRepurchase);
        marketingPromotionService.update1(marketingPromotion);
        Long shopId = marketingRepurchase.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //修改搭赠促销表
    @RequestMapping("/update5.do")
    public String update5(MarketingGift marketingGift, MarketingPromotion marketingPromotion) throws Exception {
        marketingGiftService.update1(marketingGift);
        marketingPromotionService.update1(marketingPromotion);
        Long shopId = marketingGift.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //修改第二件打折表
    @RequestMapping("/update6.do")
    public String update6(MarketingSeconddiscount marketingSeconddiscount, MarketingPromotion marketingPromotion) throws Exception {
        marketingSeconddiscountService.update1(marketingSeconddiscount);
        marketingPromotionService.update1(marketingPromotion);
        Long shopId = marketingSeconddiscount.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //修改套餐促销表
    @RequestMapping("/update7.do")
    public String update7(MarketingSetmenu marketingSetmenu, MarketingPromotion marketingPromotion) throws Exception {
        marketingSetmenuService.update1(marketingSetmenu);
        marketingPromotionService.update1(marketingPromotion);
        Long shopId = marketingSetmenu.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //*添加打折/特价页面
    @RequestMapping("marketAdddztj")
    public String marketAdddztj(Model model) {
        //促销门店判断当前门店是否是总店（shopId空）
        String shopId = session.getAttribute("shopId") + "";
        if (shopId == null || shopId.equals("null")) {
            String multipleId = session.getAttribute("multipleId") + "";
            try {
                List<HeadShop> shops = headShopService.findByMutId(multipleId);
                model.addAttribute("shops", shops);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            HeadShop shop = (HeadShop) session.getAttribute("shop");
            List list = new ArrayList();
            list.add(shop);
            model.addAttribute("shops", list);
        }
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        model.addAttribute("commodity", zomoreCommodityServiceImpl.selectByPage(1, 10));

        return "forward:/pages/marketingdztj.jsp";
    }

    //*为自己的商铺保存打折/特价活动  code商品条码，discount商品折扣，price商品特价
    @RequestMapping("saveDiscountByShopId.do")
    public String saveDiscountByShopId(MarketingPromotion marketingPromotion, MarketingDiscount marketingDiscount, String[] code, Integer discount, String price, Integer isAllCommodity) throws Exception {
        Long l = System.currentTimeMillis();
        if (isAllCommodity == 1) {
            //选择全部商品
            List<ZomoreCommodityResult> results = zomoreCommodityServiceImpl.selectAll();
            marketingPromotion.setPromotionnum(results.size());
            for (ZomoreCommodity zomoreCommodity : results) {
                MarketingCommodity commodity = new MarketingCommodity();
                commodity.setEndtime(marketingPromotion.getDuetime());
                commodity.setStartime(marketingPromotion.getCreatetime());
                commodity.setMarketingCommodityCode(zomoreCommodity.getZomoreCommodityCode());
                commodity.setMarketingCommodityDiscount(discount);
                if (price == null) {//当没有设置特价时按折扣算
                    if (discount == null) {
                        discount = 100;
                    }
                    commodity.setMarketingCommodityPrice((Double.parseDouble(zomoreCommodity.getZomoreCommodityOut()) * discount / 100) + "");
                } else {
                    commodity.setMarketingCommodityPrice(price);
                }
                commodity.setMarketingCommodityId(zomoreCommodity.getZomoreCommodityId());
                commodity.setMarketingCommodityName(zomoreCommodity.getZomoreCommodityName());
                commodity.setMarketingCommodityType(zomoreCommodity.getZomoreCommodityType());
                commodity.setMarketingCommodityOldprice(zomoreCommodity.getZomoreCommodityOut());
                commodity.setMarketingShop(marketingPromotion.getPromotionshop());
                commodity.setMarketingType(marketingPromotion.getPromotiontype());
                commodity.setStartime(marketingPromotion.getCreatetime());
                commodity.setEndtime(marketingPromotion.getDuetime());
                commodity.setMarketingPromotionId(l + "");
                marketingPromotionService1Impl.insertMarketingCommodity(commodity);
            }
        } else {
            //根据商品条码查找商品.添加到促销商品表
            if (code != null) {
                for (String c : code) {
                    marketingPromotion.setPromotionnum(code.length);
                    ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(c);
                    MarketingCommodity commodity = new MarketingCommodity();
                    commodity.setEndtime(marketingPromotion.getDuetime());
                    commodity.setStartime(marketingPromotion.getCreatetime());
                    commodity.setMarketingCommodityCode(zomoreCommodity.getZomoreCommodityCode());
                    commodity.setMarketingCommodityDiscount(discount);
                    if (price == null) {//当没有设置特价时按折扣算
                        if (discount == null) {
                            discount = 100;
                        }
                        commodity.setMarketingCommodityPrice((Double.parseDouble(zomoreCommodity.getZomoreCommodityOut()) * discount / 100) + "");
                    } else {
                        commodity.setMarketingCommodityPrice(price);
                    }
                    commodity.setMarketingCommodityId(zomoreCommodity.getZomoreCommodityId());
                    commodity.setMarketingCommodityName(zomoreCommodity.getZomoreCommodityName());
                    commodity.setMarketingCommodityType(zomoreCommodity.getZomoreCommodityType());
                    commodity.setMarketingCommodityOldprice(zomoreCommodity.getZomoreCommodityOut());
                    commodity.setMarketingShop(marketingPromotion.getPromotionshop());
                    commodity.setMarketingType(marketingPromotion.getPromotiontype());
                    commodity.setStartime(marketingPromotion.getCreatetime());
                    commodity.setEndtime(marketingPromotion.getDuetime());
                    commodity.setMarketingPromotionId(l + "");
                    marketingPromotionService1Impl.insertMarketingCommodity(commodity);
                }
            }
        }
        marketingPromotion.setPromotionid(l + "");
        marketingPromotion.setStatus(1);
        marketingPromotion.setMultipleid(session.getAttribute("multipleId") + "");
        marketingPromotion.setCreateshop(session.getAttribute("shopName") + "");
        marketingPromotionService1Impl.insertMarketingPromotion(marketingPromotion);
        marketingDiscount.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingDiscount.setDiscountId(g);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        marketingDiscount.setCreateTime(format.format(marketingPromotion.getCreatetime()));
        marketingDiscount.setDueTime(format.format(marketingPromotion.getDuetime()));
        marketingDiscount.setShopId(marketingPromotion.getShopId());
        marketingDiscount.setMultipleId(Long.parseLong(session.getAttribute("multipleId") + ""));
        marketingDiscount.setIsMember(marketingPromotion.getIsmember() + "");
        marketingDiscount.setPromotionType(1);
        marketingDiscount.setPromotionScope(marketingPromotion.getPromotionScope());
        marketingDiscount.setPromotionName(marketingPromotion.getPromotionName());
        marketingDiscountService.saveDiscountByShopId(marketingDiscount);

        //marketingPromotionService.saveDiscountByShopId(marketingPromotion);
        String shopId = marketingPromotion.getShopid();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //*搭赠促销页面
    @RequestMapping("marketAdddzcx")
    public String marketAdddzcx(Model model) {
        //促销门店判断当前门店是否是总店（shopId空）
        String shopId = session.getAttribute("shopId") + "";
        if (shopId == null || shopId.equals("null")) {
            String multipleId = session.getAttribute("multipleId") + "";
            try {
                List<HeadShop> shops = headShopService.findByMutId(multipleId);
                model.addAttribute("shops", shops);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            HeadShop shop = (HeadShop) session.getAttribute("shop");
            List list = new ArrayList();
            list.add(shop);
            model.addAttribute("shops", list);
        }
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        model.addAttribute("commodity", zomoreCommodityServiceImpl.selectByPage(1, 10));
        return "forward:/pages/marketingdzcx.jsp";
    }

    //*添加商品搭赠促销（没有保存到总表）
    @RequestMapping("dzcx")
    public String dzcx(MarketingPromotion marketingPromotion, String commodityName, String commodityCode, String[] zomoreCommodityCode, String[] zomoreCommodityName) {
        Long l = System.currentTimeMillis();
        if (commodityCode != null) {
            ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(commodityCode);
            //保存赠品
            if (zomoreCommodityCode != null && zomoreCommodityCode.length > 0) {
                marketingPromotion.setPromotionnum(zomoreCommodityCode.length);
                MarketingCommodityGive give = new MarketingCommodityGive();
                for (String code : zomoreCommodityCode) {
                    ZomoreCommodity commodity1 = zomoreCommodityServiceImpl.selectByCode(code);
                    give.setCommodityCode(commodity1.getZomoreCommodityCode());
                    give.setCommodityId(commodity1.getZomoreCommodityId());
                    give.setCommodityName(commodity1.getZomoreCommodityName());
                    give.setCommodityType(commodity1.getZomoreCommodityType());
                    give.setCommodityNameCode(zomoreCommodity.getZomoreCommodityCode());
                    give.setCommodityNameMain(zomoreCommodity.getZomoreCommodityName());
                    give.setCommodityNameType(zomoreCommodity.getZomoreCommodityType());
                    give.setMarketingPromotionId(l + "");
                    give.setCommodityPrice("0");
                    give.setCommodityOldprice(commodity1.getZomoreCommodityOut());
                    give.setMarketingType(marketingPromotion.getPromotiontype());
                    marketingCommodityGiveServiceImpl.insert(give);
                }
            }
            //保存促销商品
            MarketingCommodity commodity = new MarketingCommodity();
            commodity.setEndtime(marketingPromotion.getDuetime());
            commodity.setStartime(marketingPromotion.getCreatetime());
            commodity.setMarketingCommodityCode(zomoreCommodity.getZomoreCommodityCode());
            commodity.setMarketingCommodityPrice(zomoreCommodity.getZomoreCommodityOut());
            commodity.setMarketingCommodityId(zomoreCommodity.getZomoreCommodityId());
            commodity.setMarketingCommodityName(zomoreCommodity.getZomoreCommodityName());
            commodity.setMarketingCommodityType(zomoreCommodity.getZomoreCommodityType());
            commodity.setMarketingCommodityOldprice(zomoreCommodity.getZomoreCommodityOut());
            commodity.setMarketingShop(marketingPromotion.getPromotionshop());
            commodity.setMarketingType(marketingPromotion.getPromotiontype());
            commodity.setStartime(marketingPromotion.getCreatetime());
            commodity.setEndtime(marketingPromotion.getDuetime());
            commodity.setMarketingPromotionId(l + "");
            marketingPromotionService1Impl.insertMarketingCommodity(commodity);
        }


        marketingPromotion.setPromotionid(l + "");
        marketingPromotion.setStatus(1);
        marketingPromotion.setMultipleid(session.getAttribute("multipleId") + "");
        marketingPromotion.setCreateshop(session.getAttribute("shopName") + "");
        marketingPromotionService1Impl.insertMarketingPromotion(marketingPromotion);
        String shopId = marketingPromotion.getShopid();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //*第二件折扣页面
    @RequestMapping("marketAdddejzk")
    public String marketAdddejdz(Model model) {
        //促销门店判断当前门店是否是总店（shopId空）
        String shopId = session.getAttribute("shopId") + "";
        if (shopId == null || shopId.equals("null")) {
            String multipleId = session.getAttribute("multipleId") + "";
            try {
                List<HeadShop> shops = headShopService.findByMutId(multipleId);
                model.addAttribute("shops", shops);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            HeadShop shop = (HeadShop) session.getAttribute("shop");
            List list = new ArrayList();
            list.add(shop);
            model.addAttribute("shops", list);
        }
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        model.addAttribute("commodity", zomoreCommodityServiceImpl.selectByPage(1, 10));
        return "forward:/pages/marketingdejzk.jsp";
    }

    //*添加商品第二件折扣
    @RequestMapping("dejzk")
    public String dejzk(MarketingPromotion marketingPromotion, String commodityName, String commodityCode, String[] zomoreCommodityCode, Integer zekou) {
        Long l = System.currentTimeMillis();
        if (commodityCode != null) {
            ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(commodityCode);
            if (zomoreCommodityCode != null) {
                marketingPromotion.setPromotionnum(zomoreCommodityCode.length);
                for (String code : zomoreCommodityCode) {
                    //保存第二件打折商品
                    MarketingCommodityTwo two = new MarketingCommodityTwo();
                    ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
                    two.setCommodityCode(commodity.getZomoreCommodityCode());
                    two.setCommodityDiscount(zekou + "");
                    two.setCommodityOldprice(commodity.getZomoreCommodityOut());
                    two.setCommodityPrice((Double.parseDouble(commodity.getZomoreCommodityOut()) * zekou / 100) + "");
                    two.setCommodityName(commodity.getZomoreCommodityName());
                    two.setCommodityId(commodity.getZomoreCommodityId());
                    two.setCommodityType(commodity.getZomoreCommodityType());
                    two.setCommodityCodeOne(zomoreCommodity.getZomoreCommodityCode());
                    two.setCommodityNameOne(zomoreCommodity.getZomoreCommodityName());
                    two.setCommodityPriceOne(zomoreCommodity.getZomoreCommodityOut());
                    two.setMarketingPromotionId(l + "");
                    marketingCommodityTwoServiceImpl.insert(two);

                    //保存促销商品(总表里面)
                    MarketingCommodity commodity1 = new MarketingCommodity();
                    commodity1.setEndtime(marketingPromotion.getDuetime());
                    commodity1.setStartime(marketingPromotion.getCreatetime());
                    commodity1.setMarketingCommodityCode(commodity.getZomoreCommodityCode());
                    commodity1.setMarketingCommodityPrice(commodity.getZomoreCommodityOut());
                    commodity1.setMarketingCommodityId(commodity.getZomoreCommodityId());
                    commodity1.setMarketingCommodityName(commodity.getZomoreCommodityName());
                    commodity1.setMarketingCommodityType(commodity.getZomoreCommodityType());
                    commodity1.setMarketingCommodityOldprice(commodity.getZomoreCommodityOut());
                    commodity1.setMarketingShop(marketingPromotion.getPromotionshop());
                    commodity1.setMarketingType(marketingPromotion.getPromotiontype());
                    commodity1.setStartime(marketingPromotion.getCreatetime());
                    commodity1.setEndtime(marketingPromotion.getDuetime());
                    commodity1.setMarketingPromotionId(l + "");
                    marketingPromotionService1Impl.insertMarketingCommodity(commodity1);
                }
            }
            //保存促销商品
            MarketingCommodity commodity = new MarketingCommodity();
            commodity.setEndtime(marketingPromotion.getDuetime());
            commodity.setStartime(marketingPromotion.getCreatetime());
            commodity.setMarketingCommodityCode(zomoreCommodity.getZomoreCommodityCode());
            commodity.setMarketingCommodityPrice(zomoreCommodity.getZomoreCommodityOut());
            commodity.setMarketingCommodityId(zomoreCommodity.getZomoreCommodityId());
            commodity.setMarketingCommodityName(zomoreCommodity.getZomoreCommodityName());
            commodity.setMarketingCommodityType(zomoreCommodity.getZomoreCommodityType());
            commodity.setMarketingCommodityOldprice(zomoreCommodity.getZomoreCommodityOut());
            commodity.setMarketingShop(marketingPromotion.getPromotionshop());
            commodity.setMarketingType(marketingPromotion.getPromotiontype());
            commodity.setStartime(marketingPromotion.getCreatetime());
            commodity.setEndtime(marketingPromotion.getDuetime());
            commodity.setMarketingPromotionId(l + "");
            marketingPromotionService1Impl.insertMarketingCommodity(commodity);
        }
        //保存促销记录
        marketingPromotion.setPromotionid(l + "");
        marketingPromotion.setStatus(1);
        marketingPromotion.setMultipleid(session.getAttribute("multipleId") + "");
        marketingPromotion.setCreateshop(session.getAttribute("shopName") + "");
        marketingPromotionService1Impl.insertMarketingPromotion(marketingPromotion);
        String shopId = marketingPromotion.getShopid();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;

    }

    //*跳转到梯度折扣页面
    @RequestMapping("marketAddtdzk")
    public String marketAddtdzk(Model model) {
        //促销门店判断当前门店是否是总店（shopId空）
        String shopId = session.getAttribute("shopId") + "";
        if (shopId == null || shopId.equals("null")) {
            String multipleId = session.getAttribute("multipleId") + "";
            try {
                List<HeadShop> shops = headShopService.findByMutId(multipleId);
                model.addAttribute("shops", shops);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            HeadShop shop = (HeadShop) session.getAttribute("shop");
            List list = new ArrayList();
            list.add(shop);
            model.addAttribute("shops", list);
        }
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        model.addAttribute("commodity", zomoreCommodityServiceImpl.selectByPage(1, 10));
        return "forward:/pages/marketingtdzk.jsp";
    }
    //*添加梯度折扣商品
    @RequestMapping("tdzk")
    public String tdzk(MarketingPromotion marketingPromotion, String discount, Integer num, String[] zomoreCommodityCode) {
        Long l = System.currentTimeMillis();
        if (zomoreCommodityCode != null && zomoreCommodityCode.length > 0) {
            marketingPromotion.setPromotionnum(zomoreCommodityCode.length);
            for (String code : zomoreCommodityCode) {
                //保存梯度折扣
                MarketingCommodityTd td = new MarketingCommodityTd();
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
                td.setCommodityCode(commodity.getZomoreCommodityCode());
                td.setCommodityDiscount(discount);
                td.setCommodityId(commodity.getZomoreCommodityId());
                td.setCommodityOldprice(commodity.getZomoreCommodityOut());
                td.setNum(num);
                td.setCommodityName(commodity.getZomoreCommodityName());
                td.setCommodityType(commodity.getZomoreCommodityType());
                td.setMarketingPromotionId(l+"");
                marketingCommodityTdServiceImpl.insert(td);

                //保存促销商品(总表里面)
                MarketingCommodity commodity1 = new MarketingCommodity();
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setMarketingCommodityCode(commodity.getZomoreCommodityCode());
                commodity1.setMarketingCommodityPrice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingCommodityId(commodity.getZomoreCommodityId());
                commodity1.setMarketingCommodityName(commodity.getZomoreCommodityName());
                commodity1.setMarketingCommodityType(commodity.getZomoreCommodityType());
                commodity1.setMarketingCommodityOldprice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingShop(marketingPromotion.getPromotionshop());
                commodity1.setMarketingType(marketingPromotion.getPromotiontype());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setMarketingPromotionId(l + "");
                marketingPromotionService1Impl.insertMarketingCommodity(commodity1);
            }

        }
        //保存促销记录
        marketingPromotion.setPromotionid(l + "");
        marketingPromotion.setStatus(1);
        marketingPromotion.setMultipleid(session.getAttribute("multipleId") + "");
        marketingPromotion.setCreateshop(session.getAttribute("shopName") + "");
        marketingPromotionService1Impl.insertMarketingPromotion(marketingPromotion);
        String shopId = marketingPromotion.getShopid();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //*套餐促销页面
    @RequestMapping("marketAddtccx")
    public String marketAddtccx(Model model) {
        //促销门店判断当前门店是否是总店（shopId空）
        String shopId = session.getAttribute("shopId") + "";
        if (shopId == null || shopId.equals("null")) {
            String multipleId = session.getAttribute("multipleId") + "";
            try {
                List<HeadShop> shops = headShopService.findByMutId(multipleId);
                model.addAttribute("shops", shops);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            HeadShop shop = (HeadShop) session.getAttribute("shop");
            List list = new ArrayList();
            list.add(shop);
            model.addAttribute("shops", list);
        }
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        model.addAttribute("commodity", zomoreCommodityServiceImpl.selectByPage(1, 10));
        return "forward:/pages/marketingtccx.jsp";
    }

    //*添加套餐促销商品
    @RequestMapping("tccx")
    public String tdzk(MarketingPromotion marketingPromotion,String[] zomoreCommodityCode,String allmoney){
        Long l = System.currentTimeMillis();
        if(zomoreCommodityCode!=null&&zomoreCommodityCode.length>0){
            marketingPromotion.setPromotionnum(zomoreCommodityCode.length);
            for (String code : zomoreCommodityCode) {
                //保存进套餐促销表里
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
                MarketingCommodityTc tc=new MarketingCommodityTc();
                tc.setCommodityCode(commodity.getZomoreCommodityCode());
                tc.setCommodityId(commodity.getZomoreCommodityId());
                tc.setCommodityName(commodity.getZomoreCommodityName());
                tc.setMarketingPromotionId(l+"");
                tc.setCommodityType(commodity.getZomoreCommodityType());
                tc.setCommodityPrice(commodity.getZomoreCommodityOut());
                tc.setPrice(allmoney);
                marketingCommodityTcServiceImpl.insert(tc);
                //保存促销商品(总表里面)
                MarketingCommodity commodity1 = new MarketingCommodity();
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setMarketingCommodityCode(commodity.getZomoreCommodityCode());
                commodity1.setMarketingCommodityPrice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingCommodityId(commodity.getZomoreCommodityId());
                commodity1.setMarketingCommodityName(commodity.getZomoreCommodityName());
                commodity1.setMarketingCommodityType(commodity.getZomoreCommodityType());
                commodity1.setMarketingCommodityOldprice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingShop(marketingPromotion.getPromotionshop());
                commodity1.setMarketingType(marketingPromotion.getPromotiontype());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setMarketingPromotionId(l + "");
                marketingPromotionService1Impl.insertMarketingCommodity(commodity1);
            }
        }
        //保存促销记录
        marketingPromotion.setPromotionid(l + "");
        marketingPromotion.setStatus(1);
        marketingPromotion.setMultipleid(session.getAttribute("multipleId") + "");
        marketingPromotion.setCreateshop(session.getAttribute("shopName") + "");
        marketingPromotionService1Impl.insertMarketingPromotion(marketingPromotion);
        String shopId = marketingPromotion.getShopid();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }
    //*满额返现页面
    @RequestMapping("marketAddmefx")
    public String marketAddmefx(Model model){
        //促销门店判断当前门店是否是总店（shopId空）
        String shopId = session.getAttribute("shopId") + "";
        if (shopId == null || shopId.equals("null")) {
            String multipleId = session.getAttribute("multipleId") + "";
            try {
                List<HeadShop> shops = headShopService.findByMutId(multipleId);
                model.addAttribute("shops", shops);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            HeadShop shop = (HeadShop) session.getAttribute("shop");
            List list = new ArrayList();
            list.add(shop);
            model.addAttribute("shops", list);
        }
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        model.addAttribute("commodity", zomoreCommodityServiceImpl.selectByPage(1, 10));
        return "forward:/pages/marketingmefx.jsp";
    }
    @RequestMapping("mefx")
    public String mefx(MarketingPromotion marketingPromotion,String salemomey,String givemoney,String[]zomoreCommodityCode){
        Long l = System.currentTimeMillis();

        if(zomoreCommodityCode!=null&&zomoreCommodityCode.length>0){
            marketingPromotion.setPromotionnum(zomoreCommodityCode.length);
            for (String code : zomoreCommodityCode) {
                MarketingCommodityMefx mefx=new MarketingCommodityMefx();
                //保存进满额返现表里
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);

                mefx.setCommodityCode(commodity.getZomoreCommodityCode());
                mefx.setCommodityId(commodity.getZomoreCommodityId());
                mefx.setCommodityName(commodity.getZomoreCommodityName());
                mefx.setCommodityType(commodity.getZomoreCommodityType());
                mefx.setCommodityPrice(commodity.getZomoreCommodityOut());
                mefx.setMarketingPromotionId(l+"");
                mefx.setSalemoney(Double.parseDouble(salemomey));
                mefx.setGivemoney(Double.parseDouble(givemoney));
                marketingCommodityMefxServiceImpl.insert(mefx);
                //保存促销商品(总表里面)
                MarketingCommodity commodity1 = new MarketingCommodity();
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setMarketingCommodityCode(commodity.getZomoreCommodityCode());
                commodity1.setMarketingCommodityPrice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingCommodityId(commodity.getZomoreCommodityId());
                commodity1.setMarketingCommodityName(commodity.getZomoreCommodityName());
                commodity1.setMarketingCommodityType(commodity.getZomoreCommodityType());
                commodity1.setMarketingCommodityOldprice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingShop(marketingPromotion.getPromotionshop());
                commodity1.setMarketingType(marketingPromotion.getPromotiontype());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setMarketingPromotionId(l + "");
                marketingPromotionService1Impl.insertMarketingCommodity(commodity1);
            }
        }
        //保存促销记录
        marketingPromotion.setPromotionid(l + "");
        marketingPromotion.setStatus(1);
        marketingPromotion.setMultipleid(session.getAttribute("multipleId") + "");
        marketingPromotion.setCreateshop(session.getAttribute("shopName") + "");
        marketingPromotionService1Impl.insertMarketingPromotion(marketingPromotion);
        String shopId = marketingPromotion.getShopid();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //*换购促销页面
    @RequestMapping("marketAddhgcx")
    public String marketAddhgcx(Model model){
        //促销门店判断当前门店是否是总店（shopId空）
        String shopId = session.getAttribute("shopId") + "";
        if (shopId == null || shopId.equals("null")) {
            String multipleId = session.getAttribute("multipleId") + "";
            try {
                List<HeadShop> shops = headShopService.findByMutId(multipleId);
                model.addAttribute("shops", shops);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            HeadShop shop = (HeadShop) session.getAttribute("shop");
            List list = new ArrayList();
            list.add(shop);
            model.addAttribute("shops", list);
        }
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        model.addAttribute("commodity", zomoreCommodityServiceImpl.selectByPage(1, 10));
        return "forward:/pages/marketinghgcx.jsp";
    }

    /**添加换购促销商品
     * @param marketingPromotion
     * @param salemomey 消费满
     * @param givemoney 补差价
     * @param zomoreCommodityCode 原商品
     * @param zomoreCommodityCode1 差价商品
     * @return
     */
    @RequestMapping("hgcx")
    public String hgcx(MarketingPromotion marketingPromotion,String salemomey,String givemoney,String[]zomoreCommodityCode,String[]zomoreCommodityCode1){
        Long l = System.currentTimeMillis();
        if(zomoreCommodityCode!=null&&zomoreCommodityCode1!=null&&zomoreCommodityCode.length>0&&zomoreCommodityCode1.length>0){
          //只有当原商品和差价商品都存在时才进行保存促销商品
         marketingPromotion.setPromotionnum(zomoreCommodityCode.length+zomoreCommodityCode1.length);
            //原商品和差价商品都保存进商品促销总表里面
         //主商品
         for (String code : zomoreCommodityCode) {
                MarketingCommodityHgcx hgcx=new MarketingCommodityHgcx();
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
                hgcx.setCommodityCode(commodity.getZomoreCommodityCode());
                hgcx.setCommodityId(commodity.getZomoreCommodityId());
                hgcx.setCommodityIsmain(1);
                hgcx.setCommodityName(commodity.getZomoreCommodityName());
                hgcx.setCommodityPrice(Double.parseDouble(commodity.getZomoreCommodityOut()));
                hgcx.setCommodityType(commodity.getZomoreCommodityType());
                hgcx.setMarketingPromotionId(l+"");
                hgcx.setMoney(Double.parseDouble(salemomey));
                hgcx.setSubmoney(Double.parseDouble(givemoney));
                marketingCommodityHgcxServiceImpl.insert(hgcx);

                //保存促销商品(总表里面)
                MarketingCommodity commodity1 = new MarketingCommodity();
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setMarketingCommodityCode(commodity.getZomoreCommodityCode());
                commodity1.setMarketingCommodityPrice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingCommodityId(commodity.getZomoreCommodityId());
                commodity1.setMarketingCommodityName(commodity.getZomoreCommodityName());
                commodity1.setMarketingCommodityType(commodity.getZomoreCommodityType());
                commodity1.setMarketingCommodityOldprice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingShop(marketingPromotion.getPromotionshop());
                commodity1.setMarketingType(marketingPromotion.getPromotiontype());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setMarketingPromotionId(l + "");
                marketingPromotionService1Impl.insertMarketingCommodity(commodity1);
            }
            //差价商品
            for (String code : zomoreCommodityCode1) {
                MarketingCommodityHgcx hgcx=new MarketingCommodityHgcx();
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
                hgcx.setCommodityCode(commodity.getZomoreCommodityCode());
                hgcx.setCommodityId(commodity.getZomoreCommodityId());
                hgcx.setCommodityIsmain(0);
                hgcx.setCommodityName(commodity.getZomoreCommodityName());
                hgcx.setCommodityPrice(Double.parseDouble(commodity.getZomoreCommodityOut()));
                hgcx.setCommodityType(commodity.getZomoreCommodityType());
                hgcx.setMarketingPromotionId(l+"");
                hgcx.setMoney(Double.parseDouble(salemomey));
                hgcx.setSubmoney(Double.parseDouble(givemoney));
                marketingCommodityHgcxServiceImpl.insert(hgcx);

                //保存促销商品(总表里面)
                MarketingCommodity commodity1 = new MarketingCommodity();
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setMarketingCommodityCode(commodity.getZomoreCommodityCode());
                commodity1.setMarketingCommodityPrice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingCommodityId(commodity.getZomoreCommodityId());
                commodity1.setMarketingCommodityName(commodity.getZomoreCommodityName());
                commodity1.setMarketingCommodityType(commodity.getZomoreCommodityType());
                commodity1.setMarketingCommodityOldprice(commodity.getZomoreCommodityOut());
                commodity1.setMarketingShop(marketingPromotion.getPromotionshop());
                commodity1.setMarketingType(marketingPromotion.getPromotiontype());
                commodity1.setStartime(marketingPromotion.getCreatetime());
                commodity1.setEndtime(marketingPromotion.getDuetime());
                commodity1.setMarketingPromotionId(l + "");
                marketingPromotionService1Impl.insertMarketingCommodity(commodity1);
            }
        }
        //保存促销记录
        marketingPromotion.setPromotionid(l + "");
        marketingPromotion.setStatus(1);
        marketingPromotion.setMultipleid(session.getAttribute("multipleId") + "");
        marketingPromotion.setCreateshop(session.getAttribute("shopName") + "");
        marketingPromotionService1Impl.insertMarketingPromotion(marketingPromotion);
        String shopId = marketingPromotion.getShopid();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }


    //*根据促销活动id查找促销商品
    @RequestMapping("serarchDiscountComodty")
    public String serarchDiscountComodty(String id, String state, Model model) {
        String shopId = session.getAttribute("shopId") + "";
        String url = "redirect:findAllMarketByShopId.do?shopId=" + shopId;
        if (state.equals("打折/特价")) {
            model.addAttribute("result", marketingPromotionService1Impl.selectMarketingCommodityByid(id));
            url = "forward:/pages/marketingdztjShow.jsp";
        }
        if (state.equals("搭赠促销")) {
            model.addAttribute("result", marketingCommodityGiveServiceImpl.select(id));
            url = "forward:/pages/marketingdzcxShow.jsp";
        }
        if (state.equals("第二件打折")) {
            model.addAttribute("result", marketingCommodityTwoServiceImpl.select(id));
            url = "forward:/pages/marketingdejzkShow.jsp";
        }
        if (state.equals("梯度优惠")) {
            model.addAttribute("result", marketingCommodityTdServiceImpl.select(id));
            url = "forward:/pages/marketingtdyhShow.jsp";
        }
        if (state.equals("套餐促销")) {
            model.addAttribute("result", marketingCommodityTcServiceImpl.select(id));
            url = "forward:/pages/marketingtccxShow.jsp";
        }
        if (state.equals("满额返现")) {
            model.addAttribute("result",  marketingCommodityMefxServiceImpl.select(id));
            url = "forward:/pages/marketingmefxShow.jsp";
        }
        if (state.equals("换购促销")) {
            model.addAttribute("result",  marketingCommodityHgcxServiceImpl.select(id));
            url = "forward:/pages/marketinghgcxShow.jsp";
        }
        return url;
    }
    //*删除促销活动以及促销商品以及促销商品总表
    @RequestMapping("deleteDiscount.do")
    public String deleteDiscount(String id, String state) {
        String shopId = session.getAttribute("shopId") + "";
        //促销记录表以及促销商品总表
        marketingPromotionService1Impl.deletedMarketingPromotion(id);
        if (state.equals("打折/特价")) {
            try {
                marketingDiscountService.deleted(id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (state.equals("搭赠促销")) {
            marketingCommodityGiveServiceImpl.deleted(id);
        }
        if (state.equals("第二件打折")) {
            marketingCommodityTwoServiceImpl.deleted(id);
        }
        if (state.equals("梯度优惠")) {
            marketingCommodityTdServiceImpl.deleted(id);
        }
        if (state.equals("套餐促销")) {
            marketingCommodityTcServiceImpl.deleted(id);
        }
        if (state.equals("满额返现")) {
            marketingCommodityMefxServiceImpl.deleted(id);
        }
        if (state.equals("换购促销")) {
            marketingCommodityHgcxServiceImpl.deleted(id);
        }
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }
    //*根据状态和名称查促销类型
    @RequestMapping("selectByTypeandName")
    public ModelAndView selectByTypeandName(PageResult<MarketingPromotion> page,String stype, String name) {
        ModelAndView mv = new ModelAndView();
        String multipleId = session.getAttribute("multipleId") + "";
        //查找当前店铺创建的优惠和总店创建的优惠
        List<MarketingPromotion> marketingPromotionList = new ArrayList<>();
        if (stype == null || stype.equals("")) {
            page =  marketingPromotionService1Impl.select(page,name);
            marketingPromotionList = page.getItems();
        } else {
            page= marketingPromotionService1Impl.select(page,Integer.parseInt(stype), name);
            marketingPromotionList = page.getItems();
        }
        mv.addObject("stype", stype);
        mv.addObject("name", name);
        mv.addObject("marketingPromotionList", marketingPromotionList);
        mv.addObject("biaozhi", 1);
        mv.setViewName("marketing");
        return mv;
    }

    /*//保存打折/特价活动
        @RequestMapping("/saveDiscount.do")
        public String saveDiscount(MarketingPromotion marketingPromotion, MarketingDiscount marketingDiscount,Long shopId) throws Exception{
            Long l = System.currentTimeMillis();
            marketingPromotion.setPromotionId(l);
            marketingDiscount.setPromotionId(l);
            Random random = new Random();
            int ends = random.nextInt(99) + 1;
            String format1 = String.format("%02d", ends);
            long l1 = Long.parseLong(format1);
            Long g= l + l1;
            marketingDiscount.setDiscountId(g);
            marketingPromotionService.saveDiscount(marketingPromotion,shopId);
            marketingDiscountService.saveDiscount(marketingDiscount,shopId);
            return "";
        }*/
    //为自己的商铺保存梯度优惠活动
    @RequestMapping("saveGradientByShopId.do")
    public String saveGradientByShopId(MarketingPromotion marketingPromotion, MarketingGradient marketingGradient) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingGradient.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingGradient.setGradientId(g);
        marketingPromotion.setStatus(1);
        marketingGradientService.saveGradientByShopId(marketingGradient);
        marketingPromotionService.saveDiscountByShopId(marketingPromotion);
        Long shopId = marketingPromotion.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //为自己的商铺保存满减优惠活动
    @RequestMapping("saveFullreturnByShopId.do")
    public String saveFullreturnByShopId(MarketingPromotion marketingPromotion, MarketingFullreturn marketingFullreturn) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingFullreturn.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingFullreturn.setFullreturnId(g);
        marketingPromotion.setStatus(1);
        marketingFullreturnService.saveFullreturnByShopId(marketingFullreturn);
        marketingPromotionService.saveDiscountByShopId(marketingPromotion);
        Long shopId = marketingPromotion.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //为自己的商铺保存换购优惠活动
    @RequestMapping("saveRepurchaseByShopId.do")
    public String saveRepurchaseByShopId(MarketingPromotion marketingPromotion, MarketingRepurchase marketingRepurchase) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingRepurchase.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingRepurchase.setRepurchaseId(g);
        marketingPromotion.setStatus(1);
        marketingRepurchaseService.saveRepurchaseByShopId(marketingRepurchase);
        marketingPromotionService.saveDiscountByShopId(marketingPromotion);
        Long shopId = marketingPromotion.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //为自己的商铺保存搭赠促销活动
    @RequestMapping("saveGifteByShopId.do")
    public String saveGifteByShopId(MarketingPromotion marketingPromotion, MarketingGift marketingGift) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingGift.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingGift.setGiftId(g);
        marketingPromotion.setStatus(1);
        marketingGiftService.saveGifteByShopId(marketingGift);
        marketingPromotionService.saveDiscountByShopId(marketingPromotion);
        Long shopId = marketingPromotion.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //为自己的商铺保存第二件打折活动
    @RequestMapping("saveSeconddiscountByShopId.do")
    public String saveSeconddiscountByShopId(MarketingPromotion marketingPromotion, MarketingSeconddiscount marketingSeconddiscount) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingSeconddiscount.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingSeconddiscount.setSeconddiscountId(g);
        marketingPromotion.setStatus(1);
        marketingSeconddiscountService.saveSeconddiscountByShopId(marketingSeconddiscount);
        marketingPromotionService.saveDiscountByShopId(marketingPromotion);
        Long shopId = marketingPromotion.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //为自己的商铺保存套餐促销活动
    @RequestMapping("saveSetmenuByShopId.do")
    public String saveSetmenuByShopId(MarketingPromotion marketingPromotion, MarketingSetmenu marketingSetmenu) throws Exception {
        Long l = System.currentTimeMillis();
        marketingPromotion.setPromotionId(l);
        marketingSetmenu.setPromotionId(l);
        Random random = new Random();
        int ends = random.nextInt(99) + 1;
        String format1 = String.format("%02d", ends);
        long l1 = Long.parseLong(format1);
        Long g = l + l1;
        marketingSetmenu.setSetmenuId(g);
        marketingPromotion.setStatus(1);
        marketingSetmenuService.saveSetmenuByShopId(marketingSetmenu);
        marketingPromotionService.saveDiscountByShopId(marketingPromotion);
        Long shopId = marketingPromotion.getShopId();
        return "redirect:findAllMarketByShopId.do?shopId=" + shopId;
    }

    //查询所有交接班数据
    @RequestMapping("/findAllTurnOver.do")
    public ModelAndView findAllTurnOver(PageResult<Turnover> page) throws Exception {
        ModelAndView mv = new ModelAndView();
        page= headShopService.findAllTurnOver(page);
        List<Turnover> turnoverList =page.getItems();
        mv.addObject("turnoverList", turnoverList);
        mv.setViewName("turnover");
        return mv;
    }

    //保存交接班记录
    @RequestMapping("saveTurnOver.do")
    public String saveTurnOver(Turnover turnover, String beforeTime, String nowTime) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = format.parse(beforeTime);
        Date parse1 = format.parse(nowTime);
        List<ZomoreCommoditySale> zomoreCommoditySaleList = headShopService.findSale(parse, parse1);
        double sum = 0;//实收总额
        double cashsum = 0;//现金
        double unionsum = 0;//银联
        double storagesum = 0;//储蓄卡
        double subcardsum = 0;//次卡
        String casher = "";
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
            casher = zomoreCommoditySale.getZomoreCommoditySaleName();
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        String str = df.format(sum);
        String str1 = df.format(cashsum);
        turnover.setCreatetime(parse);
        turnover.setDuetime(parse1);
        turnover.setCashier(casher);
        turnover.setTotalmoney(str);
        turnover.setCash(str1);
        turnover.setUnionpay(unionsum + "");
        turnover.setStoragecard(storagesum + "");
        turnover.setSubcard(subcardsum + "");
        turnover.setReadycash(500 + "");
        turnover.setPaidamount(700 + "");
        headShopService.saveTurnOver(turnover);
        return "redirect:findAllTurnOver.do";
    }

    //保存日结记录表
    @RequestMapping("/saveDaily.do")
    public String saveDaily(String beforeTime, String nowTime, Dailyreport dailyReport) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = format.parse(beforeTime);
        Date parse1 = format.parse(nowTime);
        List<ZomoreCommoditySale> zomoreCommoditySaleList = headShopService.findSale(parse, parse1);
        double sum = 0;//实收总额
        double cashsum = 0;//现金
        double unionsum = 0;//银联
        double storagesum = 0;//储蓄卡
        double subcardsum = 0;//次卡
        double wxsum = 0;//微信
        double alisum = 0;//支付宝
        String casher = "";

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
            if (zomoreCommoditySale.getZomoreCommoditySaleType().equals("2") && zomoreCommoditySale.getZomoreCommodityState() == 1) {
                wxsum += Double.parseDouble(zomoreCommoditySale.getZomoreCommoditySaleInmoney());
            }
            if (zomoreCommoditySale.getZomoreCommoditySaleType().equals("4") && zomoreCommoditySale.getZomoreCommodityState() == 1) {
                alisum += Double.parseDouble(zomoreCommoditySale.getZomoreCommoditySaleInmoney());
            }
            casher = zomoreCommoditySale.getZomoreCommoditySaleName();
        }

        DecimalFormat df = new DecimalFormat("#0.00");
        String str = df.format(sum);
        String str1 = df.format(cashsum);
        dailyReport.setCreatetime(parse);
        dailyReport.setDuetime(parse1);
        dailyReport.setCashier(casher);
        dailyReport.setTotalmoney(str);
        dailyReport.setCash(str1);
        dailyReport.setUnionpay(unionsum + "");
        dailyReport.setStoragecard(storagesum + "");
        dailyReport.setSubcard(subcardsum + "");
        dailyReport.setWxpay(wxsum + "");
        dailyReport.setAlipay(alisum + "");
        headShopService.saveDailyReport(dailyReport);

        return "redirect:findAllDaily.do";

    }

    //查询所有日结记录表
    @RequestMapping("/findAllDaily.do")
    public ModelAndView findAllDaily(PageResult<Dailyreport> page) throws Exception {
        ModelAndView mv = new ModelAndView();
        page = headShopService.findAllDaily(page);
        List<Dailyreport> dailyReportList = page.getItems();
        mv.addObject("dailyReportList", dailyReportList);
        mv.setViewName("daily");
        return mv;
    }


    //查询所有预约
    @RequestMapping("/findAllReservation.do")
    public ModelAndView findAllReservation(PageResult<Reservation> page,HttpSession session) throws Exception {
        ModelAndView mv = new ModelAndView();
        page = headShopService.findAllReservation(page,session.getAttribute("shopName")+"");
        List<Reservation> reservationList = page.getItems();
        mv.addObject("reservationList", reservationList);
        mv.addObject("size", reservationList.size());
        mv.setViewName("reservation");
        return mv;

    }
}
