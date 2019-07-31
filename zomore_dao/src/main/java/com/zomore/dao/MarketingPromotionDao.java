package com.zomore.dao;

import com.zomore.domain.MarketingPromotion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

public  interface MarketingPromotionDao
{
  @Select({"select * from marketing_promotion where shopId = #{shopId} or shopId=#{multipleId} limit #{pageNum},#{pageSize}"})
  public  List<MarketingPromotion> findAllMarketByShopId(@Param("shopId") Long paramLong, @Param("multipleId")String multipleId,@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize)
    throws Exception;
  @Select({"select count(*) from marketing_promotion where shopId = #{shopId} or shopId=#{multipleId} "})
  public  Long countMarketByShopId(@Param("shopId") Long paramLong, @Param("multipleId")String multipleId)
    throws Exception;

  @Select({"select * from marketing_promotion where shopId = #{multipleId} or multipleId=#{multipleId} limit #{pageNum},#{pageSize}"})
  public  List<MarketingPromotion> findAllMarketByShop(@Param("multipleId")String multipleId,@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize) throws Exception;

  @Select({"select count(*) from marketing_promotion where shopId = #{multipleId} or multipleId=#{multipleId}"})
  public  Long countMarketByShop(@Param("multipleId")String multipleId) throws Exception;



  @Insert({"insert into marketing_promotion(promotionName,promotionType,promotionScope,createTime,dueTime,createShop,shopId,multipleId) values(#{promotionName},#{promotionType},#{promotionScope},#{createTime},#{dueTime},#{createShop},#{shopId},#{multipleId})?shopId=#{shopId}"})
  public  void save(MarketingPromotion paramMarketingPromotion, Long paramLong)
    throws Exception;
  
  @Update({"update marketing_promotion set status = 0 where duetime < #{time}"})
  public  void refresh(Date paramDate)
    throws Exception;
  
  @Select({"select * from marketing_promotion where (promotiontype = #{promotiontype} and status = #{status}) or (promotiontype = #{promotiontype} or status = #{status})"})
  public  List<MarketingPromotion> findByPromotiongTypeAndStatus(Integer paramInteger1, Integer paramInteger2)
    throws Exception;
  
  @Update({"update marketing_promotion set promotionName=#{promotionName},promotionType=#{promotionType},promotionScope=#{promotionScope},createTime=#{createTime},dueTime=#{dueTime} where promotionId = #{promotionId}"})
  public  void update1(MarketingPromotion paramMarketingPromotion)
    throws Exception;
  
  @Insert({"insert into marketing_promotion (promotionId,promotionName,createShop,promotionType,promotionScope,createTime,dueTime,shopId) values (#{promotionId},#{promotionName},#{createShop},#{promotionType},#{promotionScope},#{createTime},#{dueTime},#{shopId})"})
  public  void saveDiscount(MarketingPromotion paramMarketingPromotion, Long paramLong)
    throws Exception;
  
  @Insert({"insert into marketing_promotion(promotionId,shopId,promotionName,createShop,promotionType,promotionScope,status,createTime,dueTime) values(#{promotionId},#{shopId},#{promotionName},#{createShop},#{promotionType},#{promotionScope},#{status},#{createTime},#{dueTime})"})
  public  void saveDiscountByShopId(MarketingPromotion paramMarketingPromotion)
    throws Exception;
  
  @Select({"select * from marketing_promotion where promotionId = #{promotionId}"})
  public  List<MarketingPromotion> findAllMarketBypromotionId()
    throws Exception;

  @Select({"select promotionId as promotionid,promotionName as promotionName,createShop as createShop,promotionType as promotionType,promotionshop as promotionshop,promotionScope as promotionScope," +
          "promotionnum as promotionnum,createTime as createtime,dueTime as duetime,status as status,shopId as shopId,multipleId as multipleId,isMember as ismember from marketing_promotion where createShop=#{createShop}"})
  List<MarketingPromotion> selectPromotionByCreateShop(String createShop);

  @Select({"select promotionId as promotionid,promotionName as promotionName,createShop as createShop,promotionType as promotiontype,promotionshop as promotionshop,promotionScope as promotionScope," +
          "promotionnum as promotionnum,createTime as createtime,dueTime as duetime,status as status,shopId as shopId,multipleId as multipleId,isMember as ismember from marketing_promotion where promotionId=#{id}"})
  MarketingPromotion selectPromotionByid(String id);


  /*@Select({"select * from marketing_promotion where shopId = #{shopId}"})
  List<MarketingPromotion> findAllMarketByShopId(@Param("shopId")Long shopId);*/
}
