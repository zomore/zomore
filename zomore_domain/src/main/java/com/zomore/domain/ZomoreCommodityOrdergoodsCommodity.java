package com.zomore.domain;

public class ZomoreCommodityOrdergoodsCommodity {
    private String zomoreCommodityOrdergoodsCommodityId;//id 主键

    private String zomoreCommodityOrdergoodsId;//配货单号(订货单号)

    private String zomoreCommodityId;//商品id

    private Integer zomoreCommodityNum;//商品数量

    private String zomoreCommdityCode;//商品条码

    private String  zomoreCommodityName;//商品名称

    private String zomoreCommodityType;//商品分类

    private String zomoreCommodityOutprice;//商品零售价

    private String zomoreCommodityInprice;//商品订货价(商品进货价)

    public String getZomoreCommdityCode() {
        return zomoreCommdityCode;
    }

    public void setZomoreCommdityCode(String zomoreCommdityCode) {
        this.zomoreCommdityCode = zomoreCommdityCode;
    }

    public String getZomoreCommodityName() {
        return zomoreCommodityName;
    }

    public void setZomoreCommodityName(String zomoreCommodityName) {
        this.zomoreCommodityName = zomoreCommodityName;
    }

    public String getZomoreCommodityType() {
        return zomoreCommodityType;
    }

    public void setZomoreCommodityType(String zomoreCommodityType) {
        this.zomoreCommodityType = zomoreCommodityType;
    }

    public String getZomoreCommodityOutprice() {
        return zomoreCommodityOutprice;
    }

    public void setZomoreCommodityOutprice(String zomoreCommodityOutprice) {
        this.zomoreCommodityOutprice = zomoreCommodityOutprice;
    }

    public String getZomoreCommodityInprice() {
        return zomoreCommodityInprice;
    }

    public void setZomoreCommodityInprice(String zomoreCommodityInprice) {
        this.zomoreCommodityInprice = zomoreCommodityInprice;
    }

    public String getZomoreCommodityOrdergoodsCommodityId() {
        return zomoreCommodityOrdergoodsCommodityId;
    }

    public void setZomoreCommodityOrdergoodsCommodityId(String zomoreCommodityOrdergoodsCommodityId) {
        this.zomoreCommodityOrdergoodsCommodityId = zomoreCommodityOrdergoodsCommodityId;
    }

    public String getZomoreCommodityOrdergoodsId() {
        return zomoreCommodityOrdergoodsId;
    }

    public void setZomoreCommodityOrdergoodsId(String zomoreCommodityOrdergoodsId) {
        this.zomoreCommodityOrdergoodsId = zomoreCommodityOrdergoodsId == null ? null : zomoreCommodityOrdergoodsId.trim();
    }

    public String getZomoreCommodityId() {
        return zomoreCommodityId;
    }

    public void setZomoreCommodityId(String zomoreCommodityId) {
        this.zomoreCommodityId = zomoreCommodityId == null ? null : zomoreCommodityId.trim();
    }

    public Integer getZomoreCommodityNum() {
        return zomoreCommodityNum;
    }

    public void setZomoreCommodityNum(Integer zomoreCommodityNum) {
        this.zomoreCommodityNum = zomoreCommodityNum;
    }
}