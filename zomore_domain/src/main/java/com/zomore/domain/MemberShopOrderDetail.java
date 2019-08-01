package com.zomore.domain;

import java.math.BigDecimal;

public class MemberShopOrderDetail {
    private String memberOrderdetailId; //订单详情表id
    private String memberOrderdetailOrderid;//订单id
    private String memberOrderdetailCommodityCode;//订单详情的商品条形码
    private Integer memberOrderdetailComodityNum;//商品数量
    private String memberOrderdetailCommodityName;//商品名称
    private String memberOrderdetailComooditySpecification;//商品规格
    private String memberOrderdetailCommdityUnit;//商品单位
    private String memberOrderdetailCommodityShopname;//商品归属的店铺
    private String memberOrderdetailCmmodityShopaccount;//商品归属店铺的账号
    private String memberOrderdetialCommodityImage;//商品图片url
    private BigDecimal memberOrdetailCommodityoutprice;//商品价格
    private String memberOrderdetailCommodityId;//商品id


    public String getMemberOrderdetailId() {
        return memberOrderdetailId;
    }

    public void setMemberOrderdetailId(String memberOrderdetailId) {
        this.memberOrderdetailId = memberOrderdetailId;
    }

    public String getMemberOrderdetailOrderid() {
        return memberOrderdetailOrderid;
    }

    public void setMemberOrderdetailOrderid(String memberOrderdetailOrderid) {
        this.memberOrderdetailOrderid = memberOrderdetailOrderid;
    }

    public String getMemberOrderdetailCommodityCode() {
        return memberOrderdetailCommodityCode;
    }

    public void setMemberOrderdetailCommodityCode(String memberOrderdetailCommodityCode) {
        this.memberOrderdetailCommodityCode = memberOrderdetailCommodityCode;
    }

    public Integer getMemberOrderdetailComodityNum() {
        return memberOrderdetailComodityNum;
    }

    public void setMemberOrderdetailComodityNum(Integer memberOrderdetailComodityNum) {
        this.memberOrderdetailComodityNum = memberOrderdetailComodityNum;
    }

    public String getMemberOrderdetailCommodityName() {
        return memberOrderdetailCommodityName;
    }

    public void setMemberOrderdetailCommodityName(String memberOrderdetailCommodityName) {
        this.memberOrderdetailCommodityName = memberOrderdetailCommodityName;
    }

    public String getMemberOrderdetailComooditySpecification() {
        return memberOrderdetailComooditySpecification;
    }

    public void setMemberOrderdetailComooditySpecification(String memberOrderdetailComooditySpecification) {
        this.memberOrderdetailComooditySpecification = memberOrderdetailComooditySpecification;
    }

    public String getMemberOrderdetailCommdityUnit() {
        return memberOrderdetailCommdityUnit;
    }

    public void setMemberOrderdetailCommdityUnit(String memberOrderdetailCommdityUnit) {
        this.memberOrderdetailCommdityUnit = memberOrderdetailCommdityUnit;
    }

    public String getMemberOrderdetailCommodityShopname() {
        return memberOrderdetailCommodityShopname;
    }

    public void setMemberOrderdetailCommodityShopname(String memberOrderdetailCommodityShopname) {
        this.memberOrderdetailCommodityShopname = memberOrderdetailCommodityShopname;
    }

    public String getMemberOrderdetailCmmodityShopaccount() {
        return memberOrderdetailCmmodityShopaccount;
    }

    public void setMemberOrderdetailCmmodityShopaccount(String memberOrderdetailCmmodityShopaccount) {
        this.memberOrderdetailCmmodityShopaccount = memberOrderdetailCmmodityShopaccount;
    }

    public String getMemberOrderdetialCommodityImage() {
        return memberOrderdetialCommodityImage;
    }

    public void setMemberOrderdetialCommodityImage(String memberOrderdetialCommodityImage) {
        this.memberOrderdetialCommodityImage = memberOrderdetialCommodityImage;
    }

    public BigDecimal getMemberOrdetailCommodityoutprice() {
        return memberOrdetailCommodityoutprice;
    }

    public void setMemberOrdetailCommodityoutprice(BigDecimal memberOrdetailCommodityoutprice) {
        this.memberOrdetailCommodityoutprice = memberOrdetailCommodityoutprice;
    }

    public String getMemberOrderdetailCommodityId() {
        return memberOrderdetailCommodityId;
    }

    public void setMemberOrderdetailCommodityId(String memberOrderdetailCommodityId) {
        this.memberOrderdetailCommodityId = memberOrderdetailCommodityId;
    }

}
