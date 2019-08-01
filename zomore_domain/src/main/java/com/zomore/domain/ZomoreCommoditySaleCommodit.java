package com.zomore.domain;

public class ZomoreCommoditySaleCommodit {
    private Integer zomoreCommoditySaleCommoditId;

    private String zomoreCommoditySaleId;//流水号

    private String zomoreCommodityName;//销售商品名称

    private Integer zomoreCommodityNum;//商品数量

    private String zomoreCommodityType;//商品分类

    private Double zomoreCommodityMoney;//金额=单价*数量(原价*数量)

    private String zomoreCommodityShop;//门店

    private Double zomoreCommodutyInMoney;//单个商品实收金额

    private Integer zomoreCommodityDiscount;//单个商品的折扣

    private Double zomoreCommodityCountMoney;//小计(数量x单个商品的实收)

    private String zomreComoditycode;//商品条码

    public String getZomreComoditycode() {
        return zomreComoditycode;
    }

    public void setZomreComoditycode(String zomreComoditycode) {
        this.zomreComoditycode = zomreComoditycode;
    }

    public Double getZomoreCommodityCountMoney() {
        return zomoreCommodityCountMoney;
    }

    public void setZomoreCommodityCountMoney(Double zomoreCommodityCountMoney) {
        this.zomoreCommodityCountMoney = zomoreCommodityCountMoney;
    }

    public Integer getZomoreCommodityDiscount() {
        return zomoreCommodityDiscount;
    }

    public void setZomoreCommodityDiscount(Integer zomoreCommodityDiscount) {
        this.zomoreCommodityDiscount = zomoreCommodityDiscount;
    }

    public Double getZomoreCommodutyInMoney() {
        return zomoreCommodutyInMoney;
    }

    public void setZomoreCommodutyInMoney(Double zomoreCommodutyInMoney) {
        this.zomoreCommodutyInMoney = zomoreCommodutyInMoney;
    }

    public Integer getZomoreCommoditySaleCommoditId() {
        return zomoreCommoditySaleCommoditId;
    }

    public void setZomoreCommoditySaleCommoditId(Integer zomoreCommoditySaleCommoditId) {
        this.zomoreCommoditySaleCommoditId = zomoreCommoditySaleCommoditId;
    }

    public String getZomoreCommoditySaleId() {
        return zomoreCommoditySaleId;
    }

    public void setZomoreCommoditySaleId(String zomoreCommoditySaleId) {
        this.zomoreCommoditySaleId = zomoreCommoditySaleId == null ? null : zomoreCommoditySaleId.trim();
    }

    public String getZomoreCommodityName() {
        return zomoreCommodityName;
    }

    public void setZomoreCommodityName(String zomoreCommodityName) {
        this.zomoreCommodityName = zomoreCommodityName == null ? null : zomoreCommodityName.trim();
    }

    public Integer getZomoreCommodityNum() {
        return zomoreCommodityNum;
    }

    public void setZomoreCommodityNum(Integer zomoreCommodityNum) {
        this.zomoreCommodityNum = zomoreCommodityNum;
    }

    public String getZomoreCommodityType() {
        return zomoreCommodityType;
    }

    public void setZomoreCommodityType(String zomoreCommodityType) {
        this.zomoreCommodityType = zomoreCommodityType == null ? null : zomoreCommodityType.trim();
    }

    public Double getZomoreCommodityMoney() {
        return zomoreCommodityMoney;
    }

    public void setZomoreCommodityMoney(Double zomoreCommodityMoney) {
        this.zomoreCommodityMoney = zomoreCommodityMoney;
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }
}