package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityChange;
import com.zomore.domain.ZomoreCommodityStore;
import com.zomore.domain.ZomoreCommodityStoreExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public  interface ZomoreCommodityStoreMapper
{
  public  long countByExample(ZomoreCommodityStoreExample paramZomoreCommodityStoreExample);
  
  public  int deleteByExample(ZomoreCommodityStoreExample paramZomoreCommodityStoreExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreCommodityStore paramZomoreCommodityStore);
  
  public  int insertSelective(ZomoreCommodityStore paramZomoreCommodityStore);
  
  public  List<ZomoreCommodityStore> selectByExample(ZomoreCommodityStoreExample paramZomoreCommodityStoreExample);
  
  public  ZomoreCommodityStore selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreCommodityStore paramZomoreCommodityStore, @Param("example") ZomoreCommodityStoreExample paramZomoreCommodityStoreExample);
  
  public  int updateByExample(@Param("record") ZomoreCommodityStore paramZomoreCommodityStore, @Param("example") ZomoreCommodityStoreExample paramZomoreCommodityStoreExample);
  
  public  int updateByPrimaryKeySelective(ZomoreCommodityStore paramZomoreCommodityStore);

          int updateStoreByCommodityId(ZomoreCommodityStore paramZomoreCommodityStore);
  
  public  int updateByPrimaryKey(ZomoreCommodityStore paramZomoreCommodityStore);
  
  public  List<ZomoreCommodityStore> selectByWarmming(@Param("shop")String shop);

  public  List<ZomoreCommodityStore> selectByWarmming1(@Param("shop")String shop,@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);

  public  Integer countWarmming1(@Param("shop")String shop);

  public  List<ZomoreCommodityStore> searchWarmming(@Param("shop")String shop,@Param("type")String type,@Param("provide")String provide,@Param("name")String name,@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);

  public  Integer countsearchWarmming(@Param("shop")String shop,@Param("type")String type,@Param("provide")String provide,@Param("name")String name);

  public  List<ZomoreCommodityStore> selectByWarmming(String commoditytype,String supplier);

  @Select({"SELECT zomore_commodity_change_type as typename,SUM(zomore_commodity_change_num) as num ,COUNT(*) as typenum FROM zomore_commodity_change WHERE zomore_commodity_shop=#{shop} and zomore_commodity_change_time BETWEEN #{startime} AND#{endtime} GROUP BY zomore_commodity_change_type"})
  public List<Map<String,Object>> selectZomoreCommodityChange(@Param("shop") String shop, @Param("startime")Date startime, @Param("endtime")Date endtime);



}
