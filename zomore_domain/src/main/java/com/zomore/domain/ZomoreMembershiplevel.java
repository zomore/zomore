package com.zomore.domain;

import java.util.Date;

public class ZomoreMembershiplevel {
    private String membershiplevelId;

    private String membershiplevelName;//等级名称

    private String membershiplevelProportion;//比重（该类型的会员人数有多少）

    private Double membershiplevelNearupgrade;//临近升级会员积分（离达到会员积分很近(自己设置很近积分）的会员）

    private String membershiplevelDiscount;//优惠折扣

    private Integer membershiplevelIntegral;//是否积分(1是，0否)

    private String membershiplevelType;//升级方式（不使用）

    private String membershiplevelRule;//升级规则(积分)

    private String membershiplevelRule1;//升级规则(消费)

    private String membershiplevelRule2;//升级规则(充值)

    private Integer membershiplevelDefault;//是否为默认会员

    private Integer membershiplevelUpgradetype;//是否为自动升级（0,否，1是）

    private Integer membershiplevelUpgradepayment;//是否为付费升级（0，不付费，1，付费）

    private Date membershiplevelTime;//该等级有效时间（不使用）

    private Integer membershiplevelEffective;//是否永久有效（1有效，0无效）（全部为永久有效）

    private String shop;//所属门店

    public String getMembershiplevelId() {
        return membershiplevelId;
    }

    public void setMembershiplevelId(String membershiplevelId) {
        this.membershiplevelId = membershiplevelId == null ? null : membershiplevelId.trim();
    }

    public String getMembershiplevelName() {
        return membershiplevelName;
    }

    public void setMembershiplevelName(String membershiplevelName) {
        this.membershiplevelName = membershiplevelName == null ? null : membershiplevelName.trim();
    }

    public String getMembershiplevelProportion() {
        return membershiplevelProportion;
    }

    public void setMembershiplevelProportion(String membershiplevelProportion) {
        this.membershiplevelProportion = membershiplevelProportion == null ? null : membershiplevelProportion.trim();
    }

    public Double getMembershiplevelNearupgrade() {
        return membershiplevelNearupgrade;
    }

    public void setMembershiplevelNearupgrade(Double membershiplevelNearupgrade) {
        this.membershiplevelNearupgrade = membershiplevelNearupgrade;
    }

    public String getMembershiplevelDiscount() {
        return membershiplevelDiscount;
    }

    public void setMembershiplevelDiscount(String membershiplevelDiscount) {
        this.membershiplevelDiscount = membershiplevelDiscount == null ? null : membershiplevelDiscount.trim();
    }

    public Integer getMembershiplevelIntegral() {
        return membershiplevelIntegral;
    }

    public void setMembershiplevelIntegral(Integer membershiplevelIntegral) {
        this.membershiplevelIntegral = membershiplevelIntegral;
    }

    public String getMembershiplevelType() {
        return membershiplevelType;
    }

    public void setMembershiplevelType(String membershiplevelType) {
        this.membershiplevelType = membershiplevelType == null ? null : membershiplevelType.trim();
    }

    public String getMembershiplevelRule() {
        return membershiplevelRule;
    }

    public void setMembershiplevelRule(String membershiplevelRule) {
        this.membershiplevelRule = membershiplevelRule == null ? null : membershiplevelRule.trim();
    }

    public String getMembershiplevelRule1() {
        return membershiplevelRule1;
    }

    public void setMembershiplevelRule1(String membershiplevelRule1) {
        this.membershiplevelRule1 = membershiplevelRule1 == null ? null : membershiplevelRule1.trim();
    }

    public String getMembershiplevelRule2() {
        return membershiplevelRule2;
    }

    public void setMembershiplevelRule2(String membershiplevelRule2) {
        this.membershiplevelRule2 = membershiplevelRule2 == null ? null : membershiplevelRule2.trim();
    }

    public Integer getMembershiplevelDefault() {
        return membershiplevelDefault;
    }

    public void setMembershiplevelDefault(Integer membershiplevelDefault) {
        this.membershiplevelDefault = membershiplevelDefault;
    }

    public Integer getMembershiplevelUpgradetype() {
        return membershiplevelUpgradetype;
    }

    public void setMembershiplevelUpgradetype(Integer membershiplevelUpgradetype) {
        this.membershiplevelUpgradetype = membershiplevelUpgradetype;
    }

    public Integer getMembershiplevelUpgradepayment() {
        return membershiplevelUpgradepayment;
    }

    public void setMembershiplevelUpgradepayment(Integer membershiplevelUpgradepayment) {
        this.membershiplevelUpgradepayment = membershiplevelUpgradepayment;
    }

    public Date getMembershiplevelTime() {
        return membershiplevelTime;
    }

    public void setMembershiplevelTime(Date membershiplevelTime) {
        this.membershiplevelTime = membershiplevelTime;
    }

    public Integer getMembershiplevelEffective() {
        return membershiplevelEffective;
    }

    public void setMembershiplevelEffective(Integer membershiplevelEffective) {
        this.membershiplevelEffective = membershiplevelEffective;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }
}