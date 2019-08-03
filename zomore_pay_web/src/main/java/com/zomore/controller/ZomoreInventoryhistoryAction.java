package com.zomore.controller;

import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommodityStore;
import com.zomore.domain.ZomoreInventoryhistory;
import com.zomore.domain.ZomoreStocktaking;
import com.zomore.service.ZomoreCommodityService;
import com.zomore.service.ZomoreCommodityStoreService;
import com.zomore.service.ZomoreInventoryhistoryService;
import com.zomore.service.ZomoreStocktakingService;
import com.zomore.service.impl.ZomoreStocktakingServiceImpl;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

//盘点历史
@Controller("zomoreInventoryhistoryAction")
@RequestMapping("zomoreInventoryhistory")
public class ZomoreInventoryhistoryAction {

    @Resource
    private ZomoreInventoryhistoryService zomoreInventoryhistoryServiceImpl;
    @Resource
    private ZomoreStocktakingService zomoreStocktakingServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    //分页查询盘点历史
    @RequestMapping("list")
    public String list(PageResult<ZomoreInventoryhistory> page, Model model) {
        PageResult<ZomoreInventoryhistory> inventoryhistoryPageResult = zomoreInventoryhistoryServiceImpl.select(page);
        model.addAttribute("result", inventoryhistoryPageResult);
        return "forward:/pages/zomoreInventoryhistory.jsp";
    }
    @RequestMapping("updateAjax")
    @ResponseBody
    public ZomoreInventoryhistory updateAjax(String id) {
        return zomoreInventoryhistoryServiceImpl.select(id);
    }
    //添加盘点历史
    @RequestMapping("add")
    public String insert(ZomoreInventoryhistory inventoryhistory, ZomoreStocktaking zomoreStocktaking) {
        inventoryhistory.setInventoryhistoryId(System.currentTimeMillis() + "");
        zomoreInventoryhistoryServiceImpl.insert(inventoryhistory);
        //添加盘点详细
        zomoreStocktaking.setStocktakingHistoryid(inventoryhistory.getInventoryhistoryId());
        zomoreStocktakingServiceImpl.insert(zomoreStocktaking);
        //修改商品库存
                //根据商品条码
        ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(zomoreStocktaking.getStocktakingCode());
        ZomoreCommodityStore store=new ZomoreCommodityStore();
        store.setZomoreCommodityId(zomoreCommodity.getZomoreCommodityId());
        store.setZomoreCommodityStore(Integer.parseInt(zomoreStocktaking.getStocktakingNumber()));
        zomoreCommodityStoreServiceImpl.updateCommodityid(store);
        return "redirect:/zomoreInventoryhistory/list.do";
    }
    //修改盘点历史
    @RequestMapping("update")
    public String update(ZomoreInventoryhistory inventoryhistory,ZomoreStocktaking zomoreStocktaking) {
        zomoreInventoryhistoryServiceImpl.insert(inventoryhistory);
        //修改盘点详细
        zomoreStocktaking.setStocktakingHistoryid(inventoryhistory.getInventoryhistoryId());
        zomoreStocktakingServiceImpl.upddate(zomoreStocktaking);
        //修改商品库存
        //根据商品条码
        ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(zomoreStocktaking.getStocktakingCode());
        ZomoreCommodityStore store=new ZomoreCommodityStore();
        store.setZomoreCommodityId(zomoreCommodity.getZomoreCommodityId());
        store.setZomoreCommodityStore(Integer.parseInt(zomoreStocktaking.getStocktakingNumber()));
        zomoreCommodityStoreServiceImpl.updateCommodityid(store);
        return "redirect:/zomoreInventoryhistory/list.do";
    }
    //根据盘点历史id删除盘点
    @RequestMapping("deleted")
    public String deleted(String ids) {
        zomoreInventoryhistoryServiceImpl.deletec(ids);
        //删除盘点详细
        zomoreStocktakingServiceImpl.deleted(ids);
        return "redirect:/zomoreInventoryhistory/list.do";
    }
}
