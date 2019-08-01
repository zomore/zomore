package com.zomore.domain;

public class ZomoreChainsetSharedMember {

    private String chainsetSharedmemberId;//会员共享设置表记录id
    private String chainsetSharedmemberName;//共享组名
    private String chainsetSharedmemberMultipleId;//总部id
    private Integer chainsetSharedmemberLevel;//组名级别（0全分店共享/不共享，1组内共享）
    private Integer chainsetSharedmemberState;//是否启用全共享/不共享，0组内共享，1全共享，2全不共享

    public Integer getChainsetSharedmemberState() {
        return chainsetSharedmemberState;
    }

    public void setChainsetSharedmemberState(Integer chainsetSharedmemberState) {
        this.chainsetSharedmemberState = chainsetSharedmemberState;
    }

    public String getChainsetSharedmemberId() {
        return chainsetSharedmemberId;
    }

    public void setChainsetSharedmemberId(String chainsetSharedmemberId) {
        this.chainsetSharedmemberId = chainsetSharedmemberId;
    }

    public String getChainsetSharedmemberName() {
        return chainsetSharedmemberName;
    }

    public void setChainsetSharedmemberName(String chainsetSharedmemberName) {
        this.chainsetSharedmemberName = chainsetSharedmemberName;
    }

    public String getChainsetSharedmemberMultipleId() {
        return chainsetSharedmemberMultipleId;
    }

    public void setChainsetSharedmemberMultipleId(String chainsetSharedmemberMultipleId) {
        this.chainsetSharedmemberMultipleId = chainsetSharedmemberMultipleId;
    }

    public Integer getChainsetSharedmemberLevel() {
        return chainsetSharedmemberLevel;
    }

    public void setChainsetSharedmemberLevel(Integer chainsetSharedmemberLevel) {
        this.chainsetSharedmemberLevel = chainsetSharedmemberLevel;
    }
}
