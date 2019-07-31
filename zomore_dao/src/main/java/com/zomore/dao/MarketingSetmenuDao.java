package com.zomore.dao;

import com.zomore.domain.MarketingSetmenu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface MarketingSetmenuDao
{
  @Insert({"insert into marketing_setmenu (setmenuId,promotionname,promotiontype,promotionscope,createtime,duetime,menudetail,promotionId,shopId,multipleId) values(#{setmenuId},#{promotionname},#{promotiontype},#{promotionscope},#{createtime},#{duetime},#{menudetail},#{promotionId},#{shopId},#{multipleId})"})
  public  void save(MarketingSetmenu paramMarketingSetmenu)
    throws Exception;
  
  @Select({"select * from marketing_setmenu where promotionId = #{promotionId}"})
  public  MarketingSetmenu setMenuUpdate(Long paramLong)
    throws Exception;
  
  @Update({"update marketing_setmenu set promotionName=#{promotionName},promotionType=#{promotionType},promotionScope=#{promotionScope},createTime=#{createTime},dueTime=#{dueTime},menuDetail=#{menuDetail} where promotionId =#{promotionId}"})
  public  void update1(MarketingSetmenu paramMarketingSetmenu)
    throws Exception;
  
  @Insert({"insert into marketing_setmenu (setmenuId,shopId,promotionId,promotionName,promotionType,promotionScope,menuDetail) values (#{setmenuId},#{shopId},#{promotionId},#{promotionName},#{promotionType},#{promotionScope},#{menuDetail})"})
  public  void saveSetmenuByShopId(MarketingSetmenu paramMarketingSetmenu)
    throws Exception;
}

