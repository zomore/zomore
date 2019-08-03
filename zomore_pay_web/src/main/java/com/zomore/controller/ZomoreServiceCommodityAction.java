package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.service.*;
import com.zomore.service.impl.ZomoreServiceCommodityServiceImpl;
import com.zomore.utils.IdUtils;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

//服务类商品资料
@Controller("zomoreServiceCommodityAction")
@RequestMapping("zomoreServiceCommodity")
public class ZomoreServiceCommodityAction {
    @Resource
    private ZomoreServiceCommodityService zomoreServiceCommodityServiceImpl;
    @Resource
    private ZomoreServiceCommodityCategoryService zomoreServiceCommodityCategoryServiceImpl;
    @Resource
    private ZomoreServiceCommodityorderService zomoreServiceCommodityorderServiceImpl;
    @Resource
    private ZomoreServiceCommoditySalecommoditService zomoreServiceCommoditySalecommoditServiceImpl;
    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;
    @Resource
    ServletContext servletContext;

    //后台
    @RequestMapping("list")
    public String list(PageResult<ZomoreServiceCommodity> page, Model model,HttpSession session) {
        model.addAttribute("result", zomoreServiceCommodityServiceImpl.select(page,session.getAttribute("shopName")+""));
        return "forward:/pages/zomoreServiceCommodity.jsp";
    }

    //前台，点击后院跳转
    /**
     * @param page
     * @param httpSession
     * @param model
     * @param id          订单号
     * @return
     */
    @RequestMapping("list1")
    public String list1(PageResult<ZomoreServiceCommodity> page, String id, String zomoreMemberNum,HttpSession httpSession, Model model) {
        ZomoreMember zomoreMember =new ZomoreMember();
        DecimalFormat format = new DecimalFormat("0.00");
        //查找会员
        if (zomoreMemberNum!=null&&!zomoreMemberNum.equals("")){
            zomoreMember=zomoreMemberServiceImpl.selectZomoreMemberByNum(zomoreMemberNum);
            model.addAttribute("zomoreMember",zomoreMember);

        }
        if (id == null || id.equals("")) {
            httpSession.removeAttribute("Aa_servieceorderid");
            httpSession.setAttribute("Aa_servieceorderid", IdUtils.commoditySaleId("aa", servletContext));
        } else {
            ZomoreServiceCommodityorder select = zomoreServiceCommodityorderServiceImpl.select(id);
            if(select!=null){
                model.addAttribute("fwlmoney",select.getZomoreCommoditySaleMoney());
                model.addAttribute("fwlnum",select.getZomoreCommoditySaleNum());
            }
            //根据id查找服务类商品用于返回回显
            List<ZomoreServiceCommoditySalecommodit> aa = zomoreServiceCommoditySalecommoditServiceImpl.selectBynum(id);
            if(zomoreMemberNum!=null&&zomoreMemberNum!=""&&zomoreMember!=null&&aa!=null&&aa.size()>0){
                for (int i=0;i<aa.size();i++){
                    Double discount =Double.parseDouble(zomoreMember.getMemberDiscount())/100;
                    aa.get(i).setZomoreCommodityMoney(Double.parseDouble(format.format(aa.get(i).getZomoreCommodityMoney()*discount)));
                }

            }
            model.addAttribute("salecommodit",aa);
        }
        model.addAttribute("categorylist", zomoreServiceCommodityCategoryServiceImpl.selectByShop(httpSession.getAttribute("shopName")+""));
        page.setPageSize(1000);
        model.addAttribute("result", zomoreServiceCommodityServiceImpl.select(page,httpSession.getAttribute("shopName")+""));
        return "forward:/reception/indexs.jsp";
    }

    /*异步获取所有服务类商品分类*/
    @RequestMapping("selectcatage")
    @ResponseBody
    public List<ZomoreServiceCommodityCategory> selectcatage(HttpSession session){
        return zomoreServiceCommodityCategoryServiceImpl.selectByShop(session.getAttribute("shopName")+"");
    }
    //异步方式，根据id查收服务类商品信息
    @RequestMapping("selectAjax")
    @ResponseBody
    public ZomoreServiceCommodity selectByIdAjax(String id) {
        return zomoreServiceCommodityServiceImpl.select(id);
    }

    //异步方式，根据项目分类查找项目
    @RequestMapping("searchBytype")
    @ResponseBody
    public List<ZomoreServiceCommodity>searchBytype(String type){
        if(type.equals("全部")){
            type=null;
        }
        return zomoreServiceCommodityServiceImpl.select(type,"");
    }
    //前台，添加服务类商品
    @RequestMapping("add")
    public String addZomoreServiceCommodity(ZomoreServiceCommodity serviceCommodity, String serviceCommodityId) {
        //添加服务类商品
        boolean insert = zomoreServiceCommodityServiceImpl.insert(serviceCommodity);
        return "forward:/zomoreServiceCommodity/list1.do";
    }

    //后台台，添加服务类商品
    @RequestMapping("add1")
    public String add1ZomoreServiceCommodity(ZomoreServiceCommodity serviceCommodity, String serviceCommodityId) {
        //添加服务类商品
        boolean insert = zomoreServiceCommodityServiceImpl.insert(serviceCommodity);
        return "redirect:/zomoreServiceCommodity/list.do";
    }

    //生成服务类商品id
    @RequestMapping("getId")
    @ResponseBody
    public String getId() {
        String code = "69";
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            code += random.nextInt(10);
        }
        return code;
    }

    //后台，根据id删除服务类商品
    @RequestMapping("deleted")
    public String deleted(String ids) {
        zomoreServiceCommodityServiceImpl.deleted(ids);
        return "redirect:/zomoreServiceCommodity/list.do";
    }

    //后台，根据id修改服务类商品资料
    @RequestMapping("update")
    public String update(ZomoreServiceCommodity serviceCommodity) {
        zomoreServiceCommodityServiceImpl.update(serviceCommodity);
        return "redirect:/zomoreServiceCommodity/list.do";
    }
}
