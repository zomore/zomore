package com.zomore.domain;

import java.util.Date;

public class ZomoreMemberPoint {
    private Integer zomoreMemberPointId;

    private String zomoreMemberPointCode;

    private String zomoreMemberPointPeople;

    private Double zomoreMemberPointRule;

    private Double zomoreMemberPointNum;

    private Date time;

    private String shop;

    private String meno;

    public Integer getZomoreMemberPointId() {
        return zomoreMemberPointId;
    }

    public void setZomoreMemberPointId(Integer zomoreMemberPointId) {
        this.zomoreMemberPointId = zomoreMemberPointId;
    }

    public String getZomoreMemberPointCode() {
        return zomoreMemberPointCode;
    }

    public void setZomoreMemberPointCode(String zomoreMemberPointCode) {
        this.zomoreMemberPointCode = zomoreMemberPointCode == null ? null : zomoreMemberPointCode.trim();
    }

    public String getZomoreMemberPointPeople() {
        return zomoreMemberPointPeople;
    }

    public void setZomoreMemberPointPeople(String zomoreMemberPointPeople) {
        this.zomoreMemberPointPeople = zomoreMemberPointPeople == null ? null : zomoreMemberPointPeople.trim();
    }

    public Double getZomoreMemberPointRule() {
        return zomoreMemberPointRule;
    }

    public void setZomoreMemberPointRule(Double zomoreMemberPointRule) {
        this.zomoreMemberPointRule = zomoreMemberPointRule;
    }

    public Double getZomoreMemberPointNum() {
        return zomoreMemberPointNum;
    }

    public void setZomoreMemberPointNum(Double zomoreMemberPointNum) {
        this.zomoreMemberPointNum = zomoreMemberPointNum;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno == null ? null : meno.trim();
    }
}