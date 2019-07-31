package com.zomore.dao;

import com.zomore.domain.ZomoreServiceCommoditySalecommodit;
import com.zomore.domain.ZomoreServiceCommoditySalecommoditExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreServiceCommoditySalecommoditMapper
{
  public  long countByExample(ZomoreServiceCommoditySalecommoditExample paramZomoreServiceCommoditySalecommoditExample);
  
  public  int deleteByExample(ZomoreServiceCommoditySalecommoditExample paramZomoreServiceCommoditySalecommoditExample);
  
  public  int deleteByPrimaryKey(Integer paramInteger);
  
  public  int insert(ZomoreServiceCommoditySalecommodit paramZomoreServiceCommoditySalecommodit);
  
  public  int insertSelective(ZomoreServiceCommoditySalecommodit paramZomoreServiceCommoditySalecommodit);
  
  public  List<ZomoreServiceCommoditySalecommodit> selectByExample(ZomoreServiceCommoditySalecommoditExample paramZomoreServiceCommoditySalecommoditExample);
  
  public  ZomoreServiceCommoditySalecommodit selectByPrimaryKey(Integer paramInteger);
  
  public  int updateByExampleSelective(@Param("record") ZomoreServiceCommoditySalecommodit paramZomoreServiceCommoditySalecommodit, @Param("example") ZomoreServiceCommoditySalecommoditExample paramZomoreServiceCommoditySalecommoditExample);
  
  public  int updateByExample(@Param("record") ZomoreServiceCommoditySalecommodit paramZomoreServiceCommoditySalecommodit, @Param("example") ZomoreServiceCommoditySalecommoditExample paramZomoreServiceCommoditySalecommoditExample);
  
  public  int updateByPrimaryKeySelective(ZomoreServiceCommoditySalecommodit paramZomoreServiceCommoditySalecommodit);
  
  public  int updateByPrimaryKey(ZomoreServiceCommoditySalecommodit paramZomoreServiceCommoditySalecommodit);
  
  public  List<Map> selectSaleChart(@Param("shop") String shop);
}

