package com.zomore.domain;

import java.util.Date;

public class ZomoreCommodityLoss {
    private String zomoreCommodityId;

    private String zomoreCashierName;

    private String zomoreCashierNumber;

    private String zomoreCommodityShopname;

    private String zomoreCommodityShopid;

    private Integer zomoreCommodityLossNum;

    private Date zomoreCommodityLossTime;

    private String zomoreCommodityLossType;

    private String zomoreCommodityShop;

    public String getZomoreCommodityId() {
        return zomoreCommodityId;
    }

    public void setZomoreCommodityId(String zomoreCommodityId) {
        this.zomoreCommodityId = zomoreCommodityId == null ? null : zomoreCommodityId.trim();
    }

    public String getZomoreCashierName() {
        return zomoreCashierName;
    }

    public void setZomoreCashierName(String zomoreCashierName) {
        this.zomoreCashierName = zomoreCashierName == null ? null : zomoreCashierName.trim();
    }

    public String getZomoreCashierNumber() {
        return zomoreCashierNumber;
    }

    public void setZomoreCashierNumber(String zomoreCashierNumber) {
        this.zomoreCashierNumber = zomoreCashierNumber == null ? null : zomoreCashierNumber.trim();
    }

    public String getZomoreCommodityShopname() {
        return zomoreCommodityShopname;
    }

    public void setZomoreCommodityShopname(String zomoreCommodityShopname) {
        this.zomoreCommodityShopname = zomoreCommodityShopname == null ? null : zomoreCommodityShopname.trim();
    }

    public String getZomoreCommodityShopid() {
        return zomoreCommodityShopid;
    }

    public void setZomoreCommodityShopid(String zomoreCommodityShopid) {
        this.zomoreCommodityShopid = zomoreCommodityShopid == null ? null : zomoreCommodityShopid.trim();
    }

    public Integer getZomoreCommodityLossNum() {
        return zomoreCommodityLossNum;
    }

    public void setZomoreCommodityLossNum(Integer zomoreCommodityLossNum) {
        this.zomoreCommodityLossNum = zomoreCommodityLossNum;
    }

    public Date getZomoreCommodityLossTime() {
        return zomoreCommodityLossTime;
    }

    public void setZomoreCommodityLossTime(Date zomoreCommodityLossTime) {
        this.zomoreCommodityLossTime = zomoreCommodityLossTime;
    }

    public String getZomoreCommodityLossType() {
        return zomoreCommodityLossType;
    }

    public void setZomoreCommodityLossType(String zomoreCommodityLossType) {
        this.zomoreCommodityLossType = zomoreCommodityLossType == null ? null : zomoreCommodityLossType.trim();
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }
}