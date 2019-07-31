package com.zomore.dao;

import com.zomore.domain.MarketingCommodityHgcx;
import com.zomore.domain.MarketingCommodityHgcxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingCommodityHgcxMapper {
    long countByExample(MarketingCommodityHgcxExample example);

    int deleteByExample(MarketingCommodityHgcxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MarketingCommodityHgcx record);

    int insertSelective(MarketingCommodityHgcx record);

    List<MarketingCommodityHgcx> selectByExample(MarketingCommodityHgcxExample example);

    MarketingCommodityHgcx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MarketingCommodityHgcx record, @Param("example") MarketingCommodityHgcxExample example);

    int updateByExample(@Param("record") MarketingCommodityHgcx record, @Param("example") MarketingCommodityHgcxExample example);

    int updateByPrimaryKeySelective(MarketingCommodityHgcx record);

    int updateByPrimaryKey(MarketingCommodityHgcx record);
}