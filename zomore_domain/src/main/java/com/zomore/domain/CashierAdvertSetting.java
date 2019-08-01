package com.zomore.domain;

public class CashierAdvertSetting {
    private Integer id;//表的唯一标识
    private String cashiernumber;//收银台编号
    private String cashiershop;//收银台所属店铺
    private Integer time;//播放等待时间(秒)
    private Integer switchtime;//图片切换时间
    private Integer screen;//是否开启双屏

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

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getSwitchtime() {
        return switchtime;
    }

    public void setSwitchtime(Integer switchtime) {
        this.switchtime = switchtime;
    }

    public Integer getScreen() {
        return screen;
    }

    public void setScreen(Integer screen) {
        this.screen = screen;
    }
}
