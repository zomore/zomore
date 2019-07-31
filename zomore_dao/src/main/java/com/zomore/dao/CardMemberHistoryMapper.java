package com.zomore.dao;

import com.zomore.domain.CardMemberHistory;
import com.zomore.domain.CardMemberHistoryExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CardMemberHistoryMapper {
    Integer countByExample(CardMemberHistoryExample example);

    int deleteByExample(CardMemberHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CardMemberHistory record);

    int insertSelective(CardMemberHistory record);

    List<CardMemberHistory> selectByExampleWithBLOBs(CardMemberHistoryExample example);

    List<CardMemberHistory> selectByExample(CardMemberHistoryExample example);

    CardMemberHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CardMemberHistory record, @Param("example") CardMemberHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") CardMemberHistory record, @Param("example") CardMemberHistoryExample example);

    int updateByExample(@Param("record") CardMemberHistory record, @Param("example") CardMemberHistoryExample example);

    int updateByPrimaryKeySelective(CardMemberHistory record);

    int updateByPrimaryKeyWithBLOBs(CardMemberHistory record);

    int updateByPrimaryKey(CardMemberHistory record);

    @Select({"select member_id,member_name,cardNum,cardid,time,type,shop,guide from card_member_history where cardid=#{cardid}"})
    CardMemberHistory selectByCardid(String cardid);


}