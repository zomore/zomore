package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityChangeprice;
import com.zomore.domain.ZomoreCommodityChangepriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityChangepriceMapper {
    long countByExample(ZomoreCommodityChangepriceExample example);

    int deleteByExample(ZomoreCommodityChangepriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZomoreCommodityChangeprice record);

    int insertSelective(ZomoreCommodityChangeprice record);

    List<ZomoreCommodityChangeprice> selectByExampleWithBLOBs(ZomoreCommodityChangepriceExample example);

    List<ZomoreCommodityChangeprice> selectByExample(ZomoreCommodityChangepriceExample example);

    ZomoreCommodityChangeprice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZomoreCommodityChangeprice record, @Param("example") ZomoreCommodityChangepriceExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreCommodityChangeprice record, @Param("example") ZomoreCommodityChangepriceExample example);

    int updateByExample(@Param("record") ZomoreCommodityChangeprice record, @Param("example") ZomoreCommodityChangepriceExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityChangeprice record);

    int updateByPrimaryKeyWithBLOBs(ZomoreCommodityChangeprice record);

    int updateByPrimaryKey(ZomoreCommodityChangeprice record);
}