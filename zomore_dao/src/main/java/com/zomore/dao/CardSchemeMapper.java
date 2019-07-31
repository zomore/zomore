package com.zomore.dao;

import com.zomore.domain.CardScheme;
import com.zomore.domain.CardSchemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardSchemeMapper {
    long countByExample(CardSchemeExample example);

    int deleteByExample(CardSchemeExample example);

    int deleteByPrimaryKey(String schemeid);

    int insert(CardScheme record);

    int insertSelective(CardScheme record);

    List<CardScheme> selectByExample(CardSchemeExample example);

    CardScheme selectByPrimaryKey(String schemeid);

    int updateByExampleSelective(@Param("record") CardScheme record, @Param("example") CardSchemeExample example);

    int updateByExample(@Param("record") CardScheme record, @Param("example") CardSchemeExample example);

    int updateByPrimaryKeySelective(CardScheme record);

    int updateByPrimaryKey(CardScheme record);
}