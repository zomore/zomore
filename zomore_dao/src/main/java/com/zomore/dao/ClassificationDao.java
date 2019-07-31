package com.zomore.dao;

import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommodityCategory;
import com.zomore.utils.PageUtils;

import java.util.List;

public interface ClassificationDao {

    //获取分类
    List<ZomoreCommodityCategory> selectClassify(ZomoreCommodityCategory zomoreCommodityCategory);

    //获取总记录数
    Integer selectTotalCount(ZomoreCommodity zomoreCommodity);

    //获取分类的商品数据
    List<ZomoreCommodity> findClassifyCommodityData(PageUtils pageUtils);


}
