package com.zomore.dao;

import com.zomore.domain.CashierAdvertSetting;
import com.zomore.domain.CashierFunctionSetting;
import com.zomore.domain.CashierGenralSetting;
import com.zomore.domain.CashierPrintSetting;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SettingDao {
    //新增收银台通用设置
    void inertGenralSetting(CashierGenralSetting cashierGenralSetting);

    //选择收银台的通用设置
    @Select({"select * from zomore_cashier_generalsetting where cashiershop=#{shop}and cashiernumber=#{number}"})
    CashierGenralSetting selectAllGenralSetting(@Param("shop") String shop,@Param("number") String number);

    //更新收银台的通用设置
    void updataGenralSetting(CashierGenralSetting cashierGenralSetting);

    //收银台新增功能设置
    void inserFunctionSetting(CashierFunctionSetting cashierFunctionSetting);

    //收银台查询功能设置状态
    List<CashierFunctionSetting> selectFunctionSetting(CashierFunctionSetting cashierFunctionSetting);

    void updataFunctionSetting(CashierFunctionSetting cashierFunctionSetting);

    //新增收银台小票设置
    void inertPrintSetting(CashierPrintSetting cashierPrintSetting);

    //选择收银台的小票用设置
    @Select({"select * from zomore_cashier_printsetting where cashiershop=#{shop}and cashiernumber=#{number}"})
    CashierPrintSetting selectAllPrintSetting(@Param("shop") String shop,@Param("number") String number);

    //更新收银台的小票设置
    void updataPrintSetting(CashierPrintSetting cashierPrintSetting);

    //新增收银台小票设置
    void inertAdvertSetting(CashierAdvertSetting cashierAdvertSetting);

    //选择收银台的小票用设置
    @Select({"select * from zomore_cashier_advertsetting where cashiershop=#{shop}and cashiernumber=#{number}"})
    CashierAdvertSetting selectAllAdvertSetting(@Param("shop") String shop,@Param("number") String number);

    //更新收银台的小票设置
    void updataAdvertSetting(CashierAdvertSetting cashierAdvertSetting);



}
