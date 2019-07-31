package com.zomore.dao;

import com.zomore.domain.ZomoreCashier;
import com.zomore.domain.ZomoreCashierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCashierMapper {
    long countByExample(ZomoreCashierExample example);

    int deleteByExample(ZomoreCashierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreCashier record);

    int insertSelective(ZomoreCashier record);

    List<ZomoreCashier> selectByExample(ZomoreCashierExample example);

    ZomoreCashier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreCashier record, @Param("example") ZomoreCashierExample example);

    int updateByExample(@Param("record") ZomoreCashier record, @Param("example") ZomoreCashierExample example);

    int updateByPrimaryKeySelective(ZomoreCashier record);

    int updateByPrimaryKey(ZomoreCashier record);
}