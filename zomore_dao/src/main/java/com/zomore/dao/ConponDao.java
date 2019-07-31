package com.zomore.dao;

import com.zomore.domain.Conpon;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface ConponDao
{
  @Select({"select * from conpon where shopId =#{shopId}"})
  public  List<Conpon> findAllConponByShopId(Long paramLong)
    throws Exception;
  
  /* @Insert({"insert into conpon(conponId,createShop,conponType,conponScope,createTime,dueTime,status,shopId,conponName) values(#{conponId},#{createShop},#{conponType},#{conponScope},#{createTime},#{dueTime},#{status},#{shopId},#{conponName})"})
  public  void saveDiscountByShopId(Conpon paramConpon)
    throws Exception;
  
  @Update({"update conpon set conponType = #{conponType},conponScope=#{conponScope},createTime=#{createTime},dueTime=#{dueTime},conponName=#{conponName} where conponId = #{conponId}"})
  public  void update4(Conpon paramConpon)
    throws Exception; */

    @Insert({"insert into conpon(conponId,createShop,conponType,conponNewScope,createtime,duetime,status,useSituation,shopId,multipleId,conponName,manufactured,issued,used,useStores,superposition,money) values(#{conponId},#{createShop},#{conponType},#{conponNewScope},#{createTime},#{duetime},#{status},#{useSituation},#{shopId},#{multipleId},#{conponName},#{manufactured},#{issued},#{used},#{useStores},#{superposition},#{money})"})
    public  void saveDiscountByShopId(Conpon paramConpon)
    throws Exception;
  
    @Update({"update conpon set conponType = #{conponType},conponNewScope=#{conponNewScope},createTime=#{createTime},dueTime=#{dueTime},conponName=#{conponName} where conponId = #{conponId}"})
    public  void update4(Conpon paramConpon)
    throws Exception;
}
