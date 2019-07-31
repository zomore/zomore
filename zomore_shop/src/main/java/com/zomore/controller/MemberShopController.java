package com.zomore.controller;


import com.zomore.domain.*;
import com.zomore.service.MemberShopService;
import com.zomore.service.ZomoreCommodityService;
import com.zomore.service.ZomoreMemberPointService;
import com.zomore.service.ZomoreMemberService;
import com.zomore.utils.OrderNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/memberShop")
public class MemberShopController {

    @Autowired
    private ZomoreMemberService zomoreMemberServiceImpl;
   @Autowired
    private ZomoreMemberPointService zomoreMemberPointServiceImpl;
   @Autowired
   private MemberShopService memberShopServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;


    /**
     * 获取会员资料
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/findMemberData.do")
    public String findMemberData(Model model, HttpSession session){
        if (session.getAttribute("user") != null) {
            ZomoreMember  zomoreMember = (ZomoreMember) session.getAttribute("user");
            Double countPointNumber =  zomoreMemberPointServiceImpl.selectPointNumber(zomoreMember.getMemberInvitationcode());
            OrderNumber orderNumber = memberShopServiceImpl.findAllOrderNumberWithStatus(zomoreMember.getMemberNumber());
            model.addAttribute("orderNumber",orderNumber);
            model.addAttribute("countPointNumber",countPointNumber);
        }
        return "forward:/pages/member.jsp";
    }

    /**
     * 保存商品到购物车
     * @param session
     * @param zomoreMemberShopcar
     * @return
     */
    @RequestMapping("/saveCommodityInShopcar.do")
    @ResponseBody
    public String saveCommodityInShopcar (HttpSession session,ZomoreMemberShopcar zomoreMemberShopcar){
//        ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");

        HeadShop headShop = (HeadShop) session.getAttribute("isCommodity");
        //店名以及会员账号
//        zomoreMemberShopcar.setShopcarMemberAccount(zomoreMember.getMemberNumber());
//        zomoreMemberShopcar.setShopcarCommodityShop(zomoreMember.getMemberShop());
        zomoreMemberShopcar.setShopcarCommodityShop(headShop.getShopName());
       String result = memberShopServiceImpl.saveShopcarCommodity(zomoreMemberShopcar);
       if(!result.equals("false")){
           return "true";
       }
        return "false";
    }

    /**
     * 保存商品到购物车,到立即购买
     * @param session
     * @param zomoreMemberShopcar
     * @return
     */
    @RequestMapping("/saveCommodityToBuy.do")
    public String saveCommodityToBuy (HttpSession session,ZomoreMemberShopcar zomoreMemberShopcar,Model model){
//        ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");
        //店名以及会员账号
//        zomoreMemberShopcar.setShopcarMemberAccount(zomoreMember.getMemberNumber());
//        zomoreMemberShopcar.setShopcarCommodityShop(zomoreMember.getMemberShop());

        HeadShop headShop = (HeadShop) session.getAttribute("isCommodity");
        zomoreMemberShopcar.setShopcarCommodityShop(headShop.getShopName());
        String result = memberShopServiceImpl.saveShopcarCommodity(zomoreMemberShopcar);
        if(result.equals("false")){
            return "forward:/pages/index.jsp";
        }
        List<ZomoreMemberShopcar> shopcars = new ArrayList<>();
        ZomoreMemberShopcar zs =memberShopServiceImpl.selectShoopCarByShopcarId(result);
        shopcars.add(zs);
        //Bigdecimal乘法
        BigDecimal countMoney = new BigDecimal(String.valueOf(zs.getShopcarCommodityNum())).multiply(zs.getShopcarCommodityOutprice());
        model.addAttribute("countMoney",countMoney);
        model.addAttribute("shopcars",shopcars);
        return "forward:/pages/toOrder.jsp";

    }

    /**
     * 获取购物车资料
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/gotoMyShopcar.do")
    public String gotoMyShopcar(HttpSession session,Model model){
        ZomoreMemberShopcar zomoreMemberShopcar = new ZomoreMemberShopcar();
        if (session.getAttribute("user") == null && session.getAttribute("isCommodity") != null) {
            HeadShop headShop = (HeadShop) session.getAttribute("isCommodity");
            zomoreMemberShopcar.setShopcarCommodityShop(headShop.getShopName());
            List<ZomoreMemberShopcar> zomoreMemberShopcars = memberShopServiceImpl.selectAllShopCar(zomoreMemberShopcar);
            model.addAttribute("zomoreMemberShopcars",zomoreMemberShopcars);
        } else {
            ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");
            String  shop = zomoreMember.getMemberShop();
            String  member = zomoreMember.getMemberNumber();
            //封装查询条件，店铺名、会员账号
            zomoreMemberShopcar.setShopcarCommodityShop(shop);
            zomoreMemberShopcar.setShopcarMemberAccount(member);
            //查询
            List<ZomoreMemberShopcar> zomoreMemberShopcars = memberShopServiceImpl.selectAllShopCar(zomoreMemberShopcar);
            //
            for(ZomoreMemberShopcar zs:zomoreMemberShopcars){


            }
            model.addAttribute("zomoreMemberShopcars",zomoreMemberShopcars);

            /*List<ZomoreCommodity> zomoreCommodityList = memberShopServiceImpl.selectAllCommodityFromShopCar(shop,member);*/
            /*model.addAttribute("zomoreCommodityList",zomoreCommodityList);*/

        }

        return "forward:/pages/myShopCar.jsp";

    }

    /**
     * 根据购物车记录id删除购物车记录
     * @param zomoreMemberShopcar
     * @return
     */
    @RequestMapping("/deleteShopcar.do")
    public String deleteShopcar(ZomoreMemberShopcar zomoreMemberShopcar){
        if(memberShopServiceImpl.deleteShopcarById(zomoreMemberShopcar)>0){
            return "forward:/memberShop/gotoMyShopcar.do";
        }
      return "forward:/memberShop/gotoMyShopcar.do";
    }

    /**
     *  ajax计算购物车中的金额
     * @param shopcarIds
     * @return
     */
    @RequestMapping("/countMoneny.do")
    @ResponseBody
    public BigDecimal countMoney(String shopcarIds){

        System.out.print(shopcarIds);
        String [] shopcarId =shopcarIds.split("\\,");
        //计算购物车中的商品价格
        List<ZomoreMemberShopcar>  shopcars = new ArrayList<>();
        //返回的总额
        BigDecimal countMoney = new BigDecimal("0");

        for (int i=0;i<shopcarId.length;i++){

            ZomoreMemberShopcar zs =memberShopServiceImpl.selectShoopCarByShopcarId(shopcarId[i]);
            shopcars.add(zs);
            //Bigdecimal乘法
            BigDecimal money = new BigDecimal(String.valueOf(zs.getShopcarCommodityNum())).multiply(zs.getShopcarCommodityOutprice());
           //Bigdecimal加法
            countMoney = countMoney.add(money);
        }

        return countMoney;
    }

    /**
     * 改变购物车的数量
     * @param zomoreMemberShopcar
     * @return
     */
    @RequestMapping("/changeCommodityNum.do")
    @ResponseBody
    public String  delCommodityNum(ZomoreMemberShopcar zomoreMemberShopcar){
        ZomoreMemberShopcar zomoreMemberShopcar2 = zomoreMemberShopcar;

        Integer result = memberShopServiceImpl.changeCommodityNum(zomoreMemberShopcar);
        if (result>0){
            return "true";
        }
        return "false";

    }

    /**
     * 清空购物车
     * @param session
     * @return
     */
    @RequestMapping("/deleteAllshopcar.do")
    public String deleteAllshopcar(HttpSession session){
        ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");
        ZomoreMemberShopcar zomoreMemberShopcar = new ZomoreMemberShopcar();
        zomoreMemberShopcar.setShopcarMemberAccount(zomoreMember.getMemberNumber());
        zomoreMemberShopcar.setShopcarCommodityShop(zomoreMember.getMemberShop());
        memberShopServiceImpl.deleteAllshopcar(zomoreMemberShopcar);
        return "forward:/memberShop/gotoMyShopcar.do";

    }

    /**
     * 提交订单页面
     * @param commodityCountId
     * @param model
     * @return
     */
    @RequestMapping("/gotoMemberOrder.do")
    public  String gotoMemberOrder(String commodityCountId,Model model){


        System.out.print(commodityCountId);
        String [] shopcarId =commodityCountId.split("\\,");
        //计算购物车中的商品价格
        List<ZomoreMemberShopcar>  shopcars = new ArrayList<>();
        //返回的总额
        BigDecimal countMoney = new BigDecimal("0");

        for (int i=0;i<shopcarId.length;i++){

            ZomoreMemberShopcar zs =memberShopServiceImpl.selectShoopCarByShopcarId(shopcarId[i]);
            shopcars.add(zs);
            //Bigdecimal乘法
            BigDecimal money = new BigDecimal(String.valueOf(zs.getShopcarCommodityNum())).multiply(zs.getShopcarCommodityOutprice());
            //Bigdecimal加法
            countMoney = countMoney.add(money);
        }

        model.addAttribute("countMoney",countMoney);
        model.addAttribute("shopcars",shopcars);

        return "forward:/pages/toOrder.jsp";

    }

    /**
     * 保存订单（未付款，不减库存）
     * @param session
     * @param shopcarId
     * @param memberShopOrder
     * @param memberAddressDetails
     * @return
     */
    @RequestMapping("/subMemberOrder.do")
    public  String  subMemberOrder(HttpSession session,String[] shopcarId, MemberShopOrder memberShopOrder,String memberAddressDetails){
        //会员信息
        ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");
        memberShopOrder.setMemberAccount(zomoreMember.getMemberNumber());
        memberShopOrder.setMemberName(zomoreMember.getMemberMemberidname());
        memberShopOrder.setMemberOrderShop(zomoreMember.getMemberShop());
        //默认的订单状态0：未付款，1待发货，2待收货，3已经完成
        memberShopOrder.setMemberOrderStatus(0);

        //设置详细地址
        memberShopOrder.setMemberAddress(memberShopOrder.getMemberAddress()+memberAddressDetails);
        memberShopServiceImpl.saveMemberOrder(memberShopOrder,shopcarId);

        return "forward:/memberShop/findAllOrderByMemberAccount.do";
    }

    /**
     * 取消未付款订单
     * @param memberShopOrder
     * @return
     */
    @RequestMapping("/deleteOrderWithPendingpay.do")
    public String deleteOrderWithPendingpay(MemberShopOrder memberShopOrder){

        memberShopServiceImpl.deleteOrderWithPendingpay(memberShopOrder);
        return "forward:/memberShop/findAllOrderByMemberAccount.do";
    }

    /**
     * 根据会员账号以及订单状态获取所有对应的订单
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/findAllOrderByMemberAccount")
    public String findAllOrderByMemberAccount(HttpSession session,Model model,Integer orderStatus){
        if (session.getAttribute("user") != null) {
            ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");
            MemberShopOrder memberShopOrder = new MemberShopOrder();
            memberShopOrder.setMemberAccount(zomoreMember.getMemberNumber());
            if (orderStatus == null || orderStatus == 0) {
                orderStatus = 0;
                memberShopOrder.setMemberOrderStatus(orderStatus);
                List<MemberShopOrder> memberShopOrders = memberShopServiceImpl.findAllOrderByMemberAccount(memberShopOrder);
                model.addAttribute("memberShopOrders", memberShopOrders);
                return "forward:/pages/pendingpayment.jsp";

            }
            if (orderStatus == 1) {
                memberShopOrder.setMemberOrderStatus(orderStatus);
                List<MemberShopOrder> memberShopOrders = memberShopServiceImpl.findAllOrderByMemberAccount(memberShopOrder);
                model.addAttribute("memberShopOrders", memberShopOrders);
                return "forward:/pages/pendingsending.jsp";
            }
            if (orderStatus == 2) {
                memberShopOrder.setMemberOrderStatus(orderStatus);
                List<MemberShopOrder> memberShopOrders = memberShopServiceImpl.findAllOrderByMemberAccount(memberShopOrder);
                model.addAttribute("memberShopOrders", memberShopOrders);
                return "forward:/pages/pendingGetGoods.jsp";

            }
            //orderStatus==3
            memberShopOrder.setMemberOrderStatus(orderStatus);
            List<MemberShopOrder> memberShopOrders = memberShopServiceImpl.findAllOrderByMemberAccount(memberShopOrder);
            model.addAttribute("memberShopOrders", memberShopOrders);
        }
        return "forward:/pages/myOrder.jsp";
    }

    /**
     * 获取所有待评价订单
     * @param session
     * @param model
     * @param orderStatus
     * @return
     */
    @RequestMapping("/findPendingEvaluateOrders.do")
    public  String findPendingEvaluateOrders(HttpSession session,Model model,Integer orderStatus){
        if(session.getAttribute("user") != null) {
            ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");
            MemberShopOrder memberShopOrder = new MemberShopOrder();
            memberShopOrder.setMemberAccount(zomoreMember.getMemberNumber());
            //订单状态：3，待评价状态为0
            memberShopOrder.setOrderEvaluateStatus(0);
            memberShopOrder.setMemberOrderStatus(orderStatus);
            List<MemberShopOrder> memberShopOrders = memberShopServiceImpl.findPendingEvaluateOrders(memberShopOrder);
            model.addAttribute("memberShopOrders",memberShopOrders);
        }
        return"forward:/pages/pendingevaluate.jsp";
    }

    /**
     * 查看订单详情
     * @param memberShopOrder
     * @param model
     * @return
     */
    @RequestMapping("/findMemberShopOrderDetails.do")
    public String findMemberShopOrderDetails(MemberShopOrder memberShopOrder,Model model){
        MemberShopOrderDetail memberShopOrderDetail = new MemberShopOrderDetail();
        memberShopOrderDetail.setMemberOrderdetailOrderid(memberShopOrder.getMemberOrderId());

        MemberShopOrder newMemberShopOrder = memberShopServiceImpl.findMemberShoporderByOrderId(memberShopOrder);
        List<MemberShopOrderDetail> memberShopOrderDetails = memberShopServiceImpl.findMemberShopOrderDetailByOrderId(memberShopOrderDetail);
        model.addAttribute("newMemberShopOrder",newMemberShopOrder);
        model.addAttribute("memberShopOrderDetails",memberShopOrderDetails);

        return "forward:/pages/orderDetails.jsp";
    }
    @RequestMapping("/updataMemberOrder.do")
    public String updataMemberOrder(MemberShopOrder memberShopOrder){
        memberShopServiceImpl.updataMemberOrder(memberShopOrder);
        return "forward:/memberShop/findMemberData.do";
    }

    @RequestMapping("/selectAllClass.do")
    public String selectAllClass(){


        return "forward:/pages/classify.jsp";
    }




}
