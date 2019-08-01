package com.zomore.domain;

public class MarketingCommodityHgcx {
    private Integer id;

    private String marketingPromotionId;

    private String commodityId;

    private String commodityCode;

    private String commodityName;

    private String commodityType;

    private Double commodityPrice;

    private Integer commodityIsmain;

    private Double money;

    private Double submoney;

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

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommodityIsmain() {
        return commodityIsmain;
    }

    public void setCommodityIsmain(Integer commodityIsmain) {
        this.commodityIsmain = commodityIsmain;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getSubmoney() {
        return submoney;
    }

    public void setSubmoney(Double submoney) {
        this.submoney = submoney;
    }
}