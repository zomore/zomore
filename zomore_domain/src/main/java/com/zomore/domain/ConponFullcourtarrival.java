package com.zomore.domain;

import java.io.Serializable;

public class ConponFullcourtarrival implements Serializable {
    private Long arrivalId;
    private String conponName;
    private String conponScope;
    private String createTime;
    private String dueTime;
    private Long shopId;
    private Long multipleId;
    private Long conponId;
    private Integer isMember;
    private String arrivalNum;
    private String minNum;
    private Integer conponType;
    private String conponTypeStr;

    public Long getArrivalId() {
        return arrivalId;
    }

    public void setArrivalId(Long arrivalId) {
        this.arrivalId = arrivalId;
    }

    public String getConponName() {
        return conponName;
    }

    public void setConponName(String conponName) {
        this.conponName = conponName;
    }

    public String getConponScope() {
        return conponScope;
    }

    public void setConponScope(String conponScope) {
        this.conponScope = conponScope;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getMultipleId() {
        return multipleId;
    }

    public void setMultipleId(Long multipleId) {
        this.multipleId = multipleId;
    }

    public Long getConponId() {
        return conponId;
    }

    public void setConponId(Long conponId) {
        this.conponId = conponId;
    }

    public Integer getIsMember() {
        return isMember;
    }

    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }

    public String getArrivalNum() {
        return arrivalNum;
    }

    public void setArrivalNum(String arrivalNum) {
        this.arrivalNum = arrivalNum;
    }

    public String getMinNum() {
        return minNum;
    }

    public void setMinNum(String minNum) {
        this.minNum = minNum;
    }

    public Integer getConponType() {
        return conponType;
    }

    public void setConponType(Integer conponType) {
        this.conponType = conponType;
    }

    public String getConponTypeStr() {
        if(conponType!=null){
            if(conponType ==1){
                conponTypeStr="全场抵现券";
            }
            if(conponType ==2){
                conponTypeStr="品类抵现券";
            }
            if(conponType ==3){
                conponTypeStr="单品抵现券";
            }
            if(conponType ==4){
                conponTypeStr="全场折扣券";
            }
            if(conponType ==5){
                conponTypeStr="品类折扣券";
            }
            if(conponType ==6){
                conponTypeStr="单品折扣券";
            }
            if(conponType ==7){
                conponTypeStr="赠品提货券";
            }
        }
        return conponTypeStr;
    }

    public void setConponTypeStr(String conponTypeStr) {
        this.conponTypeStr = conponTypeStr;
    }
}
