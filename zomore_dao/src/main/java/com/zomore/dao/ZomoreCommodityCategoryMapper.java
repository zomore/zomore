package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityCategory;
import com.zomore.domain.ZomoreCommodityCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityCategoryMapper {
    long countByExample(ZomoreCommodityCategoryExample example);

    int deleteByExample(ZomoreCommodityCategoryExample example);

    int deleteByPrimaryKey(String zomoreCommodityCategoryId);

    int insert(ZomoreCommodityCategory record);

    int insertSelective(ZomoreCommodityCategory record);

    List<ZomoreCommodityCategory> selectByExample(ZomoreCommodityCategoryExample example);

    ZomoreCommodityCategory selectByPrimaryKey(String zomoreCommodityCategoryId);

    int updateByExampleSelective(@Param("record") ZomoreCommodityCategory record, @Param("example") ZomoreCommodityCategoryExample example);

    int updateByExample(@Param("record") ZomoreCommodityCategory record, @Param("example") ZomoreCommodityCategoryExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityCategory record);

    int updateByPrimaryKey(ZomoreCommodityCategory record);

    boolean deleteByshop(String shop);
}