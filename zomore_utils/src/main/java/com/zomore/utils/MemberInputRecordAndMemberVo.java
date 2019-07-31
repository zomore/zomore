package com.zomore.utils;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MemberInputRecordAndMemberVo {

    private String memberNum;

    private String memberName;

    private Double inputMoney;

    private Double giveMoney;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    private String memberGuide;

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setInputMoney(Double inputMoney) {
        this.inputMoney = inputMoney;
    }

    public Double getInputMoney() {
        return inputMoney;
    }

    public Double getGiveMoney() {
        return giveMoney;
    }

    public void setGiveMoney(Double giveMoney) {
        this.giveMoney = giveMoney;
    }

    public String getMemberGuide() {
        return memberGuide;
    }

    public void setMemberGuide(String memberGuide) {
        this.memberGuide = memberGuide;
    }
}
