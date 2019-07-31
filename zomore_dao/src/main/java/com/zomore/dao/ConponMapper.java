package com.zomore.dao;

import com.zomore.domain.Conpon;
import com.zomore.domain.ConponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConponMapper {
    long countByExample(ConponExample example);

    int deleteByExample(ConponExample example);

    int insert(Conpon record);

    int insertSelective(Conpon record);

    List<Conpon> selectByExample(ConponExample example);

    int updateByExampleSelective(@Param("record") Conpon record, @Param("example") ConponExample example);

    int updateByExample(@Param("record") Conpon record, @Param("example") ConponExample example);
}