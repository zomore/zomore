package com.zomore.dao;

import com.zomore.domain.CardClassification;
import com.zomore.domain.CardClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardClassificationMapper {
    long countByExample(CardClassificationExample example);

    int deleteByExample(CardClassificationExample example);

    int deleteByPrimaryKey(Long classificationid);

    int insert(CardClassification record);

    int insertSelective(CardClassification record);

    List<CardClassification> selectByExample(CardClassificationExample example);

    CardClassification selectByPrimaryKey(Long classificationid);

    int updateByExampleSelective(@Param("record") CardClassification record, @Param("example") CardClassificationExample example);

    int updateByExample(@Param("record") CardClassification record, @Param("example") CardClassificationExample example);

    int updateByPrimaryKeySelective(CardClassification record);

    int updateByPrimaryKey(CardClassification record);
}