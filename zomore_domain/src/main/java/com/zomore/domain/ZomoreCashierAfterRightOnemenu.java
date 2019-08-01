package com.zomore.domain;

public class ZomoreCashierAfterRightOnemenu {
    private String cashierOnemenuId;//表id
    private String cashierId;//收银台id
    private String cashierOnemenuName;//一级菜单名
    private Integer onemenuIdEffective;//是否起效

    public String getCashierOnemenuId() {
        return cashierOnemenuId;
    }

    public void setCashierOnemenuId(String cashierOnemenuId) {
        this.cashierOnemenuId = cashierOnemenuId;
    }

    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public String getCashierOnemenuName() {
        return cashierOnemenuName;
    }

    public void setCashierOnemenuName(String cashierOnemenuName) {
        this.cashierOnemenuName = cashierOnemenuName;
    }

    public Integer getOnemenuIdEffective() {
        return onemenuIdEffective;
    }

    public void setOnemenuIdEffective(Integer onemenuIdEffective) {
        this.onemenuIdEffective = onemenuIdEffective;
    }
}
