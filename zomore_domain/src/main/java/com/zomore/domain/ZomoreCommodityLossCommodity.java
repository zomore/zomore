package com.zomore.domain;

public class ZomoreCommodityLossCommodity {
    private String id;

    private String zomoreCommodityLossName;

    private String zomoreCommodityLossCode;

    private Integer zomoreCommodityLossNum;

    private String zomoreCommodityLossPrice;

    private String zomoreCommodityLossId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getZomoreCommodityLossName() {
        return zomoreCommodityLossName;
    }

    public void setZomoreCommodityLossName(String zomoreCommodityLossName) {
        this.zomoreCommodityLossName = zomoreCommodityLossName == null ? null : zomoreCommodityLossName.trim();
    }

    public String getZomoreCommodityLossCode() {
        return zomoreCommodityLossCode;
    }

    public void setZomoreCommodityLossCode(String zomoreCommodityLossCode) {
        this.zomoreCommodityLossCode = zomoreCommodityLossCode == null ? null : zomoreCommodityLossCode.trim();
    }

    public Integer getZomoreCommodityLossNum() {
        return zomoreCommodityLossNum;
    }

    public void setZomoreCommodityLossNum(Integer zomoreCommodityLossNum) {
        this.zomoreCommodityLossNum = zomoreCommodityLossNum;
    }

    public String getZomoreCommodityLossPrice() {
        return zomoreCommodityLossPrice;
    }

    public void setZomoreCommodityLossPrice(String zomoreCommodityLossPrice) {
        this.zomoreCommodityLossPrice = zomoreCommodityLossPrice == null ? null : zomoreCommodityLossPrice.trim();
    }

    public String getZomoreCommodityLossId() {
        return zomoreCommodityLossId;
    }

    public void setZomoreCommodityLossId(String zomoreCommodityLossId) {
        this.zomoreCommodityLossId = zomoreCommodityLossId == null ? null : zomoreCommodityLossId.trim();
    }
}