package com.zomore.dao;

import com.zomore.domain.Turnover;
import com.zomore.domain.TurnoverExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TurnoverMapper {
    long countByExample(TurnoverExample example);

    int deleteByExample(TurnoverExample example);

    int deleteByPrimaryKey(Long turnoverid);

    int insert(Turnover record);

    int insertSelective(Turnover record);

    List<Turnover> selectByExample(TurnoverExample example);

    List<Turnover>selectAllshopTurnOver(Map<String,Object> map);
    Turnover selectByPrimaryKey(Long turnoverid);

    int updateByExampleSelective(@Param("record") Turnover record, @Param("example") TurnoverExample example);

    int updateByExample(@Param("record") Turnover record, @Param("example") TurnoverExample example);

    int updateByPrimaryKeySelective(Turnover record);

    int updateByPrimaryKey(Turnover record);
}