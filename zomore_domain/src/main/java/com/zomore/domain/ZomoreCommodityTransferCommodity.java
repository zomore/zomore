package com.zomore.domain;

public class ZomoreCommodityTransferCommodity {
    private String id;
    //商品条码
    private String zomoreCommodityTransferName;
    //商品名称
    private String zomoreCommodityTransferCode;
    //调货数量
    private Integer zomoreCommodityTransferNum;
    //调货单价
    private String zomoreCommodityTransferPrice;
    //调货单号
    private String zomoreCommodityTransferId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getZomoreCommodityTransferName() {
        return zomoreCommodityTransferName;
    }

    public void setZomoreCommodityTransferName(String zomoreCommodityTransferName) {
        this.zomoreCommodityTransferName = zomoreCommodityTransferName == null ? null : zomoreCommodityTransferName.trim();
    }

    public String getZomoreCommodityTransferCode() {
        return zomoreCommodityTransferCode;
    }

    public void setZomoreCommodityTransferCode(String zomoreCommodityTransferCode) {
        this.zomoreCommodityTransferCode = zomoreCommodityTransferCode == null ? null : zomoreCommodityTransferCode.trim();
    }

    public Integer getZomoreCommodityTransferNum() {
        return zomoreCommodityTransferNum;
    }

    public void setZomoreCommodityTransferNum(Integer zomoreCommodityTransferNum) {
        this.zomoreCommodityTransferNum = zomoreCommodityTransferNum;
    }

    public String getZomoreCommodityTransferPrice() {
        return zomoreCommodityTransferPrice;
    }

    public void setZomoreCommodityTransferPrice(String zomoreCommodityTransferPrice) {
        this.zomoreCommodityTransferPrice = zomoreCommodityTransferPrice == null ? null : zomoreCommodityTransferPrice.trim();
    }

    public String getZomoreCommodityTransferId() {
        return zomoreCommodityTransferId;
    }

    public void setZomoreCommodityTransferId(String zomoreCommodityTransferId) {
        this.zomoreCommodityTransferId = zomoreCommodityTransferId == null ? null : zomoreCommodityTransferId.trim();
    }
}