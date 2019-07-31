package com.zomore.dao;

import com.zomore.domain.ZomoreSupplier;
import com.zomore.domain.ZomoreSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreSupplierMapper {
    long countByExample(ZomoreSupplierExample example);

    int deleteByExample(ZomoreSupplierExample example);

    int deleteByPrimaryKey(String zomoreSupplierId);

    int insert(ZomoreSupplier record);

    int insertSelective(ZomoreSupplier record);

    List<ZomoreSupplier> selectByExampleWithBLOBs(ZomoreSupplierExample example);

    List<ZomoreSupplier> selectByExample(ZomoreSupplierExample example);

    ZomoreSupplier selectByPrimaryKey(String zomoreSupplierId);

    int updateByExampleSelective(@Param("record") ZomoreSupplier record, @Param("example") ZomoreSupplierExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreSupplier record, @Param("example") ZomoreSupplierExample example);

    int updateByExample(@Param("record") ZomoreSupplier record, @Param("example") ZomoreSupplierExample example);

    int updateByPrimaryKeySelective(ZomoreSupplier record);

    int updateByPrimaryKeyWithBLOBs(ZomoreSupplier record);

    int updateByPrimaryKey(ZomoreSupplier record);
}