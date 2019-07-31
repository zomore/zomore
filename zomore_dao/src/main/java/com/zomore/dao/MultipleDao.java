package com.zomore.dao;

import com.zomore.domain.HeadShop;

import java.util.List;
import java.util.Map;

public interface MultipleDao {

    //根据multipleId查询headshop表
    List<HeadShop> selectHeadshopByMultipleId(String multipleId);

    //根据账号或者名称模糊查询所有分店
   List<HeadShop> selectAllHeadshopBYNameAndNum(Map<String,Object> map);

    List<HeadShop>selectAllHeadshopBYSharedmemberId(Map<String,Object> map);

  //根据账号或者名称模糊查询直营分店
  List<HeadShop> selectAllshopBYNameAndNum(Map<String,Object> map);

  //根据会员共享分组id查询所有分店
    List<HeadShop> selectAllshopBySharedMemberId(String id);

    Integer updateHeadshopSharedMember(HeadShop headShop);


}
