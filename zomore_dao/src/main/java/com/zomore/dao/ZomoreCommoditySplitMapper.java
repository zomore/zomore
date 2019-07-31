package com.zomore.dao;

import com.zomore.domain.ZomoreCommoditySplit;
import com.zomore.domain.ZomoreCommoditySplitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ZomoreCommoditySplitMapper {
    long countByExample(ZomoreCommoditySplitExample example);

    int deleteByExample(ZomoreCommoditySplitExample example);

    int deleteByPrimaryKey(Integer zomoreCommoditySplitId);

    int insert(ZomoreCommoditySplit record);

    int insertSelective(ZomoreCommoditySplit record);

    List<ZomoreCommoditySplit> selectByExample(ZomoreCommoditySplitExample example);

    ZomoreCommoditySplit selectByPrimaryKey(Integer zomoreCommoditySplitId);

    int updateByExampleSelective(@Param("record") ZomoreCommoditySplit record, @Param("example") ZomoreCommoditySplitExample example);

    int updateByExample(@Param("record") ZomoreCommoditySplit record, @Param("example") ZomoreCommoditySplitExample example);

    int updateByPrimaryKeySelective(ZomoreCommoditySplit record);

    int updateByPrimaryKey(ZomoreCommoditySplit record);
}