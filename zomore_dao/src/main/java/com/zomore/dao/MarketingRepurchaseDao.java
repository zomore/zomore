package com.zomore.dao;

import com.zomore.domain.MarketingRepurchase;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface MarketingRepurchaseDao
{
  @Insert({"insert into marketing_repurchase (repurchaseId,promotionname,promotiontype,promotionscope,createtime,duetime,backnum,promotionId,shopId,multipleId) values(#{repurchaseId},#{promotionname},#{promotiontype},#{promotionscope},#{createtime},#{duetime},#{backnum},#{promotionId},#{shopId},#{multipleId})"})
  public  void save(MarketingRepurchase paramMarketingRepurchase)
    throws Exception;
  
  @Select({"select * from marketing_repurchase where promotionId = #{promotionId}"})
  public  MarketingRepurchase repurchaseUpdate(Long paramLong)
    throws Exception;
  
  @Update({"update marketing_repurchase set promotionName=#{promotionName},promotionType=#{promotionType},promotionScope=#{promotionScope},createTime=#{createTime},dueTime=#{dueTime},consumeNum=#{consumeNum},backNum=#{backNum} where promotionId = #{promotionId}"})
  public  void update1(MarketingRepurchase paramMarketingRepurchase)
    throws Exception;
  
  @Insert({"insert into marketing_repurchase (repurchaseId,shopId,promotionId,promotionName,promotionType,promotionScope,isMember,consumeNum,backNum) values (#{repurchaseId},#{shopId},#{promotionId},#{promotionName},#{promotionType},#{promotionScope},#{isMember},#{consumeNum},#{backNum})"})
  public  void saveRepurchaseByShopId(MarketingRepurchase paramMarketingRepurchase)
    throws Exception;
}
