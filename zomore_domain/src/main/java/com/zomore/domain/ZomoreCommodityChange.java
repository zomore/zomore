package com.zomore.domain;

import java.util.Date;

public class ZomoreCommodityChange {
    private String zomoreCommodityChangeId;

    private String zomoreCommodityChangeType;

    private Integer zomoreCommodityChangeNum;

    private Date zomoreCommodityChangeTime;

    private String zomoreCommodityShop;

    private String zomoreOrderId;

    private Integer zomoreNum;

    public String getZomoreCommodityChangeId() {
        return zomoreCommodityChangeId;
    }

    public void setZomoreCommodityChangeId(String zomoreCommodityChangeId) {
        this.zomoreCommodityChangeId = zomoreCommodityChangeId == null ? null : zomoreCommodityChangeId.trim();
    }

    public String getZomoreCommodityChangeType() {
        return zomoreCommodityChangeType;
    }

    public void setZomoreCommodityChangeType(String zomoreCommodityChangeType) {
        this.zomoreCommodityChangeType = zomoreCommodityChangeType == null ? null : zomoreCommodityChangeType.trim();
    }

    public Integer getZomoreCommodityChangeNum() {
        return zomoreCommodityChangeNum;
    }

    public void setZomoreCommodityChangeNum(Integer zomoreCommodityChangeNum) {
        this.zomoreCommodityChangeNum = zomoreCommodityChangeNum;
    }

    public Date getZomoreCommodityChangeTime() {
        return zomoreCommodityChangeTime;
    }

    public void setZomoreCommodityChangeTime(Date zomoreCommodityChangeTime) {
        this.zomoreCommodityChangeTime = zomoreCommodityChangeTime;
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }

    public String getZomoreOrderId() {
        return zomoreOrderId;
    }

    public void setZomoreOrderId(String zomoreOrderId) {
        this.zomoreOrderId = zomoreOrderId == null ? null : zomoreOrderId.trim();
    }

    public Integer getZomoreNum() {
        return zomoreNum;
    }

    public void setZomoreNum(Integer zomoreNum) {
        this.zomoreNum = zomoreNum;
    }
}