package com.zomore.dao;

import com.zomore.domain.MarketingCommodityTwo;
import com.zomore.domain.MarketingCommodityTwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingCommodityTwoMapper {
    long countByExample(MarketingCommodityTwoExample example);

    int deleteByExample(MarketingCommodityTwoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MarketingCommodityTwo record);

    int insertSelective(MarketingCommodityTwo record);

    List<MarketingCommodityTwo> selectByExample(MarketingCommodityTwoExample example);

    MarketingCommodityTwo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MarketingCommodityTwo record, @Param("example") MarketingCommodityTwoExample example);

    int updateByExample(@Param("record") MarketingCommodityTwo record, @Param("example") MarketingCommodityTwoExample example);

    int updateByPrimaryKeySelective(MarketingCommodityTwo record);

    int updateByPrimaryKey(MarketingCommodityTwo record);
}