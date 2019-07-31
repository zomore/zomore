package com.zomore.dao;

import com.zomore.domain.Conpon;
import java.util.List;

import com.zomore.domain.ConponPar;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface Conpon_parDao
{
  @Select({"select * from conpon_par where shopId1 =#{shopId1}"})
  public  List<Conpon> findAllConponParByShopId(Long paramLong)
    throws Exception;
  
  @Insert({"insert into conpon_par(conponid1,createshop1,conpontype1,conponnewscope1,createtime1,duetime1,status1,usesituation1,shopid1,multipleid1,conponname1,manufactured1,issued1,used1,usestores1,superposition1,money1) values(#{conponid1},#{createshop1},#{conpontype1},#{conponnewscope1},#{createtime1},#{duetime1},#{status1},#{usesituation1},#{shopid1},#{multipleid1},#{conponname1},#{manufactured1},#{issued1},#{used1},#{usestores1},#{superposition1},#{money1})"})
  public  void saveAllConpon1(ConponPar paramConponpar)
    throws Exception;
  
  @Update({"update conpon_par set conponType1 = #{conponType1},conponNewScope1=#{conponNewScope1},createTime1=#{createTime1},dueTime1=#{dueTime1},conponName1=#{conponName1} where conponId1 = #{conponId1}"})
  public  void updatePar4(ConponPar paramConponpar)
    throws Exception;
}
