package com.zomore.dao;

import com.zomore.domain.ZomoreIntegralExchangeMoney;
import com.zomore.domain.ZomoreIntegralExchangeMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreIntegralExchangeMoneyMapper
{
  public  long countByExample(ZomoreIntegralExchangeMoneyExample paramZomoreIntegralExchangeMoneyExample);
  
  public  int deleteByExample(ZomoreIntegralExchangeMoneyExample paramZomoreIntegralExchangeMoneyExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreIntegralExchangeMoney paramZomoreIntegralExchangeMoney);
  
  public  int insertSelective(ZomoreIntegralExchangeMoney paramZomoreIntegralExchangeMoney);
  
  public  List<ZomoreIntegralExchangeMoney> selectByExample(ZomoreIntegralExchangeMoneyExample paramZomoreIntegralExchangeMoneyExample);
  
  public  ZomoreIntegralExchangeMoney selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreIntegralExchangeMoney paramZomoreIntegralExchangeMoney, @Param("example") ZomoreIntegralExchangeMoneyExample paramZomoreIntegralExchangeMoneyExample);
  
  public  int updateByExample(@Param("record") ZomoreIntegralExchangeMoney paramZomoreIntegralExchangeMoney, @Param("example") ZomoreIntegralExchangeMoneyExample paramZomoreIntegralExchangeMoneyExample);
  
  public  int updateByPrimaryKeySelective(ZomoreIntegralExchangeMoney paramZomoreIntegralExchangeMoney);
  
  public  int updateByPrimaryKey(ZomoreIntegralExchangeMoney paramZomoreIntegralExchangeMoney);
}
