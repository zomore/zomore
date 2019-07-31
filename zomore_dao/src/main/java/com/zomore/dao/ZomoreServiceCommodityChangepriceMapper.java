package com.zomore.dao;

import com.zomore.domain.ZomoreServiceCommodityChangeprice;
import com.zomore.domain.ZomoreServiceCommodityChangepriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreServiceCommodityChangepriceMapper {
    long countByExample(ZomoreServiceCommodityChangepriceExample example);

    int deleteByExample(ZomoreServiceCommodityChangepriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZomoreServiceCommodityChangeprice record);

    int insertSelective(ZomoreServiceCommodityChangeprice record);

    List<ZomoreServiceCommodityChangeprice> selectByExampleWithBLOBs(ZomoreServiceCommodityChangepriceExample example);

    List<ZomoreServiceCommodityChangeprice> selectByExample(ZomoreServiceCommodityChangepriceExample example);

    ZomoreServiceCommodityChangeprice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZomoreServiceCommodityChangeprice record, @Param("example") ZomoreServiceCommodityChangepriceExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreServiceCommodityChangeprice record, @Param("example") ZomoreServiceCommodityChangepriceExample example);

    int updateByExample(@Param("record") ZomoreServiceCommodityChangeprice record, @Param("example") ZomoreServiceCommodityChangepriceExample example);

    int updateByPrimaryKeySelective(ZomoreServiceCommodityChangeprice record);

    int updateByPrimaryKeyWithBLOBs(ZomoreServiceCommodityChangeprice record);

    int updateByPrimaryKey(ZomoreServiceCommodityChangeprice record);
}