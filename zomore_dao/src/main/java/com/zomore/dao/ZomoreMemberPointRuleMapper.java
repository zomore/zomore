package com.zomore.dao;

import com.zomore.domain.ZomoreMemberPointRule;
import com.zomore.domain.ZomoreMemberPointRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreMemberPointRuleMapper {
    long countByExample(ZomoreMemberPointRuleExample example);

    int deleteByExample(ZomoreMemberPointRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreMemberPointRule record);

    int insertSelective(ZomoreMemberPointRule record);

    List<ZomoreMemberPointRule> selectByExample(ZomoreMemberPointRuleExample example);

    ZomoreMemberPointRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreMemberPointRule record, @Param("example") ZomoreMemberPointRuleExample example);

    int updateByExample(@Param("record") ZomoreMemberPointRule record, @Param("example") ZomoreMemberPointRuleExample example);

    int updateByPrimaryKeySelective(ZomoreMemberPointRule record);

    int updateByPrimaryKey(ZomoreMemberPointRule record);
}