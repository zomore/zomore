package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreIntegralExchange {
    private String id;

    private String integralRuleId;

    private String echange;

    private Integer echangeIntegral;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date starttime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endtime;

    private Integer state;

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

    public String getEchange() {
        return echange;
    }

    public void setEchange(String echange) {
        this.echange = echange == null ? null : echange.trim();
    }

    public Integer getEchangeIntegral() {
        return echangeIntegral;
    }

    public void setEchangeIntegral(Integer echangeIntegral) {
        this.echangeIntegral = echangeIntegral;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}