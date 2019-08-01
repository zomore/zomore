package com.zomore.domain;

public class MarketingCommodityMefx {
    private Integer id;

    private String marketingPromotionId;

    private String commodityId;

    private String commodityCode;

    private String commodityName;

    private String commodityType;

    private String commodityPrice;

    private Double salemoney;

    private Double givemoney;

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

    public String getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice == null ? null : commodityPrice.trim();
    }

    public Double getSalemoney() {
        return salemoney;
    }

    public void setSalemoney(Double salemoney) {
        this.salemoney = salemoney;
    }

    public Double getGivemoney() {
        return givemoney;
    }

    public void setGivemoney(Double givemoney) {
        this.givemoney = givemoney;
    }
}