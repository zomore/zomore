package com.zomore.service;

import com.zomore.domain.ZomoreServiceCommoditySalecommodit;

import java.util.List;

//服务类销售单据商品
public interface ZomoreServiceCommoditySalecommoditService {
    //添加销售商品记录
    boolean insert(ZomoreServiceCommoditySalecommodit zomoreCommoditySaleCommodit);
    //根据流水账号查找服务类商品销售记录
    List<ZomoreServiceCommoditySalecommodit> selectBynum(String num);

    //根据流水号删除服务类商品
    boolean deleted(String id);

    //通过流水号id查询
    List<ZomoreServiceCommoditySalecommodit> select(String id);
}
