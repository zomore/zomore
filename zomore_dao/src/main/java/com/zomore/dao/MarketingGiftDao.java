package com.zomore.dao;

import com.zomore.domain.MarketingGift;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface MarketingGiftDao
{
  @Insert({"insert into marketing_gift (giftId,promotionname,promotiontype,promotionscope,createtime,duetime,setpromotion,promotionId,shopId,multipleId) values(#{giftId},#{promotionname},#{promotiontype},#{promotionscope},#{createtime},#{duetime},#{setpromotion},#{promotionId},#{shopId},#{multipleId})"})
  public  void save(MarketingGift paramMarketingGift)
    throws Exception;
  
  @Select({"select * from marketing_gift where promotionId = #{promotionId}"})
  public  MarketingGift giftUpdate(Long paramLong);
  
  @Update({"update marketing_gift set promotionName=#{promotionName},promotionType=#{promotionType},promotionScope=#{promotionScope},createTime=#{createTime},dueTime=#{dueTime},setPromotion=#{setPromotion} where promotionId = #{promotionId}"})
  public  void update1(MarketingGift paramMarketingGift)
    throws Exception;
  
  @Insert({"insert into marketing_gift (giftId,shopId,promotionId,promotionName,promotionType,promotionScope,setPromotion) values (#{giftId},#{shopId},#{promotionId},#{promotionName},#{promotionType},#{promotionScope},#{setPromotion})"})
  public  void saveGifteByShopId(MarketingGift paramMarketingGift)
    throws Exception;
}
