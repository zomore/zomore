package com.zomore.utils;

public class OrderNumber {
    private Integer pendingPaymemtNum;//待付款订单数量
    private Integer pendingGetGoodsNum;//待收货订单数量
    private Integer pendingSendingGoodsNum;//待发货订单数量
    private Integer pendingEvalateNum;//待评价订单数量

    public Integer getPendingPaymemtNum() {
        return pendingPaymemtNum;
    }

    public void setPendingPaymemtNum(Integer pendingPaymemtNum) {
        this.pendingPaymemtNum = pendingPaymemtNum;
    }

    public Integer getPendingGetGoodsNum() {
        return pendingGetGoodsNum;
    }

    public void setPendingGetGoodsNum(Integer pendingGetGoodsNum) {
        this.pendingGetGoodsNum = pendingGetGoodsNum;
    }

    public Integer getPendingSendingGoodsNum() {
        return pendingSendingGoodsNum;
    }

    public void setPendingSendingGoodsNum(Integer pendingSendingGoodsNum) {
        this.pendingSendingGoodsNum = pendingSendingGoodsNum;
    }

    public Integer getPendingEvalateNum() {
        return pendingEvalateNum;
    }

    public void setPendingEvalateNum(Integer pendingEvalateNum) {
        this.pendingEvalateNum = pendingEvalateNum;
    }
}
