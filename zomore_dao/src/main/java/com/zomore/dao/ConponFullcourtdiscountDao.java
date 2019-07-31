package com.zomore.dao;

import com.zomore.domain.ConponFullcourtdiscount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface ConponFullcourtdiscountDao
{
  @Insert({"insert into conpon_fullcourtdiscount (discountId,shopId,conponName,conponScope,createTime,dueTime,discount,maxNum,conponId,conponType) values(#{discountId},#{shopId},#{conponName},#{conponScope},#{createTime},#{dueTime},#{discount},#{maxNum},#{conponId},#{conponType})"})
  public  void saveDiscountByShopId(ConponFullcourtdiscount paramConponFullcourtdiscount)
    throws Exception;
  
  @Select({"select * from conpon_fullcourtdiscount where conponId = #{conponId}"})
  public  ConponFullcourtdiscount discountUpdate(Long paramLong)
    throws Exception;
  
  @Update({"update  conpon_fullcourtdiscount  set conponName = #{conponName},conponScope=#{conponScope},createTime=#{createTime},dueTime=#{dueTime},discount=#{discount},maxNum=#{maxNum},conponType=#{conponType} where conponId = #{conponId}"})
  public  void update4(ConponFullcourtdiscount paramConponFullcourtdiscount)
    throws Exception;
}


/* Location:              C:\Users\star\Desktop\jd-gui-windows-1.4.1\jd-gui-windows-1.4.1\!\dao\ConponFullcourtdiscountDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */