package com.zomore.domain;

public class ZomoreCommodityChangepriceCommodity {
    private Integer id;

    private String changepriceid;

    private String serviceCommodityid;

    private Double serviceCommodityprice;

    private Double serviceCommodityidmemberprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChangepriceid() {
        return changepriceid;
    }

    public void setChangepriceid(String changepriceid) {
        this.changepriceid = changepriceid == null ? null : changepriceid.trim();
    }

    public String getServiceCommodityid() {
        return serviceCommodityid;
    }

    public void setServiceCommodityid(String serviceCommodityid) {
        this.serviceCommodityid = serviceCommodityid == null ? null : serviceCommodityid.trim();
    }

    public Double getServiceCommodityprice() {
        return serviceCommodityprice;
    }

    public void setServiceCommodityprice(Double serviceCommodityprice) {
        this.serviceCommodityprice = serviceCommodityprice;
    }

    public Double getServiceCommodityidmemberprice() {
        return serviceCommodityidmemberprice;
    }

    public void setServiceCommodityidmemberprice(Double serviceCommodityidmemberprice) {
        this.serviceCommodityidmemberprice = serviceCommodityidmemberprice;
    }
}