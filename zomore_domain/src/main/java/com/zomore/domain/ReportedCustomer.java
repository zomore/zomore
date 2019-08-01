package com.zomore.domain;
import com.zomore.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class ReportedCustomer implements Serializable {
    private Long customerId;//报备客户的id
    private String customerName;//客户名称
    private String address;//地址
    private String officialWebsite;//官方网站
    private String phoneNumber;//联系电话
    private Integer shopNumber;//规模（门店数）
    private String  productList;//项目所需产品清单
    private Double expectedAmount;//预计成交金额
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date expectedTime;//预计成交时间
    private String expectedTimeStr;//创建时间字符串形式
    private Integer followupDay;//已跟进时长
    private String nowStage;//目前所处阶段
    private String  transactionPossibility;//成交的可能性
    private String remark;//备注

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(Integer shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public Double getExpectedAmount() {
        return expectedAmount;
    }

    public void setExpectedAmount(Double expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public Date getExpectedTime() {
        return expectedTime;
    }

    public void setExpectedTime(Date expectedTime) {
        this.expectedTime = expectedTime;
    }

    public String getExpectedTimeStr() {
        if(expectedTimeStr!=null){
            expectedTimeStr= DateUtils.date2String(expectedTime,"yyyy-MM-dd");
        }
        return expectedTimeStr;
    }

    public void setExpectedTimeStr(String expectedTimeStr) {
        this.expectedTimeStr = expectedTimeStr;
    }

    public Integer getFollowupDay() {
        return followupDay;
    }

    public void setFollowupDay(Integer followupDay) {
        this.followupDay = followupDay;
    }

    public String getNowStage() {
        return nowStage;
    }

    public void setNowStage(String nowStage) {
        this.nowStage = nowStage;
    }

    public String getTransactionPossibility() {
        return transactionPossibility;
    }

    public void setTransactionPossibility(String transactionPossibility) {
        this.transactionPossibility = transactionPossibility;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
