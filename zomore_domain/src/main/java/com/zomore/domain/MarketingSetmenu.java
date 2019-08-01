package com.zomore.domain;

import com.zomore.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class MarketingSetmenu implements Serializable {
    private Long setmenuId;

    private Integer promotionType;

    private String promotionTypeStr;

    private String promotionName;

    private String promotionScope;
    private String createTime;//创建时间
    private String createTimeStr;//创建时间字符串形式

    private String dueTime;//到期时间
    private String dueTimeStr;//到期时间

    private String menuDetail;

    private Integer isShow;

    private String defaultPic;
    private Long multipleId;
    private Long shopId;
    private Long promotionId;

    private Integer isMember;

    public Integer getIsMember() {
        return isMember;
    }

    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }

    public Long getSetmenuId() {
        return setmenuId;
    }

    public void setSetmenuId(Long setmenuId) {
        this.setmenuId = setmenuId;
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

    public String getMenuDetail() {
        return menuDetail;
    }

    public void setMenuDetail(String menuDetail) {
        this.menuDetail = menuDetail;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getDefaultPic() {
        return defaultPic;
    }

    public void setDefaultPic(String defaultPic) {
        this.defaultPic = defaultPic;
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