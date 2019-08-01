package com.zomore.domain;

import java.util.Date;

public class ZomoreCommodityInventoryHistory {
    private String zomoreCommodityInventoryHistoryId;

    private Integer zomoreCommodityInventoryHistoryStorenum;

    private Integer zomoreCommodityInventoryHistoryFactnum;

    private Date zomoreCommodityInventoryHistoryTime;

    private String zomoreCommodityShop;

    public String getZomoreCommodityInventoryHistoryId() {
        return zomoreCommodityInventoryHistoryId;
    }

    public void setZomoreCommodityInventoryHistoryId(String zomoreCommodityInventoryHistoryId) {
        this.zomoreCommodityInventoryHistoryId = zomoreCommodityInventoryHistoryId == null ? null : zomoreCommodityInventoryHistoryId.trim();
    }

    public Integer getZomoreCommodityInventoryHistoryStorenum() {
        return zomoreCommodityInventoryHistoryStorenum;
    }

    public void setZomoreCommodityInventoryHistoryStorenum(Integer zomoreCommodityInventoryHistoryStorenum) {
        this.zomoreCommodityInventoryHistoryStorenum = zomoreCommodityInventoryHistoryStorenum;
    }

    public Integer getZomoreCommodityInventoryHistoryFactnum() {
        return zomoreCommodityInventoryHistoryFactnum;
    }

    public void setZomoreCommodityInventoryHistoryFactnum(Integer zomoreCommodityInventoryHistoryFactnum) {
        this.zomoreCommodityInventoryHistoryFactnum = zomoreCommodityInventoryHistoryFactnum;
    }

    public Date getZomoreCommodityInventoryHistoryTime() {
        return zomoreCommodityInventoryHistoryTime;
    }

    public void setZomoreCommodityInventoryHistoryTime(Date zomoreCommodityInventoryHistoryTime) {
        this.zomoreCommodityInventoryHistoryTime = zomoreCommodityInventoryHistoryTime;
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }
}