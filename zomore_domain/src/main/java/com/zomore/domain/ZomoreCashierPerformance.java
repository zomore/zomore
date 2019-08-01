package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreCashierPerformance {
    private String zomoreCashierPerformanceId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date zomoreCashierPerformanceDate;

    private String zomoreCashierPerformanceCashierid;

    private String zomoreCashierPerformanceCashiername;

    private String zomoreCashierPerformanceCommodityid;

    private String zomoreCashierPerformanceCommodityname;

    private String zomoreCashierPerformanceMoney;

    private Integer zomoreCashierPerformanceNum;

    private String zomoreCashierPerformanceMoneyall;

    private String zomoreCashierPerformanceMoneyactual;

    private String zomoreCashierPerformanceMoneysave;

    private String zomoreCashierPerformanceType;

    private String shop;

    public String getZomoreCashierPerformanceId() {
        return zomoreCashierPerformanceId;
    }

    public void setZomoreCashierPerformanceId(String zomoreCashierPerformanceId) {
        this.zomoreCashierPerformanceId = zomoreCashierPerformanceId == null ? null : zomoreCashierPerformanceId.trim();
    }

    public Date getZomoreCashierPerformanceDate() {
        return zomoreCashierPerformanceDate;
    }

    public void setZomoreCashierPerformanceDate(Date zomoreCashierPerformanceDate) {
        this.zomoreCashierPerformanceDate = zomoreCashierPerformanceDate;
    }

    public String getZomoreCashierPerformanceCashierid() {
        return zomoreCashierPerformanceCashierid;
    }

    public void setZomoreCashierPerformanceCashierid(String zomoreCashierPerformanceCashierid) {
        this.zomoreCashierPerformanceCashierid = zomoreCashierPerformanceCashierid == null ? null : zomoreCashierPerformanceCashierid.trim();
    }

    public String getZomoreCashierPerformanceCashiername() {
        return zomoreCashierPerformanceCashiername;
    }

    public void setZomoreCashierPerformanceCashiername(String zomoreCashierPerformanceCashiername) {
        this.zomoreCashierPerformanceCashiername = zomoreCashierPerformanceCashiername == null ? null : zomoreCashierPerformanceCashiername.trim();
    }

    public String getZomoreCashierPerformanceCommodityid() {
        return zomoreCashierPerformanceCommodityid;
    }

    public void setZomoreCashierPerformanceCommodityid(String zomoreCashierPerformanceCommodityid) {
        this.zomoreCashierPerformanceCommodityid = zomoreCashierPerformanceCommodityid == null ? null : zomoreCashierPerformanceCommodityid.trim();
    }

    public String getZomoreCashierPerformanceCommodityname() {
        return zomoreCashierPerformanceCommodityname;
    }

    public void setZomoreCashierPerformanceCommodityname(String zomoreCashierPerformanceCommodityname) {
        this.zomoreCashierPerformanceCommodityname = zomoreCashierPerformanceCommodityname == null ? null : zomoreCashierPerformanceCommodityname.trim();
    }

    public String getZomoreCashierPerformanceMoney() {
        return zomoreCashierPerformanceMoney;
    }

    public void setZomoreCashierPerformanceMoney(String zomoreCashierPerformanceMoney) {
        this.zomoreCashierPerformanceMoney = zomoreCashierPerformanceMoney == null ? null : zomoreCashierPerformanceMoney.trim();
    }

    public Integer getZomoreCashierPerformanceNum() {
        return zomoreCashierPerformanceNum;
    }

    public void setZomoreCashierPerformanceNum(Integer zomoreCashierPerformanceNum) {
        this.zomoreCashierPerformanceNum = zomoreCashierPerformanceNum;
    }

    public String getZomoreCashierPerformanceMoneyall() {
        return zomoreCashierPerformanceMoneyall;
    }

    public void setZomoreCashierPerformanceMoneyall(String zomoreCashierPerformanceMoneyall) {
        this.zomoreCashierPerformanceMoneyall = zomoreCashierPerformanceMoneyall == null ? null : zomoreCashierPerformanceMoneyall.trim();
    }

    public String getZomoreCashierPerformanceMoneyactual() {
        return zomoreCashierPerformanceMoneyactual;
    }

    public void setZomoreCashierPerformanceMoneyactual(String zomoreCashierPerformanceMoneyactual) {
        this.zomoreCashierPerformanceMoneyactual = zomoreCashierPerformanceMoneyactual == null ? null : zomoreCashierPerformanceMoneyactual.trim();
    }

    public String getZomoreCashierPerformanceMoneysave() {
        return zomoreCashierPerformanceMoneysave;
    }

    public void setZomoreCashierPerformanceMoneysave(String zomoreCashierPerformanceMoneysave) {
        this.zomoreCashierPerformanceMoneysave = zomoreCashierPerformanceMoneysave == null ? null : zomoreCashierPerformanceMoneysave.trim();
    }

    public String getZomoreCashierPerformanceType() {
        return zomoreCashierPerformanceType;
    }

    public void setZomoreCashierPerformanceType(String zomoreCashierPerformanceType) {
        this.zomoreCashierPerformanceType = zomoreCashierPerformanceType == null ? null : zomoreCashierPerformanceType.trim();
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }
}