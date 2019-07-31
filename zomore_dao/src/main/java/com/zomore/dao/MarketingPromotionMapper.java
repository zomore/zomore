package com.zomore.dao;

import com.zomore.domain.MarketingPromotion;
import com.zomore.domain.MarketingPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingPromotionMapper {
    long countByExample(MarketingPromotionExample example);

    int deleteByExample(MarketingPromotionExample example);

    int deleteByPrimaryKey(String promotionid);

    int insert(MarketingPromotion record);

    int insertSelective(MarketingPromotion record);

    List<MarketingPromotion> selectByExample(MarketingPromotionExample example);

    MarketingPromotion selectByPrimaryKey(String promotionid);

    int updateByExampleSelective(@Param("record") MarketingPromotion record, @Param("example") MarketingPromotionExample example);

    int updateByExample(@Param("record") MarketingPromotion record, @Param("example") MarketingPromotionExample example);

    int updateByPrimaryKeySelective(MarketingPromotion record);

    int updateByPrimaryKey(MarketingPromotion record);


}