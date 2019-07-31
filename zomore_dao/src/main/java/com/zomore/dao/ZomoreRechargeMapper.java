package com.zomore.dao;

import com.zomore.domain.ZomoreRecharge;
import com.zomore.domain.ZomoreRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreRechargeMapper
{
  public  long countByExample(ZomoreRechargeExample paramZomoreRechargeExample);
  
  public  int deleteByExample(ZomoreRechargeExample paramZomoreRechargeExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreRecharge paramZomoreRecharge);
  
  public  int insertSelective(ZomoreRecharge paramZomoreRecharge);
  
  public  List<ZomoreRecharge> selectByExample(ZomoreRechargeExample paramZomoreRechargeExample);
  
  public  ZomoreRecharge selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreRecharge paramZomoreRecharge, @Param("example") ZomoreRechargeExample paramZomoreRechargeExample);
  
  public  int updateByExample(@Param("record") ZomoreRecharge paramZomoreRecharge, @Param("example") ZomoreRechargeExample paramZomoreRechargeExample);
  
  public  int updateByPrimaryKeySelective(ZomoreRecharge paramZomoreRecharge);
  
  public  int updateByPrimaryKey(ZomoreRecharge paramZomoreRecharge);
}

