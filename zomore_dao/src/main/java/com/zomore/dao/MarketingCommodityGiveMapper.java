package com.zomore.dao;

import com.zomore.domain.MarketingCommodityGive;
import com.zomore.domain.MarketingCommodityGiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingCommodityGiveMapper {
    long countByExample(MarketingCommodityGiveExample example);

    int deleteByExample(MarketingCommodityGiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MarketingCommodityGive record);

    int insertSelective(MarketingCommodityGive record);

    List<MarketingCommodityGive> selectByExample(MarketingCommodityGiveExample example);

    MarketingCommodityGive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MarketingCommodityGive record, @Param("example") MarketingCommodityGiveExample example);

    int updateByExample(@Param("record") MarketingCommodityGive record, @Param("example") MarketingCommodityGiveExample example);

    int updateByPrimaryKeySelective(MarketingCommodityGive record);

    int updateByPrimaryKey(MarketingCommodityGive record);
}