package com.zomore.domain;

public class ZomoreCommodityStore {
    private String zomoreCommodityStoreid;

    private String zomoreCommodityId;

    private Integer zomoreCommodityStore;

    private Integer zomoreCommodityUplimit;

    private Integer zomoreCommodityDownlimit;

    private String zomoreCommodityInventoryPosition;

    public String getZomoreCommodityStoreid() {
        return zomoreCommodityStoreid;
    }

    public void setZomoreCommodityStoreid(String zomoreCommodityStoreid) {
        this.zomoreCommodityStoreid = zomoreCommodityStoreid == null ? null : zomoreCommodityStoreid.trim();
    }

    public String getZomoreCommodityId() {
        return zomoreCommodityId;
    }

    public void setZomoreCommodityId(String zomoreCommodityId) {
        this.zomoreCommodityId = zomoreCommodityId == null ? null : zomoreCommodityId.trim();
    }

    public Integer getZomoreCommodityStore() {
        return zomoreCommodityStore;
    }

    public void setZomoreCommodityStore(Integer zomoreCommodityStore) {
        this.zomoreCommodityStore = zomoreCommodityStore;
    }

    public Integer getZomoreCommodityUplimit() {
        return zomoreCommodityUplimit;
    }

    public void setZomoreCommodityUplimit(Integer zomoreCommodityUplimit) {
        this.zomoreCommodityUplimit = zomoreCommodityUplimit;
    }

    public Integer getZomoreCommodityDownlimit() {
        return zomoreCommodityDownlimit;
    }

    public void setZomoreCommodityDownlimit(Integer zomoreCommodityDownlimit) {
        this.zomoreCommodityDownlimit = zomoreCommodityDownlimit;
    }

    public String getZomoreCommodityInventoryPosition() {
        return zomoreCommodityInventoryPosition;
    }

    public void setZomoreCommodityInventoryPosition(String zomoreCommodityInventoryPosition) {
        this.zomoreCommodityInventoryPosition = zomoreCommodityInventoryPosition == null ? null : zomoreCommodityInventoryPosition.trim();
    }
}