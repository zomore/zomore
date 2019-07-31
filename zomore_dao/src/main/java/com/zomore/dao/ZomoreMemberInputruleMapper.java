package com.zomore.dao;

import com.zomore.domain.ZomoreMemberInputrule;
import com.zomore.domain.ZomoreMemberInputruleExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreMemberInputruleMapper {
    long countByExample(ZomoreMemberInputruleExample example);

    int deleteByExample(ZomoreMemberInputruleExample example);

    int deleteByPrimaryKey(String zomoreMemberInputruleId);

    int insert(ZomoreMemberInputrule record);

    int insertSelective(ZomoreMemberInputrule record);

    List<ZomoreMemberInputrule> selectByExampleWithBLOBs(ZomoreMemberInputruleExample example);

    List<ZomoreMemberInputrule> selectByExample(ZomoreMemberInputruleExample example);

    ZomoreMemberInputrule selectByPrimaryKey(String zomoreMemberInputruleId);

    int updateByExampleSelective(@Param("record") ZomoreMemberInputrule record, @Param("example") ZomoreMemberInputruleExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreMemberInputrule record, @Param("example") ZomoreMemberInputruleExample example);

    int updateByExample(@Param("record") ZomoreMemberInputrule record, @Param("example") ZomoreMemberInputruleExample example);

    int updateByPrimaryKeySelective(ZomoreMemberInputrule record);

    int updateByPrimaryKeyWithBLOBs(ZomoreMemberInputrule record);

    int updateByPrimaryKey(ZomoreMemberInputrule record);

}