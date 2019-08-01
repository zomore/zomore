package com.zomore.domain;

import com.zomore.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Admin implements Serializable {
    private Long adminId;
    private String username;//账号
    private String password;//密码
    private String adminname;//管理员名字
    private String contact;//联系人
    private String phoneNumber;//手机
    private String mail;//邮箱
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;//创建时间
    private String createTimeStr;//创建时间字符串形式
    private String name;//姓名
    private Integer level;//等级 3：三星管理员 4：四星管理员 5：五星管理员
    private String address;//地址
    private String remark;//备注
    private String companyName;//公司名称
    private BigDecimal blance;//余额
    private Long byAdmin;//开通本管理员的管理员id

    public Long getByAdmin() {
        return byAdmin;
    }

    public void setByAdmin(Long byAdmin) {
        this.byAdmin = byAdmin;
    }

    public BigDecimal getBlance() { return blance; }

    public void setBlance(BigDecimal blance) { this.blance = blance; }

    public String getCompanyName() { return companyName; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getAdminname() { return adminname; }

    public void setAdminname(String adminname) { this.adminname = adminname; }

    public String getContact() { return contact; }

    public void setRemark(String remark) { this.remark = remark; }

    public String getRemark() { return remark; }

    public void setContact(String contact) { this.contact = contact; }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStr() {
        if(createTime!=null){
            createTimeStr= DateUtils.date2String(createTime,"yyyy-MM-dd");
        }
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
