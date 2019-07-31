package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityLoss;
import com.zomore.domain.ZomoreCommodityLossExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreCommodityLossMapper
{
  public  long countByExample(ZomoreCommodityLossExample paramZomoreCommodityLossExample);
  
  public  int deleteByExample(ZomoreCommodityLossExample paramZomoreCommodityLossExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreCommodityLoss paramZomoreCommodityLoss);
  
  public  int insertSelective(ZomoreCommodityLoss paramZomoreCommodityLoss);
  
  public  List<ZomoreCommodityLoss> selectByExample(ZomoreCommodityLossExample paramZomoreCommodityLossExample);
  
  public  ZomoreCommodityLoss selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreCommodityLoss paramZomoreCommodityLoss, @Param("example") ZomoreCommodityLossExample paramZomoreCommodityLossExample);
  
  public  int updateByExample(@Param("record") ZomoreCommodityLoss paramZomoreCommodityLoss, @Param("example") ZomoreCommodityLossExample paramZomoreCommodityLossExample);
  
  public  int updateByPrimaryKeySelective(ZomoreCommodityLoss paramZomoreCommodityLoss);
  
  public  int updateByPrimaryKey(ZomoreCommodityLoss paramZomoreCommodityLoss);
}

