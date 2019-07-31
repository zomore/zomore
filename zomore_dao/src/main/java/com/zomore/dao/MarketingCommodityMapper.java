package com.zomore.dao;

import com.zomore.domain.MarketingCommodity;
import com.zomore.domain.MarketingCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingCommodityMapper {
    long countByExample(MarketingCommodityExample example);

    int deleteByExample(MarketingCommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MarketingCommodity record);

    int insertSelective(MarketingCommodity record);

    List<MarketingCommodity> selectByExample(MarketingCommodityExample example);

    MarketingCommodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MarketingCommodity record, @Param("example") MarketingCommodityExample example);

    int updateByExample(@Param("record") MarketingCommodity record, @Param("example") MarketingCommodityExample example);

    int updateByPrimaryKeySelective(MarketingCommodity record);

    int updateByPrimaryKey(MarketingCommodity record);
}