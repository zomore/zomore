package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreIntegralDate {
    private String id;

    private String integralRuleId;

    private Integer multipleDate;

    private String memberDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIntegralRuleId() {
        return integralRuleId;
    }

    public void setIntegralRuleId(String integralRuleId) {
        this.integralRuleId = integralRuleId == null ? null : integralRuleId.trim();
    }

    public Integer getMultipleDate() {
        return multipleDate;
    }

    public void setMultipleDate(Integer multipleDate) {
        this.multipleDate = multipleDate;
    }

    public String getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(String memberDate) {
        this.memberDate = memberDate == null ? null : memberDate.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}