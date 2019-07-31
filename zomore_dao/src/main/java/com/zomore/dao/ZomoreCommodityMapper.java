package com.zomore.dao;

import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommodityExample;
import java.util.List;
import java.util.Map;

import com.zomore.utils.PageUtils;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ZomoreCommodityMapper {
    long countByExample(ZomoreCommodityExample example);

    int deleteByExample(ZomoreCommodityExample example);

    int deleteByPrimaryKey(String zomoreCommodityId);

    @Delete({"delete from zomore_commodity where zomore_commodity_name=#{name}"})
    int deleteByName(String name);

    int insert(ZomoreCommodity record);

    int insertSelective(ZomoreCommodity record);

    List<ZomoreCommodity> selectByExampleWithBLOBs(ZomoreCommodityExample example);

    List<ZomoreCommodity> selectByExample(ZomoreCommodityExample example);

    ZomoreCommodity selectByPrimaryKey(String zomoreCommodityId);

    int updateByExampleSelective(@Param("record") ZomoreCommodity record, @Param("example") ZomoreCommodityExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreCommodity record, @Param("example") ZomoreCommodityExample example);

    int updateByExample(@Param("record") ZomoreCommodity record, @Param("example") ZomoreCommodityExample example);

    int updateByPrimaryKeySelective(ZomoreCommodity record);

    int updateByPrimaryKeyWithBLOBs(ZomoreCommodity record);

    int updateByPrimaryKey(ZomoreCommodity record);
@Select({"SELECT zomore_commodity_laber1 FROM zomore_commodity WHERE zomore_commodity_shop=#{shop} AND zomore_commodity_laber1 !='' GROUP BY zomore_commodity_laber1;"})
    List<String> slectAllTable(@Param("shop")String shop);

    List<ZomoreCommodity> selectAllCommodityByShop(PageUtils pageUtils);
    //根据分类查询商品数量
    @Select({"select count(*) from zomore_commodity where zomore_commodity_shop=#{shop} and zomore_commodity_type=#{type}"})
    Integer selectNumByCommodityType(@Param("shop") String shop,@Param("type") String type);

    //根据品牌查询商品数量
    @Select({"select count(*) from zomore_commodity where zomore_commodity_shop=#{shop} and zomore_commodity_brand=#{band}"})
    Integer selectCommodityNumByBand(@Param("shop") String shop,@Param("band") String band);

    ZomoreCommodity selectCommodityDetails(@Param("shop") String shop,@Param("commodityCode")String commodityCode);

    List<String> selectOnlyLable(String shopname);

    List<ZomoreCommodity> selectCommodityByList(Map<String,Object> map);
}