package com.zomore.dao;

import com.zomore.domain.CardMember;
import com.zomore.domain.CardMemberExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CardMemberMapper {
    long countByExample(CardMemberExample example);

    int deleteByExample(CardMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CardMember record);

    int insertSelective(CardMember record);

    List<CardMember> selectByExampleWithBLOBs(CardMemberExample example);

    List<CardMember> selectByExample(CardMemberExample example);

    CardMember selectByPrimaryKey(Integer id);

    @Select({"select sum(num) from card_member where member_id=#{memberid}"})
    Integer selectNumByMemberid(String memberid);

    int updateByExampleSelective(@Param("record") CardMember record, @Param("example") CardMemberExample example);

    int updateByExampleWithBLOBs(@Param("record") CardMember record, @Param("example") CardMemberExample example);

    int updateByExample(@Param("record") CardMember record, @Param("example") CardMemberExample example);

    int updateByPrimaryKeySelective(CardMember record);

    int updateByPrimaryKeyWithBLOBs(CardMember record);

    int updateByPrimaryKey(CardMember record);
}