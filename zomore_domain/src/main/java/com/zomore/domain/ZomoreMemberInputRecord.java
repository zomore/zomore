package com.zomore.domain;

import java.util.Date;

public class ZomoreMemberInputRecord {
    private Integer id;

    private String memberNum;

    private String memberName;

    private Double inputmoney;

    private Double givemoney;

    private Date createtime;

    private String shop;

    private String cashier;

    private String guide;

    private String type;

    private String project;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum == null ? null : memberNum.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Double getInputmoney() {
        return inputmoney;
    }

    public void setInputmoney(Double inputmoney) {
        this.inputmoney = inputmoney;
    }

    public Double getGivemoney() {
        return givemoney;
    }

    public void setGivemoney(Double givemoney) {
        this.givemoney = givemoney;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier == null ? null : cashier.trim();
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide == null ? null : guide.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}