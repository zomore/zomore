package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreCommodityWholesale {
    private String zomoreCommodityWholesaleId;

    private String zomoreCommodityWholesaleConnectpeople;

    private Integer zomoreCommodityWholesaleNum;

    private Integer zomoreCommodityWholesaleGivenum;

    private Double zomoreCommodityWholesalePrivice;

    private Double zomoreCommodityWholesaleAllprivice;

    private String zomoreCommodityWholesalePeople1;

    private String zomoreCommodityWholesalePeople2;

    private String zomoreCommodityWholesaleCustomer;

    private String zomoreCommodityWholesalePhone;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date zomoreCommodityWholesaleDatetime;

    private String zomoreCommodityWholesaleAddress;

    private Integer zomoreCommodityWholesaleCommodityState;

    private Integer zomoreCommodityWholesaleCommodityType;

    private String shop;

    private String zomoreCommodityWholesaleMeno;

    public String getZomoreCommodityWholesaleId() {
        return zomoreCommodityWholesaleId;
    }

    public void setZomoreCommodityWholesaleId(String zomoreCommodityWholesaleId) {
        this.zomoreCommodityWholesaleId = zomoreCommodityWholesaleId == null ? null : zomoreCommodityWholesaleId.trim();
    }

    public String getZomoreCommodityWholesaleConnectpeople() {
        return zomoreCommodityWholesaleConnectpeople;
    }

    public void setZomoreCommodityWholesaleConnectpeople(String zomoreCommodityWholesaleConnectpeople) {
        this.zomoreCommodityWholesaleConnectpeople = zomoreCommodityWholesaleConnectpeople == null ? null : zomoreCommodityWholesaleConnectpeople.trim();
    }

    public Integer getZomoreCommodityWholesaleNum() {
        return zomoreCommodityWholesaleNum;
    }

    public void setZomoreCommodityWholesaleNum(Integer zomoreCommodityWholesaleNum) {
        this.zomoreCommodityWholesaleNum = zomoreCommodityWholesaleNum;
    }

    public Integer getZomoreCommodityWholesaleGivenum() {
        return zomoreCommodityWholesaleGivenum;
    }

    public void setZomoreCommodityWholesaleGivenum(Integer zomoreCommodityWholesaleGivenum) {
        this.zomoreCommodityWholesaleGivenum = zomoreCommodityWholesaleGivenum;
    }

    public Double getZomoreCommodityWholesalePrivice() {
        return zomoreCommodityWholesalePrivice;
    }

    public void setZomoreCommodityWholesalePrivice(Double zomoreCommodityWholesalePrivice) {
        this.zomoreCommodityWholesalePrivice = zomoreCommodityWholesalePrivice;
    }

    public Double getZomoreCommodityWholesaleAllprivice() {
        return zomoreCommodityWholesaleAllprivice;
    }

    public void setZomoreCommodityWholesaleAllprivice(Double zomoreCommodityWholesaleAllprivice) {
        this.zomoreCommodityWholesaleAllprivice = zomoreCommodityWholesaleAllprivice;
    }

    public String getZomoreCommodityWholesalePeople1() {
        return zomoreCommodityWholesalePeople1;
    }

    public void setZomoreCommodityWholesalePeople1(String zomoreCommodityWholesalePeople1) {
        this.zomoreCommodityWholesalePeople1 = zomoreCommodityWholesalePeople1 == null ? null : zomoreCommodityWholesalePeople1.trim();
    }

    public String getZomoreCommodityWholesalePeople2() {
        return zomoreCommodityWholesalePeople2;
    }

    public void setZomoreCommodityWholesalePeople2(String zomoreCommodityWholesalePeople2) {
        this.zomoreCommodityWholesalePeople2 = zomoreCommodityWholesalePeople2 == null ? null : zomoreCommodityWholesalePeople2.trim();
    }

    public String getZomoreCommodityWholesaleCustomer() {
        return zomoreCommodityWholesaleCustomer;
    }

    public void setZomoreCommodityWholesaleCustomer(String zomoreCommodityWholesaleCustomer) {
        this.zomoreCommodityWholesaleCustomer = zomoreCommodityWholesaleCustomer == null ? null : zomoreCommodityWholesaleCustomer.trim();
    }

    public String getZomoreCommodityWholesalePhone() {
        return zomoreCommodityWholesalePhone;
    }

    public void setZomoreCommodityWholesalePhone(String zomoreCommodityWholesalePhone) {
        this.zomoreCommodityWholesalePhone = zomoreCommodityWholesalePhone == null ? null : zomoreCommodityWholesalePhone.trim();
    }

    public Date getZomoreCommodityWholesaleDatetime() {
        return zomoreCommodityWholesaleDatetime;
    }

    public void setZomoreCommodityWholesaleDatetime(Date zomoreCommodityWholesaleDatetime) {
        this.zomoreCommodityWholesaleDatetime = zomoreCommodityWholesaleDatetime;
    }

    public String getZomoreCommodityWholesaleAddress() {
        return zomoreCommodityWholesaleAddress;
    }

    public void setZomoreCommodityWholesaleAddress(String zomoreCommodityWholesaleAddress) {
        this.zomoreCommodityWholesaleAddress = zomoreCommodityWholesaleAddress == null ? null : zomoreCommodityWholesaleAddress.trim();
    }

    public Integer getZomoreCommodityWholesaleCommodityState() {
        return zomoreCommodityWholesaleCommodityState;
    }

    public void setZomoreCommodityWholesaleCommodityState(Integer zomoreCommodityWholesaleCommodityState) {
        this.zomoreCommodityWholesaleCommodityState = zomoreCommodityWholesaleCommodityState;
    }

    public Integer getZomoreCommodityWholesaleCommodityType() {
        return zomoreCommodityWholesaleCommodityType;
    }

    public void setZomoreCommodityWholesaleCommodityType(Integer zomoreCommodityWholesaleCommodityType) {
        this.zomoreCommodityWholesaleCommodityType = zomoreCommodityWholesaleCommodityType;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }

    public String getZomoreCommodityWholesaleMeno() {
        return zomoreCommodityWholesaleMeno;
    }

    public void setZomoreCommodityWholesaleMeno(String zomoreCommodityWholesaleMeno) {
        this.zomoreCommodityWholesaleMeno = zomoreCommodityWholesaleMeno == null ? null : zomoreCommodityWholesaleMeno.trim();
    }
}