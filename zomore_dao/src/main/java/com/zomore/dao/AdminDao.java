package com.zomore.dao;

import com.zomore.domain.*;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.security.core.parameters.P;

public  interface AdminDao
{
  @Select({"select * from zomore_admin where username=#{username}"})
  public  Admin findByUsername(String paramString)
    throws Exception;

/*  @Select({"select * from zomore_head"})*/
  public  List<HeadShop> findAllHead()
    throws Exception;

  public  List<HeadShop> findAllHeadByAdminAccount(@Param("adminAccount") String adminAccount)
          throws Exception;


  @Insert({"insert into zomore_head (headId,username,password,phoneNumber,mail,registrationTime,name,shopName,dueTime,industry,address,role,multipleId,shopId,activeDay,contact,remark,adminAccount) values(#{headId},#{username},#{password},#{phoneNumber},#{mail},#{registrationTime},#{name},#{shopName},#{dueTime},#{industry},#{address},#{role},#{multipleId},#{shopId},#{activeDay},#{contact},#{remark},#{adminAccount})"})
  public  void saveHead(HeadShop paramHeadShop)
    throws Exception;


  @Select({"select * from zomore_admin"})
  public List<Admin>  findAllAdmin()
  throws Exception;

  @Select({"select * from zomore_admin where byAdminId=#{byAdminId}"})
  public List<Admin> findAllAdminByadminId(@Param("byAdminId") Long byAdminId)
          throws Exception;

  @Insert({"insert into zomore_admin (adminId,username,password,adminname,contact,phoneNumber,mail,address,createTime,name,level,remark) values (#{adminId},#{username},#{password},#{adminname},#{contact},#{phoneNumber},#{mail},#{address},#{createTime},#{name},#{level},#{remark})"})
  public void saveAdmin(Admin admin)
    throws Exception;

  @Select({"select * from reporting_customer"})
  public List<ReportedCustomer > findAllReportedCustomer()
          throws Exception;

  @Insert({"insert into reporting_customer (customerId,customerName,address,officialWebsite,phoneNumber,shopNumber,productList,expectedAmount,expectedTime,followupDay,nowStage,transactionPossibility,remark) values (#{customerId},#{customerName},#{address},#{officialWebsite},#{phoneNumber},#{shopNumber},#{productList},#{expectedAmount},#{expectedTime},#{followupDay},#{nowStage},#{transactionPossibility},#{remark})"})
  public void saveReportedCustomer(ReportedCustomer reportedCustomer)
    throws Exception;

  @Select({"select * from zomore_admin where username=#{username}"})
  public Admin selectAdminByUsername(String username)
  throws Exception;

  @Select({"select * from zomore_head where adminAccount = #{adminAccount} ORDER BY registrationTime DESC LIMIT 0,5"})
  public List<HeadShop> findHeadshopForPersonalData(@Param("adminAccount") String adminAccount) throws Exception;

  @Select({"select * from zomore_head ORDER BY  registrationTime DESC LIMIT 0,5"})
  public List<HeadShop> findHeadshopForSuperAdminData() throws Exception;

  @Update({"update zomore_admin set password=#{password} where username=#{username}"})
  public void updateAdminPassword(@Param("password") String password, @Param("username") String username)
 throws Exception;

  @Insert({"insert into supplier_recharge_applicationrecord (applicationAccount,accountName,expectedAmount,accountBalance,contact,phoneNumber,address,applicationTime,remark) values(#{applicationAccount},#{accountName},#{expectedAmount},#{accountBalance},#{contact},#{phoneNumber},#{address},#{applicationTime},#{remark}) "})
  public void saveApplicationRecord(RechargeApplicationRecord RAR)
          throws  Exception;

  @Select({"select * from shop where role = #{role}"})
  public  List<Shop> findByRole(String paramString)
    throws Exception;
  
  @Select({"select * from zomore_admin where adminId=#{adminId}"})
  public  Admin findAdminById(Long paramLong)
    throws Exception;
  
  @Update({"update zomore_admin set username=#{username},password=#{password},phoneNumber=#{phoneNumber},mail=#{mail},createTime=#{createTime},name=#{name},level=#{level},address=#{address} where adminId=#{adminId}"})
  public  void updateAdminById(Admin paramAdmin)
    throws Exception;

  @Select({"select * from rolemenu where roleId=#{roleId} ORDER BY menuId ASC"})
  public  List<RoleMenu> selectMenu(@Param("roleId") Integer roleId) throws Exception;

  @Select({"select * from rolemenuitem where roleId=#{roleId}"})
  public  List<RoleMenuItem> selectMenuItem(@Param("roleId") Integer roleId) throws  Exception;

  @Select({"select * from balancechangedrecord "})
  public List<BalanceChangedRecord> findAllBalanceChangeList() throws Exception;

  @Select({"select * from balancechangedrecord where username=#{username}"})
  public List<BalanceChangedRecord> findBalanceChangeByUsername(@Param("username") String username) throws Exception;
}
