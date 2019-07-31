package com.zomore.dao;

import com.zomore.domain.ZomoreStocktaking;
import com.zomore.domain.ZomoreStocktakingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreStocktakingMapper
{
  public  long countByExample(ZomoreStocktakingExample paramZomoreStocktakingExample);
  
  public  int deleteByExample(ZomoreStocktakingExample paramZomoreStocktakingExample);
  
  public  int deleteByPrimaryKey(Integer paramInteger);
  
  public  int insert(ZomoreStocktaking paramZomoreStocktaking);
  
  public  int insertSelective(ZomoreStocktaking paramZomoreStocktaking);
  
  public  List<ZomoreStocktaking> selectByExample(ZomoreStocktakingExample paramZomoreStocktakingExample);
  
  public  ZomoreStocktaking selectByPrimaryKey(Integer paramInteger);
  
  public  int updateByExampleSelective(@Param("record") ZomoreStocktaking paramZomoreStocktaking, @Param("example") ZomoreStocktakingExample paramZomoreStocktakingExample);
  
  public  int updateByExample(@Param("record") ZomoreStocktaking paramZomoreStocktaking, @Param("example") ZomoreStocktakingExample paramZomoreStocktakingExample);
  
  public  int updateByPrimaryKeySelective(ZomoreStocktaking paramZomoreStocktaking);
  
  public  int updateByPrimaryKey(ZomoreStocktaking paramZomoreStocktaking);
}

