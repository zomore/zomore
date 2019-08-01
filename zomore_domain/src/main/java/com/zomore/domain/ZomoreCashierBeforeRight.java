package com.zomore.domain;

public class ZomoreCashierBeforeRight {
    private Integer id;
    private String cashiernum;//收银台编号
    private String headshopnum;//收银台所属店铺账号
    private  Integer cancash;//允许收银
    private  Integer nocodecash;//禁止无码收银
    private  Integer onechangeprice;//单品改价
    private  Integer allchangeprice;//整单改价
    private  Integer seeinprice;//查看进货价
    private  Integer submitintogoods;//提交进货
    private  Integer sureintogoods;//确认进货
    private  Integer beforeordergoods;//前台订货
    private  Integer beforereturngoods;//前台退货
    private  Integer beforetransfergoods;//前台调货
    private  Integer calcellaccount;//注销账号
    private  Integer editmember;//编辑会员
    private  Integer memberinput;//会员充值
    private  Integer negativeinput;//负数反向充值
    private  Integer memberintegralexhange;//会员积分兑换
    private  Integer cardconsume;//次卡消费
    private  Integer deleteguadan;//删除挂单单据
    private  Integer returncard;//退次卡
    private  Integer inventoryright;//盘点权限
    private  Integer mingpan;//明盘（显示库存）
    private  Integer searchdatabase;//查询库存
    private  Integer openmoneybox;//开启钱箱
    private  Integer shiftrecorddetail;//交接班显示明细
    private  Integer repeatsalenum;//补打单据
    private  Integer systemsetting;//系统设置
    private  Integer bandloss;//禁止报损
    private  Integer bandaddmember;//禁止新增会员
    private  Integer bandsubinventory;//禁止提交盘点数据

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCashiernum() {
        return cashiernum;
    }

    public void setCashiernum(String cashiernum) {
        this.cashiernum = cashiernum;
    }

    public String getHeadshopnum() {
        return headshopnum;
    }

    public void setHeadshopnum(String headshopnum) {
        this.headshopnum = headshopnum;
    }

    public Integer getCancash() {
        return cancash;
    }

    public void setCancash(Integer cancash) {
        this.cancash = cancash;
    }

    public Integer getNocodecash() {
        return nocodecash;
    }

    public void setNocodecash(Integer nocodecash) {
        this.nocodecash = nocodecash;
    }

    public Integer getOnechangeprice() {
        return onechangeprice;
    }

    public void setOnechangeprice(Integer onechangeprice) {
        this.onechangeprice = onechangeprice;
    }

    public Integer getAllchangeprice() {
        return allchangeprice;
    }

    public void setAllchangeprice(Integer allchangeprice) {
        this.allchangeprice = allchangeprice;
    }

    public Integer getSeeinprice() {
        return seeinprice;
    }

    public void setSeeinprice(Integer seeinprice) {
        this.seeinprice = seeinprice;
    }

    public Integer getSubmitintogoods() {
        return submitintogoods;
    }

    public void setSubmitintogoods(Integer submitintogoods) {
        this.submitintogoods = submitintogoods;
    }

    public Integer getSureintogoods() {
        return sureintogoods;
    }

    public void setSureintogoods(Integer sureintogoods) {
        this.sureintogoods = sureintogoods;
    }

    public Integer getBeforeordergoods() {
        return beforeordergoods;
    }

    public void setBeforeordergoods(Integer beforeordergoods) {
        this.beforeordergoods = beforeordergoods;
    }

    public Integer getBeforereturngoods() {
        return beforereturngoods;
    }

    public void setBeforereturngoods(Integer beforereturngoods) {
        this.beforereturngoods = beforereturngoods;
    }

    public Integer getBeforetransfergoods() {
        return beforetransfergoods;
    }

    public void setBeforetransfergoods(Integer beforetransfergoods) {
        this.beforetransfergoods = beforetransfergoods;
    }

    public Integer getCalcellaccount() {
        return calcellaccount;
    }

    public void setCalcellaccount(Integer calcellaccount) {
        this.calcellaccount = calcellaccount;
    }

    public Integer getEditmember() {
        return editmember;
    }

    public void setEditmember(Integer editmember) {
        this.editmember = editmember;
    }

    public Integer getMemberinput() {
        return memberinput;
    }

    public void setMemberinput(Integer memberinput) {
        this.memberinput = memberinput;
    }

    public Integer getNegativeinput() {
        return negativeinput;
    }

    public void setNegativeinput(Integer negativeinput) {
        this.negativeinput = negativeinput;
    }

    public Integer getMemberintegralexhange() {
        return memberintegralexhange;
    }

    public void setMemberintegralexhange(Integer memberintegralexhange) {
        this.memberintegralexhange = memberintegralexhange;
    }

    public Integer getCardconsume() {
        return cardconsume;
    }

    public void setCardconsume(Integer cardconsume) {
        this.cardconsume = cardconsume;
    }

    public Integer getDeleteguadan() {
        return deleteguadan;
    }

    public void setDeleteguadan(Integer deleteguadan) {
        this.deleteguadan = deleteguadan;
    }

    public Integer getReturncard() {
        return returncard;
    }

    public void setReturncard(Integer returncard) {
        this.returncard = returncard;
    }

    public Integer getInventoryright() {
        return inventoryright;
    }

    public void setInventoryright(Integer inventoryright) {
        this.inventoryright = inventoryright;
    }

    public Integer getMingpan() {
        return mingpan;
    }

    public void setMingpan(Integer mingpan) {
        this.mingpan = mingpan;
    }

    public Integer getSearchdatabase() {
        return searchdatabase;
    }

    public void setSearchdatabase(Integer searchdatabase) {
        this.searchdatabase = searchdatabase;
    }

    public Integer getOpenmoneybox() {
        return openmoneybox;
    }

    public void setOpenmoneybox(Integer openmoneybox) {
        this.openmoneybox = openmoneybox;
    }

    public Integer getShiftrecorddetail() {
        return shiftrecorddetail;
    }

    public void setShiftrecorddetail(Integer shiftrecorddetail) {
        this.shiftrecorddetail = shiftrecorddetail;
    }

    public Integer getRepeatsalenum() {
        return repeatsalenum;
    }

    public void setRepeatsalenum(Integer repeatsalenum) {
        this.repeatsalenum = repeatsalenum;
    }

    public Integer getSystemsetting() {
        return systemsetting;
    }

    public void setSystemsetting(Integer systemsetting) {
        this.systemsetting = systemsetting;
    }

    public Integer getBandloss() {
        return bandloss;
    }

    public void setBandloss(Integer bandloss) {
        this.bandloss = bandloss;
    }

    public Integer getBandaddmember() {
        return bandaddmember;
    }

    public void setBandaddmember(Integer bandaddmember) {
        this.bandaddmember = bandaddmember;
    }

    public Integer getBandsubinventory() {
        return bandsubinventory;
    }

    public void setBandsubinventory(Integer bandsubinventory) {
        this.bandsubinventory = bandsubinventory;
    }
}
