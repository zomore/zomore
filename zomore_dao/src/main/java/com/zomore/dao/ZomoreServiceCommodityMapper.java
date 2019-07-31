package com.zomore.dao;

import com.zomore.domain.ZomoreServiceCommodity;
import com.zomore.domain.ZomoreServiceCommodityExample;
import java.util.List;
import java.util.Map;

import com.zomore.utils.ServiceContSale;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ZomoreServiceCommodityMapper {
    long countByExample(ZomoreServiceCommodityExample example);

    int deleteByExample(ZomoreServiceCommodityExample example);

    int deleteByPrimaryKey(String serviceCommodityId);

    int insert(ZomoreServiceCommodity record);

    int insertSelective(ZomoreServiceCommodity record);
    //根据分类查询服务商品数量
    @Select({"select COUNT(*) from zomore_service_commodity where service_commodity_shop=#{shop} and service_commodity_type=#{type}"})
    Integer selectServiceCommodityNumByType(@Param("shop") String shop,@Param("type") String type);

    List<ZomoreServiceCommodity> selectByExampleWithBLOBs(ZomoreServiceCommodityExample example);

    List<ZomoreServiceCommodity> selectByExample(ZomoreServiceCommodityExample example);

    ZomoreServiceCommodity selectByPrimaryKey(String serviceCommodityId);

    int updateByExampleSelective(@Param("record") ZomoreServiceCommodity record, @Param("example") ZomoreServiceCommodityExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreServiceCommodity record, @Param("example") ZomoreServiceCommodityExample example);

    int updateByExample(@Param("record") ZomoreServiceCommodity record, @Param("example") ZomoreServiceCommodityExample example);

    int updateByPrimaryKeySelective(ZomoreServiceCommodity record);

    int updateByPrimaryKeyWithBLOBs(ZomoreServiceCommodity record);

    int updateByPrimaryKey(ZomoreServiceCommodity record);

    List<Map<String,Object>> selectServiceContSale(@Param("shop") String shop);

    List<String> selectLaberByShopName(String shopname);

    List<ZomoreServiceCommodity> selectServiceCommodityBylist(Map<String,Object> map);
}