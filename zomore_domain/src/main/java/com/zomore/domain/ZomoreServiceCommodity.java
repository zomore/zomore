package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreServiceCommodity {
    private String serviceCommodityId;

    private String serviceCommodityName;

    private Integer serviceCommodityIsservice;

    private String serviceCommodityMain;

    private Double serviceCommodityInprice;

    private Double serviceCommodityOutprice;

    private Integer serviceCommodityIsmemberdiscount;

    private Double serviceCommodityMembershipprice;

    private String serviceCommodityPinyincode;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date serviceCommodityCreatetime;

    private Integer serviceCommodityState;

    private String serviceCommodityShop;

    private String serviceCommodityType;

    private String serviceCommodityLabber;

    private Integer serviceCommodityIsintegral;

    private Integer serviceCommodityIntegraltype;

    private String serviceCommodityIntegralvalue;

    private Integer serviceCommodityIsroyalty;

    private Integer serviceCommodityRoyaltytype;

    private String serviceCommodityRoyaltyvalue;

    private String serviceCommodityMeno;

    private String serviceCommodityImage;

    public String getServiceCommodityImage() {
        return serviceCommodityImage;
    }

    public void setServiceCommodityImage(String serviceCommodityImage) {
        this.serviceCommodityImage = serviceCommodityImage;
    }

    public String getServiceCommodityId() {
        return serviceCommodityId;
    }

    public void setServiceCommodityId(String serviceCommodityId) {
        this.serviceCommodityId = serviceCommodityId == null ? null : serviceCommodityId.trim();
    }

    public String getServiceCommodityName() {
        return serviceCommodityName;
    }

    public void setServiceCommodityName(String serviceCommodityName) {
        this.serviceCommodityName = serviceCommodityName == null ? null : serviceCommodityName.trim();
    }

    public Integer getServiceCommodityIsservice() {
        return serviceCommodityIsservice;
    }

    public void setServiceCommodityIsservice(Integer serviceCommodityIsservice) {
        this.serviceCommodityIsservice = serviceCommodityIsservice;
    }

    public String getServiceCommodityMain() {
        return serviceCommodityMain;
    }

    public void setServiceCommodityMain(String serviceCommodityMain) {
        this.serviceCommodityMain = serviceCommodityMain == null ? null : serviceCommodityMain.trim();
    }

    public Double getServiceCommodityInprice() {
        return serviceCommodityInprice;
    }

    public void setServiceCommodityInprice(Double serviceCommodityInprice) {
        this.serviceCommodityInprice = serviceCommodityInprice;
    }

    public Double getServiceCommodityOutprice() {
        return serviceCommodityOutprice;
    }

    public void setServiceCommodityOutprice(Double serviceCommodityOutprice) {
        this.serviceCommodityOutprice = serviceCommodityOutprice;
    }

    public Integer getServiceCommodityIsmemberdiscount() {
        return serviceCommodityIsmemberdiscount;
    }

    public void setServiceCommodityIsmemberdiscount(Integer serviceCommodityIsmemberdiscount) {
        this.serviceCommodityIsmemberdiscount = serviceCommodityIsmemberdiscount;
    }

    public Double getServiceCommodityMembershipprice() {
        return serviceCommodityMembershipprice;
    }

    public void setServiceCommodityMembershipprice(Double serviceCommodityMembershipprice) {
        this.serviceCommodityMembershipprice = serviceCommodityMembershipprice;
    }

    public String getServiceCommodityPinyincode() {
        return serviceCommodityPinyincode;
    }

    public void setServiceCommodityPinyincode(String serviceCommodityPinyincode) {
        this.serviceCommodityPinyincode = serviceCommodityPinyincode == null ? null : serviceCommodityPinyincode.trim();
    }

    public Date getServiceCommodityCreatetime() {
        return serviceCommodityCreatetime;
    }

    public void setServiceCommodityCreatetime(Date serviceCommodityCreatetime) {
        this.serviceCommodityCreatetime = serviceCommodityCreatetime;
    }

    public Integer getServiceCommodityState() {
        return serviceCommodityState;
    }

    public void setServiceCommodityState(Integer serviceCommodityState) {
        this.serviceCommodityState = serviceCommodityState;
    }

    public String getServiceCommodityShop() {
        return serviceCommodityShop;
    }

    public void setServiceCommodityShop(String serviceCommodityShop) {
        this.serviceCommodityShop = serviceCommodityShop == null ? null : serviceCommodityShop.trim();
    }

    public String getServiceCommodityType() {
        return serviceCommodityType;
    }

    public void setServiceCommodityType(String serviceCommodityType) {
        this.serviceCommodityType = serviceCommodityType == null ? null : serviceCommodityType.trim();
    }

    public String getServiceCommodityLabber() {
        return serviceCommodityLabber;
    }

    public void setServiceCommodityLabber(String serviceCommodityLabber) {
        this.serviceCommodityLabber = serviceCommodityLabber == null ? null : serviceCommodityLabber.trim();
    }

    public Integer getServiceCommodityIsintegral() {
        return serviceCommodityIsintegral;
    }

    public void setServiceCommodityIsintegral(Integer serviceCommodityIsintegral) {
        this.serviceCommodityIsintegral = serviceCommodityIsintegral;
    }

    public Integer getServiceCommodityIntegraltype() {
        return serviceCommodityIntegraltype;
    }

    public void setServiceCommodityIntegraltype(Integer serviceCommodityIntegraltype) {
        this.serviceCommodityIntegraltype = serviceCommodityIntegraltype;
    }

    public String getServiceCommodityIntegralvalue() {
        return serviceCommodityIntegralvalue;
    }

    public void setServiceCommodityIntegralvalue(String serviceCommodityIntegralvalue) {
        this.serviceCommodityIntegralvalue = serviceCommodityIntegralvalue == null ? null : serviceCommodityIntegralvalue.trim();
    }

    public Integer getServiceCommodityIsroyalty() {
        return serviceCommodityIsroyalty;
    }

    public void setServiceCommodityIsroyalty(Integer serviceCommodityIsroyalty) {
        this.serviceCommodityIsroyalty = serviceCommodityIsroyalty;
    }

    public Integer getServiceCommodityRoyaltytype() {
        return serviceCommodityRoyaltytype;
    }

    public void setServiceCommodityRoyaltytype(Integer serviceCommodityRoyaltytype) {
        this.serviceCommodityRoyaltytype = serviceCommodityRoyaltytype;
    }

    public String getServiceCommodityRoyaltyvalue() {
        return serviceCommodityRoyaltyvalue;
    }

    public void setServiceCommodityRoyaltyvalue(String serviceCommodityRoyaltyvalue) {
        this.serviceCommodityRoyaltyvalue = serviceCommodityRoyaltyvalue == null ? null : serviceCommodityRoyaltyvalue.trim();
    }

    public String getServiceCommodityMeno() {
        return serviceCommodityMeno;
    }

    public void setServiceCommodityMeno(String serviceCommodityMeno) {
        this.serviceCommodityMeno = serviceCommodityMeno == null ? null : serviceCommodityMeno.trim();
    }
}