package com.zomore.domain;

public class ZomoreIntegralBirthday {
    private String id;

    private String integralRuleId;

    private Integer multipleBirth;

    private String memberBirth;

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

    public Integer getMultipleBirth() {
        return multipleBirth;
    }

    public void setMultipleBirth(Integer multipleBirth) {
        this.multipleBirth = multipleBirth;
    }

    public String getMemberBirth() {
        return memberBirth;
    }

    public void setMemberBirth(String memberBirth) {
        this.memberBirth = memberBirth == null ? null : memberBirth.trim();
    }
}