package com.zomore.dao;

import com.zomore.domain.ZomoreCustomer;
import com.zomore.domain.ZomoreCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCustomerMapper {
    long countByExample(ZomoreCustomerExample example);

    int deleteByExample(ZomoreCustomerExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZomoreCustomer record);

    int insertSelective(ZomoreCustomer record);

    List<ZomoreCustomer> selectByExampleWithBLOBs(ZomoreCustomerExample example);

    List<ZomoreCustomer> selectByExample(ZomoreCustomerExample example);

    ZomoreCustomer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZomoreCustomer record, @Param("example") ZomoreCustomerExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreCustomer record, @Param("example") ZomoreCustomerExample example);

    int updateByExample(@Param("record") ZomoreCustomer record, @Param("example") ZomoreCustomerExample example);

    int updateByPrimaryKeySelective(ZomoreCustomer record);

    int updateByPrimaryKeyWithBLOBs(ZomoreCustomer record);

    int updateByPrimaryKey(ZomoreCustomer record);
}