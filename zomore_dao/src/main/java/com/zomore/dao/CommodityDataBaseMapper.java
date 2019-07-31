package com.zomore.dao;

import com.zomore.domain.CommodityDatabase;

public interface CommodityDataBaseMapper {

    CommodityDatabase selectCommodityByCode(String code);
}
