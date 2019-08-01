package com.zomore.domain;

public class MarketingCommodityTwo {
    private Integer id;

    private String marketingPromotionId;

    private String commodityId;

    private String commodityName;

    private String commodityCode;

    private String commodityType;

    private String commodityDiscount;

    private String commodityOldprice;

    private String commodityPrice;

    private String commodityCodeOne;

    private String commodityNameOne;

    private String commodityPriceOne;

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

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
    }

    public String getCommodityDiscount() {
        return commodityDiscount;
    }

    public void setCommodityDiscount(String commodityDiscount) {
        this.commodityDiscount = commodityDiscount == null ? null : commodityDiscount.trim();
    }

    public String getCommodityOldprice() {
        return commodityOldprice;
    }

    public void setCommodityOldprice(String commodityOldprice) {
        this.commodityOldprice = commodityOldprice == null ? null : commodityOldprice.trim();
    }

    public String getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice == null ? null : commodityPrice.trim();
    }

    public String getCommodityCodeOne() {
        return commodityCodeOne;
    }

    public void setCommodityCodeOne(String commodityCodeOne) {
        this.commodityCodeOne = commodityCodeOne == null ? null : commodityCodeOne.trim();
    }

    public String getCommodityNameOne() {
        return commodityNameOne;
    }

    public void setCommodityNameOne(String commodityNameOne) {
        this.commodityNameOne = commodityNameOne == null ? null : commodityNameOne.trim();
    }

    public String getCommodityPriceOne() {
        return commodityPriceOne;
    }

    public void setCommodityPriceOne(String commodityPriceOne) {
        this.commodityPriceOne = commodityPriceOne == null ? null : commodityPriceOne.trim();
    }
}