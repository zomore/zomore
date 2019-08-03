package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.domain.ZomoreCommodity;
import com.zomore.result.ZomoreCommodityResult;
import com.zomore.service.*;
import com.zomore.service.impl.MarketingCommodityTdServiceImpl;
import com.zomore.service.impl.ZomoreCommodityLossServiceImpl;
import com.zomore.utils.PageResult;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

//商品
@Controller("zomoreCommodityAction")
@RequestMapping("zomoreCommodity")
public class ZomoreCommodityAction {
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreCommodityCategoryService zomoreCommodityCategoryServiceImpl;
    @Resource
    private ZomoreSupplierService zomoreSupplierServiceImpl;
    @Resource
    private ZomoreServiceCommodityService zomoreServiceCommodityServiceImpl;
    @Resource
    private ZomoreInventoryhistoryService zomoreInventoryhistoryServiceImpl;
    @Resource
    private ZomoreStocktakingService zomoreStocktakingServiceImpl;
    @Resource
    private ZomoreCommodityIntogoodsService zomoreCommodityIntogoodsServiceImpl;
    @Resource
    private ZomoreCommodityIntogoodsHistoryService zomoreCommodityIntogoodsHistoryServiceImpl;
    @Resource
    private ZomoreCommodityLossCommodityService zomoreCommodityLossCommodityServiceImpl;
    @Resource
    private ZomoreCommodityLossService zomoreCommodityLossServiceImpl;
    @Resource
    private ZomoreCommodityOrdergoodsService zomoreCommodityOrdergoodsServiceImpl;
    @Resource
    private ZomoreCommodityOrdergoodsCommodityService zomoreCommodityOrdergoodsCommodityServiceImpl;
    @Resource
    private ZomoreCommodityTransferService zomoreCommodityTransferServiceImpl;
    @Resource
    private MarketingPromotionService1 marketingPromotionService1Impl;
    @Resource
    private ZomoreCommodityChangeService zomoreCommodityChangeServiceImpl;
    @Resource
    ServletContext servletContext;
    @Resource
    private CommodityDataBaseService CommodityDataBaseService;
    @Resource
    private MarketingCommodityGiveService marketingCommodityGiveServiceImpl;
    @Resource
    private MarketingCommodityTcService marketingCommodityTcServiceImpl;
    @Resource
    private MarketingCommodityTdService marketingCommodityTdServiceImpl;
    @Resource
    private MarketingCommodityHgcxService marketingCommodityHgcxServiceImpl;
    @Resource
    private MarketingCommodityMefxService marketingCommodityMefxServiceImpl;


    //获取条形码的商品信息
    @GetMapping("getCommodityCode")
    @ResponseBody
    private Object getCommodityCode(@RequestParam("commodityCode") String commodityCode){
        return CommodityDataBaseService.selectCommodityByCode(commodityCode);
    }


    //商品概览
    @RequestMapping("showEChart")
    public String showEChart(Model model) {
        //服务项目(种)
        Long serviceNum = zomoreServiceCommodityServiceImpl.countCommodity();
        model.addAttribute("serviceNum", serviceNum);
        //保留两位小数
        DecimalFormat df = new DecimalFormat("#0.00");
        //商品数量(种)
        List<ZomoreCommodityResult> zomoreCommodities = zomoreCommodityServiceImpl.selectAll();
        model.addAttribute("CommoditieNum", zomoreCommodities.size() + serviceNum);
        //商品品类消费排名

        //服务项目消费排名
        //敏感单据*
        //库存变动*
        return "forward:/pages/zomoreCommodityChart.jsp";
    }

    //前台页面添加商品
    @RequestMapping("add1")
    @ResponseBody
    public String add1(ZomoreCommodity zomoreCommodity, ZomoreCommodityStore store, MultipartFile file) {
        //添加图片
        if (file != null && !file.isEmpty()) {
            String path = "";
            String filename = "";
            //保存头像
            try {
                //文件名称
                filename = UUID.randomUUID().toString().replaceAll("-", "") + file.getOriginalFilename();
                //保存路径
                path = servletContext.getRealPath("/") + "upload/" + filename;  //保存新文件
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
            } catch (Exception e) {
                e.printStackTrace();
            }
            zomoreCommodity.setZomoreCommodityImage(filename);
        }
        zomoreCommodity.setZomoreCommodityId(Long.toString(System.currentTimeMillis()));
        //添加库存
        store.setZomoreCommodityId(Long.toString(System.currentTimeMillis()));
        zomoreCommodityStoreServiceImpl.insertCommodityStore(store);
        //保存商品
        zomoreCommodityServiceImpl.insert(zomoreCommodity);
        return "success";
    }

    //分页查询商品资料
    @RequestMapping("list")
    public String select(Model model) {
        List<ZomoreCommodityResult> zomoreCommodity = zomoreCommodityServiceImpl.selectByPage(1, 50);
        model.addAttribute("result", zomoreCommodity);
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        //保存供货商用于编辑和添加动态选择
        model.addAttribute("suppliers", zomoreSupplierServiceImpl.select());
        return "forward:/pages/zomoreCommodity.jsp";
    }

    //跳转到添加商品资料页面
    @RequestMapping("addUI")
    public String addUI() {
        return "forward:/pages/addzomoreCommodity.jsp";
    }

    //添加商品资料信息
    @RequestMapping("add")
    public String add(ZomoreCommodity zomoreCommodity, ZomoreCommodityStore store, MultipartFile file) {
        //添加图片
        if (file != null && !file.isEmpty()) {
            String path = "";
            String filename = "";
            //保存头像
            try {
                //文件名称
                filename = UUID.randomUUID().toString().replaceAll("-", "") + file.getOriginalFilename();
                //保存路径
                path = servletContext.getRealPath("/") + "upload/" + filename;  //保存新文件
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
            } catch (Exception e) {
                e.printStackTrace();
            }
            zomoreCommodity.setZomoreCommodityImage(filename);
        }
        zomoreCommodity.setZomoreCommodityId(Long.toString(System.currentTimeMillis()));

        //添加库存
        store.setZomoreCommodityId(Long.toString(System.currentTimeMillis()));
        zomoreCommodityStoreServiceImpl.insertCommodityStore(store);
        //保存商品
        zomoreCommodityServiceImpl.insert(zomoreCommodity);
        return "redirect:/zomoreCommodity/list.do";
    }


    //跳转到商品资料编辑页面
    @RequestMapping("editUI")
    public String editUI(String id, Model model) {
        model.addAttribute("store", zomoreCommodityStoreServiceImpl.selectByCommodityId(id));
        model.addAttribute("result", zomoreCommodityServiceImpl.selectById(id));
        return "forward:/pages/editzomoreCommodity.jsp";
    }

    //动态获取商品信息，用于数据回显
    @RequestMapping("updateAjax")
    @ResponseBody
    public Map updateAjax(String id) {
        Map map = new HashMap();
        map.put("store", zomoreCommodityStoreServiceImpl.selectByCommodityId(id));
        map.put("result", zomoreCommodityServiceImpl.selectById(id));
        return map;
    }

    @RequestMapping("update")
    @ResponseBody
    public String update( String price) {
        String id="";
        Random random=new Random();
        for(int i=0;i<13;i++){
            id+=random.nextInt(10);
        }
        ZomoreCommodity zomoreCommodity1 = zomoreCommodityServiceImpl.selectByCode(id);
        if (zomoreCommodity1 == null) {
            ZomoreCommodity zomoreCommodity2 = new ZomoreCommodity();
            zomoreCommodity2.setZomoreCommodityId(System.currentTimeMillis() + "");
            zomoreCommodity2.setZomoreCommodityName("无码商品");
            zomoreCommodity2.setZomoreCommodityCode(id);
            zomoreCommodityServiceImpl.insert(zomoreCommodity2);
        }
        ZomoreCommodity zomoreCommodity = new ZomoreCommodity();
        zomoreCommodity.setZomoreCommodityCode(id);
        zomoreCommodity.setZomoreCommodityIn(price);
        zomoreCommodity.setZomoreCommodityOut(price);
        zomoreCommodity.setZomoreCommodityOutall(price);
        zomoreCommodity.setZomoreCommodityMemberprice(price);
        boolean b = zomoreCommodityServiceImpl.updateBycode(zomoreCommodity);
        if (b)
            return id;
        return "error";
    }

    //更新商品资料信息
    @RequestMapping("edit")
    public String edit(ZomoreCommodity zomoreCommodity, ZomoreCommodityStore store, MultipartFile file) {
        //修改图片
        String path = "";
        String filename = "";
        if (file != null && !file.isEmpty()) {
            //删除原来头像（*）
            if (zomoreCommodity.getZomoreCommodityImage() != null && !zomoreCommodity.getZomoreCommodityImage().equals("")) {
                path = servletContext.getRealPath("/") + "upload/" + zomoreCommodity.getZomoreCommodityImage();
                //删除原来的头像文件
                File oldfile = new File(path);
                if (oldfile.exists()) {//判断头像是否存在
                    oldfile.delete();
                }
                //保存新添加的头像（*）
                try {
                    //文件名称
                    filename = UUID.randomUUID().toString().replaceAll("-", "") + file.getOriginalFilename();
                    //保存路径
                    path = servletContext.getRealPath("/") + "upload/" + filename;  //保存新文件
                    FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            zomoreCommodity.setZomoreCommodityImage(filename);
        }
        //更新库存
        zomoreCommodityStoreServiceImpl.updateCommodityStoreid(store);
        zomoreCommodityServiceImpl.updateByid(zomoreCommodity);
        return "redirect:/zomoreCommodity/list.do";
    }

    //删除商品资料信息
    @RequestMapping("deleted")
    public String deleted(String ids) {
        //删除图片
        ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectById(ids);
        if (zomoreCommodity.getZomoreCommodityImage() != null && !zomoreCommodity.getZomoreCommodityImage().equals("")) {
            String path = "";
            String filename = "";
            path = servletContext.getRealPath("/") + "upload/" + zomoreCommodity.getZomoreCommodityImage();
            //删除原来的头像文件
            File oldfile = new File(path);
            if (oldfile.exists()) {//判断头像是否存在
                oldfile.delete();
            }
        }
        //删除库存
        zomoreCommodityStoreServiceImpl.deleteCommodityId(ids);

        zomoreCommodityServiceImpl.deletedById(ids);
        return "redirect:/zomoreCommodity/list.do";
    }

    //Excel表数据导入商品
    @RequestMapping("importExcel")
    @ResponseBody
    public String importExcel(MultipartFile importExcelfile) {
        try {
            if (importExcelfile != null) {
                if (importExcelfile.getOriginalFilename().matches("^.+\\.(?i)((xls)|(xlsx))$")) {
                    zomoreCommodityServiceImpl.inportExcel(importExcelfile);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }

    //导出商品Excel
    //导出数据库数据进excel表
    @RequestMapping("exportExcel")
    public void exportExcel(HttpServletResponse response) {
        //1、获取商品列表
        //2、输出excel
        ServletOutputStream outputStream = null;
        try {
            response.setContentType("application/x-excel");
            response.setHeader("Content-Disposition", "attachment;filename=" + new String("商品资料.xls".getBytes(), "ISO-8859-1"));
            outputStream = response.getOutputStream();
            //所有商品资料
            List<ZomoreCommodityResult> zomoreCommodities = zomoreCommodityServiceImpl.selectAll();
            zomoreCommodityServiceImpl.exportExcel(zomoreCommodities, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //前台，根据商品条码查找商品，使用ajax访问
    @RequestMapping("searchByCode")
    @ResponseBody
    public List searchByCode(String code, HttpSession session) {
      /*  //根据门店和条码查询和时间（取开始时间最新的即是id的逆序）：打折特价
        MarketingCommodity commodity1 = marketingPromotionService1Impl.selectMarketingCommodity(code);*/

       ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
        List list = new ArrayList();
        Map<String,Object> map = new HashMap<>();
        //如果commoity不为空
        if(commodity!=null){
            //查询是否有活动
            List<MarketingPromotion> marketingPromotions = marketingPromotionService1Impl.selectPromotionByShopName(session.getAttribute("shopName")+"");
            String msg ="";
            if(marketingPromotions!=null&&marketingPromotions.size()>0){
                for(int i=0;i<marketingPromotions.size();i++){
                    if(marketingPromotions.get(i).getStatusStr().equals("有效")){
                        msg+=marketingPromotions.get(i).getPromotionTypeStr()+",";
                    }
                }
                if(!msg.equals("")){
                    msg=msg.substring(0, msg.length()- 1);
                }
            }
            map.put("promotionName",msg);
        }

        //商品条码
        map.put("id", commodity.getZomoreCommodityCode());
        //商品名称
        map.put("name", commodity.getZomoreCommodityName());
        //原价
        map.put("oldprivice", commodity.getZomoreCommodityOut());
        //折扣
        map.put("discount", 100);
        //数量
        map.put("num", 1);

        /*if (commodity1 != null && commodity1.getMarketingCommodityType().equals(1)) {
            //修改特定的价格
            commodity.setZomoreCommodityOut(commodity1.getMarketingCommodityPrice());
        }*/
        //现价
        map.put("newprivice", Double.parseDouble(commodity.getZomoreCommodityOut()));
        //小计
        map.put("money", Double.parseDouble(commodity.getZomoreCommodityOut()));
        //规格
        map.put("guige", commodity.getZomoreCommoditySpecifications());
        //货号
        map.put("huohao", commodity.getZomoreCommodityNum());
        list.add(map);

        return list;
    }

    @RequestMapping("searchPromotion")
    @ResponseBody
    public List<Map<String,Object>> searchPromotion(String[] code,String nowCode, HttpSession session,String promotionNames ,Integer[] num){
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();

        ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(nowCode);
        //商品条码
        map.put("id", commodity.getZomoreCommodityCode());
        //商品名称
        map.put("name", commodity.getZomoreCommodityName());
        //原价
        map.put("oldprivice", commodity.getZomoreCommodityOut());
        //折扣
        map.put("discount", 100);
        //数量
        map.put("num", 1);

        /*if (commodity1 != null && commodity1.getMarketingCommodityType().equals(1)) {
            //修改特定的价格
            commodity.setZomoreCommodityOut(commodity1.getMarketingCommodityPrice());
        }*/
        //现价
        map.put("newprivice", Double.parseDouble(commodity.getZomoreCommodityOut()));
        //小计
        map.put("money", Double.parseDouble(commodity.getZomoreCommodityOut()));
        //规格
        map.put("guige", commodity.getZomoreCommoditySpecifications());
        //货号
        map.put("huohao", commodity.getZomoreCommodityNum());
        //是否是会员专享
        map.put("huiyuan","");
        //会员折上折
        map.put("promotionZekou","");
        map.put("promotionName","");
        //满额返现活动商品
        map.put("mefxCommodity","");


        String[] names=promotionNames.split(",");
        Integer dzcx=0,tccx=0,dejdz=0,dztj=0,tdyh=0,hgcx=0,mefx=0;
        if(names.length>0){
            for(int i=0;i<names.length;i++){
                if(names[i].equals("搭赠促销")){ dzcx=1; }
                if(names[i].equals("套餐促销")){ tccx=1; }
                if(names[i].equals("第二件打折")){ dejdz=1; }
                if(names[i].equals("打折/特价")){ dztj=1; }
                if(names[i].equals("梯度优惠")){ tdyh=1; }
                if(names[i].equals("换购促销")){ hgcx=1; }
                if(names[i].equals("满额返现")){ mefx=1; }
            }
        }
        //第一优先度
        if(dzcx==1){
            List<MarketingPromotion> marketingPromotions = marketingPromotionService1Impl.selectPromotionByShopNameAndType(session.getAttribute("shopName")+"",5);
            if(marketingPromotions!=null&&marketingPromotions.size()>0){
                //该商品是否是赠品
                Integer zp =0;
                //记录是会员专享
                String huiyuan="";
                for(int i=0;i<marketingPromotions.size();i++){
                    if(marketingPromotions.get(i).getStatusStr().equals("有效")){
                        //查询主商品
                        //主商品
                        List<MarketingCommodity> mainCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotions.get(i).getPromotionid());
                        Integer num2=0;
                        for(int j=0;j<code.length;j++){
                            for (int k=0;k<mainCommodities.size();k++){
                                if(code[j].equals(mainCommodities.get(k).getMarketingCommodityCode())&&num[j]>=mainCommodities.get(k).getMarketingCommodityNum()){
                                    num2++;
                                }
                            }
                        }
                        //满足条件
                        if(num2==mainCommodities.size()){
                            //查询赠品
                            List<MarketingCommodityGive> giveCommoditys = marketingCommodityGiveServiceImpl.select(marketingPromotions.get(i).getPromotionid());
                            //该商品是否是赠品
                            for (int l=0;l<giveCommoditys.size();l++){
                                if(nowCode.equals(giveCommoditys.get(l).getCommodityCode())){
                                    zp=1;
                                    huiyuan=String.valueOf(i);//活动下标

                                }
                            }
                        }



                    }
                }

                if(zp==1){
                    //是否会员专享
                    if(!huiyuan.equals("")){
                        if(marketingPromotions.get(Integer.valueOf(huiyuan)).getPromotionScope().contains("会员专享")){

                                map.put("huiyuan",marketingPromotions.get(Integer.valueOf(huiyuan)).getPromotionid());
                                map.put("promotionZekou",marketingPromotions.get(Integer.valueOf(huiyuan)).getIsmember());
                               map.put("promotionName","搭赠促销");
                                list.add(map);
                                return list;
                        }else {
                            //现价
                            map.put("newprivice", 0);
                            //小计
                            map.put("money", 0);
                            //折扣
                            map.put("discount", 0);
                            //活动是否会员折上折
                            map.put("promotionZekou",marketingPromotions.get(Integer.valueOf(huiyuan)).getIsmember());
                            map.put("promotionName","搭赠促销");
                            list.add(map);
                            return list;

                        }
                    }

                }else {
                    //不是赠品
                    list.add(map);
                    return list;
                }

            }

        }
        //第二优先度,套餐促销
        if(tccx==1){
            List<MarketingPromotion> marketingPromotions = marketingPromotionService1Impl.selectPromotionByShopNameAndType(session.getAttribute("shopName")+"",7);
            List<String> stringList = new ArrayList<>();
            for (int i=0;i<code.length;i++){
                stringList.add(code[i]);
            }
            stringList.add(nowCode);

            if(marketingPromotions!=null&&marketingPromotions.size()>0){
                for(int i=0;i<marketingPromotions.size();i++){
                    if(marketingPromotions.get(i).getStatusStr().equals("有效")){
                        //套餐商品
                        int tcNum=0;
                        int tcNum2=0;
                        List<MarketingCommodity> mainCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotions.get(i).getPromotionid());

                        //是否已经经过套餐减免
                        for(int j=0;j<code.length;j++){
                            for (int k=0;k<mainCommodities.size();k++){
                                if(code[j].equals(mainCommodities.get(k).getMarketingCommodityCode())){
                                    tcNum2++;
                                }
                            }
                        }

                        if(tcNum2<mainCommodities.size()){
                            for(int j=0;j<stringList.size();j++){
                                for (int k=0;k<mainCommodities.size();k++){
                                    if(stringList.get(j).equals(mainCommodities.get(k).getMarketingCommodityCode())){
                                        tcNum++;

                                    }
                                }
                            }
                        }
                        //满足条件
                        if(tcNum>=mainCommodities.size()){
                            //查询套餐价
                            //套餐信息
                            List<MarketingCommodityTc> tc = marketingCommodityTcServiceImpl.select(marketingPromotions.get(i).getPromotionid());
                            if(tc!=null&&tc.size()>0){
                                //是否是会员专享
                                if(marketingPromotions.get(i).getPromotionScope().contains("会员专享")){
                                    map.put("huiyuan",marketingPromotions.get(i).getPromotionid());
                                    map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                    map.put("promotionName","套餐促销");
                                    list.add(map);
                                    return list;
                                }else{

                                    map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                    map.put("oldPrice",tc.get(0).getCommodityPrice());
                                    map.put("tcPirce",tc.get(0).getPrice());
                                    map.put("promotionName","套餐促销");
                                    list.add(map);
                                    return list;
                                }

                            }

                        }

                    }
                }

            }

        }
        //第三优先度
        if(dejdz==1){
            List<MarketingPromotion> marketingPromotions = marketingPromotionService1Impl.selectPromotionByShopNameAndType(session.getAttribute("shopName")+"",6);
            if(marketingPromotions!=null&&marketingPromotions.size()>0){
               for(int i=0;i<marketingPromotions.size();i++){
                   if(marketingPromotions.get(i).getStatusStr().equals("有效")){
                       MarketingCommodity marketingCommodity =null;
                       Integer num2=0;
                       List<MarketingCommodity> mainCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotions.get(i).getPromotionid());
                        if(mainCommodities!=null&&mainCommodities.size()>0){
                            for(int j=0;j<code.length;j++){
                               if(nowCode.equals(code[j])){
                                   num2++;
                               }
                            }

                            for (int k= 0;k<mainCommodities.size();k++){
                                if(nowCode.equals(mainCommodities.get(k).getMarketingCommodityCode())){
                                       if(num2==1){
                                           marketingCommodity=mainCommodities.get(k);
                                       }else{
                                           map.put("promotionName","第二件打折");
                                       }

                                }
                             }

                        }
                        if (marketingCommodity!=null){
                            if(marketingPromotions.get(i).getPromotionscope().contains("会员专享")){
                                map.put("huiyuan",marketingPromotions.get(i).getPromotionid());
                                map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                map.put("promotionName","第二件打折");
                                list.add(map);
                                return list;

                            }else {
                                //现价
                                map.put("newprivice", marketingCommodity.getMarketingCommodityPrice());
                                //小计
                                map.put("money", marketingCommodity.getMarketingCommodityPrice());
                                //折扣
                                map.put("discount", marketingCommodity.getMarketingCommodityDiscount());

                                map.put("promotionName","第二件打折");

                                map.put("promotionZekou",marketingPromotions.get(i).getIsmember());

                                list.add(map);

                                return list;

                            }

                        }

                   }
               }
            }

        }
        //第四优先度
        if(dztj==1){
            //打折特价活动
            List<MarketingPromotion> marketingPromotions = marketingPromotionService1Impl.selectPromotionByShopNameAndType(session.getAttribute("shopName")+"",1);
            if(marketingPromotions!=null&&marketingPromotions.size()>0){
                for(int i=0;i<marketingPromotions.size();i++){
                    if(marketingPromotions.get(i).getStatusStr().equals("有效")){
                        List<MarketingCommodity> marketingCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotions.get(i).getPromotionid());
                        if(marketingCommodities!=null&&marketingCommodities.size()>0){
                            for(int j=0;j<marketingCommodities.size();j++){
                                if(nowCode.equals(marketingCommodities.get(j).getMarketingCommodityCode())){
                                    if(marketingPromotions.get(i).getPromotionscope().contains("会员专享")){
                                        map.put("huiyuan",marketingPromotions.get(i).getPromotionid());
                                        map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                        map.put("promotionName","打折/特价");
                                        list.add(map);
                                        return list;
                                    }else {
                                        DecimalFormat format = new DecimalFormat("0.00");
                                        //现价
                                        map.put("newprivice", marketingCommodities.get(j).getMarketingCommodityPrice());
                                        //小计
                                        map.put("money", marketingCommodities.get(j).getMarketingCommodityPrice());
                                        //折扣
                                        if(marketingCommodities.get(j).getMarketingCommodityDiscount()!=null){
                                            map.put("discount",marketingCommodities.get(j).getMarketingCommodityDiscount());
                                        }else{
                                            Double discount=Double.parseDouble(marketingCommodities.get(j).getMarketingCommodityPrice())/Double.parseDouble(marketingCommodities.get(j).getMarketingCommodityOldprice())*100;
                                            map.put("discount",format.format(discount));
                                        }

                                        map.put("promotionName","打折/特价");

                                        map.put("promotionZekou",marketingPromotions.get(i).getIsmember());

                                        list.add(map);

                                        return list;

                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        //第五优先度
        if(tdyh==1){
            //梯度折扣活动
            List<MarketingPromotion> marketingPromotions = marketingPromotionService1Impl.selectPromotionByShopNameAndType(session.getAttribute("shopName")+"",2);
            if(marketingPromotions!=null&&marketingPromotions.size()>0){
                for(int i=0;i<marketingPromotions.size();i++){
                    if(marketingPromotions.get(i).getStatusStr().equals("有效")){

                        List<MarketingCommodity> marketingCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotions.get(i).getPromotionid());
                        if(marketingCommodities!=null&&marketingCommodities.size()>0){
                           //已经被选的所有条码
                            List<String> stringList = new ArrayList<>();
                            for (int j=0;j<code.length;j++){
                                stringList.add(code[j]);
                            }
                            stringList.add(nowCode);

                            //是梯度折扣商品的条码
                            List<MarketingCommodity> commodityList = new ArrayList<>();
                            for(int k=0;k<stringList.size();k++){
                                for(int h=0;h<marketingCommodities.size();h++){
                                    if(stringList.get(k).equals(marketingCommodities.get(h).getMarketingCommodityCode())){
                                         commodityList.add(marketingCommodities.get(h));
                                    }
                                }
                            }
                            //表示有梯度优惠
                            if(commodityList!=null&&commodityList.size()>0){

                                if(marketingPromotions.get(i).getPromotionscope().contains("会员专享")){
                                    //会员专享+不是折上折=等级折扣
                                    map.put("promotionName","梯度优惠2");
                                    map.put("huiyuan",marketingPromotions.get(i).getPromotionid());
                                    map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                    list.add(map);
                                    return list;
                                }
                                //按照原价格高低排序折扣条码
                                if(commodityList.size()>1){
                                    for(int t=commodityList.size()-1;t>0;t--){
                                        for(int b=0;b<t;b++){
                                            if(Double.parseDouble(commodityList.get(t).getMarketingCommodityOldprice())>Double.parseDouble(commodityList.get(b).getMarketingCommodityOldprice())){
                                                MarketingCommodity marketingCommodity = commodityList.get(t);
                                                commodityList.set(t,commodityList.get(b));
                                                commodityList.set(b,marketingCommodity);
                                            }
                                        }
                                    }

                                }

                                //查询梯度折扣
                                List<MarketingCommodityTd> discount = marketingCommodityTdServiceImpl.select(marketingPromotions.get(i).getPromotionid());
                                if(discount!=null&&discount.size()>0){
                                    for(int y=0;y<discount.size();y++){
                                        if(!discount.get(y).getCommodityDiscount().equals("")){
                                            //折扣
                                            String dis=discount.get(y).getCommodityDiscount();

                                            if(y<commodityList.size()){
                                                //原价
                                                String yprice = commodityList.get(y).getMarketingCommodityOldprice();
                                                //现价
                                                Double xj = Double.parseDouble(dis)*Double.parseDouble(yprice)/100;
                                                //先设折扣为0，在前端通过计算改变
                                                commodityList.get(y).setMarketingCommodityDiscount(0);
                                                commodityList.get(y).setMarketingCommodityPrice(String.valueOf(xj));
                                            }

                                        }
                                    }
                                }

                                //查询总额以及新增条码
                                Double newCountPrice = new Double("0");
                                 //加上新增的小计价格
                                 newCountPrice +=Double.parseDouble(commodity.getZomoreCommodityOut());

                                for(int u=0;u<commodityList.size();u++){
                                    newCountPrice +=Double.parseDouble(commodityList.get(u).getMarketingCommodityPrice());
                                    if(commodityList.get(u).getMarketingCommodityCode().equals(nowCode)){
                                        newCountPrice =newCountPrice-Double.parseDouble(commodity.getZomoreCommodityOut());
                                        DecimalFormat format = new DecimalFormat("0.00");
                                        //现价
                                        map.put("newprivice", commodityList.get(u).getMarketingCommodityPrice());
                                        //小计
                                        map.put("money", commodityList.get(u).getMarketingCommodityPrice());
                                        //折扣
                                        if(commodityList.get(u).getMarketingCommodityDiscount()!=0){
                                            map.put("discount",100);
                                        }else{
                                            Double discount2=Double.parseDouble(commodityList.get(u).getMarketingCommodityPrice())/Double.parseDouble(commodityList.get(u).getMarketingCommodityOldprice())*100;
                                            map.put("discount",format.format(discount2));
                                        }

                                    }
                                }

                                map.put("tdCommoditys",commodityList);
                                map.put("promotionName","梯度优惠");
                                //总额
                                map.put("countMoney",newCountPrice);
                                map.put("huiyuan",marketingPromotions.get(i).getPromotionid());
                                map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                list.add(map);
                                return list;

                            }

                        }

                    }
                }
            }

        }
        //第六优先度
        if(hgcx==1){
            List<MarketingPromotion> marketingPromotions = marketingPromotionService1Impl.selectPromotionByShopNameAndType(session.getAttribute("shopName")+"",4);
            if(marketingPromotions!=null&&marketingPromotions.size()>0){
                for(int i=0;i<marketingPromotions.size();i++){
                    if(marketingPromotions.get(i).getStatusStr().equals("有效")){
                        //查询主商品
                        List<MarketingCommodity> mainCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotions.get(i).getPromotionid());
                        //查询换购商品
                        List<MarketingCommodityHgcx> hgCommodities = marketingCommodityHgcxServiceImpl.select(marketingPromotions.get(i).getPromotionid());
                       //活动的换购商品至少一个
                        Double money = hgCommodities.get(0).getMoney();//条件金额
                        Double countMoney = new Double("0");
                        if(mainCommodities!=null&&mainCommodities.size()>0){
                            for( int j=0;j<code.length;j++){
                                for(int k=0;k<mainCommodities.size();k++){
                                    if(code[j].equals(mainCommodities.get(k).getMarketingCommodityCode())){
                                        countMoney +=Double.parseDouble(mainCommodities.get(k).getMarketingCommodityOldprice())*num[j];

                                    }
                                }
                            }

                            if (countMoney>=money){//满足条件
                                //查询该商品是否是换购商品
                                for(int h=0;h<hgCommodities.size();h++){
                                    if(nowCode.equals(hgCommodities.get(h).getCommodityCode())){
                                        if(marketingPromotions.get(i).getPromotionscope().contains("会员专享")){
                                            map.put("promotionName","换购促销");
                                            map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                            //去会员专享方法
                                            map.put("huiyuan",marketingPromotions.get(i).getPromotionid());
                                            list.add(map);
                                            return list;

                                        }else{
                                            //改变价格
                                           DecimalFormat format = new DecimalFormat("0.00");
                                            //现价
                                            map.put("newprivice",hgCommodities.get(h).getSubmoney());
                                            //小计
                                            map.put("money", hgCommodities.get(h).getSubmoney());
                                            //折扣
                                            Double discount  = hgCommodities.get(h).getSubmoney()/hgCommodities.get(h).getCommodityPrice()*100;
                                            map.put("discount",format.format(discount));
                                            map.put("promotionName","换购促销");
                                            map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                            //去会员专享方法中检查是否是折上折
                                            map.put("huiyuan",marketingPromotions.get(i).getPromotionid());

                                            list.add(map);
                                            return list;
                                        }

                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        //满额返现
        if(mefx==1){
            List<MarketingPromotion> marketingPromotions = marketingPromotionService1Impl.selectPromotionByShopNameAndType(session.getAttribute("shopName")+"",3);
            if(marketingPromotions!=null&&marketingPromotions.size()>0){
                for(int i=0;i<marketingPromotions.size();i++){
                    if(marketingPromotions.get(i).getStatusStr().equals("有效")){
                        //活动商品
                        List<MarketingCommodityMefx> marketingCommodities = marketingCommodityMefxServiceImpl.select(marketingPromotions.get(i).getPromotionid());
                        if(marketingCommodities!=null&&marketingCommodities.size()>0){
                                //满足金额条件
                                Double salemoney = marketingCommodities.get(0).getSalemoney();
                                //返现金额
                                Double givemoney = marketingCommodities.get(0).getGivemoney();

                                //已经选择的商品金额
                                Double countMoney = new Double("0");
                                //记录活动商品条码
                                String  mefxCommodity="";
                                for(int u=0;u<marketingCommodities.size();u++){
                                    mefxCommodity +=marketingCommodities.get(u).getCommodityCode()+",";
                                }
                                mefxCommodity=mefxCommodity.substring(0,mefxCommodity.length()-1);
                                map.put("mefxCommodity",mefxCommodity);
                                map.put("giveMoney",givemoney);

                                for(int j=0;j<code.length;j++){
                                    for (int k=0;k<marketingCommodities.size();k++){
                                        if(code[j].equals(marketingCommodities.get(k).getCommodityCode())){
                                            countMoney=countMoney+Double.parseDouble(marketingCommodities.get(k).getCommodityPrice())*num[j];
                                        }
                                    }
                                }
                                //是否已经经过满额返现
                                if(countMoney<salemoney){
                                    for(int l=0;l<marketingCommodities.size();l++){
                                        if(nowCode.equals(marketingCommodities.get(l).getCommodityCode())){
                                            countMoney =countMoney+Double.parseDouble(marketingCommodities.get(l).getCommodityPrice());
                                        }
                                    }
                                    if(countMoney>salemoney){
                                        //符合了条件
                                        if(marketingPromotions.get(i).getPromotionscope().contains("会员专享")){
                                            map.put("promotionName","满额返现");
                                            map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                            //去会员专享方法
                                            map.put("huiyuan",marketingPromotions.get(i).getPromotionid());
                                            map.put("huiyuan2","0");

                                            list.add(map);
                                            return list;

                                        }else{
                                            map.put("giveMoney",givemoney);
                                            map.put("promotionName","满额返现");
                                            map.put("promotionZekou",marketingPromotions.get(i).getIsmember());
                                            //去会员专享方法
                                            map.put("huiyuan",marketingPromotions.get(i).getPromotionid());
                                            map.put("huiyuan2","1");

                                            list.add(map);
                                            return list;

                                        }
                                    }


                                }


                        }



                    }
                }
            }


        }

        list.add(map);
        return list;

    }

    //会员专享促销活动
    @RequestMapping("getMemberPromotion")
    @ResponseBody
    public Map<String,Object>  getMemberPromotion(String promotionId,String[] code){
        Map<String,Object> map = new HashMap<>();
        if(code==null||code.length==0){
            map.put("name","请先输入商品！");
            return map;
        }
        //本次活动已经符合条件,会员专享情况下
        MarketingPromotion marketingPromotion = marketingPromotionService1Impl.selectPromotionById(promotionId);
        if(marketingPromotion.getPromotionTypeStr().equals("搭赠促销")){
            //查询赠品
            List<MarketingCommodityGive> giveCommoditys = marketingCommodityGiveServiceImpl.select(marketingPromotion.getPromotionid());
            //该商品是否是赠品
            String giveCode="";
            for(int i=0;i<code.length;i++){
                for (int l=0;l<giveCommoditys.size();l++){
                    if(code[i].equals(giveCommoditys.get(l).getCommodityCode())){
                       giveCode +=code[i]+",";

                    }
                }
            }
            giveCode =giveCode.substring(0,giveCode.length()-1);
            map.put("giveCode",giveCode);
            map.put("name","搭赠促销");
            map.put("memberPromotionZekou",marketingPromotion.getIsmember());
        }
        //已经是符合条件了
        if(marketingPromotion.getPromotionTypeStr().equals("套餐促销")){

            List<MarketingCommodityTc> tc = marketingCommodityTcServiceImpl.select(marketingPromotion.getPromotionid());
            map.put("oldPrice",tc.get(0).getCommodityPrice());
            map.put("tcPirce",tc.get(0).getPrice());
            map.put("name","套餐促销");
            map.put("memberPromotionZekou",marketingPromotion.getIsmember());
        }
        if(marketingPromotion.getPromotionTypeStr().equals("第二件打折")){
            //第二件打折商品
            List<MarketingCommodity> mainCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotion.getPromotionid());
            //需要打折的商品
            List<MarketingCommodity> list = new ArrayList<>();
            String dzCode="";
            String firstCode="";
            for(int j=0;j<code.length;j++){
                for(int i=0;i<mainCommodities.size();i++){
                    if(code[j].equals(mainCommodities.get(i).getMarketingCommodityCode())){
                        //不是第一个条码，并dzcode还没有包含
                        if(firstCode.contains(code[j])&&!dzCode.contains(code[j])){
                                dzCode +=code[j]+",";
                                list.add(mainCommodities.get(i));
                            }
                            firstCode +=code[j]+",";
                    }
                }
            }

            map.put("commodityList",list);
            map.put("name","第二件打折");
            map.put("memberPromotionZekou",marketingPromotion.getIsmember());

        }

        if(marketingPromotion.getPromotionTypeStr().equals("打折/特价")){
            List<MarketingCommodity> marketingCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotion.getPromotionid());
            List<MarketingCommodity> list = new ArrayList<>();
            for(int j=0;j<code.length;j++){
                for(int i=0;i<marketingCommodities.size();i++){
                    if(code[j].equals(marketingCommodities.get(i).getMarketingCommodityCode())){
                        //特价商品
                        list.add(marketingCommodities.get(i));
                    }

                }
            }
            map.put("commodityList",list);
            map.put("name","打折/特价");
            map.put("memberPromotionZekou",marketingPromotion.getIsmember());
        }

        if(marketingPromotion.getPromotionTypeStr().equals("梯度优惠")){
            //不管是会员专享还是不是都要来
            if(marketingPromotion.getPromotionscope().contains("会员专享")){
                if(marketingPromotion.getIsmember()==1){
                    //活动的商品
                    List<MarketingCommodity> marketingCommodities = marketingPromotionService1Impl.selectMarketingCommodityByid(marketingPromotion.getPromotionid());
                    //是梯度折扣商品的条码
                    List<MarketingCommodity> commodityList = new ArrayList<>();
                    if(code!=null&&code.length>0){
                        for(int i=0;i<code.length;i++){
                            for(int j =0;j<marketingCommodities.size();j++){
                                if(code[i].equals(marketingCommodities.get(j).getMarketingCommodityCode())){
                                    commodityList.add(marketingCommodities.get(j));
                                }
                            }
                        }
                    }

                    if(commodityList.size()>0){
                        //按照原价格高低排序折扣条码
                        if(commodityList.size()>1){
                            for(int t=commodityList.size()-1;t>0;t--){
                                for(int b=0;b<t;b++){
                                    if(Double.parseDouble(commodityList.get(t).getMarketingCommodityOldprice())>Double.parseDouble(commodityList.get(b).getMarketingCommodityOldprice())){
                                        MarketingCommodity marketingCommodity = commodityList.get(t);
                                        commodityList.set(t,commodityList.get(b));
                                        commodityList.set(b,marketingCommodity);
                                    }
                                }
                            }

                        }
                        //查询梯度折扣
                        List<MarketingCommodityTd> discount = marketingCommodityTdServiceImpl.select(marketingPromotion.getPromotionid());
                        if(discount!=null&&discount.size()>0){
                            for(int y=0;y<discount.size();y++){
                                if(!discount.get(y).getCommodityDiscount().equals("")){
                                    //折扣
                                    String dis=discount.get(y).getCommodityDiscount();

                                    if(y<commodityList.size()){
                                        //原价
                                        String yprice = commodityList.get(y).getMarketingCommodityOldprice();
                                        //现价
                                        Double xj = Double.parseDouble(dis)*Double.parseDouble(yprice)/100;
                                        //先设折扣为0，在前端通过计算改变
                                        commodityList.get(y).setMarketingCommodityDiscount(0);
                                        commodityList.get(y).setMarketingCommodityPrice(String.valueOf(xj));
                                    }

                                }
                            }
                        }
                        //统计总额
                        Double newCountPrice = new Double("0");
                        for(int u=0;u<commodityList.size();u++) {
                            newCountPrice += Double.parseDouble(commodityList.get(u).getMarketingCommodityPrice());
                        }
                        map.put("countMoney",newCountPrice);
                        map.put("commodityList",commodityList);

                    }

                }
                map.put("huiyuan","1");
            }else{
                map.put("huiyuan","0");
            }
            map.put("name","梯度优惠");
            map.put("memberPromotionZekou",marketingPromotion.getIsmember());

        }

        //已经符合条件了才来到这里
        if(marketingPromotion.getPromotionTypeStr().equals("换购促销")) {
            if (marketingPromotion.getPromotionscope().contains("会员专享")) {
                //会员只有在折上折才享受活动
                if (marketingPromotion.getIsmember() == 1) {
                    //查询换购商品
                    List<MarketingCommodityHgcx> hgDiscount = new ArrayList<>();
                    List<MarketingCommodityHgcx> hgCommodities = marketingCommodityHgcxServiceImpl.select(marketingPromotion.getPromotionid());
                    for(int i=0;i<code.length;i++){
                        for (int j=0;j<hgCommodities.size();j++){

                            if(code[i].equals(hgCommodities.get(j).getCommodityCode())){
                                hgDiscount.add(hgCommodities.get(j));
                            }

                        }
                    }
                    map.put("commodityList",hgDiscount);
                }
                map.put("huiyuan","1");
            }else{
                map.put("huiyuan","0");
            }
            //是否是折上折
            map.put("memberPromotionZekou",marketingPromotion.getIsmember());
            map.put("name","换购促销");
        }
         //已经是符合条件的了
        if(marketingPromotion.getPromotionTypeStr().equals("满额返现")){
            if (marketingPromotion.getPromotionscope().contains("会员专享")) {
                if (marketingPromotion.getIsmember() == 1) {
                    List<MarketingCommodityMefx> marketingCommodities = marketingCommodityMefxServiceImpl.select(marketingPromotion.getPromotionid());
                        //返现金额
                        Double givemoney = marketingCommodities.get(0).getGivemoney();
                        map.put("givemoney",givemoney);
                }
                map.put("huiyuan","1");

            }else{
                map.put("huiyuan","0");
            }
            //是否是折上折
            map.put("memberPromotionZekou",marketingPromotion.getIsmember());
            map.put("name","满额返现");
        }

        return map;
    }



    //根据条码模糊查询
    @RequestMapping("searchLikeCode")
    @ResponseBody
    public List searchLikdCode(String code) {
        List list = new ArrayList();
        List<ZomoreCommodity> zomoreCommodities = zomoreCommodityServiceImpl.selectLikeCode(code);
        for (ZomoreCommodity zomoreCommodity : zomoreCommodities) {
            Map map = new HashMap();
            if (zomoreCommodity.getZomoreCommodityCode() != null)
                map.put("CommodityCode", zomoreCommodity.getZomoreCommodityCode());
            if (zomoreCommodity.getZomoreCommodityName() != null)
                map.put("CommodityName", zomoreCommodity.getZomoreCommodityName());
            if (zomoreCommodity.getZomoreCommoditySpecifications() != null)
                map.put("Specifications", zomoreCommodity.getZomoreCommodityType());
            if (zomoreCommodity.getZomoreCommodityCode() != null)
                map.put("CommodityOut", zomoreCommodity.getZomoreCommodityOut());
            if (zomoreCommodity.getZomoreCommodityCode() != null)
                map.put("CommodityNum", zomoreCommodity.getZomoreCommodityMemberprice());
            list.add(map);
        }
        return list;
    }

    //盘点，根据商品条码查找商品，使用ajax访问
    @RequestMapping("searchByCode1")
    @ResponseBody
    public List searchByCode1(String code) {
        ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
        //查找库存
        ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
        List list = new ArrayList();
        Map map = new HashMap();
        //序号
        map.put("id", 1);
        //商品条码
        map.put("code", commodity.getZomoreCommodityCode());
        //商品名称
        map.put("name", commodity.getZomoreCommodityName());
        //原价
        map.put("peice", commodity.getZomoreCommodityOut());
        //盘前库存
        map.put("before", store.getZomoreCommodityStore());
        //差异库存
        map.put("differ", store.getZomoreCommodityStore());
        //盘后库存
        map.put("after", 1);
        list.add(map);
        return list;
    }

    //订货，根据商品条码查找商品，使用ajax访问(没有使用)
    @RequestMapping("searchByCode2")
    @ResponseBody
    public List searchByCode2(String code) {
        ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
        //查找库存
        ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
        List list = new ArrayList();
        Map map = new HashMap();
        //商品条码
        map.put("tm", commodity.getZomoreCommodityCode());
        //商品名称
        map.put("mc", commodity.getZomoreCommodityName());
        //货号
        map.put("hh", commodity.getZomoreCommodityNum());
        //分类
        map.put("fl", commodity.getZomoreCommodityType());
        //进货价
        map.put("jhj", commodity.getZomoreCommodityIn());
        //零售价
        map.put("lsj", commodity.getZomoreCommodityOut());
        //库存
        map.put("kc", store.getZomoreCommodityStore());
        //订货数量
        map.put("dhsl", 1);

        list.add(map);
        return list;
    }

    //进货，根据商品条码查找商品，使用ajax访问
    @RequestMapping("searchByCode3")
    @ResponseBody
    public List searchByCode3(String code) {
        ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code);
        List list = new ArrayList();
        Map map = new HashMap();
        //商品条码
        map.put("tm", commodity.getZomoreCommodityCode());
        //商品名称
        map.put("mc", commodity.getZomoreCommodityName());
        //货号
        map.put("hh", commodity.getZomoreCommodityNum());
        //分类
        map.put("fl", commodity.getZomoreCommodityType());
        //进货价
        map.put("jhj", commodity.getZomoreCommodityIn());
        //零售价
        map.put("lsj", commodity.getZomoreCommodityOut());
        //供应商
        map.put("gys", commodity.getZomoreCommodityProvide());
        //进货数量
        map.put("jhsl", 1);
        //小计
        map.put("xj", commodity.getZomoreCommodityIn());
        list.add(map);
        return list;
    }

    public String getjhId() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHssmm");
        String orid = format.format(new Date());
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            orid += random.nextInt(10);
        }
        return orid;
    }

    //添加进货商品(直接添加库存)
    @RequestMapping("inputCommodty")
    @ResponseBody
    public String inputCommodty(String[] name, String[] code, Integer[] num, String[] price) {
        //随机生产批次号
        String mainid = "jh";
        mainid += getjhId();
        ZomoreCommodityIntogoods intogoods = new ZomoreCommodityIntogoods();
        intogoods.setMainid(mainid);
        for (int i = 0; i < name.length; i++) {
            //添加进货商品
            intogoods.setZomoreCommodityIntogoodsName(name[i]);
            intogoods.setZomoreCommodityIntogoodsCode(code[i]);
            intogoods.setZomoreCommodityIntogoodsNum(num[i]);
            intogoods.setZomoreCommodityIntogoodsAvgprivice(price[i]);
            intogoods.setZomoreCommodityIntogoodsHightprivice(price[i]);
            intogoods.setZomoreCommodityIntogoodsLowprivice(price[i]);
            zomoreCommodityIntogoodsServiceImpl.insert(intogoods);
            //添加库存
            //根据商品名称查找商品和库存
            ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(name[i]);
            ZomoreCommodityStore store1 = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
            store1.setZomoreCommodityStore(store1.getZomoreCommodityStore() + num[i]);
            zomoreCommodityStoreServiceImpl.updateCommodityid(store1);
        }
        return mainid;
    }

    //添加进货记录
    @RequestMapping("insertIntogoodsHistory")
    public String insertIntogoodsHistory(ZomoreCommodityIntogoodsHistory history) {
        boolean insert = zomoreCommodityIntogoodsHistoryServiceImpl.insert(history);
        List<ZomoreCommodityIntogoods> zomoreCommodityIntogoods = zomoreCommodityIntogoodsServiceImpl.selectByMainid(history.getId());
        int allnum=0;
        if (zomoreCommodityIntogoods.size() > 0) {
           for(ZomoreCommodityIntogoods intogoods:zomoreCommodityIntogoods){
               allnum+=intogoods.getZomoreCommodityIntogoodsNum();
           }
        }
        //添加商品变动明细
        ZomoreCommodityChange change = new ZomoreCommodityChange();
        change.setZomoreCommodityChangeNum(allnum);
        change.setZomoreCommodityChangeType("货流进货");
        change.setZomoreOrderId(history.getId());
        zomoreCommodityChangeServiceImpl.insert(change);
        return "redirect:/reception/list.do";
    }

    //添加报损商品(直接减少库存)
    @RequestMapping("lossCommodty")
    @ResponseBody
    public String lossCommodty(String[] name, String[] code, Integer[] num, String[] price) {
        //随机生产批次号
        String mainid = "bs";
        mainid += getjhId();
        ZomoreCommodityLossCommodity intogoods = new ZomoreCommodityLossCommodity();
        ZomoreCommodityStore store = new ZomoreCommodityStore();
        intogoods.setZomoreCommodityLossId(mainid);
        for (int i = 0; i < name.length; i++) {
            //添加报损商品
            intogoods.setZomoreCommodityLossName(name[i]);
            intogoods.setZomoreCommodityLossCode(code[i]);
            intogoods.setZomoreCommodityLossNum(num[i]);
            intogoods.setZomoreCommodityLossPrice(price[i]);
            boolean insert = zomoreCommodityLossCommodityServiceImpl.insert(intogoods);

            //减少库存
            //根据商品名称查找商品和库存
            ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(name[i]);
            ZomoreCommodityStore store1 = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
            store1.setZomoreCommodityStore(store1.getZomoreCommodityStore() - num[i]);
            zomoreCommodityStoreServiceImpl.updateCommodityid(store1);
        }
        ZomoreCommodityLoss history = new ZomoreCommodityLoss();
        history.setZomoreCommodityId(mainid);
        history.setZomoreCommodityLossNum(name.length);
        history.setZomoreCommodityLossType("0");
        zomoreCommodityLossServiceImpl.add(history);
        return mainid;
    }

    //添加报损记录(把状态改为1)
    @RequestMapping("lossCommodtyHistory")
    public String lossCommodtyHistory(ZomoreCommodityLoss history) {
        history.setZomoreCommodityLossType("1");
        zomoreCommodityLossServiceImpl.update(history);
        ZomoreCommodityLoss select = zomoreCommodityLossServiceImpl.select(history.getZomoreCommodityId());
        //添加商品变动明细
        ZomoreCommodityChange change = new ZomoreCommodityChange();
        if(select!=null)
        change.setZomoreCommodityChangeNum(select.getZomoreCommodityLossNum());
        change.setZomoreCommodityChangeType("商品报损");
        change.setZomoreOrderId(history.getZomoreCommodityId());
        zomoreCommodityChangeServiceImpl.insert(change);
        return "redirect:/reception/list.do";
    }


    /**
     * 添加盘点历史
     *
     * @param inventoryhistory
     * @param code
     * @param name
     * @param beforestore      原库存
     * @param afterstore       差异库存
     * @param differStore      盘后库存
     * @return
     */
    @RequestMapping("insertHistory")
    @ResponseBody
    public String insertHistory(ZomoreInventoryhistory inventoryhistory, String[] code, String[] name, String[] beforestore, String[] afterstore, String[] differStore) {
        //生产盘点记录id
        String id = getjhId();
        inventoryhistory.setInventoryhistoryId(id);
        inventoryhistory.setInventoryhistoryDate(new Date());
        inventoryhistory.setInventoryhistoryBrand(1 + "");
        inventoryhistory.setInventoryhistoryClassification("前台盘点");
        String num = "";
        //记录有多少商品的库存有变动
        int changnum=0;
        for (int i = 0; i < code.length; i++) {
            //保存详细盘点的商品记录
            ZomoreStocktaking zomoreStocktaking = new ZomoreStocktaking();
            zomoreStocktaking.setStocktakingHistoryid(id);
            ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByCode(code[i]);
            double v = 0;
            if (commodity != null) {
                String in = commodity.getZomoreCommodityIn();
                v = Double.parseDouble(in);
            }
            zomoreStocktaking.setStocktakingCode(code[i]);
            zomoreStocktaking.setStocktakingCommodityname(name[i]);
            zomoreStocktaking.setStocktakingQuantity(Integer.parseInt(beforestore[i]));
            zomoreStocktaking.setStocktakingExistinginventory(Integer.parseInt(afterstore[i]));
            zomoreStocktaking.setStocktakingNetreceipts(Integer.parseInt(differStore[i]));
            zomoreStocktaking.setStocktakingSellingprice(v);
            zomoreStocktaking.setStocktakingNumber(commodity.getZomoreCommodityNum());
            zomoreStocktaking.setInventorydetailsProfitandloss(v * Integer.parseInt(afterstore[i]));
            zomoreStocktakingServiceImpl.insert(zomoreStocktaking);
            if (Integer.parseInt(afterstore[i]) < 0) {
                num += commodity.getZomoreCommodityName() + ",";
            }
            if(Integer.parseInt(afterstore[i])!=0){
                changnum++;
            }
            //修改库存数量
            ZomoreCommodityStore store = new ZomoreCommodityStore();
            store.setZomoreCommodityStore(Integer.parseInt(differStore[i]));
            store.setZomoreCommodityId(commodity.getZomoreCommodityId());
            zomoreCommodityStoreServiceImpl.updateCommodityid(store);
        }
        if (!num.equals(""))
        inventoryhistory.setInventoryhistoryDefect(num.substring(0, num.length() - 1));
        zomoreInventoryhistoryServiceImpl.insert(inventoryhistory);

        //添加商品变动明细
        ZomoreCommodityChange change = new ZomoreCommodityChange();
        change.setZomoreCommodityChangeNum(changnum);
        change.setZomoreCommodityChangeType("库存盘点");
        change.setZomoreOrderId(inventoryhistory.getInventoryhistoryId());
        zomoreCommodityChangeServiceImpl.insert(change);
        return null;
    }

    //查询所有的货流通知
    @RequestMapping("hltz")
    public String hltz(Model model) {
        //查询所有的订货记录
        List<ZomoreCommodityOrdergoods> select = zomoreCommodityOrdergoodsServiceImpl.select();
        //查找所有调货记录
        List<ZomoreCommodityTransfer> select2 = zomoreCommodityTransferServiceImpl.select(1);

        model.addAttribute("result", select);
        model.addAttribute("result2", select2);
        return "forward:/reception/hltz.jsp";

    }


    //根据订货记录id查找所有的订货商品信息
    @RequestMapping("hltzmessage")
    @ResponseBody
    public List hltzMessage(String id,String type) {
        List list = new ArrayList();
        if (type.equals("订货")) {
            ZomoreCommodityOrdergoods select1 = zomoreCommodityOrdergoodsServiceImpl.select(id);
            int index = 1;
            List<ZomoreCommodityOrdergoodsCommodity> select = zomoreCommodityOrdergoodsCommodityServiceImpl.select(id);
            for (ZomoreCommodityOrdergoodsCommodity commodity : select) {
                if (commodity != null) {
                    ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectById(commodity.getZomoreCommodityId());
                    Map map = new HashMap();
                    map.put("code", zomoreCommodity.getZomoreCommodityCode());
                    map.put("name", zomoreCommodity.getZomoreCommodityName());
                    map.put("num", commodity.getZomoreCommodityNum());
                    //订货价
                    map.put("price", commodity.getZomoreCommodityInprice());
                    if (index == 1) {
                        map.put("meno", select1.getZomoreCommodityOrdergoodsMeno());
                        map.put("state", 1);//1订货，2调货
                        map.put("allnum", select1.getZomoreCommodityOrdergoodsNum());
                        map.put("orderid", id);
                    }
                    list.add(map);
                    index = 2;
                }
            }
        } else {
            ZomoreCommodityTransfer select = zomoreCommodityTransferServiceImpl.select(id);
            List<ZomoreCommodityTransferCommodity> zomoreCommodityTransferCommodities = zomoreCommodityTransferServiceImpl.selectByTranId(id);
            if (zomoreCommodityTransferCommodities != null) {
                int index = 1;
                int countNum = 0;
                for(int i=0;i<zomoreCommodityTransferCommodities.size();i++){
                    countNum += zomoreCommodityTransferCommodities.get(i).getZomoreCommodityTransferNum();
                }
                for (ZomoreCommodityTransferCommodity commodity : zomoreCommodityTransferCommodities) {
                    if (commodity != null) {
                        ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(commodity.getZomoreCommodityTransferCode());
                        Map map = new HashMap();
                        map.put("code", zomoreCommodity.getZomoreCommodityCode());
                        map.put("name", zomoreCommodity.getZomoreCommodityName());
                        map.put("num", commodity.getZomoreCommodityTransferNum());
                        //调货价
                        map.put("price", commodity.getZomoreCommodityTransferPrice());
                        if (index == 1) {
                            map.put("meno", select.getZomoreCommodityTransferMeno());
                            map.put("state", 2);//2调货
                            map.put("allnum", countNum);
                            map.put("orderid", id);
                        }
                        list.add(map);
                        index = 2;
                    }
                }

            }
        }
        return list;
    }

    //整个订货单据进货
    @RequestMapping("hltzmessageIn")
    @ResponseBody
    public String hltzmessageIn(String id, Integer state, Model model) {
        //调货
        if (state == 2) {
            ZomoreCommodityTransfer select = zomoreCommodityTransferServiceImpl.select(id);
            List<ZomoreCommodityTransferCommodity> zomoreCommodityTransferCommodities = zomoreCommodityTransferServiceImpl.selectByTranId(id);
            if (zomoreCommodityTransferCommodities != null) {
                for (ZomoreCommodityTransferCommodity commodity : zomoreCommodityTransferCommodities) {
                    ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(commodity.getZomoreCommodityTransferCode());
                    if(zomoreCommodity!=null){
                        ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(zomoreCommodity.getZomoreCommodityId());
                        store.setZomoreCommodityStore(store.getZomoreCommodityStore() + commodity.getZomoreCommodityTransferNum());
                        zomoreCommodityStoreServiceImpl.updateCommodityid(store);
                    }else{
                        //该店没有该商品，新增该商品
                        //获取出货门店的商品信息
                        String shopout = select.getZomoreCommodityTransferOutstore();
                        ZomoreCommodity zomoreCommodity2 =zomoreCommodityServiceImpl.selectByCode2(shopout,commodity.getZomoreCommodityTransferCode());
                        //根据商品id获取收货门店的商品库存
                        ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId2(shopout, zomoreCommodity2.getZomoreCommodityId());

                        //插入商品信息到收货门店
                        String shop = select.getZomoreCommodityTransferInstore();
                        zomoreCommodity2.setZomoreCommodityShop(shop);
                        //新的商品id
                        String commodityId=Long.toString(System.currentTimeMillis());
                        zomoreCommodity2.setZomoreCommodityId(commodityId);
                        zomoreCommodityServiceImpl.insert2(shop,zomoreCommodity2);
                        //插入库存信息
                        //初始库存就是调入商品的数量
                        store.setZomoreCommodityId(commodityId);
                        store.setZomoreCommodityStore(commodity.getZomoreCommodityTransferNum());
                        store.setZomoreCommodityInventoryPosition(shop);
                        zomoreCommodityStoreServiceImpl.insertCommodityStore2(shop,store);
                    }
                }
                //把订单状态该为2，已收货
                select.setState(2);
                zomoreCommodityTransferServiceImpl.update(select);
            }
        }
        if (state == 1) {
            //根据订单id查询所有商品
            ZomoreCommodityOrdergoods select1 = zomoreCommodityOrdergoodsServiceImpl.select(id);
            List<ZomoreCommodityOrdergoodsCommodity> select = zomoreCommodityOrdergoodsCommodityServiceImpl.select(id);
            //添加商品库存
            for (ZomoreCommodityOrdergoodsCommodity commodity : select) {
                if (commodity != null) {
                    ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectById(commodity.getZomoreCommodityId());
                    ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(zomoreCommodity.getZomoreCommodityId());
                    store.setZomoreCommodityStore(store.getZomoreCommodityStore() + commodity.getZomoreCommodityNum());
                    zomoreCommodityStoreServiceImpl.updateCommodityid(store);
                }
            }
            //把订单状态该为2，已收货
            select1.setZomoreCommodityOrdergoodsState(2);
            zomoreCommodityOrdergoodsServiceImpl.update(select1);
        }
        return "success";
    }

    //前台货流点击拒绝
    @RequestMapping("hltzmessagejujue")
    @ResponseBody
    public String hltzmessagejujue(String id, Integer state, Model model) {
        //订货单不能拒绝
        /*if (state == 1) {
            ZomoreCommodityOrdergoods select1 = zomoreCommodityOrdergoodsServiceImpl.select(id);
            //把订单状态该为4，已拒绝
            select1.setZomoreCommodityOrdergoodsState(4);
            zomoreCommodityOrdergoodsServiceImpl.update(select1);
        }*/
        //调货单可以拒绝
        if (state == 2) {
            //调表信息
            ZomoreCommodityTransfer select = zomoreCommodityTransferServiceImpl.select(id);
            //调货商品信息
            List<ZomoreCommodityTransferCommodity> zomoreCommodityTransferCommodities = zomoreCommodityTransferServiceImpl.selectByTranId(id);
            //调出门店
            String shop =select.getZomoreCommodityTransferOutstore();

            for(int i=0;i<zomoreCommodityTransferCommodities.size();i++){
                //获取商品信息
                ZomoreCommodity zomoreCommodity =zomoreCommodityServiceImpl.selectByCode2(shop,zomoreCommodityTransferCommodities.get(i).getZomoreCommodityTransferCode());
                //根据商品id获取库存
                ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId2(shop, zomoreCommodity.getZomoreCommodityId());
                //返回库存
                if(store!=null){
                    if(store.getZomoreCommodityStore()==null){
                        store.setZomoreCommodityStore(zomoreCommodityTransferCommodities.get(i).getZomoreCommodityTransferNum());
                    }else
                    {
                        store.setZomoreCommodityStore(store.getZomoreCommodityStore()+zomoreCommodityTransferCommodities.get(i).getZomoreCommodityTransferNum());
                    }
                    zomoreCommodityStoreServiceImpl.updateCommodityStoreid(store);
                }

            }
            select.setState(4);
            zomoreCommodityTransferServiceImpl.update(select);

        }
        return "success";
    }
}
