package com.zomore.dao;

import com.zomore.domain.MarketingSeconddiscount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface MarketingSeconddiscountDao
{
  @Insert({"insert into marketing_seconddiscount (seconddiscountId,promotionname,promotiontype,promotionscope,createtime,duetime,goodsselect,seconddiscount,promotionId,shopId,multipleId) values(#{seconddiscountId},#{promotionname},#{promotiontype},#{promotionscope},#{createtime},#{duetime},#{goodsselect},#{seconddiscount},#{promotionId},#{shopId},#{multipleId})"})
  public  void save(MarketingSeconddiscount paramMarketingSeconddiscount)
    throws Exception;
  
  @Select({"select * from marketing_seconddiscount where promotionId = #{promotionId}"})
  public  MarketingSeconddiscount secondDiscountUpdate(Long paramLong)
    throws Exception;
  
  @Update({"update marketing_seconddiscount set promotionName=#{promotionName},promotionType=#{promotionType},promotionScope=#{promotionScope},createTime=#{createTime},dueTime=#{dueTime},goodsSelect=#{goodsSelect},goodsSelect=#{goodsSelect},secondDiscount=#{secondDiscount} where promotionId = #{promotionId}"})
  public  void update1(MarketingSeconddiscount paramMarketingSeconddiscount)
    throws Exception;
  
  @Insert({"insert into marketing_seconddiscount (seconddiscountId,shopId,promotionId,promotionName,promotionType,promotionScope,goodsSelect,secondDiscount) values (#{seconddiscountId},#{shopId},#{promotionId},#{promotionName},#{promotionType},#{promotionScope},#{goodsSelect},#{secondDiscount})"})
  public  void saveSeconddiscountByShopId(MarketingSeconddiscount paramMarketingSeconddiscount)
    throws Exception;
}
