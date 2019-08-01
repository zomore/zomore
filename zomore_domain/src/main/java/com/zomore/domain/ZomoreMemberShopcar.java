package com.zomore.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ZomoreMemberShopcar {
    private String shopcarId;//购物车记录的唯一标识
    private String shopcarCommodityId;//购物车商品id
    private String shopcarCommodityCode;//购物车商品条码
    private String shopcarCommodityName;//商品名称
    private BigDecimal shopcarCommodityOutprice;//商品出售价
    private BigDecimal shopcarCommodityActiveprice;//商品活动价
    private  Integer shopcarCommodityNum;//商品数量
    private String shopcarMemberAccount;//会员的账号
    private String shopcarCommodityShop;//商品所属店铺
    private Date shopcarCommodityIntime;//商品加入购物车时间
    private Integer shopcarComodityStore;//商品的库存
    private String shopccarCommodityImage;//商品图片

    public String getShopccarCommodityImage() {
        return shopccarCommodityImage;
    }
    public void setShopccarCommodityImage(String shopccarCommodityImage) {
        this.shopccarCommodityImage = shopccarCommodityImage;
    }

    public String getShopcarCommodityId() {
        return shopcarCommodityId;
    }

    public void setShopcarCommodityId(String shopcarCommodityId) {
        this.shopcarCommodityId = shopcarCommodityId;
    }

    public BigDecimal getShopcarCommodityOutprice() {
        return shopcarCommodityOutprice;
    }

    public void setShopcarCommodityOutprice(BigDecimal shopcarCommodityOutprice) {
        this.shopcarCommodityOutprice = shopcarCommodityOutprice;
    }

    public BigDecimal getShopcarCommodityActiveprice() {
        return shopcarCommodityActiveprice;
    }

    public void setShopcarCommodityActiveprice(BigDecimal shopcarCommodityActiveprice) {
        this.shopcarCommodityActiveprice = shopcarCommodityActiveprice;
    }

    public Integer getShopcarComodityStore() {
        return shopcarComodityStore;
    }

    public void setShopcarComodityStore(Integer shopcarComodityStore) {
        this.shopcarComodityStore = shopcarComodityStore;
    }

    public Date getShopcarCommodityIntime() {
        return shopcarCommodityIntime;
    }

    public void setShopcarCommodityIntime(Date shopcarCommodityIntime) {
        this.shopcarCommodityIntime = shopcarCommodityIntime;
    }

    public String getShopcarCommodityShop() {
        return shopcarCommodityShop;
    }

    public void setShopcarCommodityShop(String shopcarCommodityShop) {
        this.shopcarCommodityShop = shopcarCommodityShop;
    }

    public String getShopcarId() {
        return shopcarId;
    }

    public void setShopcarId(String shopcarId) {
        this.shopcarId = shopcarId;
    }

    public String getShopcarCommodityCode() {
        return shopcarCommodityCode;
    }

    public void setShopcarCommodityCode(String shopcarCommodityCode) {
        this.shopcarCommodityCode = shopcarCommodityCode;
    }

    public String getShopcarCommodityName() {
        return shopcarCommodityName;
    }

    public void setShopcarCommodityName(String shopcarCommodityName) {
        this.shopcarCommodityName = shopcarCommodityName;
    }

    public Integer getShopcarCommodityNum() {
        return shopcarCommodityNum;
    }

    public void setShopcarCommodityNum(Integer shopcarCommodityNum) {
        this.shopcarCommodityNum = shopcarCommodityNum;
    }

    public String getShopcarMemberAccount() {
        return shopcarMemberAccount;
    }

    public void setShopcarMemberAccount(String shopcarMemberAccount) {
        this.shopcarMemberAccount = shopcarMemberAccount;
    }
}
