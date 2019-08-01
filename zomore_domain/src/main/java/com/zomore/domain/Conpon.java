package com.zomore.domain;

import java.io.Serializable;

public class Conpon implements Serializable {
    private Long conponId;
    private String createShop;
    private Integer conponType;
    private String conponTypeStr;
    private String conponScope;
    private String createTime;
    private String dueTime;
    private Integer status;
    private String statusStr;
    private String useSituation;
    private Long shopId;
    private Long multipleId;
    private String conponName;

    public String getConponName() {
        return conponName;
    }

    public void setConponName(String conponName) {
        this.conponName = conponName;
    }

    public Long getConponId() {
        return conponId;
    }

    public void setConponId(Long conponId) {
        this.conponId = conponId;
    }

    public String getCreateShop() {
        return createShop;
    }

    public void setCreateShop(String createShop) {
        this.createShop = createShop;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusStr() {
        if(status != null){
            if(status==0)
                statusStr="已过期";
            if(status==1)
                statusStr="有效";

        }

        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getUseSituation() {
        return useSituation;
    }

    public void setUseSituation(String useSituation) {
        this.useSituation = useSituation;
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
}
