package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityTransfer;
import com.zomore.domain.ZomoreCommodityTransferCommodity;
import com.zomore.domain.ZomoreCommodityTransferExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityTransferMapper {
    long countByExample(ZomoreCommodityTransferExample example);

    int deleteByExample(ZomoreCommodityTransferExample example);

    int deleteByPrimaryKey(String zomoreCommodityTransferId);

    int insert(ZomoreCommodityTransfer record);

    int insertSelective(ZomoreCommodityTransfer record);

    List<ZomoreCommodityTransfer> selectByExample(ZomoreCommodityTransferExample example);

    ZomoreCommodityTransfer selectByPrimaryKey(String zomoreCommodityTransferId);

    int updateByExampleSelective(@Param("record") ZomoreCommodityTransfer record, @Param("example") ZomoreCommodityTransferExample example);

    int updateByExample(@Param("record") ZomoreCommodityTransfer record, @Param("example") ZomoreCommodityTransferExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityTransfer record);

    int updateByPrimaryKey(ZomoreCommodityTransfer record);

    List<ZomoreCommodityTransfer> selectTransferCommodity(@Param("shop") String shop);

    List<ZomoreCommodityTransfer> selectTransferCommodity2(@Param("shop") String shop,@Param("transferCommodityId") String transferCommodityId);

    //根据调货单号模糊查询
    List<ZomoreCommodityTransfer> selectTransferCommodityByNum(@Param("shop") String shop,@Param("num") String num);

    void deleteTransferCommodityById(String transferCommodityId);
    void deleteTransferCommodityDetailsByTransferId(String transferCommodityId);

    List<ZomoreCommodityTransferCommodity> selectTransferCommodityDetails(String transferCommodityId);

    /*更新调货商品的数量*/
    void updateTransferCommocityNum(ZomoreCommodityTransferCommodity zomoreCommodityTransferCommodity);

    /*根据id获取调货的商品信息*/
    ZomoreCommodityTransferCommodity selectZomoreCommodityTransferCommodityById(String id);

    /*获取总部所有分店的调货单号*/
    List<ZomoreCommodityTransfer> selectAllShopTransferCommoditys(Map<String,Object> map);

    List<ZomoreCommodityTransfer> selectAllTransferNums(Map<String,Object> map);
}