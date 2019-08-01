package com.zomore.domain;

import java.util.Date;

public class ZomoreServiceCommodityorder {
    private String zomoreCommoditySaleId;//流水号

    private Date zomoreCommoditySaleTime;//日期（记录到秒,系统输入）

    private String zomoreCommoditySaleType;//支付类型

    private String zomoreCommoditySaleName;//收银员

    private String zomoreCommoditySaleMember;//会员

    private Integer zomoreCommoditySaleNum;//商品数量

    private String zomoreCommoditySaleMoney;//商品原价

    private String zomoreCommoditySaleInmoney;//实收金额

    private String zomoreCommoditySaleLetmoney;//折让金额

    private String zomoreCommoditySaleSavemoney;//利润

    private String zomoreCommoditySaleGuide;//技师导购

    private String zomoreCommodityShop;//销售门店

    private Integer zomoreCommodityState;//状态（1未付款，2已付款，3已退款）

    public String getZomoreCommoditySaleId() {
        return zomoreCommoditySaleId;
    }

    public void setZomoreCommoditySaleId(String zomoreCommoditySaleId) {
        this.zomoreCommoditySaleId = zomoreCommoditySaleId == null ? null : zomoreCommoditySaleId.trim();
    }

    public Date getZomoreCommoditySaleTime() {
        return zomoreCommoditySaleTime;
    }

    public void setZomoreCommoditySaleTime(Date zomoreCommoditySaleTime) {
        this.zomoreCommoditySaleTime = zomoreCommoditySaleTime;
    }

    public String getZomoreCommoditySaleType() {
        return zomoreCommoditySaleType;
    }

    public void setZomoreCommoditySaleType(String zomoreCommoditySaleType) {
        this.zomoreCommoditySaleType = zomoreCommoditySaleType == null ? null : zomoreCommoditySaleType.trim();
    }

    public String getZomoreCommoditySaleName() {
        return zomoreCommoditySaleName;
    }

    public void setZomoreCommoditySaleName(String zomoreCommoditySaleName) {
        this.zomoreCommoditySaleName = zomoreCommoditySaleName == null ? null : zomoreCommoditySaleName.trim();
    }

    public String getZomoreCommoditySaleMember() {
        return zomoreCommoditySaleMember;
    }

    public void setZomoreCommoditySaleMember(String zomoreCommoditySaleMember) {
        this.zomoreCommoditySaleMember = zomoreCommoditySaleMember == null ? null : zomoreCommoditySaleMember.trim();
    }

    public Integer getZomoreCommoditySaleNum() {
        return zomoreCommoditySaleNum;
    }

    public void setZomoreCommoditySaleNum(Integer zomoreCommoditySaleNum) {
        this.zomoreCommoditySaleNum = zomoreCommoditySaleNum;
    }

    public String getZomoreCommoditySaleMoney() {
        return zomoreCommoditySaleMoney;
    }

    public void setZomoreCommoditySaleMoney(String zomoreCommoditySaleMoney) {
        this.zomoreCommoditySaleMoney = zomoreCommoditySaleMoney == null ? null : zomoreCommoditySaleMoney.trim();
    }

    public String getZomoreCommoditySaleInmoney() {
        return zomoreCommoditySaleInmoney;
    }

    public void setZomoreCommoditySaleInmoney(String zomoreCommoditySaleInmoney) {
        this.zomoreCommoditySaleInmoney = zomoreCommoditySaleInmoney == null ? null : zomoreCommoditySaleInmoney.trim();
    }

    public String getZomoreCommoditySaleLetmoney() {
        return zomoreCommoditySaleLetmoney;
    }

    public void setZomoreCommoditySaleLetmoney(String zomoreCommoditySaleLetmoney) {
        this.zomoreCommoditySaleLetmoney = zomoreCommoditySaleLetmoney == null ? null : zomoreCommoditySaleLetmoney.trim();
    }

    public String getZomoreCommoditySaleSavemoney() {
        return zomoreCommoditySaleSavemoney;
    }

    public void setZomoreCommoditySaleSavemoney(String zomoreCommoditySaleSavemoney) {
        this.zomoreCommoditySaleSavemoney = zomoreCommoditySaleSavemoney == null ? null : zomoreCommoditySaleSavemoney.trim();
    }

    public String getZomoreCommoditySaleGuide() {
        return zomoreCommoditySaleGuide;
    }

    public void setZomoreCommoditySaleGuide(String zomoreCommoditySaleGuide) {
        this.zomoreCommoditySaleGuide = zomoreCommoditySaleGuide == null ? null : zomoreCommoditySaleGuide.trim();
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }

    public Integer getZomoreCommodityState() {
        return zomoreCommodityState;
    }

    public void setZomoreCommodityState(Integer zomoreCommodityState) {
        this.zomoreCommodityState = zomoreCommodityState;
    }
}