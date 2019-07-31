package com.zomore.utils;

import java.util.Date;

//收银台业绩返回集合
public class CashierPerformanceResult {

    private Date startime;
    private Date endtime;
    //收银台名称
    private String zomore_commodity_sale_name;
    //销售总数量
    private int num;
    //原总价
    private String oleprice;
    //实收总价
    private String allinprice;
    //总利润
    private String savemoney;

    public Date getStartime() {
        return startime;
    }

    public void setStartime(Date startime) {
        this.startime = startime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getZomore_commodity_sale_name() {
        return zomore_commodity_sale_name;
    }

    public void setZomore_commodity_sale_name(String zomore_commodity_sale_name) {
        this.zomore_commodity_sale_name = zomore_commodity_sale_name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getOleprice() {
        return oleprice;
    }

    public void setOleprice(String oleprice) {
        this.oleprice = oleprice;
    }

    public String getAllinprice() {
        return allinprice;
    }

    public void setAllinprice(String allinprice) {
        this.allinprice = allinprice;
    }

    public String getSavemoney() {
        return savemoney;
    }

    public void setSavemoney(String savemoney) {
        this.savemoney = savemoney;
    }
}
