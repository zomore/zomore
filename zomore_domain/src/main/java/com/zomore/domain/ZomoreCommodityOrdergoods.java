package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreCommodityOrdergoods {
    private String zomoreCommodityOrdergoodsId;//配货单号(订货单号)

    private String zomoreCommodityOrdergoodsOutname;//配货门店

    private Date zomoreCommodityOrdergoodsTime;//订货时间（后台获取当前时间）

    private String zomoreCommodityOrdergoodsInname;//订货门店（名称）

    private String zomoreCommodityOrdergoodsName;//订货员（名称）

    private String zomoreCommodityOrdergoodsNum;//订货总数量
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date zomoreCommodityOrdergoodsExpecttime;//期望发货时间（精确到秒）

    private String zomoreCommodityOrdergoodsMoney;//预付款

    private Integer zomoreCommodityOrdergoodsState;//订单状态（0审核，1配货，2已配货）

    private Integer zomoreCommodityOrdergoodsPrintingnum;//打印次数

    private String zomoreCommodityOrdergoodsMeno;//发货备注（使用text）

    public String getZomoreCommodityOrdergoodsId() {
        return zomoreCommodityOrdergoodsId;
    }

    public void setZomoreCommodityOrdergoodsId(String zomoreCommodityOrdergoodsId) {
        this.zomoreCommodityOrdergoodsId = zomoreCommodityOrdergoodsId == null ? null : zomoreCommodityOrdergoodsId.trim();
    }

    public String getZomoreCommodityOrdergoodsOutname() {
        return zomoreCommodityOrdergoodsOutname;
    }

    public void setZomoreCommodityOrdergoodsOutname(String zomoreCommodityOrdergoodsOutname) {
        this.zomoreCommodityOrdergoodsOutname = zomoreCommodityOrdergoodsOutname == null ? null : zomoreCommodityOrdergoodsOutname.trim();
    }

    public Date getZomoreCommodityOrdergoodsTime() {
        return zomoreCommodityOrdergoodsTime;
    }

    public void setZomoreCommodityOrdergoodsTime(Date zomoreCommodityOrdergoodsTime) {
        this.zomoreCommodityOrdergoodsTime = zomoreCommodityOrdergoodsTime;
    }

    public String getZomoreCommodityOrdergoodsInname() {
        return zomoreCommodityOrdergoodsInname;
    }

    public void setZomoreCommodityOrdergoodsInname(String zomoreCommodityOrdergoodsInname) {
        this.zomoreCommodityOrdergoodsInname = zomoreCommodityOrdergoodsInname == null ? null : zomoreCommodityOrdergoodsInname.trim();
    }

    public String getZomoreCommodityOrdergoodsName() {
        return zomoreCommodityOrdergoodsName;
    }

    public void setZomoreCommodityOrdergoodsName(String zomoreCommodityOrdergoodsName) {
        this.zomoreCommodityOrdergoodsName = zomoreCommodityOrdergoodsName == null ? null : zomoreCommodityOrdergoodsName.trim();
    }

    public String getZomoreCommodityOrdergoodsNum() {
        return zomoreCommodityOrdergoodsNum;
    }

    public void setZomoreCommodityOrdergoodsNum(String zomoreCommodityOrdergoodsNum) {
        this.zomoreCommodityOrdergoodsNum = zomoreCommodityOrdergoodsNum == null ? null : zomoreCommodityOrdergoodsNum.trim();
    }

    public Date getZomoreCommodityOrdergoodsExpecttime() {
        return zomoreCommodityOrdergoodsExpecttime;
    }

    public void setZomoreCommodityOrdergoodsExpecttime(Date zomoreCommodityOrdergoodsExpecttime) {
        this.zomoreCommodityOrdergoodsExpecttime = zomoreCommodityOrdergoodsExpecttime;
    }

    public String getZomoreCommodityOrdergoodsMoney() {
        return zomoreCommodityOrdergoodsMoney;
    }

    public void setZomoreCommodityOrdergoodsMoney(String zomoreCommodityOrdergoodsMoney) {
        this.zomoreCommodityOrdergoodsMoney = zomoreCommodityOrdergoodsMoney == null ? null : zomoreCommodityOrdergoodsMoney.trim();
    }

    public Integer getZomoreCommodityOrdergoodsState() {
        return zomoreCommodityOrdergoodsState;
    }

    public void setZomoreCommodityOrdergoodsState(Integer zomoreCommodityOrdergoodsState) {
        this.zomoreCommodityOrdergoodsState = zomoreCommodityOrdergoodsState;
    }

    public Integer getZomoreCommodityOrdergoodsPrintingnum() {
        return zomoreCommodityOrdergoodsPrintingnum;
    }

    public void setZomoreCommodityOrdergoodsPrintingnum(Integer zomoreCommodityOrdergoodsPrintingnum) {
        this.zomoreCommodityOrdergoodsPrintingnum = zomoreCommodityOrdergoodsPrintingnum;
    }

    public String getZomoreCommodityOrdergoodsMeno() {
        return zomoreCommodityOrdergoodsMeno;
    }

    public void setZomoreCommodityOrdergoodsMeno(String zomoreCommodityOrdergoodsMeno) {
        this.zomoreCommodityOrdergoodsMeno = zomoreCommodityOrdergoodsMeno == null ? null : zomoreCommodityOrdergoodsMeno.trim();
    }
}