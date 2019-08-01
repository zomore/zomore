package com.zomore.domain;

import java.util.Date;

public class ZomoreCommodityCategory {
    private String zomoreCommodityCategoryId;//商品类目id

    private String zomoreCommodityCategoryParentid;//商品父类目id（父类目ID=0时，代表的是一级的类目）

    private String zomoreCommodityCategoryName;//商品分类名称

    private Integer zomoreCommodityCategoryPriority;//商品排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数

    private Integer zomoreCommodityIsparent;//该商品类目是否为父类目，1为true，0为false（1位一级目录，2为二级目录）

    private Date zomoreCommodityCreatetime;//创建时间

    private Date zomoreCommodityUpdatetime;//更新时间

    private String shop;//店铺名称

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

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }
}