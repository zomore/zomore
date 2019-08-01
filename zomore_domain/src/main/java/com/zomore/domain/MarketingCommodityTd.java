package com.zomore.domain;

public class MarketingCommodityTd {
    private Integer id;

    private String marketingPromotionId;

    private String commodityId;

    private String commodityCode;

    private String commodityName;

    private String commodityOldprice;

    private String commodityType;

    private Integer num;

    private String commodityDiscount;

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

    public String getCommodityOldprice() {
        return commodityOldprice;
    }

    public void setCommodityOldprice(String commodityOldprice) {
        this.commodityOldprice = commodityOldprice == null ? null : commodityOldprice.trim();
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCommodityDiscount() {
        return commodityDiscount;
    }

    public void setCommodityDiscount(String commodityDiscount) {
        this.commodityDiscount = commodityDiscount == null ? null : commodityDiscount.trim();
    }
}