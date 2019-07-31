package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityChangepriceCommodity;
import com.zomore.domain.ZomoreCommodityChangepriceCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityChangepriceCommodityMapper {
    long countByExample(ZomoreCommodityChangepriceCommodityExample example);

    int deleteByExample(ZomoreCommodityChangepriceCommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreCommodityChangepriceCommodity record);

    int insertSelective(ZomoreCommodityChangepriceCommodity record);

    List<ZomoreCommodityChangepriceCommodity> selectByExample(ZomoreCommodityChangepriceCommodityExample example);

    ZomoreCommodityChangepriceCommodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreCommodityChangepriceCommodity record, @Param("example") ZomoreCommodityChangepriceCommodityExample example);

    int updateByExample(@Param("record") ZomoreCommodityChangepriceCommodity record, @Param("example") ZomoreCommodityChangepriceCommodityExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityChangepriceCommodity record);

    int updateByPrimaryKey(ZomoreCommodityChangepriceCommodity record);
}