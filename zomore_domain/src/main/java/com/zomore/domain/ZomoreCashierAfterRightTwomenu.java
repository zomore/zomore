package com.zomore.domain;

public class ZomoreCashierAfterRightTwomenu {
    private String cashierTwomenuId;//二级菜单id
    private String cashierId;//收银台id
    private String cashierOnemenuId;//一级菜单id
    private String cashierTwomenuName;//二级菜单名
    private String cahierTwomenuUrl;//二级菜单url
    private  Integer cashierTwomenuEffective;//是否起效

    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public Integer getCashierTwomenuEffective() {
        return cashierTwomenuEffective;
    }

    public void setCashierTwomenuEffective(Integer cashierTwomenuEffective) {
        this.cashierTwomenuEffective = cashierTwomenuEffective;
    }

    public String getCashierTwomenuId() {
        return cashierTwomenuId;
    }

    public void setCashierTwomenuId(String cashierTwomenuId) {
        this.cashierTwomenuId = cashierTwomenuId;
    }

    public String getCashierOnemenuId() {
        return cashierOnemenuId;
    }

    public void setCashierOnemenuId(String cashierOnemenuId) {
        this.cashierOnemenuId = cashierOnemenuId;
    }

    public String getCashierTwomenuName() {
        return cashierTwomenuName;
    }

    public void setCashierTwomenuName(String cashierTwomenuName) {
        this.cashierTwomenuName = cashierTwomenuName;
    }

    public String getCahierTwomenuUrl() {
        return cahierTwomenuUrl;
    }

    public void setCahierTwomenuUrl(String cahierTwomenuUrl) {
        this.cahierTwomenuUrl = cahierTwomenuUrl;
    }


}
