package com.zomore.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HavingRechargedRecord {
    private Integer rechargeId;//唯一标识的单据号
    private String rechargeAccount;//充值的账号
    private String accountName;//账号名称
    private BigDecimal rechargedAmount;//充值的金额
    private BigDecimal accountBalance;//充值时账号的余额
    private String contact;//联系人
    private String phoneNumber;//联系电话
    private String address;//地址
    private Date rechargeTime;//充值的时间
    private String remark;//备注

    public BigDecimal getRechargedAmount() {
        return rechargedAmount;
    }

    public void setRechargedAmount(BigDecimal rechargedAmount) {
        this.rechargedAmount = rechargedAmount;
    }

    public Integer getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(Integer rechargeId) {
        this.rechargeId = rechargeId;
    }

    public String getRechargeAccount() {
        return rechargeAccount;
    }

    public void setRechargeAccount(String rechargeAccount) {
        this.rechargeAccount = rechargeAccount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
