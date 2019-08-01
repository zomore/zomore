package com.zomore.domain;

public class CashierFunctionSetting  {
    private Integer id;//表唯一标识
    private String cashierNumber;//收银台编号
    private String cashierShop;//收银台所属店铺
    private Integer icmemberKar;//是否使用ic会员卡（0不使用，1使用）
    private Integer memberBirthday;//是否开启会员生日提醒
    private Integer lockScreen;//是否自动锁屏
    private Integer guestShow;//是否开始客显
    private String guestShowAddress;//客显地址
    private String primaryExtension;//主分机
    private Integer itemNum;//是否显示货号
    private Integer remarks;//是否开启单据备注remarks
    private Integer retrieval;//是否开启会员检索

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
        this.cashierNumber = cashierNumber;
    }

    public String getCashierShop() {
        return cashierShop;
    }

    public void setCashierShop(String cashierShop) {
        this.cashierShop = cashierShop;
    }

    public Integer getIcmemberKar() {
        return icmemberKar;
    }

    public void setIcmemberKar(Integer icmemberKar) {
        this.icmemberKar = icmemberKar;
    }

    public Integer getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(Integer memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public Integer getLockScreen() {
        return lockScreen;
    }

    public void setLockScreen(Integer lockScreen) {
        this.lockScreen = lockScreen;
    }

    public Integer getGuestShow() {
        return guestShow;
    }

    public void setGuestShow(Integer guestShow) {
        this.guestShow = guestShow;
    }

    public String getGuestShowAddress() {
        return guestShowAddress;
    }

    public void setGuestShowAddress(String guestShowAddress) {
        this.guestShowAddress = guestShowAddress;
    }

    public String getPrimaryExtension() {
        return primaryExtension;
    }

    public void setPrimaryExtension(String primaryExtension) {
        this.primaryExtension = primaryExtension;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Integer getRemarks() {
        return remarks;
    }

    public void setRemarks(Integer remarks) {
        this.remarks = remarks;
    }

    public Integer getRetrieval() {
        return retrieval;
    }

    public void setRetrieval(Integer retrieval) {
        this.retrieval = retrieval;
    }
}
