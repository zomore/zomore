package com.zomore.dao;

import com.zomore.domain.ZomoreCommoditySaleTh;
import com.zomore.domain.ZomoreCommoditySaleThExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface ZomoreCommoditySaleThMapper {
    long countByExample(ZomoreCommoditySaleThExample example);

    int deleteByExample(ZomoreCommoditySaleThExample example);

    int deleteByPrimaryKey(Integer zomoreCommoditySaleCommoditId);

    int insert(ZomoreCommoditySaleTh record);

    int insertSelective(ZomoreCommoditySaleTh record);

    List<ZomoreCommoditySaleTh> selectByExample(ZomoreCommoditySaleThExample example);

    ZomoreCommoditySaleTh selectByPrimaryKey(Integer zomoreCommoditySaleCommoditId);

    int updateByExampleSelective(@Param("record") ZomoreCommoditySaleTh record, @Param("example") ZomoreCommoditySaleThExample example);

    int updateByExample(@Param("record") ZomoreCommoditySaleTh record, @Param("example") ZomoreCommoditySaleThExample example);

    int updateByPrimaryKeySelective(ZomoreCommoditySaleTh record);

    int updateByPrimaryKey(ZomoreCommoditySaleTh record);

    @Select({"select * from zomore_commodity_sale_th where zomore_commodity_shop=#{shop} and time BETWEEN #{startTime} and #{endTime}"})
    List<ZomoreCommoditySaleTh> selectByTimePeriod(@Param("shop")String shop, @Param("startTime")Date startTime, @Param("endTime")Date endTime);
}