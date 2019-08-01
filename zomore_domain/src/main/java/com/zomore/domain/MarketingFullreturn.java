package com.zomore.domain;

import com.zomore.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class MarketingFullreturn implements Serializable {
    private Long fullreturnId;

    private Integer promotionType;
    private String promotionTypeStr;
    private String promotionName;

    private String promotionScope;

    private Integer isMember;
    private String createTime;//创建时间
    private String createTimeStr;//创建时间字符串形式

    private String dueTime;//到期时间
    private String dueTimeStr;//到期时间
    private String consumeNum;

    private String backNum;

    private Integer promotionSelect;

    private Integer promotionDisSelect;

    private Long multipleId;
    private Long shopId;
    private Long promotionId;

    public Long getFullreturnId() {
        return fullreturnId;
    }

    public void setFullreturnId(Long fullreturnId) {
        this.fullreturnId = fullreturnId;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public String getPromotionTypeStr() {
        if(promotionType!=null){
            if(promotionType ==1){
                promotionTypeStr="打折/特价";
            }
            if(promotionType ==2){
                promotionTypeStr="梯度优惠";
            }
            if(promotionType ==3){
                promotionTypeStr="满额返现";
            }
            if(promotionType ==4){
                promotionTypeStr="换购促销";
            }
            if(promotionType ==5){
                promotionTypeStr="搭赠促销";
            }
            if(promotionType ==6){
                promotionTypeStr="第二件打折";
            }
            if(promotionType ==7){
                promotionTypeStr="套餐促销";
            }
        }
        return promotionTypeStr;
    }

    public void setPromotionTypeStr(String promotionTypeStr) {
        this.promotionTypeStr = promotionTypeStr;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getPromotionScope() {
        return promotionScope;
    }

    public void setPromotionScope(String promotionScope) {
        this.promotionScope = promotionScope;
    }

    public Integer getIsMember() {
        return isMember;
    }

    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public String getDueTimeStr() {
        return dueTimeStr;
    }

    public void setDueTimeStr(String dueTimeStr) {
        this.dueTimeStr = dueTimeStr;
    }

    public String getConsumeNum() {
        return consumeNum;
    }

    public void setConsumeNum(String consumeNum) {
        this.consumeNum = consumeNum;
    }

    public String getBackNum() {
        return backNum;
    }

    public void setBackNum(String backNum) {
        this.backNum = backNum;
    }

    public Integer getPromotionSelect() {
        return promotionSelect;
    }

    public void setPromotionSelect(Integer promotionSelect) {
        this.promotionSelect = promotionSelect;
    }

    public Integer getPromotionDisSelect() {
        return promotionDisSelect;
    }

    public void setPromotionDisSelect(Integer promotionDisSelect) {
        this.promotionDisSelect = promotionDisSelect;
    }

    public Long getMultipleId() {
        return multipleId;
    }

    public void setMultipleId(Long multipleId) {
        this.multipleId = multipleId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }
}