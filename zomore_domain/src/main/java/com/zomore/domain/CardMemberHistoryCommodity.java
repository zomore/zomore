package com.zomore.domain;

public class CardMemberHistoryCommodity {
    private Integer id;

    private Integer cardhistoryid;

    private String commodityid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardhistoryid() {
        return cardhistoryid;
    }

    public void setCardhistoryid(Integer cardhistoryid) {
        this.cardhistoryid = cardhistoryid;
    }

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid == null ? null : commodityid.trim();
    }
}