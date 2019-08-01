package com.zomore.domain;

import java.util.Date;

public class ZomoreCommodityTransfer {
    /**
     *调货编号
     * */
    private String zomoreCommodityTransferId;
    /**
     *调货总价
     * */
    private String zomoreCommodityTransferNum;
    /**
     *调货总数
     * */
    private String zomoreCommodityTransferSize;
    /**
     *调货门店
     * */
    private String zomoreCommodityTransferInstore;
    /**
     *出货门店
     * */
    private String zomoreCommodityTransferOutstore;
    /**
     *调货备注
     * */
    private String zomoreCommodityTransferMeno;
    /**
     *调货时间
     * */
    private String zomoreCommodityTransferTime;
    /**
     *调货记录创建时间（系统自动添加）
     * */
    private Date zomoreCommodityTransferDatetime;
    /**
     *调货状态（0为未提交，1已提交，2已收货，4拒绝）
     * */
    private Integer state;

    private String zomoreCommodityTransferStaff;//调货员工
    private String zomoreCommodityTransferConcat;//收货人
    private String zomoreCommodityTransferConcatPhone;//收货人联系电话

    public String getZomoreCommodityTransferStaff() {
        return zomoreCommodityTransferStaff;
    }

    public void setZomoreCommodityTransferStaff(String zomoreCommodityTransferStaff) {
        this.zomoreCommodityTransferStaff = zomoreCommodityTransferStaff;
    }

    public String getZomoreCommodityTransferConcat() {
        return zomoreCommodityTransferConcat;
    }

    public void setZomoreCommodityTransferConcat(String zomoreCommodityTransferConcat) {
        this.zomoreCommodityTransferConcat = zomoreCommodityTransferConcat;
    }

    public String getZomoreCommodityTransferConcatPhone() {
        return zomoreCommodityTransferConcatPhone;
    }

    public void setZomoreCommodityTransferConcatPhone(String zomoreCommodityTransferConcatPhone) {
        this.zomoreCommodityTransferConcatPhone = zomoreCommodityTransferConcatPhone;
    }

    public String getZomoreCommodityTransferId() {
        return zomoreCommodityTransferId;
    }

    public void setZomoreCommodityTransferId(String zomoreCommodityTransferId) {
        this.zomoreCommodityTransferId = zomoreCommodityTransferId == null ? null : zomoreCommodityTransferId.trim();
    }

    public String getZomoreCommodityTransferNum() {
        return zomoreCommodityTransferNum;
    }

    public void setZomoreCommodityTransferNum(String zomoreCommodityTransferNum) {
        this.zomoreCommodityTransferNum = zomoreCommodityTransferNum == null ? null : zomoreCommodityTransferNum.trim();
    }

    public String getZomoreCommodityTransferSize() {
        return zomoreCommodityTransferSize;
    }

    public void setZomoreCommodityTransferSize(String zomoreCommodityTransferSize) {
        this.zomoreCommodityTransferSize = zomoreCommodityTransferSize == null ? null : zomoreCommodityTransferSize.trim();
    }

    public String getZomoreCommodityTransferInstore() {
        return zomoreCommodityTransferInstore;
    }

    public void setZomoreCommodityTransferInstore(String zomoreCommodityTransferInstore) {
        this.zomoreCommodityTransferInstore = zomoreCommodityTransferInstore == null ? null : zomoreCommodityTransferInstore.trim();
    }

    public String getZomoreCommodityTransferOutstore() {
        return zomoreCommodityTransferOutstore;
    }

    public void setZomoreCommodityTransferOutstore(String zomoreCommodityTransferOutstore) {
        this.zomoreCommodityTransferOutstore = zomoreCommodityTransferOutstore == null ? null : zomoreCommodityTransferOutstore.trim();
    }

    public String getZomoreCommodityTransferMeno() {
        return zomoreCommodityTransferMeno;
    }

    public void setZomoreCommodityTransferMeno(String zomoreCommodityTransferMeno) {
        this.zomoreCommodityTransferMeno = zomoreCommodityTransferMeno == null ? null : zomoreCommodityTransferMeno.trim();
    }

    public String getZomoreCommodityTransferTime() {
        return zomoreCommodityTransferTime;
    }

    public void setZomoreCommodityTransferTime(String zomoreCommodityTransferTime) {
        this.zomoreCommodityTransferTime = zomoreCommodityTransferTime == null ? null : zomoreCommodityTransferTime.trim();
    }

    public Date getZomoreCommodityTransferDatetime() {
        return zomoreCommodityTransferDatetime;
    }

    public void setZomoreCommodityTransferDatetime(Date zomoreCommodityTransferDatetime) {
        this.zomoreCommodityTransferDatetime = zomoreCommodityTransferDatetime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}