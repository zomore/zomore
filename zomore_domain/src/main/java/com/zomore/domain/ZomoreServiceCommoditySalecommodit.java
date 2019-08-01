package com.zomore.domain;

public class ZomoreServiceCommoditySalecommodit {
    private Integer zomoreCommoditySaleCommoditId;

    private String zomoreCommoditySaleId;

    private String zomoreCommodityName;

    private Integer zomoreCommodityNum;

    private Double zomoreCommodityMoney;

    private String zomoreCommodityType;

    private String zomoreCommodityShop;

    public Integer getZomoreCommoditySaleCommoditId() {
        return zomoreCommoditySaleCommoditId;
    }

    public void setZomoreCommoditySaleCommoditId(Integer zomoreCommoditySaleCommoditId) {
        this.zomoreCommoditySaleCommoditId = zomoreCommoditySaleCommoditId;
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

    public Double getZomoreCommodityMoney() {
        return zomoreCommodityMoney;
    }

    public void setZomoreCommodityMoney(Double zomoreCommodityMoney) {
        this.zomoreCommodityMoney = zomoreCommodityMoney;
    }

    public String getZomoreCommodityType() {
        return zomoreCommodityType;
    }

    public void setZomoreCommodityType(String zomoreCommodityType) {
        this.zomoreCommodityType = zomoreCommodityType == null ? null : zomoreCommodityType.trim();
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }
}