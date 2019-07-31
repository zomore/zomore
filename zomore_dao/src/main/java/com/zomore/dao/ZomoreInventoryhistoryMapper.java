package com.zomore.dao;

import com.zomore.domain.ZomoreInventoryhistory;
import com.zomore.domain.ZomoreInventoryhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreInventoryhistoryMapper
{
  public  long countByExample(ZomoreInventoryhistoryExample paramZomoreInventoryhistoryExample);
  
  public  int deleteByExample(ZomoreInventoryhistoryExample paramZomoreInventoryhistoryExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreInventoryhistory paramZomoreInventoryhistory);
  
  public  int insertSelective(ZomoreInventoryhistory paramZomoreInventoryhistory);
  
  public  List<ZomoreInventoryhistory> selectByExampleWithBLOBs(ZomoreInventoryhistoryExample paramZomoreInventoryhistoryExample);
  
  public  List<ZomoreInventoryhistory> selectByExample(ZomoreInventoryhistoryExample paramZomoreInventoryhistoryExample);
  
  public  ZomoreInventoryhistory selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreInventoryhistory paramZomoreInventoryhistory, @Param("example") ZomoreInventoryhistoryExample paramZomoreInventoryhistoryExample);
  
  public  int updateByExampleWithBLOBs(@Param("record") ZomoreInventoryhistory paramZomoreInventoryhistory, @Param("example") ZomoreInventoryhistoryExample paramZomoreInventoryhistoryExample);
  
  public  int updateByExample(@Param("record") ZomoreInventoryhistory paramZomoreInventoryhistory, @Param("example") ZomoreInventoryhistoryExample paramZomoreInventoryhistoryExample);
  
  public  int updateByPrimaryKeySelective(ZomoreInventoryhistory paramZomoreInventoryhistory);
  
  public  int updateByPrimaryKeyWithBLOBs(ZomoreInventoryhistory paramZomoreInventoryhistory);
  
  public  int updateByPrimaryKey(ZomoreInventoryhistory paramZomoreInventoryhistory);
}
