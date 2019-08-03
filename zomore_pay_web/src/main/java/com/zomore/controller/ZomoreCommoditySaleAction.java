package com.zomore.controller;


import com.zomore.controller.ClientDisp.ClientDisplay;
import com.zomore.domain.*;
import com.zomore.result.ZomoreCommoditySaleCommoditResult;
import com.zomore.service.*;
import com.zomore.service.impl.ZomoreIntegralRecordServiceImpl;
import com.zomore.service.impl.ZomoreServiceCommodityorderServiceImpl;
import com.zomore.utils.DoubleUtil;
import com.zomore.utils.EffectiveDateUtil;
import com.zomore.utils.IdUtils;
import com.zomore.utils.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//销售单据
@Controller("zomoreCommoditySaleAction")
@RequestMapping("zomoreCommoditySale")
public class ZomoreCommoditySaleAction {
    @Resource
    private ZomoreIntegralService zomoreIntegralServiceImpl;
    @Resource
    private ZomoreIntegralGradeService zomoreIntegralGradeServiceImpl;
    @Resource
    private ZomoreIntegralBirthdayService zomoreIntegralBirthdayServiceImpl;
    @Resource
    private ZomoreIntegralDateService zomoreIntegralDateServiceImpl;
    @Resource
    private ZomoreCommoditySaleService zomoreCommoditySaleServiceImpl;
    @Resource
    private ZomoreCommoditySaleCommoditService zomoreCommoditySaleCommoditServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;
    @Resource
    private ZomoreServiceCommodityorderService zomoreServiceCommodityorderServiceImpl;
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreMembershiplevelService zomoreMembershiplevelService;
    @Resource
    private ZomoreCommoditySaleThService zomoreCommoditySaleThServiceImpl;
    @Resource
    private ZomoreCommodityChangeService zomoreCommodityChangeServiceImpl;
    @Resource
    private ZomoreIntegralRecordService zomoreIntegralRecordServiceImpl;
    @Autowired
    private SettingService settingServiceImpl;
    @Resource
    ServletContext servletContext;

    //查询所有销售单据
    @RequestMapping("list")
    public String listzomoreCommoditySale(PageResult page, Model model) {
        model.addAttribute("result", zomoreCommoditySaleServiceImpl.select(page.getPageNum(), page.getPageSize()));
        return "forward:/pages/zomoreCommoditySale.jsp";
    }

    //前台查询所有销售单据（指定是已付款状态的订单）
    @RequestMapping("list1")
    public String list1(Model model) {
        //查询所有已经付款的单据
        model.addAttribute("result", zomoreCommoditySaleServiceImpl.select(1));
        return "forward:/reception/xsdj.jsp";
    }

    //请根据订单号和时间段查询销售单据（指定是已付款状态的订单）
    @RequestMapping("list11")
    public String list11(String num, String startime, String endtime, HttpSession session, Model model) {
        String shop = session.getAttribute("shopName") + "";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = null, d2 = null;
        if (startime != null && !startime.equals("")) {
            try {
                d1 = format.parse(startime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (endtime != null && !endtime.equals("")) {
            try {
                d2 = format.parse(endtime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        model.addAttribute("result", zomoreCommoditySaleServiceImpl.select(num, d1, d2, 1, shop));
        model.addAttribute("num", num);
        model.addAttribute("startime", startime);
        model.addAttribute("endtime", endtime);
        return "forward:/reception/xsdj.jsp";
    }

    //前台查询所有已挂单销售单据（指定是挂单状态的订单）
    @RequestMapping("list2")
    public String list2(Model model) {
        //查询所有挂单状态的单据
        model.addAttribute("result", zomoreCommoditySaleServiceImpl.select(2));
        return "forward:/reception/guadan.jsp";
    }

    //获取订单号
    @RequestMapping("getid")
    @ResponseBody
    public String getid(HttpSession session) {
        return (String) session.getAttribute("Aa_servieceorderid");
    }

    //跳转到添加销售单据
    @RequestMapping("addUI")
    public String addUI(Model model) {
        //查询所有商品 用于 为选择购买商品
        model.addAttribute("result", zomoreCommodityServiceImpl.selectAll());
        return "forward:/pages/addZomoreCommoditySale.jsp";
    }

    //前台查询销售单据详细内容
    @RequestMapping("selectByAjax")
    @ResponseBody
    public List selectByAjax(PageResult page) {
        List list = new ArrayList();
        List<ZomoreCommoditySale> select = zomoreCommoditySaleServiceImpl.select(page.getPageNum(), page.getPageSize());
        return list;
    }

    /**
     * 添加销售单据(点击收款)
     *
     * @param sale         销售单据数据
     * @param commoditNum  商品数量
     * @param commoditName 商品名称
     * @param condrealprice 单个商品实收
     * @return
     */
    @RequestMapping("add")
    @ResponseBody
    public String addZomoreCommoditySale(ZomoreCommoditySale sale, Integer state, String[] discount,String[] commoditNum, String[] condrealprice,String[] commoditName, HttpSession httpSession)throws  Exception {
        //后台计算购买的商品金额是否与前台统计的一致（或者交给结算功能处理）
        //前台传来了:收银员，会员名称，原价，实收价，详细的商品数量和名称
        //生成销售订单号（流水号）
        if(sale.getZomoreCommoditySaleMember().equals("会员")){
            sale.setZomoreCommoditySaleMember("来宾");
        }
        String id = IdUtils.commoditySaleId("aa", servletContext);
        sale.setZomoreCommoditySaleId(id);
        //把流水id记录到session中
        httpSession.removeAttribute("Aa_servieceorderid");
        //在页面使用隐藏域接收
        httpSession.setAttribute("Aa_servieceorderid", id);
        Integer num = 0;
        Double inplice = new Double(0);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");


        //保存销售商品
        if (commoditName != null && commoditName.length > 0)
            for (int i = 0; i < commoditName.length; i++) {
                ZomoreCommodity commodity= zomoreCommodityServiceImpl.selectByName(commoditName[i]);
                //找到商品的销售单价
                String outprices;
                if(commoditName[i].equals("无码商品")){
                    //商品原价
                    outprices=decimalFormat.format(Double.parseDouble(condrealprice[i])/(Double.parseDouble(discount[i])*0.01));
                    commodity.setZomoreCommodityOut(outprices);
                    commodity.setZomoreCommodityName("无码商品");
                    commodity.setZomoreCommodityType("无码商品");
                    commodity.setZomoreCommodityIn("0");
                }
                else{
                    outprices = commodity.getZomoreCommodityOut();
                }

                //保存详细的销售单据
                ZomoreCommoditySaleCommodit commodit = new ZomoreCommoditySaleCommodit();
                //商品条码
                commodit.setZomreComoditycode(commodity.getZomoreCommodityCode());
                //单个商品的实收价格(小计)
                commodit.setZomoreCommodityCountMoney(Integer.valueOf(commoditNum[i])*Double.valueOf(condrealprice[i]));

                //商品折扣(double型转化为int型)
                commodit.setZomoreCommodityDiscount( new Double(Double.parseDouble(discount[i])).intValue());
                //商品原价*数量
                commodit.setZomoreCommodityMoney(Double.parseDouble(outprices) * Integer.valueOf(commoditNum[i]));
                //商品所属店名
                commodit.setZomoreCommodityShop(httpSession.getAttribute("shopName") + "");
                //商品类型
                commodit.setZomoreCommodityType(commodity.getZomoreCommodityType());
                //销售流水号
                commodit.setZomoreCommoditySaleId(id);
                //商品数量
                commodit.setZomoreCommodityNum(Integer.valueOf(commoditNum[i]));
                //单个商品的折后价
                commodit.setZomoreCommodutyInMoney(Double.valueOf(condrealprice[i]));
                num += Integer.valueOf(commoditNum[i]);
                commodit.setZomoreCommodityName(commoditName[i]);

                zomoreCommoditySaleCommoditServiceImpl.insert(commodit);
                //根据商品名称找到商品进货价

                BigDecimal a1 = new BigDecimal(inplice);
                BigDecimal a2 = new BigDecimal(commodity.getZomoreCommodityIn());
                BigDecimal a3 = new BigDecimal(commoditNum[i]);
                BigDecimal a4 = a2.multiply(a3);
                inplice = a1.add(a4).doubleValue();

            }

        //保存商品总数量
        sale.setZomoreCommoditySaleNum(num);
        //计算让利价
        BigDecimal b1 = new BigDecimal(sale.getZomoreCommoditySaleMoney());
        BigDecimal b2 = new BigDecimal(sale.getZomoreCommoditySaleInmoney());
        Double letmoney = b1.subtract(b2).doubleValue();
        sale.setZomoreCommoditySaleLetmoney(letmoney + "");
        //计算利润
        BigDecimal c1 = new BigDecimal(inplice);
        Double savemoney = b2.subtract(c1).doubleValue();
        sale.setZomoreCommoditySaleSavemoney(savemoney + "");
        //保存店铺名称
        sale.setZomoreCommodityShop(httpSession.getAttribute("shopName") + "");
        if (state != null) {
            //当点击的时挂单时使用
            sale.setZomoreCommodityState(state);
        }
        //保存销售单据
        zomoreCommoditySaleServiceImpl.insert(sale);

      /*  ClientDisplay clientDisplay = new ClientDisplay();
        String port = "COM2";
        int baudRate = 2400;
        String displayRate = "0";
        String data = b1.toString();
        String state1 = "2";
        clientDisplay.output(port,baudRate,displayRate,data,state1);*/
        return id;
    }
    //客显总价
    @RequestMapping("searchByreq")
    public  String selectReq(String req) throws Exception {
        ClientDisplay clientDisplay = new ClientDisplay();


        String port = "COM2";
        int baudRate = 2400;
        String displayRate = "0";
        String data = req;
        String state1 = "2";
        clientDisplay.output(port,baudRate,displayRate,data,state1);
        return data;
    }
    //客显单价
    @RequestMapping("searchZhaoLing")
    public String selectZhaoLing(String req)throws  Exception{
        ClientDisplay clientDisplay = new ClientDisplay();

        //客显找零
        String port = "COM2";
        int baudRate = 2400;
        String displayRate = "0";
        String data = req;
        String state1 = "4";
        clientDisplay.output(port,baudRate,displayRate,data,state1);
        return data;
    }
    //客显清零
    @RequestMapping("clean")
    public String clean()throws  Exception{
        ClientDisplay clientDisplay = new ClientDisplay();
        String port = "COM2";
        int baudRate = 2400;
        String displayRate = "0";
        String data = "0.00";
        String state1 = "0";
        clientDisplay.output(port,baudRate,displayRate,data,state1);

        return data;
    }

    //回显前院的商品
    @RequestMapping("selectQianYuan")
    public String selectQianYuan (Model model,String id,HttpSession session){
        ZomoreCommoditySale qianyuanSale = zomoreCommoditySaleServiceImpl.select(id);

        if(qianyuanSale!=null){
            List<ZomoreCommoditySaleCommodit> qianyuanList= zomoreCommoditySaleCommoditServiceImpl.select(id);
            model.addAttribute("qianyuanSale",qianyuanSale);
            model.addAttribute("qianyuanList",qianyuanList);
        }
        else{
            return "redirect:/reception/list.do";
        }

        //回显会员
        if(!qianyuanSale.getZomoreCommoditySaleMember().equals("来宾")){
            String memberName = qianyuanSale.getZomoreCommoditySaleMember();
            ZomoreMember zomoreMember=zomoreMemberServiceImpl.selectZomoreMemberByname(memberName);
            model.addAttribute("zomoreMember",zomoreMember);
        }

        //备用金
        String readycash=session.getAttribute("bank")+"";

        if(readycash.equals("已经存在")){
            CashierGenralSetting cashierGenralSetting= new CashierGenralSetting();
            cashierGenralSetting.setStandbyfund(0);
            model.addAttribute("cashierGenralSetting",cashierGenralSetting);
        }
        else{
            CashierGenralSetting cashierGenralSetting=settingServiceImpl.selectAllGenralSetting(session.getAttribute("shopName")+"",session.getAttribute("cashierNumber")+"");
            model.addAttribute("cashierGenralSetting",cashierGenralSetting);
            model.addAttribute("shoppingguide",cashierGenralSetting.getShoppingguide());
        }


     /*   List<String> qianyuanOnlyMoneyById = zomoreCommoditySaleServiceImpl.selectMoneyById(id);
        String sum = "";
        for(String qianyuan:qianyuanOnlyMoneyById){
            sum = qianyuan;
        }*/
        /*   List<String> list = zomoreCommoditySaleInmoney*/

     /*  ClientDisplay clientDisplay = new ClientDisplay();
        String port = "COM1";
        String baudRate = "2400";
        String displayRate = "0";
        String data = sum;
        String state = "4";
        String[]str = new String[]{port,baudRate,displayRate,data,state};
        clientDisplay.main(str);*/

        /*return "forward:/reception/123.jsp";*/
        return "forward:/reception/index.jsp";
    }


    //删除销售记录
    @RequestMapping("deleted")
    public String deleted(String ids) {
        zomoreCommoditySaleServiceImpl.deleted(ids);
        return "redirect:/zomoreCommoditySale/list.do";
    }

    //根据流水号查找销售商品（点击详细时作用）
    @RequestMapping("showAllCommodit")
    @ResponseBody
    public List showAllZomoreCommoditySaleCommodit(String id) {
        List<Map<String ,Object>> list = new ArrayList<>();
        //保存会员信息标志
        int index = 1;
        //出现无码商品，在取完信息后，需要删除
        int bank=0;
        DecimalFormat format = new DecimalFormat("#.00");
        ZomoreCommoditySale select = zomoreCommoditySaleServiceImpl.select(id);
        List<ZomoreCommoditySaleCommodit> commodits = zomoreCommoditySaleCommoditServiceImpl.select(id);
        if (commodits != null && commodits.size() > 0) {
            for (ZomoreCommoditySaleCommodit commodit : commodits) {
                Map<String,Object> map = new HashMap<>();
                map.put("name", commodit.getZomoreCommodityName());
                //根据商品名称查找销售价
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(commodit.getZomoreCommodityName());
                if(commodit.getZomoreCommodityName().equals("无码商品")){
                    Double price =commodit.getZomoreCommodityMoney()/commodit.getZomoreCommodityNum();
                    map.put("price", format.format(price));
                    bank++;
                }else{
                    map.put("price", commodity.getZomoreCommodityOut());
                }
                //商品的实收（数量*实收单价）
                Double cutprice = commodit.getZomoreCommodityCountMoney();

                /*ZomoreCommoditySale select1 = zomoreCommoditySaleServiceImpl.select(commodit.getZomoreCommoditySaleId());*/
                /*if (select1 != null) {
                    ZomoreMember zomoreMember1 = zomoreMemberServiceImpl.selectZomoreMemberByname(select1.getZomoreCommoditySaleMember());
                    if (zomoreMember1 != null) {
                        ZomoreMembershiplevel zomoreMembershiplevel = zomoreMembershiplevelService.selectZomoreMembershiplevelByName(zomoreMember1.getMemberGrade());
                        if (zomoreMembershiplevel != null) {
                            String membershiplevelDiscount = zomoreMembershiplevel.getMembershiplevelDiscount();
                            Integer discount = Integer.parseInt(membershiplevelDiscount);
                            cutprice = Double.parseDouble(commodity.getZomoreCommodityOut()) * discount * 0.01;
                        }
                    }
                }*/

                map.put("cutprice", format.format(cutprice));//单个商品折扣小计
                map.put("num", commodit.getZomoreCommodityNum());//数量
                map.put("code", commodit.getZomreComoditycode());//商品条码
                if(!commodit.getZomoreCommodityName().equals("无码商品")){
                    map.put("huohao", commodity.getZomoreCommodityNum());//货号
                }
                //记录id，用于删除（退货）
                map.put("id", commodit.getZomoreCommoditySaleCommoditId());//销售单号
                //只保存一次
                map.put("index",index);//该map没有信息
                if (index == 1) {
                    index = 2;
                    map.put("index",index);//index==2该map以下信息
                    //保存总件数和总金额,会员名称
                    map.put("alllnum", select.getZomoreCommoditySaleNum());//销售单商品总数
                    map.put("alllmoney", select.getZomoreCommoditySaleInmoney());//实收价格
                    String paytype=select.getZomoreCommoditySaleType();//支付方式
                    if(paytype.equals("0")){
                        map.put("payType","现金");
                    }
                    if(paytype.equals("1")){
                        map.put("payType","储值卡");
                    }
                    if(paytype.equals("2")){
                        map.put("payType","微信");
                    }
                    if(paytype.equals("3")){
                        map.put("payType","银联");
                    }
                    if(paytype.equals("4")){
                        map.put("payType","微信");
                    }
                    map.put("menber", select.getZomoreCommoditySaleMember());//会员名称
                    map.put("guide", select.getZomoreCommoditySaleGuide());//导购员名称
                    map.put("meno", select.getZomoreCommodityMeno());//备注
                    //根据会员名称查找会员电话
                    if(select.getZomoreCommoditySaleMember()!=null){

                        ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByname(select.getZomoreCommoditySaleMember());
                        if (zomoreMember != null) {
                            //会员手机号码
                            map.put("menberphone", zomoreMember.getMemberPhonenumber());
                            //会员余额
                            map.put("menberBalance", zomoreMember.getMemberBalance());
                            map.put("memberName",zomoreMember.getMemberMemberidname());
                            map.put("memberNo",zomoreMember.getMemberNumber());
                            map.put("countIntegral",zomoreMember.getMemberIntegral());
                        } else {
                            map.put("menberphone", " ");
                            map.put("menberBalance", 0);
                        }
                    }

                }
                list.add(map);
            }
        }
        if(bank>0){
            //删除无码商品
            int count=zomoreCommodityServiceImpl.deleteByName("无码商品");
            System.out.println(count);
        }
        return list;
    }

    //根据流水账号修改订单状态（用于确定付款）

    /**
     * @param type      支付类型
     * @param id        销售订单id
     * @param state     状态
     * @param guideName 导购员名称
     * @param tk        是否时退货
     * @param money     实收金额
     * @param memberNum 会员号
     * @param ishouyuan 判断是否包含服务类商品的支付  0或者null不包含 1包含
     * @return 暂时只能单一种支付方式（没有联合支付）
     */
    @RequestMapping("upateCommoditSaleType")
    @ResponseBody
    public String upateCommoditSaleType(String type, String id, Integer state, String guideName, String tk, String money, String memberNum, Integer ishouyuan,HttpSession session) {
        if(guideName!=null&&guideName.equals("")){
            guideName=null;
        }
        boolean update = false;
        String memberIntegral2="";
        DecimalFormat format = new DecimalFormat("0.00");
        //退货
        if (tk != null && tk.equals("1")) {
            deletedCommoditSaleall(id);
        } else {
            //付款
            ZomoreCommoditySale sale = zomoreCommoditySaleServiceImpl.select(id);
            //会员产生积分变动记录
            ZomoreIntegralRecord zomoreIntegralRecord = new ZomoreIntegralRecord();

            if (sale != null) {
                sale.setZomoreCommoditySaleType(type);
                sale.setZomoreCommoditySaleId(id);
                sale.setZomoreCommodityState(state);
                if (money != null && ishouyuan != null && ishouyuan == 0) {
                    zomoreIntegralRecord.setMeno("前店消费");
                    //原来的实收价
                    Double d1 = Double.parseDouble(sale.getZomoreCommoditySaleInmoney());
                    //现在的实收
                    Double d2 = Double.parseDouble(money);
                    //差价
                    Double d3 = DoubleUtil.sub(d1, d2);
                    //折让金额
                    sale.setZomoreCommoditySaleLetmoney("" + DoubleUtil.sum(d3, Double.parseDouble(sale.getZomoreCommoditySaleLetmoney())));
                    //原来的利润减去现在的差价
                    sale.setZomoreCommoditySaleSavemoney("" + DoubleUtil.sub(Double.parseDouble(sale.getZomoreCommoditySaleSavemoney()),d3));
                    //实收金额
                    sale.setZomoreCommoditySaleInmoney(money);
                }
                if(ishouyuan != 0){
                    zomoreIntegralRecord.setMeno("前店消费,后院消费");
                }

                sale.setZomoreCommoditySaleGuide(guideName);
                //修改销售商品
                update = zomoreCommoditySaleServiceImpl.update(sale);
            }
            if (sale==null&&ishouyuan ==1){
                zomoreIntegralRecord.setMeno("后院消费");
            }
            //修改服务商品
            ZomoreServiceCommodityorder commodityorder = new ZomoreServiceCommodityorder();
            commodityorder.setZomoreCommoditySaleId(id);
            commodityorder.setZomoreCommodityState(state);
            commodityorder.setZomoreCommoditySaleGuide(guideName);
            zomoreServiceCommodityorderServiceImpl.update(commodityorder);
            if(!type.contains("2")||!type.contains("4")){
                //如果状态是确定收款的要减去库存(只针对销售商品)
                List<ZomoreCommoditySaleCommodit> select = zomoreCommoditySaleCommoditServiceImpl.select(id);
                if (select != null && select.size() > 0) {
                    for (ZomoreCommoditySaleCommodit zomoreCommoditySaleCommodit : select) {
                        Integer num = zomoreCommoditySaleCommodit.getZomoreCommodityNum();
                        String name = zomoreCommoditySaleCommodit.getZomoreCommodityName();
                        ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(name);
                        if(!commodity.getZomoreCommodityName().equals("无码商品")){
                            ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
                            store.setZomoreCommodityStore(store.getZomoreCommodityStore() - num);
                            zomoreCommodityStoreServiceImpl.updateCommodityid(store);
                        }

                    }
                }
            }
            String multipleId = session.getAttribute("multipleId") + "";
            ZomoreMember zomoreMember=null;
            if (multipleId.equals("") || multipleId.equals("null")) {
                //根据会员号查询消费会员的信息
                zomoreMember= zomoreMemberServiceImpl.selectZomoreMemberByNum(memberNum);
            }else{
                zomoreMember=zomoreMemberServiceImpl.selectZomoreMemberByNum2(multipleId,memberNum);

            }


            //如果时储值卡消费时减去会员余额
            if (type.contains("1") && money != null) {
                if (zomoreMember != null) {
                    Double d4 = Double.parseDouble(zomoreMember.getMemberBalance());
                    zomoreMember.setMemberBalance(DoubleUtil.sub(d4, Double.parseDouble(money)) + "");
                }
            }
            //会员积分变动
            //查询该店的积分规则
            if (zomoreMember != null) {
                ZomoreIntegral integral = zomoreIntegralServiceImpl.selectZomoreIntegralByshop(session.getAttribute("shopName") + "");

                zomoreIntegralRecord.setShop(session.getAttribute("shopName") + "");
                //会员名字
                zomoreIntegralRecord.setMemberName(zomoreMember.getMemberMemberidname());
                //会员id
                zomoreIntegralRecord.setMemberNum(zomoreMember.getMemberMemberid());

                if (integral!=null&&!integral.equals("")){

                    //会员等级多倍积分规则
                    List<ZomoreIntegralGrade> zomoreIntegralGrades = zomoreIntegralGradeServiceImpl.selectByRuleId(integral.getIntegralRuleId());
                    //查询当前门店的会员生日多倍积分规则
                    List<ZomoreIntegralBirthday> zomoreIntegralBirthdays = zomoreIntegralBirthdayServiceImpl.selectByRuleId(integral.getIntegralRuleId());
                    //查询所有当前门店的会员特殊日子多倍积分
                    List<ZomoreIntegralDate> zomoreIntegralDates = zomoreIntegralDateServiceImpl.selectByRuleId(integral.getIntegralRuleId());

                    //1按金额进行积分
                    if(integral.getIntegralRuleType()==1){
                        String rule = integral.getIntegralRuleTypeRule();
                        String[] rules=rule.split("\\,");
                        //计算基础积分
                        Double memberIntegral =Double.parseDouble(money)/Integer.valueOf(rules[0]);
                        //记录积分生成

                        int num = (new Double(memberIntegral)).intValue();
                        zomoreIntegralRecord.setNum(Integer.valueOf(num));
                        //多倍积分标志位()
                        boolean multiple = false;
                        //会员生日多倍积分
                        if(zomoreIntegralBirthdays!=null&&zomoreIntegralBirthdays.size()>0&&!multiple){
                            String memberBirth = zomoreIntegralBirthdays.get(0).getMemberBirth();
                            //积分规则
                            String[] memberBirths = memberBirth.split("\\,");
                            for (int i=0;i<memberBirths.length;i++){
                                //判断会员等级是否在规则内
                                if(memberBirths[i].equals(zomoreMember.getMemberGrade())){
                                    //是否是该会员生日
                                    SimpleDateFormat sdf= new SimpleDateFormat("MMdd");
                                    String date = sdf.format(new Date());
                                    if(zomoreMember.getMemberBirthday()!=null&&sdf.format(zomoreMember.getMemberBirthday()).equals(date)){
                                        multiple=true;
                                    }
                                }
                            }
                            if (multiple){
                                Integer multipleBirth = zomoreIntegralBirthdays.get(0).getMultipleBirth();
                                //积分翻倍
                                memberIntegral =memberIntegral*multipleBirth;
                                num = (new Double(memberIntegral)).intValue();
                                zomoreIntegralRecord.setNum(Integer.valueOf(num));
                            }
                        }

                        if(zomoreIntegralDates!=null&&zomoreIntegralDates.size()>0&&!multiple){
                            //设置了很多个活动日
                            for (ZomoreIntegralDate zomoreIntegralDate:zomoreIntegralDates){
                                boolean aa=EffectiveDateUtil.isEffectiveDate(new Date(),zomoreIntegralDate.getStartdate(),zomoreIntegralDate.getEnddate());
                                if (aa){
                                    //是活动期间，判断会员等级是否在活动条件中
                                    String memberDate=zomoreIntegralDate.getMemberDate();
                                    String[] memberDates = memberDate.split("\\,");
                                    for(int i=0;i<memberDates.length;i++){
                                        if (memberDates[i].equals(zomoreMember.getMemberGrade())){
                                            multiple=true;
                                            break;
                                        }

                                    }
                                    if (multiple){
                                        Integer multipleDate = zomoreIntegralDate.getMultipleDate();
                                        //积分翻倍
                                        memberIntegral = memberIntegral*multipleDate;
                                        num = (new Double(memberIntegral)).intValue();
                                        zomoreIntegralRecord.setNum(Integer.valueOf(num));

                                    }
                                    break;
                                }

                            }

                        }
                        //会员等级多倍积分
                        if(zomoreIntegralGrades!=null&&zomoreIntegralGrades.size()>0&&!multiple){
                            String memberGrade=zomoreIntegralGrades.get(0).getMemberGrade();
                            String[] memberGrades = memberGrade.split("\\,");
                            for (int i=0;i<memberGrades.length;i++){
                                //判断会员等级是否在规则内
                                if(memberGrades[i].equals(zomoreMember.getMemberGrade())){
                                    multiple=true;
                                    break;
                                }

                            }
                            if (multiple){
                                Integer multipleGrade=zomoreIntegralGrades.get(0).getMultipleGrade();
                                //积分翻倍
                                memberIntegral = memberIntegral*multipleGrade;
                                num = (new Double(memberIntegral)).intValue();
                                zomoreIntegralRecord.setNum(Integer.valueOf(num));
                            }


                        }
                        //无码商品是否参与积分

                        //会员增加积分

                        zomoreMember.setMemberIntegral(zomoreMember.getMemberIntegral()+memberIntegral);
                        memberIntegral2=format.format(memberIntegral);
                    }

                }

                /*zomoreMemberServiceImpl.updateZomoreMemberByNum(zomoreMember);*/
                zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
                if (zomoreIntegralRecord.getNum()!=null&&zomoreIntegralRecord.getNum()!=0){
                    zomoreIntegralRecordServiceImpl.insert(zomoreIntegralRecord);
                }


            }

        }

            if(memberIntegral2!=null&&!memberIntegral2.equals("")){
                return memberIntegral2;
            }
            else{
                return "success";
            }

    }
    //确认退款
    @RequestMapping("upateCommoditSaleType2")
    public String upateCommoditSaleType2(ZomoreCommoditySale zomoreCommoditySale, String money, String memberNum,HttpSession session) {

        if(zomoreCommoditySale.getZomoreCommoditySaleId()!=null&&!zomoreCommoditySale.getZomoreCommoditySaleId().equals("")){
            zomoreCommoditySaleServiceImpl.update(zomoreCommoditySale);
            ZomoreCommoditySale select1 = zomoreCommoditySaleServiceImpl.select(zomoreCommoditySale.getZomoreCommoditySaleId());
            //商品入库
            List<ZomoreCommoditySaleCommodit> select = zomoreCommoditySaleCommoditServiceImpl.select(zomoreCommoditySale.getZomoreCommoditySaleId());
            if(select!=null&&select.size()>0){
                for(int i=0;i<select.size();i++){
                    ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(select.get(i).getZomreComoditycode());
                    if(zomoreCommodity!=null){
                        ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(zomoreCommodity.getZomoreCommodityId());
                        store.setZomoreCommodityStore(store.getZomoreCommodityStore() -select.get(i).getZomoreCommodityNum() );
                        zomoreCommodityStoreServiceImpl.updateCommodityid(store);

                        //保存进商品退货详细表
                        ZomoreCommoditySaleTh th = new ZomoreCommoditySaleTh();
                       th.setZomoreCommodityType(select.get(i).getZomoreCommodityType());
                       th.setZomoreCommodityNum(-select.get(i).getZomoreCommodityNum());
                       th.setZomoreCommodityName(select.get(i).getZomoreCommodityName());
                       th.setZomoreCommodityMoney(select.get(i).getZomoreCommodityMoney()/select.get(i).getZomoreCommodityNum());
                        th.setZomoreCommodityThId(zomoreCommoditySale.getZomoreCommoditySaleId());
                        th.setZomoreCommoditySaleId(zomoreCommoditySale.getZomoreCommoditySaleId());
                        zomoreCommoditySaleThServiceImpl.insert(th);

                    }
                }

            }
            //商品变动明细
            try {
                ZomoreCommodityChange change = new ZomoreCommodityChange();
                if (select != null)
                    change.setZomoreCommodityChangeNum(-select1.getZomoreCommoditySaleNum());
                change.setZomoreCommodityChangeType("客户退货");
                //记录流水号
                change.setZomoreOrderId(zomoreCommoditySale.getZomoreCommoditySaleId());
                zomoreCommodityChangeServiceImpl.insert(change);


            } catch (Exception e) {
                e.printStackTrace();
            }
            String multipleId = session.getAttribute("multipleId") + "";
        ZomoreMember zomoreMember=null;
        if (multipleId.equals("") || multipleId.equals("null")) {
            //根据会员号查询消费会员的信息
            zomoreMember= zomoreMemberServiceImpl.selectZomoreMemberByNum(memberNum);
        }else{
            zomoreMember=zomoreMemberServiceImpl.selectZomoreMemberByNum2(multipleId,memberNum);

        }
            //如果是会员退款到储值卡
            if (zomoreMember != null) {
                Double d4 = Double.parseDouble(zomoreMember.getMemberBalance());
                zomoreMember.setMemberBalance(DoubleUtil.sub(d4, Double.parseDouble(money)) + "");
                //会员储值卡金额变动？？？

                //会员产生积分变动记录
                ZomoreIntegralRecord zomoreIntegralRecord = new ZomoreIntegralRecord();
                zomoreIntegralRecord.setMeno("快捷退款");
                //会员积分变动
                //查询该店的积分规则
                    ZomoreIntegral integral = zomoreIntegralServiceImpl.selectZomoreIntegralByshop(session.getAttribute("shopName") + "");
                    zomoreIntegralRecord.setShop(session.getAttribute("shopName") + "");
                    //会员名字
                    zomoreIntegralRecord.setMemberName(zomoreMember.getMemberMemberidname());
                    //会员id
                    zomoreIntegralRecord.setMemberNum(zomoreMember.getMemberMemberid());

                    if (integral != null && !integral.equals("")) {

                        //会员等级多倍积分规则
                        List<ZomoreIntegralGrade> zomoreIntegralGrades = zomoreIntegralGradeServiceImpl.selectByRuleId(integral.getIntegralRuleId());
                        //查询当前门店的会员生日多倍积分规则
                        List<ZomoreIntegralBirthday> zomoreIntegralBirthdays = zomoreIntegralBirthdayServiceImpl.selectByRuleId(integral.getIntegralRuleId());
                        //查询所有当前门店的会员特殊日子多倍积分
                        List<ZomoreIntegralDate> zomoreIntegralDates = zomoreIntegralDateServiceImpl.selectByRuleId(integral.getIntegralRuleId());

                        //1按金额进行积分
                        if (integral.getIntegralRuleType() == 1) {
                            String rule = integral.getIntegralRuleTypeRule();
                            String[] rules = rule.split("\\,");
                            //计算基础积分
                            Double memberIntegral = Double.parseDouble(money) / Integer.valueOf(rules[0]);
                            //记录积分生成

                            int num = (new Double(memberIntegral)).intValue();
                            zomoreIntegralRecord.setNum(Integer.valueOf(num));
                            //多倍积分标志位()
                            boolean multiple = false;
                            //会员生日多倍积分
                            if (zomoreIntegralBirthdays != null && zomoreIntegralBirthdays.size() > 0 && !multiple) {
                                String memberBirth = zomoreIntegralBirthdays.get(0).getMemberBirth();
                                //积分规则
                                String[] memberBirths = memberBirth.split("\\,");
                                for (int i = 0; i < memberBirths.length; i++) {
                                    //判断会员等级是否在规则内
                                    if (memberBirths[i].equals(zomoreMember.getMemberGrade())) {
                                        //是否是该会员生日
                                        SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
                                        String date = sdf.format(new Date());
                                        if (zomoreMember.getMemberBirthday() != null && sdf.format(zomoreMember.getMemberBirthday()).equals(date)) {
                                            multiple = true;
                                        }
                                    }
                                }
                                if (multiple) {
                                    Integer multipleBirth = zomoreIntegralBirthdays.get(0).getMultipleBirth();
                                    //积分翻倍
                                    memberIntegral = memberIntegral * multipleBirth;
                                    num = (new Double(memberIntegral)).intValue();
                                    zomoreIntegralRecord.setNum(Integer.valueOf(num));
                                }
                            }

                            if (zomoreIntegralDates != null && zomoreIntegralDates.size() > 0 && !multiple) {
                                //设置了很多个活动日
                                for (ZomoreIntegralDate zomoreIntegralDate : zomoreIntegralDates) {
                                    boolean aa = EffectiveDateUtil.isEffectiveDate(new Date(), zomoreIntegralDate.getStartdate(), zomoreIntegralDate.getEnddate());
                                    if (aa) {
                                        //是活动期间，判断会员等级是否在活动条件中
                                        String memberDate = zomoreIntegralDate.getMemberDate();
                                        String[] memberDates = memberDate.split("\\,");
                                        for (int i = 0; i < memberDates.length; i++) {
                                            if (memberDates[i].equals(zomoreMember.getMemberGrade())) {
                                                multiple = true;
                                                break;
                                            }

                                        }
                                        if (multiple) {
                                            Integer multipleDate = zomoreIntegralDate.getMultipleDate();
                                            //积分翻倍
                                            memberIntegral = memberIntegral * multipleDate;
                                            num = (new Double(memberIntegral)).intValue();
                                            zomoreIntegralRecord.setNum(Integer.valueOf(num));

                                        }
                                        break;
                                    }

                                }

                            }
                            //会员等级多倍积分
                            if (zomoreIntegralGrades != null && zomoreIntegralGrades.size() > 0 && !multiple) {
                                String memberGrade = zomoreIntegralGrades.get(0).getMemberGrade();
                                String[] memberGrades = memberGrade.split("\\,");
                                for (int i = 0; i < memberGrades.length; i++) {
                                    //判断会员等级是否在规则内
                                    if (memberGrades[i].equals(zomoreMember.getMemberGrade())) {
                                        multiple = true;
                                        break;
                                    }

                                }
                                if (multiple) {
                                    Integer multipleGrade = zomoreIntegralGrades.get(0).getMultipleGrade();
                                    //积分翻倍
                                    memberIntegral = memberIntegral * multipleGrade;
                                    num = (new Double(memberIntegral)).intValue();
                                    zomoreIntegralRecord.setNum(Integer.valueOf(num));
                                }


                            }
                            //无码商品是否参与积分

                            //会员减去积分
                            if(zomoreMember.getMemberIntegral()!=null&&!zomoreMember.getMemberIntegral().equals("0.0")){
                                zomoreMember.setMemberIntegral(zomoreMember.getMemberIntegral() + memberIntegral);
                            }else {
                                zomoreMember.setMemberIntegral(memberIntegral);
                            }

                        }

                    }

                    /*zomoreMemberServiceImpl.updateZomoreMemberByNum(zomoreMember);*/
                    zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
                    if (zomoreIntegralRecord.getNum() != null && zomoreIntegralRecord.getNum() != 0) {
                        zomoreIntegralRecordServiceImpl.insert(zomoreIntegralRecord);
                    }


            }

    }

    return "redirect:/reception/list.do";
    }


    //前台，单个退货(普通订单)
    @RequestMapping("deletedCommoditSale")
    @ResponseBody
    public String deletedCommoditSale(Integer id,HttpSession session) {
        try {
            //找到销售的具体商品
            ZomoreCommoditySaleCommodit commodit = zomoreCommoditySaleCommoditServiceImpl.selectByid(id);
            //根据流水号查找有多少具体商品
            List<ZomoreCommoditySaleCommodit> select = zomoreCommoditySaleCommoditServiceImpl.select(commodit.getZomoreCommoditySaleId());
            if (select.size() == 1) {
                /*当只有一个商品时，把销售订单状态变成（3）退货状态和删除商品*/
                ZomoreCommoditySale sale = new ZomoreCommoditySale();
                sale.setZomoreCommoditySaleId(commodit.getZomoreCommoditySaleId());
                sale.setZomoreCommodityState(3);
                sale.setZomoreCommoditySaleNum(0);
                sale.setZomoreCommoditySaleInmoney("0");
                sale.setZomoreCommoditySaleMoney("0");
                sale.setZomoreCommoditySaleLetmoney("0");
                sale.setZomoreCommoditySaleSavemoney("0");

                zomoreCommoditySaleServiceImpl.update(sale);
                zomoreCommoditySaleCommoditServiceImpl.deleted(id);

            } else {
                //修该销售单据金额
                ZomoreCommoditySale sale = zomoreCommoditySaleServiceImpl.select(commodit.getZomoreCommoditySaleId());
                Double inmoney = Double.parseDouble(sale.getZomoreCommoditySaleInmoney());

                DecimalFormat format = new DecimalFormat("#0.00");
                //总收减去小计
                sale.setZomoreCommoditySaleInmoney(format.format((inmoney - (commodit.getZomoreCommodityCountMoney()))));
                //改变的数量
                sale.setZomoreCommoditySaleNum(sale.getZomoreCommoditySaleNum()-commodit.getZomoreCommodityNum());
                //原总价
                Double money=Double.parseDouble(sale.getZomoreCommoditySaleMoney())-commodit.getZomoreCommodityMoney();
                sale.setZomoreCommoditySaleMoney(String.valueOf(money));
                //计算让利价
                BigDecimal b1 = new BigDecimal(sale.getZomoreCommoditySaleMoney());
                BigDecimal b2 = new BigDecimal(sale.getZomoreCommoditySaleInmoney());
                Double letmoney = b1.subtract(b2).doubleValue();
                sale.setZomoreCommoditySaleLetmoney(letmoney + "");
                //利润
                ZomoreCommodity commodity= zomoreCommodityServiceImpl.selectByCode(commodit.getZomreComoditycode());
                //进货价*数量
                Double inprice=Double.parseDouble(commodity.getZomoreCommodityIn())*commodit.getZomoreCommodityNum();
                Double saveMoney=Double.parseDouble(sale.getZomoreCommoditySaleMoney())+inprice;
                sale.setZomoreCommoditySaleSavemoney(String.valueOf(saveMoney));

                //更新单据
                zomoreCommoditySaleServiceImpl.update(sale);
                //只删除销售记录
                zomoreCommoditySaleCommoditServiceImpl.deleted(id);

            }
            //通过商品id修改库存(退货添加的库存数量)
            //ZomoreCommodityStore store = new ZomoreCommodityStore();
            ZomoreCommodity commodity= zomoreCommodityServiceImpl.selectByCode(commodit.getZomreComoditycode());
            ZomoreCommodityStore store1 = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
            store1.setZomoreCommodityStore(store1.getZomoreCommodityStore() + commodit.getZomoreCommodityNum());
            zomoreCommodityStoreServiceImpl.updateCommodityid(store1);

            //保存进商品变动表和退货详细表
            //保存商品销售的商品变动明细
            String orid = getthId();
            ZomoreCommodityChange change = new ZomoreCommodityChange();
            change.setZomoreCommodityChangeNum(commodit.getZomoreCommodityNum());
            change.setZomoreCommodityChangeType("客户退货");
            change.setZomoreOrderId(orid);
            zomoreCommodityChangeServiceImpl.insert(change);
            //退货表
            ZomoreCommoditySaleTh th = new ZomoreCommoditySaleTh();
            BeanUtils.copyProperties(commodit, th);
            th.setZomoreCommodityThId(orid);
            zomoreCommoditySaleThServiceImpl.insert(th);

            //会员退货
            ZomoreCommoditySale select1 = zomoreCommoditySaleServiceImpl.select(commodit.getZomoreCommoditySaleId());
            String memberName=select1.getZomoreCommoditySaleMember();
            ZomoreMember zomoreMember = new ZomoreMember();
            if(memberName!=null&&!memberName.equals("来宾")&&!memberName.equals("")){
                List<ZomoreMember> select2 = zomoreMemberServiceImpl.select(memberName, memberName, memberName);
                if(select2!=null&&select.size()>0){
                    zomoreMember=select2.get(0);
                }
            }

            //如果是会员退款到储值卡
            if (zomoreMember != null) {
                Double d4 = Double.parseDouble(zomoreMember.getMemberBalance());
                zomoreMember.setMemberBalance(DoubleUtil.sub(d4, commodit.getZomoreCommodityCountMoney()) + "");
                //会员产生积分变动记录
                ZomoreIntegralRecord zomoreIntegralRecord = new ZomoreIntegralRecord();
                zomoreIntegralRecord.setMeno("商品退货");
                //会员积分变动
                //查询该店的积分规则
                ZomoreIntegral integral = zomoreIntegralServiceImpl.selectZomoreIntegralByshop(session.getAttribute("shopName") + "");
                zomoreIntegralRecord.setShop(session.getAttribute("shopName") + "");
                //会员名字
                zomoreIntegralRecord.setMemberName(zomoreMember.getMemberMemberidname());
                //会员id
                zomoreIntegralRecord.setMemberNum(zomoreMember.getMemberMemberid());

                if (integral != null && !integral.equals("")) {

                    //会员等级多倍积分规则
                    List<ZomoreIntegralGrade> zomoreIntegralGrades = zomoreIntegralGradeServiceImpl.selectByRuleId(integral.getIntegralRuleId());
                    //查询当前门店的会员生日多倍积分规则
                    List<ZomoreIntegralBirthday> zomoreIntegralBirthdays = zomoreIntegralBirthdayServiceImpl.selectByRuleId(integral.getIntegralRuleId());
                    //查询所有当前门店的会员特殊日子多倍积分
                    List<ZomoreIntegralDate> zomoreIntegralDates = zomoreIntegralDateServiceImpl.selectByRuleId(integral.getIntegralRuleId());

                    //1按金额进行积分
                    if (integral.getIntegralRuleType() == 1) {
                        String rule = integral.getIntegralRuleTypeRule();
                        String[] rules = rule.split("\\,");
                        //计算基础积分
                        Double memberIntegral = commodit.getZomoreCommodityCountMoney() / Integer.valueOf(rules[0]);
                        //记录积分生成

                        int num = (new Double(memberIntegral)).intValue();
                        zomoreIntegralRecord.setNum(Integer.valueOf(num));
                        //多倍积分标志位()
                        boolean multiple = false;
                        //会员生日多倍积分
                        if (zomoreIntegralBirthdays != null && zomoreIntegralBirthdays.size() > 0 && !multiple) {
                            String memberBirth = zomoreIntegralBirthdays.get(0).getMemberBirth();
                            //积分规则
                            String[] memberBirths = memberBirth.split("\\,");
                            for (int i = 0; i < memberBirths.length; i++) {
                                //判断会员等级是否在规则内
                                if (memberBirths[i].equals(zomoreMember.getMemberGrade())) {
                                    //是否是该会员生日
                                    SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
                                    String date = sdf.format(new Date());
                                    if (zomoreMember.getMemberBirthday() != null && sdf.format(zomoreMember.getMemberBirthday()).equals(date)) {
                                        multiple = true;
                                    }
                                }
                            }
                            if (multiple) {
                                Integer multipleBirth = zomoreIntegralBirthdays.get(0).getMultipleBirth();
                                //积分翻倍
                                memberIntegral = memberIntegral * multipleBirth;
                                num = (new Double(memberIntegral)).intValue();
                                zomoreIntegralRecord.setNum(Integer.valueOf(num));
                            }
                        }

                        if (zomoreIntegralDates != null && zomoreIntegralDates.size() > 0 && !multiple) {
                            //设置了很多个活动日
                            for (ZomoreIntegralDate zomoreIntegralDate : zomoreIntegralDates) {
                                boolean aa = EffectiveDateUtil.isEffectiveDate(new Date(), zomoreIntegralDate.getStartdate(), zomoreIntegralDate.getEnddate());
                                if (aa) {
                                    //是活动期间，判断会员等级是否在活动条件中
                                    String memberDate = zomoreIntegralDate.getMemberDate();
                                    String[] memberDates = memberDate.split("\\,");
                                    for (int i = 0; i < memberDates.length; i++) {
                                        if (memberDates[i].equals(zomoreMember.getMemberGrade())) {
                                            multiple = true;
                                            break;
                                        }

                                    }
                                    if (multiple) {
                                        Integer multipleDate = zomoreIntegralDate.getMultipleDate();
                                        //积分翻倍
                                        memberIntegral = memberIntegral * multipleDate;
                                        num = (new Double(memberIntegral)).intValue();
                                        zomoreIntegralRecord.setNum(Integer.valueOf(num));

                                    }
                                    break;
                                }

                            }

                        }
                        //会员等级多倍积分
                        if (zomoreIntegralGrades != null && zomoreIntegralGrades.size() > 0 && !multiple) {
                            String memberGrade = zomoreIntegralGrades.get(0).getMemberGrade();
                            String[] memberGrades = memberGrade.split("\\,");
                            for (int i = 0; i < memberGrades.length; i++) {
                                //判断会员等级是否在规则内
                                if (memberGrades[i].equals(zomoreMember.getMemberGrade())) {
                                    multiple = true;
                                    break;
                                }

                            }
                            if (multiple) {
                                Integer multipleGrade = zomoreIntegralGrades.get(0).getMultipleGrade();
                                //积分翻倍
                                memberIntegral = memberIntegral * multipleGrade;
                                num = (new Double(memberIntegral)).intValue();
                                zomoreIntegralRecord.setNum(Integer.valueOf(num));
                            }


                        }
                        //无码商品是否参与积分

                        //会员减去积分
                        if(zomoreMember.getMemberIntegral()!=null&&!zomoreMember.getMemberIntegral().equals("0.0")){
                            zomoreMember.setMemberIntegral(zomoreMember.getMemberIntegral() + memberIntegral);
                        }else {
                            zomoreMember.setMemberIntegral(memberIntegral);
                        }

                    }

                }

                /*zomoreMemberServiceImpl.updateZomoreMemberByNum(zomoreMember);*/
                zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
                if (zomoreIntegralRecord.getNum() != null && zomoreIntegralRecord.getNum() != 0) {
                    zomoreIntegralRecordServiceImpl.insert(zomoreIntegralRecord);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }

        return "success";
    }

    //生成退货id
    public String getthId() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHssmm");
        String orid = format.format(new Date());
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            orid += random.nextInt(10);
        }
        return orid;
    }

    //前台，整个销售订单退货(普通订单)
    @RequestMapping("deletedCommoditSaleall")
    @ResponseBody
    public String deletedCommoditSaleall(String id) {
        try {
            ZomoreCommoditySale sale = new ZomoreCommoditySale();
            sale.setZomoreCommoditySaleId(id);
            sale.setZomoreCommodityState(3);
            List<ZomoreCommoditySaleCommodit> select = zomoreCommoditySaleCommoditServiceImpl.select(id);
            //退货商品表id
            String orid = getthId();
            ZomoreCommoditySale select1 = zomoreCommoditySaleServiceImpl.select(id);
            //保存商品销售的商品变动明细
            ZomoreCommodityChange change = new ZomoreCommodityChange();
            if (select1 != null)
                change.setZomoreCommodityChangeNum(select1.getZomoreCommoditySaleNum());
            change.setZomoreCommodityChangeType("客户退货");
            change.setZomoreOrderId(orid);
            zomoreCommodityChangeServiceImpl.insert(change);
            for (ZomoreCommoditySaleCommodit commodit : select) {
                //通过商品id修改库存(退货添加的库存数量)
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(commodit.getZomoreCommodityName());
                ZomoreCommodityStore store1 = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
                store1.setZomoreCommodityStore(store1.getZomoreCommodityStore() + commodit.getZomoreCommodityNum());
                zomoreCommodityStoreServiceImpl.updateCommodityid(store1);
                //保存进商品退货详细表
                ZomoreCommoditySaleTh th = new ZomoreCommoditySaleTh();
                BeanUtils.copyProperties(commodit, th);
                th.setZomoreCommodityThId(orid);
                zomoreCommoditySaleThServiceImpl.insert(th);
            }
            zomoreCommoditySaleServiceImpl.update(sale);
            zomoreCommoditySaleCommoditServiceImpl.deletedBycommodtyId(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }

    //前台，整个销售订单作废(普通订单)
    @RequestMapping("deletedCommoditSaleall1")
    @ResponseBody
    public String deletedCommoditSaleall1(String id) {
        try {
            ZomoreCommoditySale sale = new ZomoreCommoditySale();
            sale.setZomoreCommoditySaleId(id);
            sale.setZomoreCommodityState(4);
            zomoreCommoditySaleServiceImpl.update(sale);
            zomoreCommoditySaleCommoditServiceImpl.deletedBycommodtyId(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }

    //修改销售订单状态
    @RequestMapping("updateCommoditSale")
    @ResponseBody
    public String updateState(ZomoreCommoditySale sale) {
        zomoreCommoditySaleServiceImpl.update(sale);
        return "success";
    }
}
