package com.zomore.dao;

import com.zomore.domain.ZomoreIntegralDate;
import com.zomore.domain.ZomoreIntegralDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreIntegralDateMapper
{
  public  long countByExample(ZomoreIntegralDateExample paramZomoreIntegralDateExample);
  
  public  int deleteByExample(ZomoreIntegralDateExample paramZomoreIntegralDateExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreIntegralDate paramZomoreIntegralDate);
  
  public  int insertSelective(ZomoreIntegralDate paramZomoreIntegralDate);
  
  public  List<ZomoreIntegralDate> selectByExample(ZomoreIntegralDateExample paramZomoreIntegralDateExample);
  
  public  ZomoreIntegralDate selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreIntegralDate paramZomoreIntegralDate, @Param("example") ZomoreIntegralDateExample paramZomoreIntegralDateExample);
  
  public  int updateByExample(@Param("record") ZomoreIntegralDate paramZomoreIntegralDate, @Param("example") ZomoreIntegralDateExample paramZomoreIntegralDateExample);
  
  public  int updateByPrimaryKeySelective(ZomoreIntegralDate paramZomoreIntegralDate);
  
  public  int updateByPrimaryKey(ZomoreIntegralDate paramZomoreIntegralDate);
}
