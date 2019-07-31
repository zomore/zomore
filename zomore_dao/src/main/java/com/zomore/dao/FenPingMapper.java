package com.zomore.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FenPingMapper {

     void InsertToTable(@Param("name") String name,@Param("num") String num,@Param("money") String money,@Param("code") String code,
                       @Param("shopName") String shopName,@Param("cashierNumber") String cashierNumber);

    void fenpingUpdate(@Param("name") String name,@Param("num") String num,@Param("money") String money,@Param("code") String code,
                       @Param("shopName") String shopName,@Param("cashierNumber") String cashierNumber);

     void fenpingOnlyForMoney(@Param("zhekou") String zhekou,@Param("shopName") String shopName,@Param("cashierNumber") String cashierNumber);

     void fenpingMoneyAndNum(@Param("money")String money,@Param("num")String num,@Param("code")String code,@Param("shopName") String shopName,@Param("cashierNumber") String cashierNumber);

     void fenpingDelAll(@Param("shopName") String shopName,@Param("cashierNumber") String cashierNumber);

     void fenpingDelOne(@Param("shopName") String shopName,@Param("cashierNumber") String cashierNumber,@Param("code") String code);

     List<Map<String,Object>> fenpingGetMsg(@Param("shopName") String shopName, @Param("cashierNumber") String cashierNumber);

}
