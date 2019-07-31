package com.zomore.dao;

import com.zomore.domain.ZomoreIntegralBirthday;
import com.zomore.domain.ZomoreIntegralBirthdayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreIntegralBirthdayMapper
{
  public  long countByExample(ZomoreIntegralBirthdayExample paramZomoreIntegralBirthdayExample);
  
  public  int deleteByExample(ZomoreIntegralBirthdayExample paramZomoreIntegralBirthdayExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreIntegralBirthday paramZomoreIntegralBirthday);
  
  public  int insertSelective(ZomoreIntegralBirthday paramZomoreIntegralBirthday);
  
  public  List<ZomoreIntegralBirthday> selectByExample(ZomoreIntegralBirthdayExample paramZomoreIntegralBirthdayExample);
  
  public  ZomoreIntegralBirthday selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreIntegralBirthday paramZomoreIntegralBirthday, @Param("example") ZomoreIntegralBirthdayExample paramZomoreIntegralBirthdayExample);
  
  public  int updateByExample(@Param("record") ZomoreIntegralBirthday paramZomoreIntegralBirthday, @Param("example") ZomoreIntegralBirthdayExample paramZomoreIntegralBirthdayExample);
  
  public  int updateByPrimaryKeySelective(ZomoreIntegralBirthday paramZomoreIntegralBirthday);
  
  public  int updateByPrimaryKey(ZomoreIntegralBirthday paramZomoreIntegralBirthday);
}
