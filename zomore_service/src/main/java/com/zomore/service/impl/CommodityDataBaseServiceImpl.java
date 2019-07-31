package com.zomore.service.impl;

import com.zomore.dao.CommodityDataBaseMapper;
import com.zomore.domain.CommodityDatabase;
import com.zomore.service.CommodityDataBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommodityDataBaseServiceImpl implements CommodityDataBaseService {


    @Resource
   private CommodityDataBaseMapper commodityDataBaseMapper;

    @Override
    public CommodityDatabase selectCommodityByCode(String code) {
        return commodityDataBaseMapper.selectCommodityByCode(code);
    }
}
