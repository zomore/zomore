package com.zomore.domain;

import java.math.BigDecimal;
import java.util.Date;

public class MemberShopOrder {
    private String memberOrderId;//会员订单id
    private String memberOrderAccount;//订单号
    private Date memberOrderTime;//订单时间
    private BigDecimal memberOrderAmout;//订单付款
    private String memberOrderShop;//订单所属门店号
    private Integer memberOrderCommodityNumber;//商品数量（多种之和）
    private String memberOrderCommodityImage;//商品图片url
    private String memberOrderCommodityName;//商品名称
    private String memberAccount;//会员账号
    private String memberName;//收货人名称
    private String memberPhone;//收货订单手机号
    private String memberAddress;//会员订单地址
    private Integer memberOrderStatus; //订单状态
    private String orderEvaluate;//订单评价内容
    private Integer orderEvaluateStatus;//订单评价状态
    private String memberOrderRemark;//会员订单备注

    public String getMemberOrderId() {
        return memberOrderId;
    }

    public void setMemberOrderId(String memberOrderId) {
        this.memberOrderId = memberOrderId;
    }

    public String getMemberOrderAccount() {
        return memberOrderAccount;
    }

    public void setMemberOrderAccount(String memberOrderAccount) {
        this.memberOrderAccount = memberOrderAccount;
    }

    public Date getMemberOrderTime() {
        return memberOrderTime;
    }

    public void setMemberOrderTime(Date memberOrderTime) {
        this.memberOrderTime = memberOrderTime;
    }

    public BigDecimal getMemberOrderAmout() {
        return memberOrderAmout;
    }

    public void setMemberOrderAmout(BigDecimal memberOrderAmout) {
        this.memberOrderAmout = memberOrderAmout;
    }

    public String getMemberOrderShop() {
        return memberOrderShop;
    }

    public void setMemberOrderShop(String memberOrderShop) {
        this.memberOrderShop = memberOrderShop;
    }

    public Integer getMemberOrderCommodityNumber() {
        return memberOrderCommodityNumber;
    }

    public void setMemberOrderCommodityNumber(Integer memberOrderCommodityNumber) {
        this.memberOrderCommodityNumber = memberOrderCommodityNumber;
    }

    public String getMemberOrderCommodityImage() {
        return memberOrderCommodityImage;
    }

    public void setMemberOrderCommodityImage(String memberOrderCommodityImage) {
        this.memberOrderCommodityImage = memberOrderCommodityImage;
    }

    public String getMemberOrderCommodityName() {
        return memberOrderCommodityName;
    }

    public void setMemberOrderCommodityName(String memberOrderCommodityName) {
        this.memberOrderCommodityName = memberOrderCommodityName;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public Integer getMemberOrderStatus() {
        return memberOrderStatus;
    }

    public void setMemberOrderStatus(Integer memberOrderStatus) {
        this.memberOrderStatus = memberOrderStatus;
    }

    public String getOrderEvaluate() {
        return orderEvaluate;
    }

    public void setOrderEvaluate(String orderEvaluate) {
        this.orderEvaluate = orderEvaluate;
    }

    public Integer getOrderEvaluateStatus() {
        return orderEvaluateStatus;
    }

    public void setOrderEvaluateStatus(Integer orderEvaluateStatus) {
        this.orderEvaluateStatus = orderEvaluateStatus;
    }

    public String getMemberOrderRemark() {
        return memberOrderRemark;
    }

    public void setMemberOrderRemark(String memberOrderRemark) {
        this.memberOrderRemark = memberOrderRemark;
    }
}
