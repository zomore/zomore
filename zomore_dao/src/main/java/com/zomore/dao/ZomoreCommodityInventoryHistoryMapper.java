package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityInventoryHistory;
import com.zomore.domain.ZomoreCommodityInventoryHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreCommodityInventoryHistoryMapper
{
  public  long countByExample(ZomoreCommodityInventoryHistoryExample paramZomoreCommodityInventoryHistoryExample);
  
  public  int deleteByExample(ZomoreCommodityInventoryHistoryExample paramZomoreCommodityInventoryHistoryExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreCommodityInventoryHistory paramZomoreCommodityInventoryHistory);
  
  public  int insertSelective(ZomoreCommodityInventoryHistory paramZomoreCommodityInventoryHistory);
  
  public  List<ZomoreCommodityInventoryHistory> selectByExample(ZomoreCommodityInventoryHistoryExample paramZomoreCommodityInventoryHistoryExample);
  
  public  ZomoreCommodityInventoryHistory selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreCommodityInventoryHistory paramZomoreCommodityInventoryHistory, @Param("example") ZomoreCommodityInventoryHistoryExample paramZomoreCommodityInventoryHistoryExample);
  
  public  int updateByExample(@Param("record") ZomoreCommodityInventoryHistory paramZomoreCommodityInventoryHistory, @Param("example") ZomoreCommodityInventoryHistoryExample paramZomoreCommodityInventoryHistoryExample);
  
  public  int updateByPrimaryKeySelective(ZomoreCommodityInventoryHistory paramZomoreCommodityInventoryHistory);
  
  public  int updateByPrimaryKey(ZomoreCommodityInventoryHistory paramZomoreCommodityInventoryHistory);
}
