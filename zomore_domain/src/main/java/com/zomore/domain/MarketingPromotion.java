package com.zomore.domain;

import com.zomore.utils.DateUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class MarketingPromotion implements Serializable {
    //第一次建立的属性名，对应MarketingPromotionDao的写法
    private Long promotionId;
    private String promotionName;
    private String createShop;
    private Integer promotionType;
    private String promotionTypeStr;
    private String promotionScope;

    private String createTime;
    private String createTimeStr;

    private String dueTime;
    private String dueTimeStr;
    private Integer status;
    private String statusStr;
    private Long shopId;
    private Long multipleId;

    private Integer promotionnum;
    private String promotionshop;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date duetime;
    private Integer ismember;

    //第二次修改新加属性名，对应MarketingPromotionMapper.xml的写法
    private String promotionid;

    private String promotionname;

    private String createshop;

    private Integer promotiontype;
    private String promotionscope;

    private String shopid;

    private String multipleid;


    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionName() {
        if(promotionName==null){
            promotionName=promotionname;
        }
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getCreateShop() {
        return createShop;
    }

    public void setCreateShop(String createShop) {
        this.createShop = createShop;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public String getPromotionTypeStr() {
        if(promotiontype!=null){
            if(promotiontype ==1){
                promotionTypeStr="打折/特价";
            }
            if(promotiontype ==2){
                promotionTypeStr="梯度优惠";
            }
            if(promotiontype ==3){
                promotionTypeStr="满额返现";
            }
            if(promotiontype ==4){
                promotionTypeStr="换购促销";
            }
            if(promotiontype ==5){
                promotionTypeStr="搭赠促销";
            }
            if(promotiontype ==6){
                promotionTypeStr="第二件打折";
            }
            if(promotiontype ==7){
                promotionTypeStr="套餐促销";
            }
        }
        return promotionTypeStr;
    }

    public void setPromotionTypeStr(String promotionTypeStr) {
        this.promotionTypeStr = promotionTypeStr;
    }

    public String getPromotionScope() {
        if(promotionScope==null){
            promotionScope=promotionscope;
        }
        return promotionScope;
    }

    public void setPromotionScope(String promotionScope) {
        this.promotionScope = promotionScope;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusStr() {
        if(status != null){
            if(status==0){
                statusStr="失效";
            }
            if(status==1){
                if(duetime!=null){
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String dateTime=format.format(new Date());
                    try {
                        Date nowTime= format.parse(dateTime);
                        if(duetime.before(nowTime)){
                            statusStr="失效";
                        }else {
                            statusStr="有效";
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                if(duetime==null){
                    statusStr="失效";
                }

            }

        }
        return statusStr;
    }
    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
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

    public String getCreateTime() {
        if(createTime==null){
            if(createtime!=null){
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                createTime=format.format(createtime);
            }

        }
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStr() {
        if(createtime!=null){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            createTimeStr=format.format(createtime);
        }
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getDueTime() {
        if(dueTime==null){
            if(duetime!=null){
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                dueTime=format.format(duetime);
            }

        }
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public String getDueTimeStr() {
        if(duetime!=null){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            dueTimeStr=format.format(duetime);
        }
        return dueTimeStr;
    }

    public void setDueTimeStr(String dueTimeStr) {
        this.dueTimeStr = dueTimeStr;
    }

    public Integer getPromotionnum() {
        return promotionnum;
    }

    public void setPromotionnum(Integer promotionnum) {
        this.promotionnum = promotionnum;
    }

    public String getPromotionshop() {
        return promotionshop;
    }

    public void setPromotionshop(String promotionshop) {
        this.promotionshop = promotionshop;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDuetime() {
        return duetime;
    }

    public void setDuetime(Date duetime) {
        this.duetime = duetime;
    }

    public Integer getIsmember() {
        return ismember;
    }

    public void setIsmember(Integer ismember) {
        this.ismember = ismember;
    }

    public String getPromotionid() {
        return promotionid;
    }

    public void setPromotionid(String promotionid) {
        this.promotionid = promotionid;
    }

    public String getPromotionname() {
        return promotionname;
    }

    public void setPromotionname(String promotionname) {
        this.promotionname = promotionname;
    }

    public String getCreateshop() {
        return createshop;
    }

    public void setCreateshop(String createshop) {
        this.createshop = createshop;
    }

    public Integer getPromotiontype() {
        return promotiontype;
    }

    public void setPromotiontype(Integer promotiontype) {
        this.promotiontype = promotiontype;
    }

    public String getPromotionscope() {
        return promotionscope;
    }

    public void setPromotionscope(String promotionscope) {
        this.promotionscope = promotionscope;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getMultipleid() {
        return multipleid;
    }

    public void setMultipleid(String multipleid) {
        this.multipleid = multipleid;
    }
}