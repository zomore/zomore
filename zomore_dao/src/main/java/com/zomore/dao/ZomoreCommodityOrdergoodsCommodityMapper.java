package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityOrdergoodsCommodity;
import com.zomore.domain.ZomoreCommodityOrdergoodsCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreCommodityOrdergoodsCommodityMapper
{
  public  long countByExample(ZomoreCommodityOrdergoodsCommodityExample paramZomoreCommodityOrdergoodsCommodityExample);
  
  public  int deleteByExample(ZomoreCommodityOrdergoodsCommodityExample paramZomoreCommodityOrdergoodsCommodityExample);
  
  public  int deleteByPrimaryKey(Integer paramInteger);
  
  public  int insert(ZomoreCommodityOrdergoodsCommodity paramZomoreCommodityOrdergoodsCommodity);
  
  public  int insertSelective(ZomoreCommodityOrdergoodsCommodity paramZomoreCommodityOrdergoodsCommodity);
  
  public  List<ZomoreCommodityOrdergoodsCommodity> selectByExample(ZomoreCommodityOrdergoodsCommodityExample paramZomoreCommodityOrdergoodsCommodityExample);
  
  public  ZomoreCommodityOrdergoodsCommodity selectByPrimaryKey(Integer paramInteger);
  
  public  int updateByExampleSelective(@Param("record") ZomoreCommodityOrdergoodsCommodity paramZomoreCommodityOrdergoodsCommodity, @Param("example") ZomoreCommodityOrdergoodsCommodityExample paramZomoreCommodityOrdergoodsCommodityExample);
  
  public  int updateByExample(@Param("record") ZomoreCommodityOrdergoodsCommodity paramZomoreCommodityOrdergoodsCommodity, @Param("example") ZomoreCommodityOrdergoodsCommodityExample paramZomoreCommodityOrdergoodsCommodityExample);
  
  public  int updateByPrimaryKeySelective(ZomoreCommodityOrdergoodsCommodity paramZomoreCommodityOrdergoodsCommodity);
  
  public  int updateByPrimaryKey(ZomoreCommodityOrdergoodsCommodity paramZomoreCommodityOrdergoodsCommodity);

  ZomoreCommodityOrdergoodsCommodity selectOrderGoodsCommodityById(String id);
}
