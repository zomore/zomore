package com.zomore.dao;

import com.zomore.domain.*;

import java.util.List;

import org.apache.ibatis.annotations.*;

public  interface SuperAdminDao
{
  @Select({"select * from zomore_superadmin where username=#{username}"})
  public  SuperAdmin findByUsername(String paramString)
    throws Exception;
  
  @Insert({"insert into zomore_admin (adminId,username,password,phoneNumber,mail,createTime,name,level,address) values (#{adminId},#{username},#{password},#{phoneNumber},#{mail},#{createTime},#{name},#{level},#{address})"})
  public  void saveAdmin(Admin paramAdmin)
    throws Exception;
  
  @Select({"select * from zomore_admin"})
  public  List<Admin> findAll()
    throws Exception;
  
  @Select({"select * from zomore_admin where level = #{level}"})
  public  List<Admin> findByLevel(Integer paramInteger)
    throws Exception;
  
  @Select({"select * from multiple"})
  public  List<Multiple> findAllMultiple()
    throws Exception;

  @Select({"select * from multiple where adminAccount=#{adminAccount}"})
  public  List<Multiple> findAllMultipleByAdminAccount(@Param("adminAccount") String adminAccount)
          throws Exception;
  
  @Insert({"insert into multiple (multipleId,multiplename,password,phoneNumber,mail,registrationTime,name,shopName,dueTime,industry,address,role,contact,activeDay,adminAccount,remark) values(#{multipleId},#{multiplename},#{password},#{phoneNumber},#{mail},#{registrationTime},#{name},#{shopName},#{dueTime},#{industry},#{address},#{role},#{contact},#{activeDay},#{adminAccount},#{remark})"})
  public  void saveMultiple(Multiple paramMultiple)
    throws Exception;

  public  List<Shop> findAllShop()
    throws Exception;
  
  @Insert({"insert into shop (shopId,username,password,phoneNumber,mail,registrationTime,name,shopName,dueTime,industry,address,role,activeDay,contact,remark,adminAccount) values(#{shopId},#{username},#{password},#{phoneNumber},#{mail},#{registrationTime},#{name},#{shopName},#{dueTime},#{industry},#{address},#{role},#{activeDay},#{contact},#{remark},#{adminAccount})"})
  public  void saveSingleShop(Shop paramShop)
    throws Exception;
  
  @Select({"select * from shop where multipleId=#{multipleId}"})
  public  List<Shop> findShopByMultipleId(Long paramLong)
    throws Exception;
  
  @Insert({"insert into shop (shopId,username,password,phoneNumber,mail,registrationTime,name,shopName,dueTime,industry,address,role,multipleId,activeDay,contact,remark,adminAccount) values(#{shopId},#{username},#{password},#{phoneNumber},#{mail},#{registrationTime},#{name},#{shopName},#{dueTime},#{industry},#{address},#{role},#{multipleId},#{activeDay},#{contact},#{remark},#{adminAccount})"})
  public  void saveShopBelongMultiple(Shop paramShop) throws  Exception;
  
  @Insert({"insert into zomore_head (headId,username,password,phoneNumber,mail,registrationTime,name,shopName,dueTime,industry,address,role,multipleId,shopId,adminAccount) values(#{headId},#{username},#{password},#{phoneNumber},#{mail},#{registrationTime},#{name},#{shopName},#{dueTime},#{industry},#{address},#{role},#{multipleId},#{shopId}),#{adminAccount}"})
  public  void saveHead(HeadShop paramHeadShop)throws  Exception;

  @Select({"select * from supplier_recharge_applicationrecord"})
  public List<RechargeApplicationRecord> findAllApplicationRechargeRecord()
    throws Exception;

  @Select({"select * from supplier_recharge_applicationrecord where applicationrecordId=#{applicationrecordId}"})
  public RechargeApplicationRecord findApplicationRechargeById(@Param("applicationrecordId") Integer applicationrecordId)
    throws  Exception;

  @Delete({"delete from supplier_recharge_applicationrecord where applicationrecordId=#{applicationrecordId}"})
  public void deleteApplicationRechargeRecord(RechargeApplicationRecord rechargeApplicationRecord)
    throws Exception;

  @Select({"select * from supplier_havingrecharged ORDER BY rechargeTime DESC"})
  public List<HavingRechargedRecord> findAllHavingRechargedRecord()
    throws Exception;

  @Select({"select * from supplier_havingrecharged where rechargeAccount = #{username} ORDER BY rechargeTime DESC"})
  public List<HavingRechargedRecord> findAllAdminRechargedRecord(@Param("username") String username)
          throws Exception;

  @Update({"update zomore_admin set blance=#{blance} where username=#{username}"})
  public void rechargeToAdmin(Admin admin) throws Exception;


  @Insert({"insert into supplier_havingrecharged(rechargeAccount,accountName,rechargedAmount,accountBalance,contact,phoneNumber,address,rechargeTime,remark) values (#{rechargeAccount},#{accountName},#{rechargedAmount},#{accountBalance},#{contact},#{phoneNumber},#{address},#{rechargeTime},#{remark}) "})
   public void saveHavingRechargedRecord(HavingRechargedRecord havingRechargedRecord)throws  Exception;

  @Insert({"insert into paymentbinnding (username,shopId,shopName,headAccount,headName,storeAccount,storePassword,bindTime,remark) values(#{username},#{shopId},#{shopName},#{headAccount},#{headName},#{storeAccount},#{storePassword},#{bindTime},#{remark})"})
  public void savePaymentBinding(PaymentBinding paymentBinding) throws  Exception;

  @Select({"select * from paymentbinding"})
  public List<PaymentBinding> findAllPaymentBinding()throws Exception;

  @Select({"select * from paymentbinding where paymentBindingId=#{paymentBindingId}"})
  public PaymentBinding findPaymentBindingById(PaymentBinding paymentBinding)
    throws  Exception;

  @Update({"update paymentbinding set username=#{username},shopName=#{shopName},headAccount=#{headAccount},headName=#{headName},storeAccount=#{storeAccount},storePassword=#{storePassword},remark=#{remark} where paymentBindingId=#{paymentBindingId}"})
  public void updatePaymentBinding(PaymentBinding paymentBinding)throws Exception;

  public int saveCommdityByExcel(CommodityDatabase CommodityDatabase) throws Exception;

  @Select({"select commodity_code from commoditydatabase"})
  public List<String> findAllCommodityDatabaseCode() throws  Exception;

  @Select({"select * from commoditydatabase"})
  List<CommodityDatabase>selectAllCommodity() throws Exception;

  public int updataCommodityByExcel(CommodityDatabase CommodityDatabase) throws  Exception;

}
