package com.zomore.service.impl;

import com.zomore.dao.ZomoreServiceCommoditySalecommoditMapper;
import com.zomore.domain.ZomoreServiceCommoditySalecommodit;
import com.zomore.domain.ZomoreServiceCommoditySalecommoditExample;
import com.zomore.service.ZomoreServiceCommoditySalecommoditService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//服务类销售单据商品
@Service("zomoreServiceCommoditySalecommoditService")
public class ZomoreServiceCommoditySalecommoditServiceImpl implements ZomoreServiceCommoditySalecommoditService {
   @Resource
    private ZomoreServiceCommoditySalecommoditMapper zomoreServiceCommoditySalecommoditMapper;
    //添加销售商品记录
    public boolean insert(ZomoreServiceCommoditySalecommodit zomoreCommoditySaleCommodit) {
        int i = 0;
        try {
            i = zomoreServiceCommoditySalecommoditMapper.insertSelective(zomoreCommoditySaleCommodit);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        if(i==1){
            return true;
        }
        return false;
    }

    //根据流水账号查找服务类商品销售记录
    public List<ZomoreServiceCommoditySalecommodit> selectBynum(String num) {
        ZomoreServiceCommoditySalecommoditExample example=new ZomoreServiceCommoditySalecommoditExample();
        example.createCriteria().andZomoreCommoditySaleIdEqualTo(num);
        return zomoreServiceCommoditySalecommoditMapper.selectByExample(example);
    }

    //根据流水号删除服务类商品
    @Override
    public boolean deleted(String id) {
        ZomoreServiceCommoditySalecommoditExample example=new ZomoreServiceCommoditySalecommoditExample();
        example.createCriteria().andZomoreCommoditySaleIdEqualTo(id);
        int i = zomoreServiceCommoditySalecommoditMapper.deleteByExample(example);
        if(i==1){
            return true;
        }
        return false;
    }

    //项目订单详情列表
    public List<ZomoreServiceCommoditySalecommodit> select(String id){
        ZomoreServiceCommoditySalecommoditExample example = new ZomoreServiceCommoditySalecommoditExample();
        example.createCriteria().andZomoreCommoditySaleIdEqualTo(id);
        List<ZomoreServiceCommoditySalecommodit> Salecommodits = zomoreServiceCommoditySalecommoditMapper.selectByExample(example);
        return Salecommodits;
    }
}
