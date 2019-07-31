package com.zomore.utils;

import java.util.ArrayList;
import java.util.List;

public class PageResult2<T>{
    //总记录数
    private long totalCount;
    //当前页 默认是第一页
    private int pageNum=1;
    //总页数
    private int totalPageCount;
    //页大小 默认是每页显示3条
    private int pageSize=3;
    //记录列表
    private List<T> items;
    //搜索条件
    private String nameLike;
    //构造分页对象
    public PageResult2(long totalCount, int pageNum, int pageSize, List<T> items) {
        this.items = items != null ? items : new ArrayList();
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        if (totalCount > 0) {
            this.pageNum = pageNum;
            //计算总页数
            int tem = (int) totalCount / pageSize;
            this.totalPageCount = (totalCount % pageSize == 0) ? tem : (tem + 1);
        } else {
            this.pageNum = 0;
            this.totalPageCount = 0;
        }
    }

    public PageResult2() {}

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
        this.items = items != null ? items : new ArrayList();
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        if (totalCount > 0) {
            this.pageNum = pageNum;
            //计算总页数
            int tem = (int) totalCount / pageSize;
            this.totalPageCount = (totalCount % pageSize == 0) ? tem : (tem + 1);
        } else {
            this.pageNum = 0;
            this.totalPageCount = 0;
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
