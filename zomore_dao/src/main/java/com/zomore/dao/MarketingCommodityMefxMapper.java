package com.zomore.dao;

import com.zomore.domain.MarketingCommodityMefx;
import com.zomore.domain.MarketingCommodityMefxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingCommodityMefxMapper {
    long countByExample(MarketingCommodityMefxExample example);

    int deleteByExample(MarketingCommodityMefxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MarketingCommodityMefx record);

    int insertSelective(MarketingCommodityMefx record);

    List<MarketingCommodityMefx> selectByExample(MarketingCommodityMefxExample example);

    MarketingCommodityMefx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MarketingCommodityMefx record, @Param("example") MarketingCommodityMefxExample example);

    int updateByExample(@Param("record") MarketingCommodityMefx record, @Param("example") MarketingCommodityMefxExample example);

    int updateByPrimaryKeySelective(MarketingCommodityMefx record);

    int updateByPrimaryKey(MarketingCommodityMefx record);
}