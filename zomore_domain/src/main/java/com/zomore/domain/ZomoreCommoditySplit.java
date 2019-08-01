package com.zomore.domain;

import java.util.Date;

public class ZomoreCommoditySplit {
    private Integer zomoreCommoditySplitId;

    private String zomoreCommoditySplitBig;

    private String zomoreCommoditySplitMin;

    private String zomoreCommoditySplitRule;

    private Date zomoreCommoditySplitTime;

    private String shop;

    public Integer getZomoreCommoditySplitId() {
        return zomoreCommoditySplitId;
    }

    public void setZomoreCommoditySplitId(Integer zomoreCommoditySplitId) {
        this.zomoreCommoditySplitId = zomoreCommoditySplitId;
    }

    public String getZomoreCommoditySplitBig() {
        return zomoreCommoditySplitBig;
    }

    public void setZomoreCommoditySplitBig(String zomoreCommoditySplitBig) {
        this.zomoreCommoditySplitBig = zomoreCommoditySplitBig == null ? null : zomoreCommoditySplitBig.trim();
    }

    public String getZomoreCommoditySplitMin() {
        return zomoreCommoditySplitMin;
    }

    public void setZomoreCommoditySplitMin(String zomoreCommoditySplitMin) {
        this.zomoreCommoditySplitMin = zomoreCommoditySplitMin == null ? null : zomoreCommoditySplitMin.trim();
    }

    public String getZomoreCommoditySplitRule() {
        return zomoreCommoditySplitRule;
    }

    public void setZomoreCommoditySplitRule(String zomoreCommoditySplitRule) {
        this.zomoreCommoditySplitRule = zomoreCommoditySplitRule == null ? null : zomoreCommoditySplitRule.trim();
    }

    public Date getZomoreCommoditySplitTime() {
        return zomoreCommoditySplitTime;
    }

    public void setZomoreCommoditySplitTime(Date zomoreCommoditySplitTime) {
        this.zomoreCommoditySplitTime = zomoreCommoditySplitTime;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }
}