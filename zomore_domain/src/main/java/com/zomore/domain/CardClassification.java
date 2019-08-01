package com.zomore.domain;

public class CardClassification {
    private Long classificationid;

    private String classificationname;

    private String classificationremark;

    private String shop;

    public Long getClassificationid() {
        return classificationid;
    }

    public void setClassificationid(Long classificationid) {
        this.classificationid = classificationid;
    }

    public String getClassificationname() {
        return classificationname;
    }

    public void setClassificationname(String classificationname) {
        this.classificationname = classificationname == null ? null : classificationname.trim();
    }

    public String getClassificationremark() {
        return classificationremark;
    }

    public void setClassificationremark(String classificationremark) {
        this.classificationremark = classificationremark == null ? null : classificationremark.trim();
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }
}