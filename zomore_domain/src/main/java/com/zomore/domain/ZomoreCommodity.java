package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreCommodity {
    private String zomoreCommodityId;

    private String zomoreCommodityName;

    private String zomoreCommodityImage;

    private String zomoreCommodityCode;

    private String zomoreCommodityNum;//商品货号

    private String zomoreCommoditySpecifications;//商品规格

    private String zomoreCommodityPingyin;//拼音码

    private String zomoreCommodityType;

    private String zomoreCommodityMain;//主单位

    private String zomoreCommodityIn;//商品进货价

    private String zomoreCommodityOut;//商品销售价

    private String zomoreCommodityOutall;//商品批发价

    private Integer zomoreCommodityIsdiscount;//会员是否有折扣

    private String zomoreCommodityProvide;//商品供货商
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date zomoreCommodityProductdate;//商品生产日期

    private Integer zomoreCommodityTime;//
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date zomoreCommodityCreatetime;//商品资料表创建时间

    private Integer zomoreCommodityIsuser;//商品是否启用

    private Integer zomoreCommodityIsservice;//商品是否服务类商品

    private String zomoreCommodityLaber1;//商品标签

    private String zomoreCommodityLaber2;//自定义标签1（改成颜色）

    private String zomoreCommodityLaber3;//自定义标签2（改成尺码）

    private String zomoreCommodityLaberproduct;//商品标签

    private Integer zomoreCommodityIsintegral;//是否是积分商品

    private String zomoreCommodityBrand;//

    private String zomoreCommodityMemberprice;//会员价

    private String zomoreCommodityShop;

    private Integer zomoreCommodityIsroyalty;

    private Integer zomoreCommodityRoyaltytype;

    private String zomoreCommodityRoyaltyvalue;//商品提成（可以是固定价格或者提成百分比）

    private Integer zomoreCommodityUpdown;

    private String zomoreCommodityMeno;

    public String getZomoreCommodityId() {
        return zomoreCommodityId;
    }

    public void setZomoreCommodityId(String zomoreCommodityId) {
        this.zomoreCommodityId = zomoreCommodityId == null ? null : zomoreCommodityId.trim();
    }

    public String getZomoreCommodityName() {
        return zomoreCommodityName;
    }

    public void setZomoreCommodityName(String zomoreCommodityName) {
        this.zomoreCommodityName = zomoreCommodityName == null ? null : zomoreCommodityName.trim();
    }

    public String getZomoreCommodityImage() {
        return zomoreCommodityImage;
    }

    public void setZomoreCommodityImage(String zomoreCommodityImage) {
        this.zomoreCommodityImage = zomoreCommodityImage == null ? null : zomoreCommodityImage.trim();
    }

    public String getZomoreCommodityCode() {
        return zomoreCommodityCode;
    }

    public void setZomoreCommodityCode(String zomoreCommodityCode) {
        this.zomoreCommodityCode = zomoreCommodityCode == null ? null : zomoreCommodityCode.trim();
    }

    public String getZomoreCommodityNum() {
        return zomoreCommodityNum;
    }

    public void setZomoreCommodityNum(String zomoreCommodityNum) {
        this.zomoreCommodityNum = zomoreCommodityNum == null ? null : zomoreCommodityNum.trim();
    }

    public String getZomoreCommoditySpecifications() {
        return zomoreCommoditySpecifications;
    }

    public void setZomoreCommoditySpecifications(String zomoreCommoditySpecifications) {
        this.zomoreCommoditySpecifications = zomoreCommoditySpecifications == null ? null : zomoreCommoditySpecifications.trim();
    }

    public String getZomoreCommodityPingyin() {
        return zomoreCommodityPingyin;
    }

    public void setZomoreCommodityPingyin(String zomoreCommodityPingyin) {
        this.zomoreCommodityPingyin = zomoreCommodityPingyin == null ? null : zomoreCommodityPingyin.trim();
    }

    public String getZomoreCommodityType() {
        return zomoreCommodityType;
    }

    public void setZomoreCommodityType(String zomoreCommodityType) {
        this.zomoreCommodityType = zomoreCommodityType == null ? null : zomoreCommodityType.trim();
    }

    public String getZomoreCommodityMain() {
        return zomoreCommodityMain;
    }

    public void setZomoreCommodityMain(String zomoreCommodityMain) {
        this.zomoreCommodityMain = zomoreCommodityMain == null ? null : zomoreCommodityMain.trim();
    }

    public String getZomoreCommodityIn() {
        return zomoreCommodityIn;
    }

    public void setZomoreCommodityIn(String zomoreCommodityIn) {
        this.zomoreCommodityIn = zomoreCommodityIn == null ? null : zomoreCommodityIn.trim();
    }

    public String getZomoreCommodityOut() {
        return zomoreCommodityOut;
    }

    public void setZomoreCommodityOut(String zomoreCommodityOut) {
        this.zomoreCommodityOut = zomoreCommodityOut == null ? null : zomoreCommodityOut.trim();
    }

    public String getZomoreCommodityOutall() {
        return zomoreCommodityOutall;
    }

    public void setZomoreCommodityOutall(String zomoreCommodityOutall) {
        this.zomoreCommodityOutall = zomoreCommodityOutall == null ? null : zomoreCommodityOutall.trim();
    }

    public Integer getZomoreCommodityIsdiscount() {
        return zomoreCommodityIsdiscount;
    }

    public void setZomoreCommodityIsdiscount(Integer zomoreCommodityIsdiscount) {
        this.zomoreCommodityIsdiscount = zomoreCommodityIsdiscount;
    }

    public String getZomoreCommodityProvide() {
        return zomoreCommodityProvide;
    }

    public void setZomoreCommodityProvide(String zomoreCommodityProvide) {
        this.zomoreCommodityProvide = zomoreCommodityProvide == null ? null : zomoreCommodityProvide.trim();
    }

    public Date getZomoreCommodityProductdate() {
        return zomoreCommodityProductdate;
    }

    public void setZomoreCommodityProductdate(Date zomoreCommodityProductdate) {
        this.zomoreCommodityProductdate = zomoreCommodityProductdate;
    }

    public Integer getZomoreCommodityTime() {
        return zomoreCommodityTime;
    }

    public void setZomoreCommodityTime(Integer zomoreCommodityTime) {
        this.zomoreCommodityTime = zomoreCommodityTime;
    }

    public Date getZomoreCommodityCreatetime() {
        return zomoreCommodityCreatetime;
    }

    public void setZomoreCommodityCreatetime(Date zomoreCommodityCreatetime) {
        this.zomoreCommodityCreatetime = zomoreCommodityCreatetime;
    }

    public Integer getZomoreCommodityIsuser() {
        return zomoreCommodityIsuser;
    }

    public void setZomoreCommodityIsuser(Integer zomoreCommodityIsuser) {
        this.zomoreCommodityIsuser = zomoreCommodityIsuser;
    }

    public Integer getZomoreCommodityIsservice() {
        return zomoreCommodityIsservice;
    }

    public void setZomoreCommodityIsservice(Integer zomoreCommodityIsservice) {
        this.zomoreCommodityIsservice = zomoreCommodityIsservice;
    }

    public String getZomoreCommodityLaber1() {
        return zomoreCommodityLaber1;
    }

    public void setZomoreCommodityLaber1(String zomoreCommodityLaber1) {
        this.zomoreCommodityLaber1 = zomoreCommodityLaber1 == null ? null : zomoreCommodityLaber1.trim();
    }

    public String getZomoreCommodityLaber2() {
        return zomoreCommodityLaber2;
    }

    public void setZomoreCommodityLaber2(String zomoreCommodityLaber2) {
        this.zomoreCommodityLaber2 = zomoreCommodityLaber2 == null ? null : zomoreCommodityLaber2.trim();
    }

    public String getZomoreCommodityLaber3() {
        return zomoreCommodityLaber3;
    }

    public void setZomoreCommodityLaber3(String zomoreCommodityLaber3) {
        this.zomoreCommodityLaber3 = zomoreCommodityLaber3 == null ? null : zomoreCommodityLaber3.trim();
    }

    public String getZomoreCommodityLaberproduct() {
        return zomoreCommodityLaberproduct;
    }

    public void setZomoreCommodityLaberproduct(String zomoreCommodityLaberproduct) {
        this.zomoreCommodityLaberproduct = zomoreCommodityLaberproduct == null ? null : zomoreCommodityLaberproduct.trim();
    }

    public Integer getZomoreCommodityIsintegral() {
        return zomoreCommodityIsintegral;
    }

    public void setZomoreCommodityIsintegral(Integer zomoreCommodityIsintegral) {
        this.zomoreCommodityIsintegral = zomoreCommodityIsintegral;
    }

    public String getZomoreCommodityBrand() {
        return zomoreCommodityBrand;
    }

    public void setZomoreCommodityBrand(String zomoreCommodityBrand) {
        this.zomoreCommodityBrand = zomoreCommodityBrand == null ? null : zomoreCommodityBrand.trim();
    }

    public String getZomoreCommodityMemberprice() {
        return zomoreCommodityMemberprice;
    }

    public void setZomoreCommodityMemberprice(String zomoreCommodityMemberprice) {
        this.zomoreCommodityMemberprice = zomoreCommodityMemberprice == null ? null : zomoreCommodityMemberprice.trim();
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }

    public Integer getZomoreCommodityIsroyalty() {
        return zomoreCommodityIsroyalty;
    }

    public void setZomoreCommodityIsroyalty(Integer zomoreCommodityIsroyalty) {
        this.zomoreCommodityIsroyalty = zomoreCommodityIsroyalty;
    }

    public Integer getZomoreCommodityRoyaltytype() {
        return zomoreCommodityRoyaltytype;
    }

    public void setZomoreCommodityRoyaltytype(Integer zomoreCommodityRoyaltytype) {
        this.zomoreCommodityRoyaltytype = zomoreCommodityRoyaltytype;
    }

    public String getZomoreCommodityRoyaltyvalue() {
        return zomoreCommodityRoyaltyvalue;
    }

    public void setZomoreCommodityRoyaltyvalue(String zomoreCommodityRoyaltyvalue) {
        this.zomoreCommodityRoyaltyvalue = zomoreCommodityRoyaltyvalue == null ? null : zomoreCommodityRoyaltyvalue.trim();
    }

    public Integer getZomoreCommodityUpdown() {
        return zomoreCommodityUpdown;
    }

    public void setZomoreCommodityUpdown(Integer zomoreCommodityUpdown) {
        this.zomoreCommodityUpdown = zomoreCommodityUpdown;
    }

    public String getZomoreCommodityMeno() {
        return zomoreCommodityMeno;
    }

    public void setZomoreCommodityMeno(String zomoreCommodityMeno) {
        this.zomoreCommodityMeno = zomoreCommodityMeno == null ? null : zomoreCommodityMeno.trim();
    }
}