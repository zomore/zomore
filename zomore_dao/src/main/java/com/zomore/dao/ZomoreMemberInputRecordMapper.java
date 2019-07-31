package com.zomore.dao;

import com.zomore.domain.ZomoreMemberInputRecord;
import com.zomore.domain.ZomoreMemberInputRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZomoreMemberInputRecordMapper {
    String countByExample(ZomoreMemberInputRecordExample example);

    int deleteByExample(ZomoreMemberInputRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreMemberInputRecord record);

    int insertSelective(ZomoreMemberInputRecord record);

    List<ZomoreMemberInputRecord> selectByExample(ZomoreMemberInputRecordExample example);
    //标记
    List<ZomoreMemberInputRecord> selectByExampleOther(ZomoreMemberInputRecordExample example);

    List<ZomoreMemberInputRecord> selectByCreateTimeDesc(ZomoreMemberInputRecordExample example);

    ZomoreMemberInputRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreMemberInputRecord record, @Param("example") ZomoreMemberInputRecordExample example);

    int updateByExample(@Param("record") ZomoreMemberInputRecord record, @Param("example") ZomoreMemberInputRecordExample example);

    int updateByPrimaryKeySelective(ZomoreMemberInputRecord record);

//    int updateByPrimaryKey(ZomoreMemberInputRecord record);
//    @Select({"SELECT LAST_INSERT_ID()"})
//    Integer selectLastInsertId();
}