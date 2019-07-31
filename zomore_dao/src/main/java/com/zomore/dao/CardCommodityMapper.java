package com.zomore.dao;

import com.zomore.domain.CardCommodity;
import com.zomore.domain.CardCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardCommodityMapper {
    long countByExample(CardCommodityExample example);

    int deleteByExample(CardCommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CardCommodity record);

    int insertSelective(CardCommodity record);

    List<CardCommodity> selectByExample(CardCommodityExample example);

    CardCommodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CardCommodity record, @Param("example") CardCommodityExample example);

    int updateByExample(@Param("record") CardCommodity record, @Param("example") CardCommodityExample example);

    int updateByPrimaryKeySelective(CardCommodity record);

    int updateByPrimaryKey(CardCommodity record);
}