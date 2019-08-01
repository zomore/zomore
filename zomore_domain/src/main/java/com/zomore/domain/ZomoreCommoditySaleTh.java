package com.zomore.domain;

import java.util.Date;

public class ZomoreCommoditySaleTh {
    private Integer zomoreCommoditySaleCommoditId;

    private String zomoreCommodityThId;

    private String zomoreCommoditySaleId;

    private String zomoreCommodityName;

    private Integer zomoreCommodityNum;

    private String zomoreCommodityType;

    private Double zomoreCommodityMoney;

    private String zomoreCommodityShop;

    private Date time;

    public Integer getZomoreCommoditySaleCommoditId() {
        return zomoreCommoditySaleCommoditId;
    }

    public void setZomoreCommoditySaleCommoditId(Integer zomoreCommoditySaleCommoditId) {
        this.zomoreCommoditySaleCommoditId = zomoreCommoditySaleCommoditId;
    }

    public String getZomoreCommodityThId() {
        return zomoreCommodityThId;
    }

    public void setZomoreCommodityThId(String zomoreCommodityThId) {
        this.zomoreCommodityThId = zomoreCommodityThId == null ? null : zomoreCommodityThId.trim();
    }

    public String getZomoreCommoditySaleId() {
        return zomoreCommoditySaleId;
    }

    public void setZomoreCommoditySaleId(String zomoreCommoditySaleId) {
        this.zomoreCommoditySaleId = zomoreCommoditySaleId == null ? null : zomoreCommoditySaleId.trim();
    }

    public String getZomoreCommodityName() {
        return zomoreCommodityName;
    }

    public void setZomoreCommodityName(String zomoreCommodityName) {
        this.zomoreCommodityName = zomoreCommodityName == null ? null : zomoreCommodityName.trim();
    }

    public Integer getZomoreCommodityNum() {
        return zomoreCommodityNum;
    }

    public void setZomoreCommodityNum(Integer zomoreCommodityNum) {
        this.zomoreCommodityNum = zomoreCommodityNum;
    }

    public String getZomoreCommodityType() {
        return zomoreCommodityType;
    }

    public void setZomoreCommodityType(String zomoreCommodityType) {
        this.zomoreCommodityType = zomoreCommodityType == null ? null : zomoreCommodityType.trim();
    }

    public Double getZomoreCommodityMoney() {
        return zomoreCommodityMoney;
    }

    public void setZomoreCommodityMoney(Double zomoreCommodityMoney) {
        this.zomoreCommodityMoney = zomoreCommodityMoney;
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}