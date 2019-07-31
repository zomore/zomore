package com.zomore.dao;

import com.zomore.domain.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.io.File;
import java.util.Date;
import java.util.List;

public  interface HeadShopDao
{
  @Select({"select * from zomore_head where username=#{username}"})
  public  HeadShop findByUsername(String paramString)
    throws Exception;
  
  @Select({"select * from zomore_head where role=#{role}"})
  public  List<HeadShop> findByRole2(Integer paramInteger)
    throws Exception;
  
  @Select({"select * from zomore_head where role=#{role}"})
  public  List<HeadShop> findByRole3(Integer paramInteger)
    throws Exception;

  @Select({"select * from multiple where multiplename = #{multiplename}"})
  public  Multiple findMultipleByUsername(String paramString)
          throws Exception;

  @Select({"select * from zomore_head where role=#{role} and multipleId=#{Mutid}"})
  public  List<HeadShop> findByRoleAndMutId(@Param("role") Integer role,@Param("Mutid") String Mutid)
    throws Exception;
    
  @Select({"select * from zomore_head where multipleId=#{Mutid}"})
  public  List<HeadShop> findByMutId(@Param("Mutid") String Mutid)
    throws Exception;

  @Select({"select * from zomore_head where role=#{role} and multipleId=#{Mutid} and shopName like #{code}"})
  public  List<HeadShop> findByRoleAndMutIdAndCode(@Param("role") Integer role, @Param("Mutid") String Mutid, @Param("code") String code)
    throws Exception;

  @Select({"select * from zomore_head"})
  public  List<HeadShop> findAll()
    throws Exception;
  
  @Insert({"insert into zomore_head (headId,username,password,phoneNumber,mail,registrationTime,name,shopName,dueTime,industry,address,role) values(#{headId},#{username},#{password},#{phoneNumber},#{mail},#{registrationTime},#{name},#{shopName},#{dueTime},#{industry},#{address},#{role})"})
  public  void save(HeadShop paramHeadShop)
    throws Exception;
  
  @Update({"update zomore_head set username=#{username},password=#{password},phoneNumber=#{phoneNumber},mail=#{mail},registrationTime=#{registrationTime},name=#{name},shopName=#{shopName},dueTime=#{dueTime},industry=#{industry},address=#{address} where shopId = #{shopId}"})
  public  void updateShopById(HeadShop paramHeadShop)
    throws Exception;
  
  @Select({"select * from shop where shopId = #{shopId}"})
  public  Shop findShopById(Long paramLong)
    throws Exception;
  
  @Select({"select * from multiple where multipleId = #{multipleId}"})
  public  Multiple findMultipleById(Long paramLong)
    throws Exception;
  
  @Update({"update multiple set username=#{username},password=#{password},phoneNumber=#{phoneNumber},mail=#{mail},registrationTime=#{registrationTime},name=#{name},shopName=#{shopName},dueTime=#{dueTime},industry=#{industry},address=#{address},role=#{role} where multipleId = #{multipleId}"})
  public  void updateMultipleById(Multiple paramMultiple)
    throws Exception;
  
  @Update({"update shop set username=#{username},password=#{password},phoneNumber=#{phoneNumber},mail=#{mail},registrationTime=#{registrationTime},name=#{name},shopName=#{shopName},dueTime=#{dueTime},industry=#{industry},address=#{address},role=#{role} where shopId = #{shopId}"})
  public  void updateShopshopById(Shop paramShop);
  
  @Select({"select * from shop where id = #{id}"})
  public  Shop findHeadshopById(Long paramLong)
    throws Exception;

  @Select({"select * from zomore_head where headId = #{headId}"})
  public  HeadShop findHeadshopById2(Long headId)
          throws Exception;
  
  @Select({"select * from shop where multipleId = #{multipleId}"})
  public  List<Shop> findShopByMultipleId(Long paramLong)
    throws Exception;
  
  @Update({"update zomore_head set username=#{username},password=#{password},phoneNumber=#{phoneNumber},mail=#{mail},registrationTime=#{registrationTime},name=#{name},shopName=#{shopName},dueTime=#{dueTime},industry=#{industry},address=#{address} where multipleId = #{multipleId} and role = 1"})
  public  void updateHeadById(HeadShop paramHeadShop)
    throws Exception;
  
  @Select({"select * from shop where shopId = #{shopId}"})
  public  Shop findShopByShopId(Long paramLong)
    throws Exception;
  
  @Insert({"insert into file set image = #{image}"})
  public  void addUser(FileUtil paramFile);

  @Insert({"insert into file set image = #{image}"})
  public  void addUser1(File file);

  @Select({"select * from turnover where shop = #{shop}"})
  public  List<Turnover> findAllTurnOver1(@Param("shop") String shop)
          throws Exception;

  @Select({"select turnoverId as turnoverid,createTime as createtime,dueTime as duetime,cashier as cashier,totalmoney as totalmoney,cash as cash," +
          "unionpay as unionpay,storagecard as storagecard,subcard as subcard,readycash as readycash,paidamount as paidamount,shop as shop from turnover where shop = #{shop} order by createtime desc limit #{pageNum},#{pageSize} "})
  public  List<Turnover> findAllTurnOver(@Param("shop") String shop,@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize)
    throws Exception;
  @Select({"select count(*) from turnover where shop = #{shop}"})
  public  Integer countTurnOver(@Param("shop") String shop)
    throws Exception;

  @Select({"select * from zomore_commodity_sale where zomoreCommoditySaleTime between #{beforeTime} and #{nowTime} "})
  public  List<ZomoreCommoditySale> findSale(Date paramDate1, Date paramDate2)
    throws Exception;
  
  @Insert({"insert into turnover set createTime = #{createTime},dueTime=#{dueTime},cashier=#{cashier},totalmoney=#{totalmoney},cash=#{cash},unionpay=#{unionpay},storagecard=#{storagecard},subcard=#{subcard},readycash=#{readycash},paidamount=#{paidamount}"})
  public  void saveTurnOver(Turnover paramTurnover)
    throws Exception;
  
  @Select({"select * from dailyreport where shop=#{shop}  ORDER BY dueTime DESC limit #{pageNum},#{pageSize}"})
  public  List<Dailyreport> findAllDaily(@Param("shop")String shop,@Param("pageNum") Integer pageNum,@Param("pageSize")Integer pageSize)
    throws Exception;

  @Select({"select * from dailyreport"})
  public  List<Dailyreport> findAllDaily1()
          throws Exception;

  @Select({"select count(*) from dailyreport where shop=#{shop}"})
  public  Integer countDaily(@Param("shop")String shop)
    throws Exception;


  
  @Insert({"insert into dailyreport set createTime = #{createTime},dueTime=#{dueTime},cashier=#{cashier},totalmoney=#{totalmoney},cash=#{cash},unionpay=#{unionpay},storagecard=#{storagecard},subcard=#{subcard},wxpay=#{wxpay},alipay=#{alipay}"})
  public  void saveDailyReport(Dailyreport paramDailyReport)
    throws Exception;
  
  @Select({"select * from reservation where shopnum=#{shop} limit #{pageNum},#{pageSize} "})
  public  List<Reservation> findAllReservation(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize,@Param("shop") String shop)
    throws Exception;


  @Select({"select * from reservation"})
  public  List<Reservation> findAllReservation1()
          throws Exception;


  @Select({"select count(*) from reservation where shopnum=#{shop}"})
  public  Integer countReservation(String shop)
    throws Exception;
  @Select({"select * from reservation where shopnum=#{shop} and serverer like #{guide} and serverItem like #{code} limit #{pageNum},#{pageSize}"})
  public  List<Reservation> searchReservation(@Param("guide") String guide,@Param("starttime") Date starttime, @Param("endtime")Date endtime, @Param("code")String code,@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize,@Param("shop")String shop)
          throws Exception;
  @Select({"select count(*) from reservation where shopnum=#{shop} and serverer like #{guide} and serverItem like #{code}"})
  public  Integer countSearchReservation(@Param("guide") String guide,@Param("starttime") Date starttime, @Param("endtime")Date endtime, @Param("code")String code,@Param("shop")String shop)
          throws Exception;

  public void updateMultipleById2(Multiple multiple);
  public void updataHeadshopbyId2(HeadShop headShop);
  public void updataShopById2(HeadShop headShop);
  public void updataShopByMultipleId(Shop shop);

  //根据总部的id更新会员共享设置
  Integer updataHeadshopBymultipleId(HeadShop headShop);

}
