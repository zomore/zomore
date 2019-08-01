package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreMember {
    private String memberMemberid;

    private String memberNumber;

    private String memberMemberidname;

    private String memberPhonenumber;

    private String memberSex;

    private String memberGrade;

    private String memberDiscount;

    private String memberBalance;

    private Double memberMoney1;

    private Double memberMoney2;

    private Double memberIntegral;

    private Integer memberSubcard;

    private String memberCoupon;

    private String memberPassword;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date memberDateofopeningcard;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date memberDuedate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date memberBirthday;

    private String memberAddress;

    private Integer memberOncredit;

    private Long memberCreditlimit;

    private Integer memberState;

    private String memberGuide;

    private String memberEmail;

    private String memberQq;

    private String memberShop;

    private String memberShopcar;

    private String memberRecommendcode;

    private String memberInvitationcode;

    private String memberNote;

    private String memberImage;

    public String getMemberImage() {
        return memberImage;
    }

    public void setMemberImage(String memberImage) {
        this.memberImage = memberImage;
    }

    public String getMemberMemberid() {
        return memberMemberid;
    }

    public void setMemberMemberid(String memberMemberid) {
        this.memberMemberid = memberMemberid == null ? null : memberMemberid.trim();
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber == null ? null : memberNumber.trim();
    }

    public String getMemberMemberidname() {
        return memberMemberidname;
    }

    public void setMemberMemberidname(String memberMemberidname) {
        this.memberMemberidname = memberMemberidname == null ? null : memberMemberidname.trim();
    }

    public String getMemberPhonenumber() {
        return memberPhonenumber;
    }

    public void setMemberPhonenumber(String memberPhonenumber) {
        this.memberPhonenumber = memberPhonenumber == null ? null : memberPhonenumber.trim();
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex == null ? null : memberSex.trim();
    }

    public String getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(String memberGrade) {
        this.memberGrade = memberGrade == null ? null : memberGrade.trim();
    }

    public String getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(String memberDiscount) {
        this.memberDiscount = memberDiscount == null ? null : memberDiscount.trim();
    }

    public String getMemberBalance() {
        return memberBalance;
    }

    public void setMemberBalance(String memberBalance) {
        this.memberBalance = memberBalance == null ? null : memberBalance.trim();
    }

    public Double getMemberMoney1() {
        return memberMoney1;
    }

    public void setMemberMoney1(Double memberMoney1) {
        this.memberMoney1 = memberMoney1;
    }

    public Double getMemberMoney2() {
        return memberMoney2;
    }

    public void setMemberMoney2(Double memberMoney2) {
        this.memberMoney2 = memberMoney2;
    }

    public Double getMemberIntegral() {
        return memberIntegral;
    }

    public void setMemberIntegral(Double memberIntegral) {
        this.memberIntegral = memberIntegral;
    }

    public Integer getMemberSubcard() {
        return memberSubcard;
    }

    public void setMemberSubcard(Integer memberSubcard) {
        this.memberSubcard = memberSubcard;
    }

    public String getMemberCoupon() {
        return memberCoupon;
    }

    public void setMemberCoupon(String memberCoupon) {
        this.memberCoupon = memberCoupon == null ? null : memberCoupon.trim();
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }

    public Date getMemberDateofopeningcard() {
        return memberDateofopeningcard;
    }

    public void setMemberDateofopeningcard(Date memberDateofopeningcard) {
        this.memberDateofopeningcard = memberDateofopeningcard;
    }

    public Date getMemberDuedate() {
        return memberDuedate;
    }

    public void setMemberDuedate(Date memberDuedate) {
        this.memberDuedate = memberDuedate;
    }

    public Date getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(Date memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress == null ? null : memberAddress.trim();
    }

    public Integer getMemberOncredit() {
        return memberOncredit;
    }

    public void setMemberOncredit(Integer memberOncredit) {
        this.memberOncredit = memberOncredit;
    }

    public Long getMemberCreditlimit() {
        return memberCreditlimit;
    }

    public void setMemberCreditlimit(Long memberCreditlimit) {
        this.memberCreditlimit = memberCreditlimit;
    }

    public Integer getMemberState() {
        return memberState;
    }

    public void setMemberState(Integer memberState) {
        this.memberState = memberState;
    }

    public String getMemberGuide() {
        return memberGuide;
    }

    public void setMemberGuide(String memberGuide) {
        this.memberGuide = memberGuide == null ? null : memberGuide.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public String getMemberQq() {
        return memberQq;
    }

    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq == null ? null : memberQq.trim();
    }

    public String getMemberShop() {
        return memberShop;
    }

    public void setMemberShop(String memberShop) {
        this.memberShop = memberShop == null ? null : memberShop.trim();
    }

    public String getMemberShopcar() {
        return memberShopcar;
    }

    public void setMemberShopcar(String memberShopcar) {
        this.memberShopcar = memberShopcar == null ? null : memberShopcar.trim();
    }

    public String getMemberRecommendcode() {
        return memberRecommendcode;
    }

    public void setMemberRecommendcode(String memberRecommendcode) {
        this.memberRecommendcode = memberRecommendcode == null ? null : memberRecommendcode.trim();
    }

    public String getMemberInvitationcode() {
        return memberInvitationcode;
    }

    public void setMemberInvitationcode(String memberInvitationcode) {
        this.memberInvitationcode = memberInvitationcode == null ? null : memberInvitationcode.trim();
    }

    public String getMemberNote() {
        return memberNote;
    }

    public void setMemberNote(String memberNote) {
        this.memberNote = memberNote == null ? null : memberNote.trim();
    }
}