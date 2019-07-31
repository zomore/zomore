package com.zomore.dao;

import com.zomore.domain.MarketingFullreturn;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface MarketingFullreturnDao
{
  @Insert({"insert into marketing_fullreturn (fullreturnId,promotionname,promotiontype,promotionscope,createtime,duetime,consumenum,promotionId,shopId,multipleId) values(#{fullreturnId},#{promotionname},#{promotiontype},#{promotionscope},#{createtime},#{duetime},#{consumenum},#{promotionId},#{shopId},#{multipleId})"})
  public  void save(MarketingFullreturn paramMarketingFullreturn)
    throws Exception;
  
  @Select({"select * from marketing_fullreturn where promotionId = #{promotionId}"})
  public  MarketingFullreturn fullreturnUpdate(Long paramLong)
    throws Exception;
  
  @Update({"update marketing_fullreturn set promotionType=#{promotionType},promotionName=#{promotionName},promotionScope=#{promotionScope},createTime=#{createTime},dueTime=#{dueTime},consumeNum=#{consumeNum},backNum=#{backNum} where promotionId =#{promotionId}"})
  public  void update1(MarketingFullreturn paramMarketingFullreturn)
    throws Exception;
  
  @Insert({"insert into marketing_fullreturn (fullreturnId,shopId,promotionId,promotionName,promotionType,promotionScope,isMember,consumeNum,backNum) values (#{fullreturnId},#{shopId},#{promotionId},#{promotionName},#{promotionType},#{promotionScope},#{isMember},#{consumeNum},#{backNum})"})
  public  void saveFullreturnByShopId(MarketingFullreturn paramMarketingFullreturn)
    throws Exception;
}

