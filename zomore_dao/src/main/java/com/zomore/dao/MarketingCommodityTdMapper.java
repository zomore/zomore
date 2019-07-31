package com.zomore.dao;

import com.zomore.domain.MarketingCommodityTd;
import com.zomore.domain.MarketingCommodityTdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingCommodityTdMapper {
    long countByExample(MarketingCommodityTdExample example);

    int deleteByExample(MarketingCommodityTdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MarketingCommodityTd record);

    int insertSelective(MarketingCommodityTd record);

    List<MarketingCommodityTd> selectByExample(MarketingCommodityTdExample example);

    MarketingCommodityTd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MarketingCommodityTd record, @Param("example") MarketingCommodityTdExample example);

    int updateByExample(@Param("record") MarketingCommodityTd record, @Param("example") MarketingCommodityTdExample example);

    int updateByPrimaryKeySelective(MarketingCommodityTd record);

    int updateByPrimaryKey(MarketingCommodityTd record);
}