package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

//调货
@Controller("zomoreCommodityDiaohuoAction")
@RequestMapping("zomoreCommodityDiaohuo")
public class ZomoreCommodityDiaohuoAction {

    @Resource
    private HeadShopService headShopService;
    @Resource
    private ZomoreCommodityTransferService zomoreCommodityTransferServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreCommodityChangeService zomoreCommodityChangeServiceImpl;
    @Resource
    private HttpSession session;
    @Resource
    private MultipleService multipleServiceImpl;

    //跳转到调货页面
    @RequestMapping("add")
    public String add(Model model) {
        //连锁总店的id
        String id = String.valueOf(session.getAttribute("multipleId"));
        //店铺的角色类型1：连锁店 2：直营店 3：加盟店 4：单店
        Integer role = (int) session.getAttribute("shopRole");
        //根据角色类型和连锁店铺id查找相同类型的店铺

        try {
            /*List<HeadShop> headShops = headShopService.findByRoleAndMutId(role, id);*/
            //查询所有的直营店、加盟店
            List<HeadShop> headShopList=multipleServiceImpl.selectHeadshopByMultipleId(id);
            model.addAttribute("headShops", headShopList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "forward:/reception/diaohuo.jsp";
    }

    //根据条件查找门店
    @RequestMapping("searchLikeCode")
    @ResponseBody
    public List searchLikeCode(String code) {
        List list = new ArrayList();
        //连锁总店的id
        String id = String.valueOf(session.getAttribute("multipleId"));
        //店铺的角色类型1：连锁店 2：直营店 3：加盟店 4：单店
        Integer role = (int) session.getAttribute("shopRole");
        try {
            List<HeadShop> headShops = headShopService.findByRoleAndMutIdAndCode(role, id, "%" + code + "%");
            for (HeadShop h : headShops) {
                if(h.getRole()!=1&&!h.getShopName().equals(session.getAttribute("shopName"))){
                    Map map = new HashMap();
                    map.put("shop", h.getShopName());
                    list.add(map);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //生成id
    public String getthId() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHssmm");
        String orid = format.format(new Date());
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            orid += random.nextInt(10);
        }
        return orid;
    }

    //添加调货商品
    @RequestMapping("transferCommodty")
    @ResponseBody
    public String lossCommodty(String[] name, String[] code, Integer[] num, String[] price, String inshop, String allin) {
        //随机生产批次号
        String mainid = "dh";
        mainid += getthId();
        ZomoreCommodityTransferCommodity commodityTransferCommodity = new ZomoreCommodityTransferCommodity();
        commodityTransferCommodity.setZomoreCommodityTransferId(mainid);
        for (int i = 0; i < name.length; i++) {
            commodityTransferCommodity.setZomoreCommodityTransferName(name[i]);
            commodityTransferCommodity.setZomoreCommodityTransferCode(code[i]);
            commodityTransferCommodity.setZomoreCommodityTransferPrice(price[i]);
            commodityTransferCommodity.setZomoreCommodityTransferNum(num[i]);
            zomoreCommodityTransferServiceImpl.insert(commodityTransferCommodity);
        }
        ZomoreCommodityTransfer commodityTransfer = new ZomoreCommodityTransfer();
        commodityTransfer.setState(0);
        commodityTransfer.setZomoreCommodityTransferNum(allin);
        commodityTransfer.setZomoreCommodityTransferId(mainid);
        commodityTransfer.setZomoreCommodityTransferSize(name.length + "");
        commodityTransfer.setZomoreCommodityTransferInstore(inshop);
        zomoreCommodityTransferServiceImpl.insert(commodityTransfer);
        return mainid;
    }


    //添加调货单据(把状态改为1)
    @RequestMapping("transferCommodtyHistory")
    public String lossCommodtyHistory(ZomoreCommodityTransfer commodityTransfer, Model model) {
        //减少调出库存
        String transferId = commodityTransfer.getZomoreCommodityTransferId();
        int allnum = 0;
        List<ZomoreCommodityTransferCommodity> transferCommodities = zomoreCommodityTransferServiceImpl.selectByTranId(transferId);
        if (transferCommodities != null && transferCommodities.size() > 0) {
            for (ZomoreCommodityTransferCommodity t : transferCommodities) {
                ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectByCode(t.getZomoreCommodityTransferCode());
                ZomoreCommodityStore store = zomoreCommodityStoreServiceImpl.selectByCommodityId(zomoreCommodity.getZomoreCommodityId());
                if(store!=null){
                    if(store.getZomoreCommodityStore()==null){
                        store.setZomoreCommodityStore(0 - t.getZomoreCommodityTransferNum());
                    }
                    else{
                        store.setZomoreCommodityStore(store.getZomoreCommodityStore() - t.getZomoreCommodityTransferNum());
                    }
                    allnum += t.getZomoreCommodityTransferNum();
                    zomoreCommodityStoreServiceImpl.updateCommodityid(store);
                }

            }
        }
        commodityTransfer.setState(1);
        zomoreCommodityTransferServiceImpl.update(commodityTransfer);

        //添加商品变动明细
        ZomoreCommodityChange change = new ZomoreCommodityChange();
        change.setZomoreCommodityChangeNum(allnum);
        change.setZomoreCommodityChangeType("货流调出");
        change.setZomoreOrderId(commodityTransfer.getZomoreCommodityTransferId());
        zomoreCommodityChangeServiceImpl.insert(change);
        return "forward:/reception/list.do";
    }


}
