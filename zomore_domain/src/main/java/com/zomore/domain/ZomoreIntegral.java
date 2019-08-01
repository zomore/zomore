package com.zomore.domain;

public class ZomoreIntegral {
    private String integralRuleId;//积分规则id，主键

    private Integer integralRuleType;//积分方式（1按金额积分，2按商品积分，3 积点方式）

    private String integralRuleTypeRule;//积分方式的规则（多少钱积1分，积分是否取整默认1，无码商品是否积分）

    private String integralRuleCycle;

    private String integralRuleExchange;//兑换方式(1兑换礼品,2抵扣现金,3无)

    private Integer integralRuleIsempty;//是否清空积分(0否，1是)--在每年的1月1号凌晨，重置会员的积分为0

    private String integralRuleShop;//使用门店

    public String getIntegralRuleId() {
        return integralRuleId;
    }

    public void setIntegralRuleId(String integralRuleId) {
        this.integralRuleId = integralRuleId == null ? null : integralRuleId.trim();
    }

    public Integer getIntegralRuleType() {
        return integralRuleType;
    }

    public void setIntegralRuleType(Integer integralRuleType) {
        this.integralRuleType = integralRuleType;
    }

    public String getIntegralRuleTypeRule() {
        return integralRuleTypeRule;
    }

    public void setIntegralRuleTypeRule(String integralRuleTypeRule) {
        this.integralRuleTypeRule = integralRuleTypeRule == null ? null : integralRuleTypeRule.trim();
    }

    public String getIntegralRuleCycle() {
        return integralRuleCycle;
    }

    public void setIntegralRuleCycle(String integralRuleCycle) {
        this.integralRuleCycle = integralRuleCycle == null ? null : integralRuleCycle.trim();
    }

    public String getIntegralRuleExchange() {
        return integralRuleExchange;
    }

    public void setIntegralRuleExchange(String integralRuleExchange) {
        this.integralRuleExchange = integralRuleExchange == null ? null : integralRuleExchange.trim();
    }

    public Integer getIntegralRuleIsempty() {
        return integralRuleIsempty;
    }

    public void setIntegralRuleIsempty(Integer integralRuleIsempty) {
        this.integralRuleIsempty = integralRuleIsempty;
    }

    public String getIntegralRuleShop() {
        return integralRuleShop;
    }

    public void setIntegralRuleShop(String integralRuleShop) {
        this.integralRuleShop = integralRuleShop == null ? null : integralRuleShop.trim();
    }
}