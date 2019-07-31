package com.zomore.dao;

import com.zomore.domain.MarketingGradient;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface MarketingGradientDao
{
  @Insert({"insert into marketing_gradient (gradientId,promotionname,promotiontype,promotionscope,createtime,duetime,preferentialnum,promotionId,shopId,multipleId) values(#{gradientId},#{promotionname},#{promotiontype},#{promotionscope},#{createtime},#{duetime},#{preferentialnum},#{promotionId},#{shopId},#{multipleId})"})
  public  void save(MarketingGradient paramMarketingGradient)
    throws Exception;
  
  @Select({"select * from marketing_gradient where promotionId = #{promotionId}"})
  public  MarketingGradient gradientUpdate(Long paramLong)
    throws Exception;
  
  @Update({"update marketing_gradient set promotionType =#{promotionType},promotionName=#{promotionName},promotionScope=#{promotionScope},createTime=#{createTime},dueTime=#{dueTime},preferentialNum=#{preferentialNum},preferentialDiscount=#{preferentialDiscount} where promotionId = #{promotionId}"})
  public  void update1(MarketingGradient paramMarketingGradient)
    throws Exception;
  
  @Insert({"insert into marketing_gradient (gradientId,shopId,promotionId,promotionName,promotionType,promotionScope,preferentialNum,preferentialDiscount) values (#{gradientId},#{shopId},#{promotionId},#{promotionName},#{promotionType},#{promotionScope},#{preferentialNum},#{preferentialDiscount})"})
  public  void saveGradientByShopId(MarketingGradient paramMarketingGradient)
    throws Exception;
}
