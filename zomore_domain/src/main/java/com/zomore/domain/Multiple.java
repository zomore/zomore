package com.zomore.domain;

import com.zomore.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Multiple implements Serializable {
    private Long multipleId;
    private String multiplename;//用户名
    private String password;//密码
    private String phoneNumber;//手机号
    private String mail;//邮箱
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date registrationTime;//注册时间
    private String registrationTimeStr;//注册时间字符串形式
    private String name;//姓名
    private String shopName;//店铺名称
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dueTime;//到期时间
    private String dueTimeStr;//到期时间字符串形式
    private String industry;//所属行业
    private String address;//地址
    private Integer role;//角色等级 1：连锁店 2：直营店 3：加盟店 4：单店
    private String roleStr;//角色等级字符串形式
    private Integer activeDay;//活跃天数
    private String contact;//联系人
    private String remark;//备注
    private String adminAccount;//关联的管理员(服务商)

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public void setRemark(String remark) { this.remark = remark; }

    public void setActiveDay(Integer activeDay) { this.activeDay = activeDay; }

    public String getContact() { return contact; }

    public Integer getActiveDay() { return activeDay; }

    public String getRemark() { return remark; }

    public void setContact(String contact) { this.contact = contact; }



    public Long getMultipleId() {
        return multipleId;
    }

    public void setMultipleId(Long multipleId) {
        this.multipleId = multipleId;
    }

    public String getMultiplename() { return multiplename; }

    public void setMultiplename(String multiplename) { this.multiplename = multiplename; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getRegistrationTimeStr() {
        if(registrationTime!=null){
            registrationTimeStr= DateUtils.date2String(registrationTime,"yyyy-MM-dd");
        }
        return registrationTimeStr;
    }

    public void setRegistrationTimeStr(String registrationTimeStr) {
        this.registrationTimeStr = registrationTimeStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    public String getDueTimeStr() {
        if(dueTime!=null){
            dueTimeStr= DateUtils.date2String(dueTime,"yyyy-MM-dd");
        }
        return dueTimeStr;
    }

    public void setDueTimeStr(String dueTimeStr) {
        this.dueTimeStr = dueTimeStr;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getRoleStr() {
        if (role != null) {
            // 状态 1连锁店 2直营店 3加盟店 4单店
            if(role==1)
                roleStr="连锁店";
            if(role==2)
                roleStr="直营店";
            if(role==3)
                roleStr="加盟店";
            if(role==4)
                roleStr="单店";
        }
        return roleStr;
    }

    public void setRoleStr(String roleStr) {
        this.roleStr = roleStr;
    }
}
