package com.zomore.result;

import com.zomore.domain.CardMemberInput;
//次卡充值记录
public class CardMemberInputResult extends CardMemberInput {
    //次卡分类
    private String cardType;
    //会员号
    private String memberNum;
    //结存次数
    private String cardNum;

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }
}
