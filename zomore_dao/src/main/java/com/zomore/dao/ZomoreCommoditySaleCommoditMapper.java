package com.zomore.dao;

import com.zomore.domain.ZomoreCommoditySaleCommodit;
import com.zomore.domain.ZomoreCommoditySaleCommoditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreCommoditySaleCommoditMapper
{
  public  long countByExample(ZomoreCommoditySaleCommoditExample paramZomoreCommoditySaleCommoditExample);
  
  public  int deleteByExample(ZomoreCommoditySaleCommoditExample paramZomoreCommoditySaleCommoditExample);
  
  public  int deleteByPrimaryKey(Integer paramInteger);
  
  public  int insert(ZomoreCommoditySaleCommodit paramZomoreCommoditySaleCommodit);
  
  public  int insertSelective(ZomoreCommoditySaleCommodit paramZomoreCommoditySaleCommodit);
  
  public  List<ZomoreCommoditySaleCommodit> selectByExample(ZomoreCommoditySaleCommoditExample paramZomoreCommoditySaleCommoditExample);
  
  public  ZomoreCommoditySaleCommodit selectByPrimaryKey(Integer paramInteger);
  
  public  int updateByExampleSelective(@Param("record") ZomoreCommoditySaleCommodit paramZomoreCommoditySaleCommodit, @Param("example") ZomoreCommoditySaleCommoditExample paramZomoreCommoditySaleCommoditExample);
  
  public  int updateByExample(@Param("record") ZomoreCommoditySaleCommodit paramZomoreCommoditySaleCommodit, @Param("example") ZomoreCommoditySaleCommoditExample paramZomoreCommoditySaleCommoditExample);
  
  public  int updateByPrimaryKeySelective(ZomoreCommoditySaleCommodit paramZomoreCommoditySaleCommodit);
  
  public  int updateByPrimaryKey(ZomoreCommoditySaleCommodit paramZomoreCommoditySaleCommodit);
}

