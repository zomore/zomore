package com.zomore.domain;

public class CashierGenralSetting {

    private Integer id;//表的唯一标识
    private String cashiernumber;//收银台编号
    private String cashiershop;//收银台所属对铺
    private Integer standbyfund;//开启备用金
    private Integer merge;//是否合并商品
    private Integer newlyadded;//在主页显示新增商品按钮
    private Integer shoppingguide;//是否开启导购提醒
    private Integer setrepeat;//订单重复提醒
    private Integer startup;//开机启动
    private Integer system;//是否开启系统弹窗

    public Integer getSetrepeat() {
        return setrepeat;
    }

    public void setSetrepeat(Integer setrepeat) {
        this.setrepeat = setrepeat;
    }

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

    public Integer getStandbyfund() {
        return standbyfund;
    }

    public void setStandbyfund(Integer standbyfund) {
        this.standbyfund = standbyfund;
    }

    public Integer getMerge() {
        return merge;
    }

    public void setMerge(Integer merge) {
        this.merge = merge;
    }

    public Integer getNewlyadded() {
        return newlyadded;
    }

    public void setNewlyadded(Integer newlyadded) {
        this.newlyadded = newlyadded;
    }

    public Integer getShoppingguide() {
        return shoppingguide;
    }

    public void setShoppingguide(Integer shoppingguide) {
        this.shoppingguide = shoppingguide;
    }


    public Integer getStartup() {
        return startup;
    }

    public void setStartup(Integer startup) {
        this.startup = startup;
    }

    public Integer getSystem() {
        return system;
    }

    public void setSystem(Integer system) {
        this.system = system;
    }
}
