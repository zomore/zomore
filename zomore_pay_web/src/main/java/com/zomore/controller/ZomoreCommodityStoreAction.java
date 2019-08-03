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
import java.util.List;

//库存
@Controller("zomoreCommodityStoreAction")
@RequestMapping("zomoreCommodityStore")
public class ZomoreCommodityStoreAction {
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    //分页查询所有库存
    @RequestMapping("list")
    public String selectByPage(PageResult<ZomoreCommodityStoreResult> page, Model model){
        List<ZomoreCommodityStoreResult> list=new  ArrayList<ZomoreCommodityStoreResult>();
        List<ZomoreCommodityStore> stores = zomoreCommodityStoreServiceImpl.select(page.getPageNum(), page.getPageSize());
        for (ZomoreCommodityStore store:stores){
            ZomoreCommodityStoreResult result=new ZomoreCommodityStoreResult();
            BeanUtils.copyProperties(store,result);
            //根据商品id查找商品
            ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectById(store.getZomoreCommodityId());
            if(commodity!=null){
                BeanUtils.copyProperties(commodity,result);
            }
            list.add(result);
        }
        page.setItems(list);
        model.addAttribute("result",page);
        return "forward:/pages/zomoreCommodityStore.jsp";
    }

    //删除库存

    @RequestMapping("deleted")
    public String deleted(String ids) {
        zomoreCommodityStoreServiceImpl.deleteStoreId(ids);
        return "redirect:/zomoreCommodityStore/list.do";
    }
}
