package com.zomore.dao;

import com.zomore.domain.ZomoreMemberPointExchange;
import com.zomore.domain.ZomoreMemberPointExchangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreMemberPointExchangeMapper {
    long countByExample(ZomoreMemberPointExchangeExample example);

    int deleteByExample(ZomoreMemberPointExchangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreMemberPointExchange record);

    int insertSelective(ZomoreMemberPointExchange record);

    List<ZomoreMemberPointExchange> selectByExample(ZomoreMemberPointExchangeExample example);

    ZomoreMemberPointExchange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreMemberPointExchange record, @Param("example") ZomoreMemberPointExchangeExample example);

    int updateByExample(@Param("record") ZomoreMemberPointExchange record, @Param("example") ZomoreMemberPointExchangeExample example);

    int updateByPrimaryKeySelective(ZomoreMemberPointExchange record);

    int updateByPrimaryKey(ZomoreMemberPointExchange record);
}