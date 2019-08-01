package com.zomore.domain;

import java.util.Date;

public class MarketingCommodity {
    private Integer id;

    private String marketingPromotionId;

    private String marketingCommodityId;

    private String marketingCommodityCode;

    private String marketingCommodityName;

    private String marketingCommodityType;

    private String marketingCommodityOldprice;

    private Integer marketingType;

    private Integer marketingCommodityDiscount;

    private String marketingCommodityPrice;

    private String marketingShop;

    private Date startime;

    private Date endtime;

    private Integer marketingCommodityNum;

    public Integer getMarketingCommodityNum() {
        return marketingCommodityNum;
    }

    public void setMarketingCommodityNum(Integer marketingCommodityNum) {
        this.marketingCommodityNum = marketingCommodityNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarketingPromotionId() {
        return marketingPromotionId;
    }

    public void setMarketingPromotionId(String marketingPromotionId) {
        this.marketingPromotionId = marketingPromotionId == null ? null : marketingPromotionId.trim();
    }

    public String getMarketingCommodityId() {
        return marketingCommodityId;
    }

    public void setMarketingCommodityId(String marketingCommodityId) {
        this.marketingCommodityId = marketingCommodityId == null ? null : marketingCommodityId.trim();
    }

    public String getMarketingCommodityCode() {
        return marketingCommodityCode;
    }

    public void setMarketingCommodityCode(String marketingCommodityCode) {
        this.marketingCommodityCode = marketingCommodityCode == null ? null : marketingCommodityCode.trim();
    }

    public String getMarketingCommodityName() {
        return marketingCommodityName;
    }

    public void setMarketingCommodityName(String marketingCommodityName) {
        this.marketingCommodityName = marketingCommodityName == null ? null : marketingCommodityName.trim();
    }

    public String getMarketingCommodityType() {
        return marketingCommodityType;
    }

    public void setMarketingCommodityType(String marketingCommodityType) {
        this.marketingCommodityType = marketingCommodityType == null ? null : marketingCommodityType.trim();
    }

    public String getMarketingCommodityOldprice() {
        return marketingCommodityOldprice;
    }

    public void setMarketingCommodityOldprice(String marketingCommodityOldprice) {
        this.marketingCommodityOldprice = marketingCommodityOldprice == null ? null : marketingCommodityOldprice.trim();
    }

    public Integer getMarketingType() {
        return marketingType;
    }

    public void setMarketingType(Integer marketingType) {
        this.marketingType = marketingType;
    }

    public Integer getMarketingCommodityDiscount() {
        return marketingCommodityDiscount;
    }

    public void setMarketingCommodityDiscount(Integer marketingCommodityDiscount) {
        this.marketingCommodityDiscount = marketingCommodityDiscount;
    }

    public String getMarketingCommodityPrice() {
        return marketingCommodityPrice;
    }

    public void setMarketingCommodityPrice(String marketingCommodityPrice) {
        this.marketingCommodityPrice = marketingCommodityPrice == null ? null : marketingCommodityPrice.trim();
    }

    public String getMarketingShop() {
        return marketingShop;
    }

    public void setMarketingShop(String marketingShop) {
        this.marketingShop = marketingShop == null ? null : marketingShop.trim();
    }

    public Date getStartime() {
        return startime;
    }

    public void setStartime(Date startime) {
        this.startime = startime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}