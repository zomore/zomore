package com.zomore.dao;

import com.zomore.domain.ConponFullcourtarrival;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface ConponFullcourtarrivalDao
{
  @Insert({"insert into conpon_fullcourtarrival (arrivalId,shopId,conponName,conponScope,createTime,dueTime,arrivalNum,minNum,conponId,conponType) values(#{arrivalId},#{shopId},#{conponName},#{conponScope},#{createTime},#{dueTime},#{arrivalNum},#{minNum},#{conponId},#{conponType})"})
  public  void saveArrivalByShopId(ConponFullcourtarrival paramConponFullcourtarrival)
    throws Exception;
  
  @Select({"select * from conpon_fullcourtarrival where conponId = #{conponId}"})
  public  ConponFullcourtarrival arrivalUpdate(Long paramLong)
    throws Exception;
  
  @Update({"update  conpon_fullcourtarrival  set conponName = #{conponName},conponScope=#{conponScope},createTime=#{createTime},dueTime=#{dueTime},arrivalNum=#{arrivalNum},minNum=#{minNum},conponType=#{conponType} where conponId = #{conponId}"})
  public  void update4(ConponFullcourtarrival paramConponFullcourtarrival)
    throws Exception;
}
