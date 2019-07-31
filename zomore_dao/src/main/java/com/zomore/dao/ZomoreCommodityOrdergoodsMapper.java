package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityOrdergoods;
import com.zomore.domain.ZomoreCommodityOrdergoodsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public  interface ZomoreCommodityOrdergoodsMapper
{
  public  long countByExample(ZomoreCommodityOrdergoodsExample paramZomoreCommodityOrdergoodsExample);
  
  public  int deleteByExample(ZomoreCommodityOrdergoodsExample paramZomoreCommodityOrdergoodsExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreCommodityOrdergoods paramZomoreCommodityOrdergoods);
  
  public  int insertSelective(ZomoreCommodityOrdergoods paramZomoreCommodityOrdergoods);
  
  List<ZomoreCommodityOrdergoods> selectByExampleWithBLOBs(ZomoreCommodityOrdergoodsExample paramZomoreCommodityOrdergoodsExample);

  List<ZomoreCommodityOrdergoods> selectAllshopOrderGoods(Map<String,Object> map);

  public  List<ZomoreCommodityOrdergoods> selectByExample(ZomoreCommodityOrdergoodsExample paramZomoreCommodityOrdergoodsExample);
  
  public  ZomoreCommodityOrdergoods selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreCommodityOrdergoods paramZomoreCommodityOrdergoods, @Param("example") ZomoreCommodityOrdergoodsExample paramZomoreCommodityOrdergoodsExample);
  
  public  int updateByExampleWithBLOBs(@Param("record") ZomoreCommodityOrdergoods paramZomoreCommodityOrdergoods, @Param("example") ZomoreCommodityOrdergoodsExample paramZomoreCommodityOrdergoodsExample);
  
  public  int updateByExample(@Param("record") ZomoreCommodityOrdergoods paramZomoreCommodityOrdergoods, @Param("example") ZomoreCommodityOrdergoodsExample paramZomoreCommodityOrdergoodsExample);
  
  public  int updateByPrimaryKeySelective(ZomoreCommodityOrdergoods paramZomoreCommodityOrdergoods);
  
  public  int updateByPrimaryKeyWithBLOBs(ZomoreCommodityOrdergoods paramZomoreCommodityOrdergoods);
  
  public  int updateByPrimaryKey(ZomoreCommodityOrdergoods paramZomoreCommodityOrdergoods);
}

