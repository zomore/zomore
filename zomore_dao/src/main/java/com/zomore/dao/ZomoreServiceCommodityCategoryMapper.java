package com.zomore.dao;

import com.zomore.domain.ZomoreServiceCommodityCategory;
import com.zomore.domain.ZomoreServiceCommodityCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ZomoreServiceCommodityCategoryMapper {
    long countByExample(ZomoreServiceCommodityCategoryExample example);

    int deleteByExample(ZomoreServiceCommodityCategoryExample example);

    int deleteByPrimaryKey(String zomoreCommodityCategoryId);

    int insert(ZomoreServiceCommodityCategory record);

    int insertSelective(ZomoreServiceCommodityCategory record);
    @Select({"select zomore_commodity_category_name from  zomore_service_commodity_category where zomore_commodity_category_id=#{id}"})
    String selectTypeNameById(String id);
    List<ZomoreServiceCommodityCategory> selectByExample(ZomoreServiceCommodityCategoryExample example);

    ZomoreServiceCommodityCategory selectByPrimaryKey(String zomoreCommodityCategoryId);

    int updateByExampleSelective(@Param("record") ZomoreServiceCommodityCategory record, @Param("example") ZomoreServiceCommodityCategoryExample example);

    int updateByExample(@Param("record") ZomoreServiceCommodityCategory record, @Param("example") ZomoreServiceCommodityCategoryExample example);

    int updateByPrimaryKeySelective(ZomoreServiceCommodityCategory record);

    int updateByPrimaryKey(ZomoreServiceCommodityCategory record);
}