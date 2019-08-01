package com.zomore.domain;

public class MarketingCommodityGive {
    private Integer id;

    private String marketingPromotionId;

    private String commodityId;

    private String commodityCode;

    private String commodityName;

    private String commodityType;

    private String commodityOldprice;

    private String commodityPrice;

    private Integer marketingType;

    private String commodityNameMain;

    private String commodityNameCode;

    private String commodityNameType;

    private Integer commodityNum;

    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
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

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
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

    public Integer getMarketingType() {
        return marketingType;
    }

    public void setMarketingType(Integer marketingType) {
        this.marketingType = marketingType;
    }

    public String getCommodityNameMain() {
        return commodityNameMain;
    }

    public void setCommodityNameMain(String commodityNameMain) {
        this.commodityNameMain = commodityNameMain == null ? null : commodityNameMain.trim();
    }

    public String getCommodityNameCode() {
        return commodityNameCode;
    }

    public void setCommodityNameCode(String commodityNameCode) {
        this.commodityNameCode = commodityNameCode == null ? null : commodityNameCode.trim();
    }

    public String getCommodityNameType() {
        return commodityNameType;
    }

    public void setCommodityNameType(String commodityNameType) {
        this.commodityNameType = commodityNameType == null ? null : commodityNameType.trim();
    }
}