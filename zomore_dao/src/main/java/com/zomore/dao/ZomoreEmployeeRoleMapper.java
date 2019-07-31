package com.zomore.dao;

import com.zomore.domain.ZomoreEmployeeRole;
import com.zomore.domain.ZomoreEmployeeRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public  interface ZomoreEmployeeRoleMapper
{
  public  long countByExample(ZomoreEmployeeRoleExample paramZomoreEmployeeRoleExample);
  
  public  int deleteByExample(ZomoreEmployeeRoleExample paramZomoreEmployeeRoleExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreEmployeeRole paramZomoreEmployeeRole);
  
  public  int insertSelective(ZomoreEmployeeRole paramZomoreEmployeeRole);
  
  public  List<ZomoreEmployeeRole> selectByExample(ZomoreEmployeeRoleExample paramZomoreEmployeeRoleExample);
  
  public  ZomoreEmployeeRole selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreEmployeeRole paramZomoreEmployeeRole, @Param("example") ZomoreEmployeeRoleExample paramZomoreEmployeeRoleExample);
  
  public  int updateByExample(@Param("record") ZomoreEmployeeRole paramZomoreEmployeeRole, @Param("example") ZomoreEmployeeRoleExample paramZomoreEmployeeRoleExample);
  
  public  int updateByPrimaryKeySelective(ZomoreEmployeeRole paramZomoreEmployeeRole);
  
  public  int updateByPrimaryKey(ZomoreEmployeeRole paramZomoreEmployeeRole);
}
