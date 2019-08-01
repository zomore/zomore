package com.zomore.domain;

import java.util.Date;

public class ZomoreRecharge {
    private String rechargeId;

    private String storeName;

    private String memberName;

    private String rechargeProject;

    private String rechargeMoney;

    private String giveProject;

    private String giveMoney;

    private String isUpgrade;

    private Integer isUserone;

    private Date createtime;

    private Date endtime;

    public String getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId == null ? null : rechargeId.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getRechargeProject() {
        return rechargeProject;
    }

    public void setRechargeProject(String rechargeProject) {
        this.rechargeProject = rechargeProject == null ? null : rechargeProject.trim();
    }

    public String getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(String rechargeMoney) {
        this.rechargeMoney = rechargeMoney == null ? null : rechargeMoney.trim();
    }

    public String getGiveProject() {
        return giveProject;
    }

    public void setGiveProject(String giveProject) {
        this.giveProject = giveProject == null ? null : giveProject.trim();
    }

    public String getGiveMoney() {
        return giveMoney;
    }

    public void setGiveMoney(String giveMoney) {
        this.giveMoney = giveMoney == null ? null : giveMoney.trim();
    }

    public String getIsUpgrade() {
        return isUpgrade;
    }

    public void setIsUpgrade(String isUpgrade) {
        this.isUpgrade = isUpgrade == null ? null : isUpgrade.trim();
    }

    public Integer getIsUserone() {
        return isUserone;
    }

    public void setIsUserone(Integer isUserone) {
        this.isUserone = isUserone;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}