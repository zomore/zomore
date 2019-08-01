package com.zomore.domain;

import java.io.Serializable;

public class Reservation implements Serializable {

    private Long reservationId;//预约服务Id
    private String createTime;//开始时间
    private String dueTime;//结束时间
    private String timeTime;//
    private String serverItem;//服务项目
    private String member;//会员名称
    private String phone;//联系电话
    private String repay;//预定金
    private Integer status;//状态
    private String statusStr;//
    private Integer payway;//支付方式
    private String paywayStr;//
    private String remark;//备注
    private String serverer;//服务人员
    private String shopnum;//预约门店账号

    public String getShopnum() {
        return shopnum;
    }

    public void setShopnum(String shopnum) {
        this.shopnum = shopnum;
    }

    public String getServerer() {
        return serverer;
    }

    public void setServerer(String serverer) {
        this.serverer = serverer;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
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

    public String getTimeTime() {
        if(createTime!=null && dueTime != null){
            timeTime = createTime+"-"+dueTime;
        }else {
            timeTime="";
        }
        return timeTime;
    }

    public void setTimeTime(String timeTime) {
        this.timeTime = timeTime;
    }

    public String getServerItem() {
        return serverItem;
    }

    public void setServerItem(String serverItem) {
        this.serverItem = serverItem;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRepay() {
        return repay;
    }

    public void setRepay(String repay) {
        this.repay = repay;
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
                statusStr="已付定金";
            if(status==1)
                statusStr="已作废";
            if(status==2)
                statusStr="已取消";
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPayway() {
        return payway;
    }

    public void setPayway(Integer payway) {
        this.payway = payway;
    }

    public String getPaywayStr() {
        if(payway!=null){
            if(payway ==0){
                paywayStr="现金支付";
            }
            if(payway ==1){
                paywayStr="储值卡支付";
            }
            if(payway ==2){
                paywayStr="微信支付";
            }
            if(payway ==3){
                paywayStr="银联支付";
            }
            if(payway ==4){
                paywayStr="支付宝支付";
            }
            if(payway ==5){
                paywayStr="预售卡支付";
            }
            if(payway ==6){
                paywayStr="优惠券支付";
            }
            if(payway ==7){
                paywayStr="其他";
            }
        }
        return paywayStr;
    }

    public void setPaywayStr(String paywayStr) {
        this.paywayStr = paywayStr;
    }
}
