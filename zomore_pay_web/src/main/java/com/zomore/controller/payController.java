package com.zomore.controller;

import com.alibaba.fastjson.JSON;
import com.zomore.controller.analysis.PrintBook;
import com.zomore.controller.constant.ComConstant_QuickIn;
import com.zomore.controller.example_quickIn.Main_QuickIn;
import com.zomore.dao.HeadShopDao;
import com.zomore.domain.*;
import com.zomore.service.*;
import com.zomore.utils.PropertiesUtils;
import com.zomore.utils.ResourcesUtils;
import com.zomore.utils.SignUtil_QuickIn;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 被扫支付API
 * Created by LVHUIHUI on 2018-8-6
 */
@Controller
@RequestMapping("/pay")
public class payController {
    @Autowired
    private PayService payService;
    @Autowired
    private ZomoreCashierService zomoreCashierService;
    @Autowired
    private ZomoreCommoditySaleAction zomoreCommoditySaleAction;
    @Autowired
    private ZomoreServiceCommodityorderAction zomoreServiceCommodityorderAction;
    @Resource
    private ZomoreCommoditySaleService zomoreCommoditySaleServiceImpl;
    @Resource
    private ZomoreCommodityChangeService zomoreCommodityChangeServiceImpl;
    @Resource
    private ZomoreCommoditySaleCommoditService zomoreCommoditySaleCommoditServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreServiceCommodityorderService zomoreServiceCommodityorderServiceImpl;
    @Resource
    private ZomoreServiceCommoditySalecommoditService zomoreServiceCommoditySalecommoditService;
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Autowired
    private HeadShopDao headShopDao;
    @Resource
    private HttpSession httpSession;
    @Autowired
    private SettingService settingServiceImpl;


    public static Map getReqparas() {
        Map<String, String> paras = new HashMap<String, String>();
        paras.put("appId", ComConstant_QuickIn.APPID);//合作方标识
        paras.put("random", "liantuo123");//随机数
        paras.put("merchantCode", "EW_N4130797151");//商户编号
        paras.put("outTradeNo", "EW_N4267159134_a1a11a11aaaabc1");//商户订单号
        paras.put("totalAmount", "0.01");//订单总金额
        paras.put("authCode", "135342335622154771");//支付授权码
        paras.put("subject", "测试订单1");//支付凭证商品描述信息，不填写默认为交易订单编号
        paras.put("sign", SignUtil_QuickIn.createSign(paras, ComConstant_QuickIn.PARTER_KEY, ComConstant_QuickIn.INPUT_CHARSET));
        return paras;
    }

    @RequestMapping("/pay.do")
    public static Map getReqparasTest(String authCode, String money, String id) {
        Map<String, String> paras = new HashMap<String, String>();
        paras.put("appId", ComConstant_QuickIn.APPID);//合作方标识
        paras.put("random", "9217");//随机数
        paras.put("merchantCode", "EW_N4130797151");//商户编号
        paras.put("outTradeNo", id + "");//商户订单号
        paras.put("totalAmount", money + "");//订单总金额
        paras.put("authCode", authCode + "");//支付授权码
        paras.put("operatorId", "1001");//支付凭证商品描述信息，不填写默认为交易订单编号
        paras.put("sign", SignUtil_QuickIn.createSign(paras, ComConstant_QuickIn.PARTER_KEY, ComConstant_QuickIn.INPUT_CHARSET));
        System.out.println("请求数据：" + paras);
        return paras;
    }

    @RequestMapping("aa.do")
    public String aa(String authCode, String money,String memberNum, String id, String actualmoney, HttpSession session, Model model) {
        String s = Main_QuickIn.requestAsPost(payController.getReqparasTest(authCode, money, id), ComConstant_QuickIn.SERVICEURL_NEWSI_PAY);
        System.out.println("被扫支付API===服务器端返回res=====" + s);
        String s1 = s.substring(1, s.length() - 1);
        String[] split = s1.split(",");
        Map map1 = new HashMap();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(":");
            map1.put(split1[0].substring(1, split1[0].length() - 1), split1[1].substring(1, split1[1].length() - 1));
        }
        if (map1.get("code").equals("FAILED")) {//支付失败
            model.addAttribute("message", map1);
            return "forward:/pages/payfailer.jsp";
        }
        try {
            ZomoreCommoditySale sale = new ZomoreCommoditySale();
            sale.setZomoreCommoditySaleId(id);
            sale.setZomoreCommodityState(1);
            zomoreCommoditySaleServiceImpl.update(sale);
            //根据会员号改变会员的积分


            //保存商品销售的商品变动明细
            ZomoreCommoditySale select = zomoreCommoditySaleServiceImpl.select(id);
            ZomoreCommodityChange change = new ZomoreCommodityChange();
            if (select != null)
                change.setZomoreCommodityChangeNum(select.getZomoreCommoditySaleNum());
            change.setZomoreCommodityChangeType("商品销售");
            change.setZomoreOrderId(id);
            zomoreCommodityChangeServiceImpl.insert(change);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //减去商品库存
        List<ZomoreCommoditySaleCommodit> select = zomoreCommoditySaleCommoditServiceImpl.select(id);
        if (select != null && select.size() > 0) {
            for (ZomoreCommoditySaleCommodit zomoreCommoditySaleCommodit : select) {
                Integer num = zomoreCommoditySaleCommodit.getZomoreCommodityNum();
                String name = zomoreCommoditySaleCommodit.getZomoreCommodityName();
                ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(name);
                ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
                store.setZomoreCommodityStore(store.getZomoreCommodityStore() - num);
                zomoreCommodityStoreServiceImpl.updateCommodityid(store);
            }
        }
        //支付成功打印
        // 模板解析
        String jsonStr = "";
        try {
            jsonStr = new ResourcesUtils().getResource(PropertiesUtils.getString("ext.template"),memberNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (StringUtils.isBlank(jsonStr)) {
            System.exit(0);
            //134707337576753967
            // MYBKJHZF2019032614512665337691
            // return ;
        }
        PrintBook printBook = JSON.parseObject(jsonStr, PrintBook.class);

        // 设置打印页眉
        Map<String, Object> dataMap = new LinkedHashMap<String, Object>();
        dataMap.put("merberNo", session.getAttribute("cashierName") + "");//收銀員編號
        dataMap.put("companyName", session.getAttribute("shopName") + "");
        dataMap.put("orderNo", id + "");
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dataMap.put("orderDate", format.format(new Date()) + "");
        // 设置打印body
        List list = zomoreCommoditySaleAction.showAllZomoreCommoditySaleCommodit(id);
        List<GoodsInfo> goods = new ArrayList<GoodsInfo>();
        int allnum = 0;
        Double alltotalmoney = new Double(0);
        for (int i = 0; i < list.size(); i++) {
            Map map = (Map) list.get(0);
            Double price = Double.parseDouble(map.get("price") + "");
            int num = (int) map.get("num");
            allnum += num;
            Double totalmoney = price * num;
            alltotalmoney += totalmoney;
            goods.add(new GoodsInfo(map.get("name") + "", price + "", num + "", totalmoney + ""));
        }
      /*  goods.add(new GoodsInfo("大数据", "14800", "1", "14800"));
        goods.add(new GoodsInfo("前端", "11800", "1", "11800"));*/
        dataMap.put("goodInfos", goods);
        // 设置打印页脚
        dataMap.put("goodsCount", allnum + "");//总数量
        dataMap.put("totalmoney", alltotalmoney + "");//总金额
        dataMap.put("actualmoney", actualmoney + "");//实收
        dataMap.put("changemoney", (alltotalmoney - Double.parseDouble(actualmoney)) + "");//找零
        dataMap.put("operatorname", session.getAttribute("cashierName") + "");//操作员
        /*dataMap.put("score", "10");//积分*/
        dataMap.put("address", session.getAttribute("shopAddress"));
        // 输出打印
        PrintTicket printTicket = new PrintTicket(printBook, dataMap);
        printTicket.printer();
        httpSession.removeAttribute("Aa_servieceorderid");
        return "forward:/pages/paysuccess.jsp";
    }

    @RequestMapping("money.do")
    public String money(String money, Model model, String memberNum,String id, String actualmoney) {
        model.addAttribute("money", money);
        model.addAttribute("id", id);
        model.addAttribute("actualmoney", actualmoney);
        model.addAttribute("memberNum",memberNum);
        return "forward:/pages/pay.jsp";
    }

    /**
     *
     * @param money 实收价格
     * @param model
     * @param id 销售单流水号
     * @param memberNum 会员号
     * @param actualmoney ？？
     * @param session
     * @return
     */
    @RequestMapping("noMoney.do")
    @ResponseBody
    public String noMoney(String money, Model model, String id, Integer ishouyuan,String guideName,String memberNum,String actualmoney,String changeMoney,String integral, HttpSession session) {
        //保存商品销售的商品变动明细
        ZomoreCommoditySale select = zomoreCommoditySaleServiceImpl.select(id);
        ZomoreServiceCommodityorder select2 =zomoreServiceCommodityorderServiceImpl.select(id);
        try {
            ZomoreCommodityChange change = new ZomoreCommodityChange();
            if (select != null)
            change.setZomoreCommodityChangeNum(select.getZomoreCommoditySaleNum());
            change.setZomoreCommodityChangeType("商品销售");
            change.setZomoreOrderId(id);
            zomoreCommodityChangeServiceImpl.insert(change);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("money", money);
        model.addAttribute("id", id);
        model.addAttribute("actualmoney", actualmoney);
        kaiqianxiang();
        // 模板解析
        String jsonStr = "";
        try {
            jsonStr = new ResourcesUtils().getResource(PropertiesUtils.getString("ext.template"),memberNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (StringUtils.isBlank(jsonStr)) {
            System.exit(0);
            //134707337576753967
            // MYBKJHZF2019032614512665337691
            // return ;
        }
        PrintBook printBook = JSON.parseObject(jsonStr, PrintBook.class);

      /*  for (int i=0;i<printBook.getGooods().size();i++){
            printBook.getGooods().get(0).setLine(true);
        }*/
        // 设置打印页眉
        Map<String, Object> dataMap = new LinkedHashMap<String, Object>();
        dataMap.put("cashierNo", session.getAttribute("cashierNumber") + "");//收银员编号
        dataMap.put("guideName", guideName);//导购员
        dataMap.put("companyName", session.getAttribute("shopName") + "");//店名
        String itemNum =session.getAttribute("itemNum")+"";
        dataMap.put("orderNo", id + "");//订单号
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dataMap.put("orderDate", format.format(new Date()) + "");
        // 设置打印body
        List list=new ArrayList();
        if (select!=null&&select2==null){
             list= zomoreCommoditySaleAction.showAllZomoreCommoditySaleCommodit(id);
        }
        if(select2!=null&&select==null){
            list =zomoreServiceCommodityorderAction.showAllZomoreCommoditySaleCommodit(id);
        }
        if(select!=null&&select2!=null){
            list= zomoreCommoditySaleAction.showAllZomoreCommoditySaleCommodit(id);
            List list2 =zomoreServiceCommodityorderAction.showAllZomoreCommoditySaleCommodit(id);
            for(int i=0;i<list2.size();i++){
                list.add(list2.get(i));
            }
        }
        List<GoodsInfo> goods = new ArrayList<GoodsInfo>();
        int allnum = 0;
        Double alltotalmoney = new Double(0);
        for (int i = 0; i < list.size(); i++) {
            Map map = (Map) list.get(i);
            Double price = Double.parseDouble(map.get("price") + "");
            int num = (int) map.get("num");
            allnum += num;
            Double totalmoney = price * num;
            alltotalmoney += totalmoney;
            goods.add(new GoodsInfo(map.get("name") + "", price + "", num + "", totalmoney + ""));
        }
      /*  goods.add(new GoodsInfo("大数据", "14800", "1", "14800"));
        goods.add(new GoodsInfo("前端", "11800", "1", "11800"));*/
        dataMap.put("goodInfos", goods);
        // 设置打印页脚
        DecimalFormat format12 =new DecimalFormat("0.00");
        Map map = (Map) list.get(0);
        String alltotalmoney2 =format12.format(alltotalmoney);
        String allmoney=String.valueOf(map.get("alllmoney"));
        Double saveMoney=Double.parseDouble(alltotalmoney2)-Double.parseDouble(money);
       /* dataMap.put("goodsCount", map.get("alllnum"));//总数量*/
        dataMap.put("totalMoney", alltotalmoney2);//(应收)
        dataMap.put("actualMoney",allmoney);//实收
        if (changeMoney==null||changeMoney.equals("")){
            changeMoney="0";
        }
        dataMap.put("changeMoney", changeMoney);//找零？？？？？
       /*dataMap.put("operatorname", session.getAttribute("cashierName") + "");//导购员*/
        /*dataMap.put("score", "10");//积分*/
        dataMap.put("payType",map.get("payType"));
        dataMap.put("saveMoney",format12.format(saveMoney));
        dataMap.put("address", session.getAttribute("shopAddress")+"");
        if(memberNum!=null&&!memberNum.equals("")){
            dataMap.put("memberNo",map.get("memberNo"));//会员号
            dataMap.put("memberName",map.get("memberName"));//姓名
            dataMap.put("memberBalance",map.get("menberBalance"));//余额
            dataMap.put("countIntegral",map.get("countIntegral"));//总积分
            dataMap.put("integral",integral);//本单积分
        }
        // 输出打印
        PrintTicket printTicket = new PrintTicket(printBook, dataMap);
        String num = session.getAttribute("printnumber")+"";
        for (int i=0;i<Integer.valueOf(num);i++){
            printTicket.printer();
        }
        httpSession.removeAttribute("Aa_servieceorderid");
        return "success";
    }

    //开钱箱

    public void kaiqianxiang() {
        //获取系统名
        String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            //Windows
           try {
                FileWriter fw = new FileWriter("LTP1");
                PrintWriter pw = new PrintWriter(fw);
            /*    //打印机开钱箱指令
               byte[] data = new byte[5];
               data[0] = 0x1B;
               data[1] = 0x70;
               data[2] = 0x00;
               data[3] = 0x0A;
               data[4] = 0x32;
               String c=new String(data);*/
               char[] c = {27, 112, 0, 100,100};
                pw.print(c);
                pw.print("\r\n");
                pw.flush();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PrintTicket.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException e) {
                e.printStackTrace();
            }

          /*  Host host = HostFactory.getHost();
            Bus[] bus = host.getBusses();
            int total_bus = bus.length;
            for (int i = 0; i < total_bus; i++) {
                Device root = bus[i].getRootHub();
                int total_port = root.getNumPorts();
                for (int j = 1; j <= total_port; j++) {
                    Device device = root.getChild(j);
                }
                if (dlevice!=null){

                }
            }*/

        } else {
            //Linux
            try {
                FileOutputStream fos = new FileOutputStream("/dev/lp0");
                //打印机开钱箱指令
                char[] c = {27, 'p', 0, 60, 240};
                for (int i = 0; i < c.length; i++) {
                    fos.write(c[i]);
                }
                fos.write("\n".getBytes());
                fos.flush();
            } catch (IOException ex) {
                Logger.getLogger(PrintTicket.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }

    @RequestMapping("/payLogin.do")
    public String payLogin(String cashierNumber, String cashierPassword, HttpServletRequest request, HttpSession session) {

        ZomoreCashier zomoreCashier = zomoreCashierService.select(cashierNumber, cashierPassword);
        if (zomoreCashier != null) {
            String cashierName = zomoreCashier.getCashierName();
            session.setAttribute("cashierName", cashierName);
            session.setAttribute("cashierNumber", zomoreCashier.getCashierNumber());
            session.setAttribute("cashierPhone",zomoreCashier.getCashierPhone());
            session.setAttribute("loginTime", new Date());
            session.setAttribute("index", "null");
            //登录成功，把全限加载
            String headshopaccount= session.getAttribute("shopAccount")+"";
            ZomoreCashierBeforeRight zomoreCashierBeforeRight = new ZomoreCashierBeforeRight();
            zomoreCashierBeforeRight.setCashiernum(zomoreCashier.getCashierNumber());
            zomoreCashierBeforeRight.setHeadshopnum(headshopaccount);
            List<ZomoreCashierBeforeRight> zomoreCashierBeforeRights = settingServiceImpl.selectCashierBeforeRight(zomoreCashierBeforeRight);
            if(zomoreCashierBeforeRights!=null&zomoreCashierBeforeRights.size()>0){
                session.setAttribute("zomoreCashierBeforeRight",zomoreCashierBeforeRights.get(0));
            }
            return "redirect:/reception/list.do";
        } else {
            request.setAttribute("errorMsg", "账户名或密码错误,请重新登录");
            return "forward:/pages/shouyintailogin.jsp";
        }

    }

    /**
     * 去收银台登录
     * @param headShop
     * @param session
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/toShouyingtai.do")
    private String toShouyingtai(HeadShop headShop, HttpSession session, HttpServletResponse response) throws Exception {
        //获取登录人信息
        SecurityContext sc = SecurityContextHolder.getContext();
        Authentication auth = sc.getAuthentication();
        User user = (User) auth.getPrincipal();
        String username = user.getUsername();
        HeadShop byUsername = headShopDao.findByUsername(username);
        session.setAttribute("sharedmemberid",byUsername.getSharedmemberid());
        String shopName = byUsername.getShopName();
        session.setAttribute("shopName", shopName);
        session.setAttribute("shopAccount", byUsername.getUsername());
        Long multipleId = byUsername.getMultipleId();
        session.setAttribute("multipleId", multipleId);
        session.setAttribute("shopRole", byUsername.getRole());
        Long shopId = byUsername.getShopId();
        session.setAttribute("shopId", shopId);
        session.setAttribute("shopAddress", byUsername.getAddress());
        addcooke(headShop.getUsername(), headShop.getPassword(), response);
        return "forward:/pages/shouyintailogin.jsp";
    }

    //添加字自动登录Cookie
    public void addcooke(String username, String passward, HttpServletResponse response) {
        // 组合登录信息
        String loginInfo = username + "+" + passward;
        // 将登陆信息编码
        try {
            loginInfo = URLEncoder.encode(loginInfo, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 创建Cookie
        Cookie userCookie = new Cookie("loginInfo", loginInfo);
        // 设置Cookie存活期限
        userCookie.setMaxAge(5*365*24*60*60);//设置存活5年
        // 设置所有路径下共享Cookie
        userCookie.setPath("/");
        // 添加Cookie到服务器响应中
        response.addCookie(userCookie);
    }
    @RequestMapping("/payLogout.do")
    @ResponseBody
    public String deleteCookie(HttpServletResponse response){
        String loginInfo="";
        try {
            loginInfo = URLEncoder.encode(loginInfo, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 创建Cookie
        Cookie userCookie = new Cookie("loginInfo", loginInfo);
        // 设置Cookie存活期限
        userCookie.setMaxAge(0);//0秒存活
        // 设置所有路径下共享Cookie
        userCookie.setPath("/");
        // 添加Cookie到服务器响应中，覆盖掉原来的
        response.addCookie(userCookie);
        return "success";
    }

    //保存预约服务表
    @RequestMapping("/saveReservation.do")
    public String saveReservation(Reservation reservation) throws Exception {
        reservation.setPayway(2);
        reservation.setStatus(0);
        payService.saveReservation(reservation);
        return "redirect:/reception/index.jsp";
    }


}







