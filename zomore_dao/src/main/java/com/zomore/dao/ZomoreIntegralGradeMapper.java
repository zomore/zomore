package com.zomore.dao;

import com.zomore.domain.ZomoreIntegralGrade;
import com.zomore.domain.ZomoreIntegralGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreIntegralGradeMapper
{
  public  long countByExample(ZomoreIntegralGradeExample paramZomoreIntegralGradeExample);
  
  public  int deleteByExample(ZomoreIntegralGradeExample paramZomoreIntegralGradeExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreIntegralGrade paramZomoreIntegralGrade);
  
  public  int insertSelective(ZomoreIntegralGrade paramZomoreIntegralGrade);
  
  public  List<ZomoreIntegralGrade> selectByExample(ZomoreIntegralGradeExample paramZomoreIntegralGradeExample);
  
  public  ZomoreIntegralGrade selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreIntegralGrade paramZomoreIntegralGrade, @Param("example") ZomoreIntegralGradeExample paramZomoreIntegralGradeExample);
  
  public  int updateByExample(@Param("record") ZomoreIntegralGrade paramZomoreIntegralGrade, @Param("example") ZomoreIntegralGradeExample paramZomoreIntegralGradeExample);
  
  public  int updateByPrimaryKeySelective(ZomoreIntegralGrade paramZomoreIntegralGrade);
  
  public  int updateByPrimaryKey(ZomoreIntegralGrade paramZomoreIntegralGrade);
}
