package com.zomore.domain;

import java.util.Date;

public class Turnover {
    private Long turnoverid;

    private Date createtime;

    private Date duetime;

    private String cashier;

    private String totalmoney;

    private String cash;

    private String unionpay;

    private String storagecard;

    private String subcard;

    private String readycash;

    private String paidamount;

    private String shop;

    public Long getTurnoverid() {
        return turnoverid;
    }

    public void setTurnoverid(Long turnoverid) {
        this.turnoverid = turnoverid;
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

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier == null ? null : cashier.trim();
    }

    public String getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(String totalmoney) {
        this.totalmoney = totalmoney == null ? null : totalmoney.trim();
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash == null ? null : cash.trim();
    }

    public String getUnionpay() {
        return unionpay;
    }

    public void setUnionpay(String unionpay) {
        this.unionpay = unionpay == null ? null : unionpay.trim();
    }

    public String getStoragecard() {
        return storagecard;
    }

    public void setStoragecard(String storagecard) {
        this.storagecard = storagecard == null ? null : storagecard.trim();
    }

    public String getSubcard() {
        return subcard;
    }

    public void setSubcard(String subcard) {
        this.subcard = subcard == null ? null : subcard.trim();
    }

    public String getReadycash() {
        return readycash;
    }

    public void setReadycash(String readycash) {
        this.readycash = readycash == null ? null : readycash.trim();
    }

    public String getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(String paidamount) {
        this.paidamount = paidamount == null ? null : paidamount.trim();
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }
}