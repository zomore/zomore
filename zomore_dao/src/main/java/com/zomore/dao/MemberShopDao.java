package com.zomore.dao;

import com.zomore.domain.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

public interface MemberShopDao {
    //获取待付款的订单数量
    Integer selectOrderNumberofPay(@Param("account") String account);
    //获取待发货的订单数量
    Integer selectOrderNumberofSend(@Param("account") String account);
    //获取待收货的订单数量
    Integer selectOrderNumberofGet(@Param("account") String account);
    //获取待评价的订单数量
    Integer selectOrderNumberofEvalate(@Param("account") String account);
    //保存购物车商品信息
    Integer saveShopcarCommodity(ZomoreMemberShopcar zomoreMemberShopcar);
    //获取购物车商品信息
    List<ZomoreMemberShopcar> selectAllShopcar(ZomoreMemberShopcar zomoreMemberShopcar);
    //根据购物车id获取商品信息
    ZomoreMemberShopcar selectShoopCarByShopcarId (@Param("shopcarId") String shopcarId);
    //更新购物车商品信息
    Integer updataShopcarCommodity(ZomoreMemberShopcar zomoreMemberShopcar);
    //删除购物车的记录
    Integer deleteShopcarById(ZomoreMemberShopcar zomoreMemberShopcar);
    //更改购物车中已经存在的商品数量
    Integer changeCommodityNum(ZomoreMemberShopcar zomoreMemberShopcar);

    /*//根据商品条码查询购物车sp
    List<ZomoreMemberShopcar>  selectAllCommodityByCommodityCode(@Param("commodityCode") String commodityCode);*/

    //查看购物车商品信息
    List<ZomoreMemberShopcar> selelctAllCommodityFromShopcar(@Param("shop") String shop,@Param("memberAccount") String memberAccount);

    //清空购物车
    Integer deleteAllshopcar(ZomoreMemberShopcar zomoreMemberShopcar);

    //提交了订单（未付款，不减库存）
    Integer saveMemberOrder(MemberShopOrder memberShopOrder);

    //获取已完成订单的信息
    List<MemberShopOrder> selectAllOrderByMemberAccount (MemberShopOrder memberShopOrder);

    //获取待评价订单
    List<MemberShopOrder> findPendingEvaluateOrders( MemberShopOrder memberShopOrder);

    //获取订单详情-订单order
    MemberShopOrder findMemberShoporderByOrderId(MemberShopOrder memberShopOrder);

    //根据订单号获取订单详情-详细商品orderdetail
    List<MemberShopOrderDetail> findMemberShopOrderDetailByOrderId(MemberShopOrderDetail memberShopOrderDetail);

    //取消未付款订单
    void deleteOrderWithPendingpay(MemberShopOrder memberShopOrder);

    //保存订单的详细信息
    Integer saveMemberOrderDetails(MemberShopOrderDetail memberShopOrderDetail);

    //根据Id更改订单消息
    void updataMemberOrder(MemberShopOrder memberShopOrder);

    //根据商品id取商品
    ZomoreCommodity selsectCommodityById(@Param("commodityId") String commodityId);

    //根据商品id取商品库存
    ZomoreCommodityStore selectComodityStoreByCommodityId (@Param("commodityId") String commodityId);




}
