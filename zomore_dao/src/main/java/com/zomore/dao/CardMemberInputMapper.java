package com.zomore.dao;

import com.zomore.domain.CardMemberInput;
import com.zomore.domain.CardMemberInputExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CardMemberInputMapper {
    Integer countByExample(CardMemberInputExample example);

    int deleteByExample(CardMemberInputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CardMemberInput record);

    int insertSelective(CardMemberInput record);

    List<CardMemberInput> selectByExampleWithBLOBs(CardMemberInputExample example);

    List<CardMemberInput> selectByExample(CardMemberInputExample example);

    CardMemberInput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CardMemberInput record, @Param("example") CardMemberInputExample example);

    int updateByExampleWithBLOBs(@Param("record") CardMemberInput record, @Param("example") CardMemberInputExample example);

    int updateByExample(@Param("record") CardMemberInput record, @Param("example") CardMemberInputExample example);

    int updateByPrimaryKeySelective(CardMemberInput record);

    int updateByPrimaryKeyWithBLOBs(CardMemberInput record);

    int updateByPrimaryKey(CardMemberInput record);
}