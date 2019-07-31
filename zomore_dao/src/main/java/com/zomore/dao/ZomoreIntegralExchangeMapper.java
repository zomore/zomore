package com.zomore.dao;

import com.zomore.domain.ZomoreIntegralExchange;
import com.zomore.domain.ZomoreIntegralExchangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreIntegralExchangeMapper {
    long countByExample(ZomoreIntegralExchangeExample example);

    int deleteByExample(ZomoreIntegralExchangeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZomoreIntegralExchange record);

    int insertSelective(ZomoreIntegralExchange record);

    List<ZomoreIntegralExchange> selectByExample(ZomoreIntegralExchangeExample example);

    ZomoreIntegralExchange selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZomoreIntegralExchange record, @Param("example") ZomoreIntegralExchangeExample example);

    int updateByExample(@Param("record") ZomoreIntegralExchange record, @Param("example") ZomoreIntegralExchangeExample example);

    int updateByPrimaryKeySelective(ZomoreIntegralExchange record);

    int updateByPrimaryKey(ZomoreIntegralExchange record);
}