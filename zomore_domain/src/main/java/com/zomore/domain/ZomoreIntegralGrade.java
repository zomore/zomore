package com.zomore.domain;

public class ZomoreIntegralGrade {
    private String id;

    private String integralRuleId;

    private Integer multipleGrade;

    private String memberGrade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIntegralRuleId() {
        return integralRuleId;
    }

    public void setIntegralRuleId(String integralRuleId) {
        this.integralRuleId = integralRuleId == null ? null : integralRuleId.trim();
    }

    public Integer getMultipleGrade() {
        return multipleGrade;
    }

    public void setMultipleGrade(Integer multipleGrade) {
        this.multipleGrade = multipleGrade;
    }

    public String getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(String memberGrade) {
        this.memberGrade = memberGrade == null ? null : memberGrade.trim();
    }
}