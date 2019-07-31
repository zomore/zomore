package com.zomore.dao;

import com.zomore.domain.MarketingCommodityTc;
import com.zomore.domain.MarketingCommodityTcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingCommodityTcMapper {
    long countByExample(MarketingCommodityTcExample example);

    int deleteByExample(MarketingCommodityTcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MarketingCommodityTc record);

    int insertSelective(MarketingCommodityTc record);

    List<MarketingCommodityTc> selectByExample(MarketingCommodityTcExample example);

    MarketingCommodityTc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MarketingCommodityTc record, @Param("example") MarketingCommodityTcExample example);

    int updateByExample(@Param("record") MarketingCommodityTc record, @Param("example") MarketingCommodityTcExample example);

    int updateByPrimaryKeySelective(MarketingCommodityTc record);

    int updateByPrimaryKey(MarketingCommodityTc record);
}