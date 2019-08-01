package com.zomore.domain;

public class ZomoreCashier {
    private Integer id;

    private String cashierNumber;

    private String cashierName;

    private String cashierPassword;

    private String cashierPhone;

    private String cashierRolename;

    private Integer cashierState;

    private String cashierStore;

    private Integer cashierDiscount;

    private Double cashierMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCashierNumber() {
        return cashierNumber;
    }

    public void setCashierNumber(String cashierNumber) {
        this.cashierNumber = cashierNumber == null ? null : cashierNumber.trim();
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName == null ? null : cashierName.trim();
    }

    public String getCashierPassword() {
        return cashierPassword;
    }

    public void setCashierPassword(String cashierPassword) {
        this.cashierPassword = cashierPassword == null ? null : cashierPassword.trim();
    }

    public String getCashierPhone() {
        return cashierPhone;
    }

    public void setCashierPhone(String cashierPhone) {
        this.cashierPhone = cashierPhone == null ? null : cashierPhone.trim();
    }

    public String getCashierRolename() {
        return cashierRolename;
    }

    public void setCashierRolename(String cashierRolename) {
        this.cashierRolename = cashierRolename == null ? null : cashierRolename.trim();
    }

    public Integer getCashierState() {
        return cashierState;
    }

    public void setCashierState(Integer cashierState) {
        this.cashierState = cashierState;
    }

    public String getCashierStore() {
        return cashierStore;
    }

    public void setCashierStore(String cashierStore) {
        this.cashierStore = cashierStore == null ? null : cashierStore.trim();
    }

    public Integer getCashierDiscount() {
        return cashierDiscount;
    }

    public void setCashierDiscount(Integer cashierDiscount) {
        this.cashierDiscount = cashierDiscount;
    }

    public Double getCashierMoney() {
        return cashierMoney;
    }

    public void setCashierMoney(Double cashierMoney) {
        this.cashierMoney = cashierMoney;
    }
}