package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreMemberInputrule {
    private String zomoreMemberInputruleId;

    private String zomoreMemberInputruleName;

    private String zomoreMemberInputruleGrade;

    private Double zomoreMemberInputruleInmoney;

    private Double zomoreMemberInputruleGivemoney;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date zomoreMemberInputruleStarttime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date zomoreMemberInputruleEndtime;

    private String shop;

    private Integer zomoreMemberInputruleIsuserone;

    private Integer zomoreMemberInputruleNum;

    private String zomoreMemberInputruleMeno;

    public String getZomoreMemberInputruleId() {
        return zomoreMemberInputruleId;
    }

    public void setZomoreMemberInputruleId(String zomoreMemberInputruleId) {
        this.zomoreMemberInputruleId = zomoreMemberInputruleId == null ? null : zomoreMemberInputruleId.trim();
    }

    public String getZomoreMemberInputruleName() {
        return zomoreMemberInputruleName;
    }

    public void setZomoreMemberInputruleName(String zomoreMemberInputruleName) {
        this.zomoreMemberInputruleName = zomoreMemberInputruleName == null ? null : zomoreMemberInputruleName.trim();
    }

    public String getZomoreMemberInputruleGrade() {
        return zomoreMemberInputruleGrade;
    }

    public void setZomoreMemberInputruleGrade(String zomoreMemberInputruleGrade) {
        this.zomoreMemberInputruleGrade = zomoreMemberInputruleGrade == null ? null : zomoreMemberInputruleGrade.trim();
    }

    public Double getZomoreMemberInputruleInmoney() {
        return zomoreMemberInputruleInmoney;
    }

    public void setZomoreMemberInputruleInmoney(Double zomoreMemberInputruleInmoney) {
        this.zomoreMemberInputruleInmoney = zomoreMemberInputruleInmoney;
    }

    public Double getZomoreMemberInputruleGivemoney() {
        return zomoreMemberInputruleGivemoney;
    }

    public void setZomoreMemberInputruleGivemoney(Double zomoreMemberInputruleGivemoney) {
        this.zomoreMemberInputruleGivemoney = zomoreMemberInputruleGivemoney;
    }

    public Date getZomoreMemberInputruleStarttime() {
        return zomoreMemberInputruleStarttime;
    }

    public void setZomoreMemberInputruleStarttime(Date zomoreMemberInputruleStarttime) {
        this.zomoreMemberInputruleStarttime = zomoreMemberInputruleStarttime;
    }

    public Date getZomoreMemberInputruleEndtime() {
        return zomoreMemberInputruleEndtime;
    }

    public void setZomoreMemberInputruleEndtime(Date zomoreMemberInputruleEndtime) {
        this.zomoreMemberInputruleEndtime = zomoreMemberInputruleEndtime;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }

    public Integer getZomoreMemberInputruleIsuserone() {
        return zomoreMemberInputruleIsuserone;
    }

    public void setZomoreMemberInputruleIsuserone(Integer zomoreMemberInputruleIsuserone) {
        this.zomoreMemberInputruleIsuserone = zomoreMemberInputruleIsuserone;
    }

    public Integer getZomoreMemberInputruleNum() {
        return zomoreMemberInputruleNum;
    }

    public void setZomoreMemberInputruleNum(Integer zomoreMemberInputruleNum) {
        this.zomoreMemberInputruleNum = zomoreMemberInputruleNum;
    }

    public String getZomoreMemberInputruleMeno() {
        return zomoreMemberInputruleMeno;
    }

    public void setZomoreMemberInputruleMeno(String zomoreMemberInputruleMeno) {
        this.zomoreMemberInputruleMeno = zomoreMemberInputruleMeno == null ? null : zomoreMemberInputruleMeno.trim();
    }
}