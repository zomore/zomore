package com.zomore.dao;

import com.zomore.domain.CardMemberHistoryCommodity;
import com.zomore.domain.CardMemberHistoryCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardMemberHistoryCommodityMapper {
    long countByExample(CardMemberHistoryCommodityExample example);

    int deleteByExample(CardMemberHistoryCommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CardMemberHistoryCommodity record);

    int insertSelective(CardMemberHistoryCommodity record);

    List<CardMemberHistoryCommodity> selectByExample(CardMemberHistoryCommodityExample example);

    CardMemberHistoryCommodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CardMemberHistoryCommodity record, @Param("example") CardMemberHistoryCommodityExample example);

    int updateByExample(@Param("record") CardMemberHistoryCommodity record, @Param("example") CardMemberHistoryCommodityExample example);

    int updateByPrimaryKeySelective(CardMemberHistoryCommodity record);

    int updateByPrimaryKey(CardMemberHistoryCommodity record);
}