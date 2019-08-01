package com.zomore.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BalanceChangedRecord {
    private Integer balanceChangedId;//余额变动记录唯一标识
    private String username;//账号
    private String shopName;//店名
    private Integer number;//数量
    private BigDecimal amount;//金额
    private Date changeTime;//时间
    private String   remark; //备注

    public Integer getBalanceChangedId() {
        return balanceChangedId;
    }

    public void setBalanceChangedId(Integer balanceChangedId) {
        this.balanceChangedId = balanceChangedId;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
