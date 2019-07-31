package com.zomore.dao;

import com.zomore.domain.ZomoreShoppingGuideCustomer;
import com.zomore.domain.ZomoreShoppingGuideCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreShoppingGuideCustomerMapper {
    long countByExample(ZomoreShoppingGuideCustomerExample example);

    int deleteByExample(ZomoreShoppingGuideCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreShoppingGuideCustomer record);

    int insertSelective(ZomoreShoppingGuideCustomer record);

    List<ZomoreShoppingGuideCustomer> selectByExample(ZomoreShoppingGuideCustomerExample example);

    ZomoreShoppingGuideCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreShoppingGuideCustomer record, @Param("example") ZomoreShoppingGuideCustomerExample example);

    int updateByExample(@Param("record") ZomoreShoppingGuideCustomer record, @Param("example") ZomoreShoppingGuideCustomerExample example);

    int updateByPrimaryKeySelective(ZomoreShoppingGuideCustomer record);

    int updateByPrimaryKey(ZomoreShoppingGuideCustomer record);
}