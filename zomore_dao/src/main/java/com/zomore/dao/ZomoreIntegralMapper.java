package com.zomore.dao;

import com.zomore.domain.ZomoreIntegral;
import com.zomore.domain.ZomoreIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreIntegralMapper {
    long countByExample(ZomoreIntegralExample example);

    int deleteByExample(ZomoreIntegralExample example);

    int deleteByPrimaryKey(String integralRuleId);

    int insert(ZomoreIntegral record);

    int insertSelective(ZomoreIntegral record);

    List<ZomoreIntegral> selectByExample(ZomoreIntegralExample example);

    ZomoreIntegral selectByPrimaryKey(String integralRuleId);

    int updateByExampleSelective(@Param("record") ZomoreIntegral record, @Param("example") ZomoreIntegralExample example);

    int updateByExample(@Param("record") ZomoreIntegral record, @Param("example") ZomoreIntegralExample example);

    int updateByPrimaryKeySelective(ZomoreIntegral record);

    int updateByPrimaryKey(ZomoreIntegral record);
}