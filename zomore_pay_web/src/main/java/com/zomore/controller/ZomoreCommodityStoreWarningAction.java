package com.zomore.controller;

import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommodityStore;
import com.zomore.result.ZomoreCommodityStoreResult;
import com.zomore.service.ZomoreCommodityService;
import com.zomore.service.ZomoreCommodityStoreService;
import com.zomore.utils.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//库存预警
@Controller("ZomoreCommodityStoreWarningAction")
@RequestMapping("zomoreCommodityStoreWarning")
public class ZomoreCommodityStoreWarningAction {
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    //分页查询所有库存
    @RequestMapping("list1")
    public String selectByPage(PageResult<ZomoreCommodityStoreResult> page, Model model) {
        List<ZomoreCommodityStoreResult> list = new ArrayList<ZomoreCommodityStoreResult>();
        List<ZomoreCommodityStore> stores = zomoreCommodityStoreServiceImpl.select(page.getPageNum(), page.getPageSize());
        for (ZomoreCommodityStore store : stores) {
            ZomoreCommodityStoreResult result = new ZomoreCommodityStoreResult();
            BeanUtils.copyProperties(store, result);
            //根据商品id查找商品
            ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectById(store.getZomoreCommodityId());
            if (commodity != null) {
                BeanUtils.copyProperties(commodity, result);
                //计算到期时间
                Date zomoreCommodityProductdate = commodity.getZomoreCommodityProductdate();
                if (zomoreCommodityProductdate != null) {
                    Integer zomoreCommodityTime = commodity.getZomoreCommodityTime();
                    Calendar begin = Calendar.getInstance();
                    begin.setTime(zomoreCommodityProductdate);
                    if (zomoreCommodityTime != null && !zomoreCommodityTime.equals(""))
                        begin.add(Calendar.DAY_OF_MONTH, zomoreCommodityTime);
                    result.setZomoreCommodityProductdate(begin.getTime());
                    Date date = new Date();
                    if (date.getTime() > begin.getTime().getTime()) {
                        result.setZomoreCommodityLaber1("已过期");
                    } else {
                        long daysBetween = (begin.getTime().getTime() - date.getTime() + 1000000) / (60 * 60 * 24 * 1000);
                        result.setZomoreCommodityLaber1("保质期还有" + daysBetween + "天");
                    }
                }else {
                    result.setZomoreCommodityLaber1("-");
                }
            }

            list.add(result);
        }
        page.setItems(list);
        model.addAttribute("result", page);
        return "forward:/pages/zomoreCommodityStoreWarning.jsp";
    }
    //分页查询所有库存预警（即库存数量少于库存下限）
    @RequestMapping("list")
    public String selectByPage1(PageResult<ZomoreCommodityStoreResult> page, Model model){
        List<ZomoreCommodityStoreResult> list = new ArrayList<ZomoreCommodityStoreResult>();
        List<ZomoreCommodityStore> stores =zomoreCommodityStoreServiceImpl.select1(page.getPageNum(), page.getPageSize());
        for (ZomoreCommodityStore store : stores) {
            ZomoreCommodityStoreResult result = new ZomoreCommodityStoreResult();
            BeanUtils.copyProperties(store, result);
            //根据商品id查找商品
            ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectById(store.getZomoreCommodityId());
            if (commodity != null) {
                BeanUtils.copyProperties(commodity, result);
                //计算到期时间
                Date zomoreCommodityProductdate = commodity.getZomoreCommodityProductdate();
                if (zomoreCommodityProductdate != null) {
                    Integer zomoreCommodityTime = commodity.getZomoreCommodityTime();
                    Calendar begin = Calendar.getInstance();
                    begin.setTime(zomoreCommodityProductdate);
                    if (zomoreCommodityTime != null && !zomoreCommodityTime.equals(""))
                        begin.add(Calendar.DAY_OF_MONTH, zomoreCommodityTime);
                    result.setZomoreCommodityProductdate(begin.getTime());
                    Date date = new Date();
                    if (date.getTime() > begin.getTime().getTime()) {
                        result.setZomoreCommodityLaber1("已过期");
                    } else {
                        long daysBetween = (begin.getTime().getTime() - date.getTime() + 1000000) / (60 * 60 * 24 * 1000);
                        result.setZomoreCommodityLaber1("保质期还有" + daysBetween + "天");
                    }
                }else {
                    result.setZomoreCommodityLaber1("-");
                }
            }

            list.add(result);
        }
        page.setItems(list);
        model.addAttribute("result", page);
        return "forward:/pages/zomoreCommodityStoreWarning.jsp";
    }


}
