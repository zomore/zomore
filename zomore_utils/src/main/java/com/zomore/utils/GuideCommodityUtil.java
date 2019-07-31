package com.zomore.utils;

public class GuideCommodityUtil {

    private String commodityId;
    private String commodityName;//商品名称
    private Integer commodutyNum;//商品数量
    private Double realMoney;//实收金额
    private Double commodityOutprice;//商品原价
    private String royalty;//提成

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodutyNum() {
        return commodutyNum;
    }

    public void setCommodutyNum(Integer commodutyNum) {
        this.commodutyNum = commodutyNum;
    }

    public Double getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(Double realMoney) {
        this.realMoney = realMoney;
    }

    public Double getCommodityOutprice() {
        return commodityOutprice;
    }

    public void setCommodityOutprice(Double commodityOutprice) {
        this.commodityOutprice = commodityOutprice;
    }

    public String getRoyalty() {
        return royalty;
    }

    public void setRoyalty(String royalty) {
        this.royalty = royalty;
    }
}
