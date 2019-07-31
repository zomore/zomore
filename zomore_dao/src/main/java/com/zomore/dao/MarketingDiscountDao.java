package com.zomore.dao;

import com.zomore.domain.MarketingDiscount;
import org.apache.ibatis.annotations.*;

public  interface MarketingDiscountDao
{
  @Insert({"insert into marketing_discount(discountId,promotionname,promotiontype,promotionscope,createtime,duetime,maxnum,multipleId,shopId,promotionid) values(#{discountId},#{promotionname},#{promotiontype},#{promotionscope},#{createtime},#{duetime},#{maxnum},#{multipleId},#{shopId},#{promotionid})"})
  public  void save(MarketingDiscount paramMarketingDiscount, Long paramLong)
    throws Exception;
  
  @Select({"select * from marketing_discount where promotionId = #{promotionId}"})
  public  MarketingDiscount discountUpdate(Long paramLong)
    throws Exception;
  @Delete({"deleted  from marketing_discount where promotionId = #{promotionId}"})
  public  void deleted(@Param("promotionId") String promotionid)
    throws Exception;

  @Update({"update marketing_discount set promotionType = #{promotionType},promotionName=#{promotionName},promotionScope=#{promotionScope},createTime=#{createTime},dueTime=#{dueTime},maxNum=#{maxNum},isMax=#{isMax} where promotionId =#{promotionId}"})
  public  void update1(MarketingDiscount paramMarketingDiscount)
    throws Exception;
  
  @Insert({"insert into marketing_discount (discountId,promotionname,promotiontype,promotionscope,createtime,duetime,maxnum,multipleId,shopId,promotionid) values (#{discountId},#{promotionname},#{promotiontype},#{promotionscope},#{createtime},#{duetime},#{maxnum},#{multipleId},#{shopId},#{promotionid})"})
  public  void saveDiscount(MarketingDiscount paramMarketingDiscount, Long paramLong)
    throws Exception;
  
  @Insert({"insert into marketing_discount (discountId,shopId,promotionId,promotionName,promotionType,promotionScope,isMember,isMax,maxNum,createTime,dueTime) values (#{discountId},#{shopId},#{promotionId},#{promotionName},#{promotionType},#{promotionScope},#{isMember},#{isMax},#{maxNum},#{createTime},#{dueTime})"})
  public  void saveDiscountByShopId(MarketingDiscount paramMarketingDiscount)
    throws Exception;
}
