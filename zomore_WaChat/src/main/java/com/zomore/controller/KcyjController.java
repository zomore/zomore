package com.zomore.controller;

import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommodityStore;
import com.zomore.result.ZomoreCommodityStoreResult;
import com.zomore.service.*;
import com.zomore.utils.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.*;

@Controller("kcyjController")
@RequestMapping("kcyjController")
public class KcyjController {
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityCategoryService zomoreCommodityCategoryServiceImpl;
    @Resource
    private ZomoreSupplierService zomoreSupplierServiceImpl;

    @Resource
    private WaChatService waChatServiceImpl;


 /*   @RequestMapping("list")
    public String selectByPage1(PageResult<ZomoreCommodityStoreResult> page, Model model) {
        List<ZomoreCommodityStoreResult> list = new ArrayList();
        List<ZomoreCommodityStore> stores = this.zomoreCommodityStoreServiceImpl.select1(page.getPageNum(), page.getPageSize());
        for (ZomoreCommodityStore store : stores) {
            ZomoreCommodityStoreResult result = new ZomoreCommodityStoreResult();
            BeanUtils.copyProperties(store, result);
            ZomoreCommodity commodity = this.zomoreCommodityServiceImpl.selectById(store.getZomoreCommodityId());
            if (commodity != null) {
                BeanUtils.copyProperties(commodity, result);
                Date zomoreCommodityProductdate = commodity.getZomoreCommodityProductdate();
                if (zomoreCommodityProductdate != null) {
                    Integer zomoreCommodityTime = commodity.getZomoreCommodityTime();
                    Calendar begin = Calendar.getInstance();
                    begin.setTime(zomoreCommodityProductdate);
                    if ((zomoreCommodityTime != null) && (!zomoreCommodityTime.equals("")))
                        begin.add(5, zomoreCommodityTime.intValue());
                    result.setZomoreCommodityProductdate(begin.getTime());
                    Date date = new Date();
                    if (date.getTime() > begin.getTime().getTime()) {
                        result.setZomoreCommodityLaber1("已过期");
                    } else {
                        long daysBetween = (begin.getTime().getTime() - date.getTime() + 1000000L) / 86400000L;
                        result.setZomoreCommodityLaber1("保质期还有" + daysBetween + "天");
                    }
                } else {
                    result.setZomoreCommodityLaber1("-");
                }
            }
            list.add(result);
        }
        //保存商品分类用于编辑和添加动态选择
        model.addAttribute("commodityType", zomoreCommodityCategoryServiceImpl.selectAll());
        //保存供货商用于编辑和添加动态选择
        model.addAttribute("suppliers", zomoreSupplierServiceImpl.select());
        page.setItems(list);
        page.setTotalCount(zomoreCommodityStoreServiceImpl.countWarning());
        model.addAttribute("result", page);
        return "forward:/pages/kcyj.jsp";
    }*/
    @RequestMapping("list")
    public String selectAllStore(Model model){
        List<Map<String,Objects>> results = waChatServiceImpl.selectAllStock();
        model.addAttribute("result",results);
        return "forward:/pages/kcyj.jsp";
    }

    @RequestMapping("selectWord")
    public String SelectNumCode(String code,Model model)throws Exception{
        code = new String(code.getBytes("ISO8859_1"), "UTF-8");
        List<Map<String, Objects>> results = waChatServiceImpl.selectStockWord(code);

        model.addAttribute("result",results);
        return "forward:/pages/kcyj.jsp";
    }
}


