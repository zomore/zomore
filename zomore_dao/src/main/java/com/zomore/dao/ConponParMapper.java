package com.zomore.dao;

import com.zomore.domain.ConponPar;
import com.zomore.domain.ConponParExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConponParMapper {
    long countByExample(ConponParExample example);

    int deleteByExample(ConponParExample example);

    int insert(ConponPar record);

    int insertSelective(ConponPar record);

    List<ConponPar> selectByExample(ConponParExample example);

    int updateByExampleSelective(@Param("record") ConponPar record, @Param("example") ConponParExample example);

    int updateByExample(@Param("record") ConponPar record, @Param("example") ConponParExample example);
}