package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class RechargeApplicationRecord {
    private Integer applicationrecordId;//记录的唯一标识
    private String applicationAccount;//申请充值的账号
    private String accountName;//申请充值账号名称
    private BigDecimal expectedAmount;//预计充值金额
    private BigDecimal accountBalance;//申请充值时账户余额
    private String contact;//联系人
    private String phoneNumber;//联系电话
    private String address;//地址
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date applicationTime;//申请充值的时间
    private String remark;//备注

    public Integer getApplicationrecordId() { return applicationrecordId; }

    public void setApplicationrecordId(Integer applicationrecordId) { this.applicationrecordId = applicationrecordId; }

    public String getApplicationAccount() { return applicationAccount; }

    public void setApplicationAccount(String applicationAccount) { this.applicationAccount = applicationAccount; }

    public String getAccountName() { return accountName; }

    public void setAccountName(String accountName) { this.accountName = accountName; }

    public BigDecimal getExpectedAmount() { return expectedAmount; }

    public void setExpectedAmount(BigDecimal expectedAmount) { this.expectedAmount = expectedAmount; }

    public BigDecimal getAccountBalance() { return accountBalance; }

    public void setAccountBalance(BigDecimal accountBalance) { this.accountBalance = accountBalance; }

    public String getContact() { return contact; }

    public void setContact(String contact) { this.contact = contact; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public Date getApplicationTime() { return applicationTime; }

    public void setApplicationTime(Date applicationTime) { this.applicationTime = applicationTime; }

    public String getRemark() { return remark; }

    public void setRemark(String remark) { this.remark = remark; }

}
