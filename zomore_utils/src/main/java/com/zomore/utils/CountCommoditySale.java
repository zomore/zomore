package com.zomore.utils;
import java.util.Date;

public class CountCommoditySale {

    private String commodityName;//商品名称
    private String commodityCode;//商品条码
    private String commodityType;//商品类型
    private Integer saleNum;//售卖数量
    private String commodityOutprice;//商品售价
    private String commodityRealMoney;//实收金额
    private String profit;//利润
    private String profitMargin;//利润率
    private String shop;
    private Date saletime1;//起始销售时间
    private Date saletime2;//结束时间*//*

    public Date getSaletime1() {
        return saletime1;
    }

    public void setSaletime1(Date saletime1) {
        this.saletime1 = saletime1;
    }

    public Date getSaletime2() {
        return saletime2;
    }

    public void setSaletime2(Date saletime2) {
        this.saletime2 = saletime2;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public String getCommodityOutprice() {
        return commodityOutprice;
    }

    public void setCommodityOutprice(String commodityOutprice) {
        this.commodityOutprice = commodityOutprice;
    }

    public String getCommodityRealMoney() {
        return commodityRealMoney;
    }

    public void setCommodityRealMoney(String commodityRealMoney) {
        this.commodityRealMoney = commodityRealMoney;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(String profitMargin) {
        this.profitMargin = profitMargin;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
