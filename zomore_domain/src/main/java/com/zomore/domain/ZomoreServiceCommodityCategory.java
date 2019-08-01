package com.zomore.domain;

import java.util.Date;

public class ZomoreServiceCommodityCategory {
    private String zomoreCommodityCategoryId;

    private String zomoreCommodityCategoryParentid;

    private String zomoreCommodityCategoryName;

    private Integer zomoreCommodityCategoryPriority;

    private Integer zomoreCommodityIsparent;

    private Date zomoreCommodityCreatetime;

    private Date zomoreCommodityUpdatetime;

    private String zomoreCommodityShop;

    public String getZomoreCommodityCategoryId() {
        return zomoreCommodityCategoryId;
    }

    public void setZomoreCommodityCategoryId(String zomoreCommodityCategoryId) {
        this.zomoreCommodityCategoryId = zomoreCommodityCategoryId == null ? null : zomoreCommodityCategoryId.trim();
    }

    public String getZomoreCommodityCategoryParentid() {
        return zomoreCommodityCategoryParentid;
    }

    public void setZomoreCommodityCategoryParentid(String zomoreCommodityCategoryParentid) {
        this.zomoreCommodityCategoryParentid = zomoreCommodityCategoryParentid == null ? null : zomoreCommodityCategoryParentid.trim();
    }

    public String getZomoreCommodityCategoryName() {
        return zomoreCommodityCategoryName;
    }

    public void setZomoreCommodityCategoryName(String zomoreCommodityCategoryName) {
        this.zomoreCommodityCategoryName = zomoreCommodityCategoryName == null ? null : zomoreCommodityCategoryName.trim();
    }

    public Integer getZomoreCommodityCategoryPriority() {
        return zomoreCommodityCategoryPriority;
    }

    public void setZomoreCommodityCategoryPriority(Integer zomoreCommodityCategoryPriority) {
        this.zomoreCommodityCategoryPriority = zomoreCommodityCategoryPriority;
    }

    public Integer getZomoreCommodityIsparent() {
        return zomoreCommodityIsparent;
    }

    public void setZomoreCommodityIsparent(Integer zomoreCommodityIsparent) {
        this.zomoreCommodityIsparent = zomoreCommodityIsparent;
    }

    public Date getZomoreCommodityCreatetime() {
        return zomoreCommodityCreatetime;
    }

    public void setZomoreCommodityCreatetime(Date zomoreCommodityCreatetime) {
        this.zomoreCommodityCreatetime = zomoreCommodityCreatetime;
    }

    public Date getZomoreCommodityUpdatetime() {
        return zomoreCommodityUpdatetime;
    }

    public void setZomoreCommodityUpdatetime(Date zomoreCommodityUpdatetime) {
        this.zomoreCommodityUpdatetime = zomoreCommodityUpdatetime;
    }

    public String getZomoreCommodityShop() {
        return zomoreCommodityShop;
    }

    public void setZomoreCommodityShop(String zomoreCommodityShop) {
        this.zomoreCommodityShop = zomoreCommodityShop == null ? null : zomoreCommodityShop.trim();
    }
}