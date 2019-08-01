package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PaymentBinding {
    private Integer paymentBindingId;//支付绑定的唯一标识
    private String shopId;//店铺id
    private String username;//店铺账号
    private String shopName;//店铺名称
    private String headAccount;//总部账号
    private String headName;//总部名称
    private String storeAccount;//门店商户编号
    private String storePassword;//门店商户密码
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date bindTime;//绑定时间
    private String remark;//备注

    public Integer getPaymentBindingId() {
        return paymentBindingId;
    }

    public void setPaymentBindingId(Integer paymentBindingId) {
        this.paymentBindingId = paymentBindingId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getHeadAccount() {
        return headAccount;
    }

    public void setHeadAccount(String headAccount) {
        this.headAccount = headAccount;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getStoreAccount() {
        return storeAccount;
    }

    public void setStoreAccount(String storeAccount) {
        this.storeAccount = storeAccount;
    }

    public String getStorePassword() {
        return storePassword;
    }

    public void setStorePassword(String storePassword) {
        this.storePassword = storePassword;
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
