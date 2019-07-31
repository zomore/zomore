package com.zomore.dao;

import com.zomore.domain.ZomoreMemberPointHistory;
import com.zomore.domain.ZomoreMemberPointHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreMemberPointHistoryMapper {
    long countByExample(ZomoreMemberPointHistoryExample example);

    int deleteByExample(ZomoreMemberPointHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreMemberPointHistory record);

    int insertSelective(ZomoreMemberPointHistory record);

    List<ZomoreMemberPointHistory> selectByExampleWithBLOBs(ZomoreMemberPointHistoryExample example);

    List<ZomoreMemberPointHistory> selectByExample(ZomoreMemberPointHistoryExample example);

    ZomoreMemberPointHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreMemberPointHistory record, @Param("example") ZomoreMemberPointHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreMemberPointHistory record, @Param("example") ZomoreMemberPointHistoryExample example);

    int updateByExample(@Param("record") ZomoreMemberPointHistory record, @Param("example") ZomoreMemberPointHistoryExample example);

    int updateByPrimaryKeySelective(ZomoreMemberPointHistory record);

    int updateByPrimaryKeyWithBLOBs(ZomoreMemberPointHistory record);

    int updateByPrimaryKey(ZomoreMemberPointHistory record);
}