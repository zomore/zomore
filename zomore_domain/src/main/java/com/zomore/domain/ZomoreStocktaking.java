package com.zomore.domain;

public class ZomoreStocktaking {
    private Integer stocktakingId;

    private String stocktakingHistoryid;

    private String stocktakingCode;

    private String stocktakingCommodityname;

    private Double stocktakingSellingprice;

    private String stocktakingNumber;

    private Integer stocktakingQuantity;

    private Integer stocktakingExistinginventory;

    private Integer stocktakingNetreceipts;

    private Double inventorydetailsProfitandloss;

    public Integer getStocktakingId() {
        return stocktakingId;
    }

    public void setStocktakingId(Integer stocktakingId) {
        this.stocktakingId = stocktakingId;
    }

    public String getStocktakingHistoryid() {
        return stocktakingHistoryid;
    }

    public void setStocktakingHistoryid(String stocktakingHistoryid) {
        this.stocktakingHistoryid = stocktakingHistoryid == null ? null : stocktakingHistoryid.trim();
    }

    public String getStocktakingCode() {
        return stocktakingCode;
    }

    public void setStocktakingCode(String stocktakingCode) {
        this.stocktakingCode = stocktakingCode == null ? null : stocktakingCode.trim();
    }

    public String getStocktakingCommodityname() {
        return stocktakingCommodityname;
    }

    public void setStocktakingCommodityname(String stocktakingCommodityname) {
        this.stocktakingCommodityname = stocktakingCommodityname == null ? null : stocktakingCommodityname.trim();
    }

    public Double getStocktakingSellingprice() {
        return stocktakingSellingprice;
    }

    public void setStocktakingSellingprice(Double stocktakingSellingprice) {
        this.stocktakingSellingprice = stocktakingSellingprice;
    }

    public String getStocktakingNumber() {
        return stocktakingNumber;
    }

    public void setStocktakingNumber(String stocktakingNumber) {
        this.stocktakingNumber = stocktakingNumber == null ? null : stocktakingNumber.trim();
    }

    public Integer getStocktakingQuantity() {
        return stocktakingQuantity;
    }

    public void setStocktakingQuantity(Integer stocktakingQuantity) {
        this.stocktakingQuantity = stocktakingQuantity;
    }

    public Integer getStocktakingExistinginventory() {
        return stocktakingExistinginventory;
    }

    public void setStocktakingExistinginventory(Integer stocktakingExistinginventory) {
        this.stocktakingExistinginventory = stocktakingExistinginventory;
    }

    public Integer getStocktakingNetreceipts() {
        return stocktakingNetreceipts;
    }

    public void setStocktakingNetreceipts(Integer stocktakingNetreceipts) {
        this.stocktakingNetreceipts = stocktakingNetreceipts;
    }

    public Double getInventorydetailsProfitandloss() {
        return inventorydetailsProfitandloss;
    }

    public void setInventorydetailsProfitandloss(Double inventorydetailsProfitandloss) {
        this.inventorydetailsProfitandloss = inventorydetailsProfitandloss;
    }
}