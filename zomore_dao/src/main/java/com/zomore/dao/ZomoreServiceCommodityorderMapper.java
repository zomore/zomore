package com.zomore.dao;

import com.zomore.domain.ZomoreServiceCommodityorder;
import com.zomore.domain.ZomoreServiceCommodityorderExample;
import com.zomore.utils.KeyValueResult;
import com.zomore.utils.ServiceCountCommodityOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public  interface ZomoreServiceCommodityorderMapper
{
  public  long countByExample(ZomoreServiceCommodityorderExample paramZomoreServiceCommodityorderExample);
  
  public  int deleteByExample(ZomoreServiceCommodityorderExample paramZomoreServiceCommodityorderExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreServiceCommodityorder paramZomoreServiceCommodityorder);
  
  public  int insertSelective(ZomoreServiceCommodityorder paramZomoreServiceCommodityorder);
  
  public  List<ZomoreServiceCommodityorder> selectByExample(ZomoreServiceCommodityorderExample paramZomoreServiceCommodityorderExample);
  
  public  ZomoreServiceCommodityorder selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreServiceCommodityorder paramZomoreServiceCommodityorder, @Param("example") ZomoreServiceCommodityorderExample paramZomoreServiceCommodityorderExample);
  
  public  int updateByExample(@Param("record") ZomoreServiceCommodityorder paramZomoreServiceCommodityorder, @Param("example") ZomoreServiceCommodityorderExample paramZomoreServiceCommodityorderExample);
  
  public  int updateByPrimaryKeySelective(ZomoreServiceCommodityorder paramZomoreServiceCommodityorder);
  
  public  int updateByPrimaryKey(ZomoreServiceCommodityorder paramZomoreServiceCommodityorder);

  //项目销售统计接口
  public  List<ServiceCountCommodityOrder> searchCommoditySale(ServiceCountCommodityOrder serviceCountCommodityOrder);



  @Select({"select zomore_commodity_sale_type as k,SUM(zomore_commodity_sale_inmoney) as v from zomore_service_commodityorder where zomore_commodity_state=1 and zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime} ORDER BY zomore_commodity_sale_type"})
  public List<KeyValueResult> selectGroupByType(@Param("shop")String shop, @Param("startTime") Date startTime, @Param("endTime")Date endTime);

  //应收
  @Select({"select SUM(zomore_commodity_sale_money) from zomore_service_commodityorder where zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime}"})
  String countMoney(@Param("shop")String shop, @Param("startTime") Date startTime, @Param("endTime")Date endTime);
  //折扣
  @Select({"select SUM(zomore_commodity_sale_letmoney) from zomore_service_commodityorder where zomore_commodity_state=1 and zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime}"})
  String countLetmoney(@Param("shop")String shop, @Param("startTime") Date startTime, @Param("endTime")Date endTime);
//实收
  @Select({"select SUM(zomore_commodity_sale_inmoney) from zomore_service_commodityorder where zomore_commodity_state=1 and zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime}"})
  String countInmoney(@Param("shop")String shop, @Param("startTime") Date startTime, @Param("endTime")Date endTime);

}

