package com.zomore.utils;


import java.util.Date;

//项目销售统计实体类
public class ServiceCountCommodityOrder {

    private String commodityName;//项目名称
    private String commodityType;//项目类型
    private Integer saleNum;//售卖数量
    private Double commodityOutprice;//商品售价

    private String shop;
    private String commodityCode;//商品条码
    private String commodityMoney;//项目原价

    private Date commodityStartTime; //开始时间
    private Date commodityEndTime;  //结束时间

    public Date getCommodityStartTime() {
        return commodityStartTime;
    }

    public void setCommodityStartTime(Date commodityStartTime) {
        this.commodityStartTime = commodityStartTime;
    }

    public Date getCommodityEndTime() {
        return commodityEndTime;
    }

    public void setCommodityEndTime(Date commodityEndTime) {
        this.commodityEndTime = commodityEndTime;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
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

    public Double getCommodityOutprice() {
        return commodityOutprice;
    }

    public void setCommodityOutprice(Double commodityOutprice) {
        this.commodityOutprice = commodityOutprice;
    }

    public String getCommodityMoney() {
        return commodityMoney;
    }

    public void setCommodityMoney(String commodityMoney) {
        this.commodityMoney = commodityMoney;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }
}
