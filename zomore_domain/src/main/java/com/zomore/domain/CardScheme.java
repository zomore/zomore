package com.zomore.domain;

import java.util.Date;

public class CardScheme {
    private String schemeid;

    private String cardname;//次卡名称

    private String cardtype;//次卡类型

    private String servicelife;//使用期限

    private String shopname;//商铺名称

    private String salemoney;//销售金额

    private String usenum;//使用次数

    private String effectivedays;//有效天数

    private Date createtime;//开始时间

    private Date duetime;//结束时间

    private String commodityid;//商品Id

    private Integer commoditynum;//选择商品的数量，次卡可以在多个商品中选择的个数

    private String remark;//备注

    private Integer status;//状态

    private String ticheng;//次卡提成

    public String getSchemeid() {
        return schemeid;
    }

    public void setSchemeid(String schemeid) {
        this.schemeid = schemeid == null ? null : schemeid.trim();
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname == null ? null : cardname.trim();
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    public String getServicelife() {
        return servicelife;
    }

    public void setServicelife(String servicelife) {
        this.servicelife = servicelife == null ? null : servicelife.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getSalemoney() {
        return salemoney;
    }

    public void setSalemoney(String salemoney) {
        this.salemoney = salemoney == null ? null : salemoney.trim();
    }

    public String getUsenum() {
        return usenum;
    }

    public void setUsenum(String usenum) {
        this.usenum = usenum == null ? null : usenum.trim();
    }

    public String getEffectivedays() {
        return effectivedays;
    }

    public void setEffectivedays(String effectivedays) {
        this.effectivedays = effectivedays == null ? null : effectivedays.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDuetime() {
        return duetime;
    }

    public void setDuetime(Date duetime) {
        this.duetime = duetime;
    }

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid == null ? null : commodityid.trim();
    }

    public Integer getCommoditynum() {
        return commoditynum;
    }

    public void setCommoditynum(Integer commoditynum) {
        this.commoditynum = commoditynum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTicheng() {
        return ticheng;
    }

    public void setTicheng(String ticheng) {
        this.ticheng = ticheng == null ? null : ticheng.trim();
    }
}