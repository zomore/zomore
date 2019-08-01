package com.zomore.domain;

public class CashierPrintSetting {
    private Integer id;//表的唯一标识
    private String cashiernumber;//收银台编号
    private String cashiershop;//收银台所属店名
    private Integer norms;//小票打印规格
    private Integer printnumber;//小票打印张数
    private Integer tablelist;//挂单打压桌单
    private Integer feedback;//开启反馈通道
    private Integer hidenum;//隐藏货好

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCashiernumber() {
        return cashiernumber;
    }

    public void setCashiernumber(String cashiernumber) {
        this.cashiernumber = cashiernumber;
    }

    public String getCashiershop() {
        return cashiershop;
    }

    public void setCashiershop(String cashiershop) {
        this.cashiershop = cashiershop;
    }

    public Integer getNorms() {
        return norms;
    }

    public void setNorms(Integer norms) {
        this.norms = norms;
    }

    public Integer getPrintnumber() {
        return printnumber;
    }

    public void setPrintnumber(Integer printnumber) {
        this.printnumber = printnumber;
    }

    public Integer getTablelist() {
        return tablelist;
    }

    public void setTablelist(Integer tablelist) {
        this.tablelist = tablelist;
    }

    public Integer getFeedback() {
        return feedback;
    }

    public void setFeedback(Integer feedback) {
        this.feedback = feedback;
    }

    public Integer getHidenum() {
        return hidenum;
    }

    public void setHidenum(Integer hidenum) {
        this.hidenum = hidenum;
    }
}
