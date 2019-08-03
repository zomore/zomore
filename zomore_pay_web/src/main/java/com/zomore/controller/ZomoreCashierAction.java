package com.zomore.controller;

import com.zomore.domain.ZomoreCashier;
import com.zomore.service.ZomoreCashierService;
import com.zomore.service.ZomoreEmployeeRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

//收银员资料
@Controller("zomoreCashierAction")
@RequestMapping("zomoreCashier")
public class ZomoreCashierAction {
    @Resource
    private ZomoreCashierService zomoreCashierServiceImpl;
    @Resource
    private ZomoreEmployeeRoleService zomoreEmployeeRoleServiceImpl;

    //跳转到编辑页面
    @RequestMapping("editUI")
    public String updateZomoreCashierByUI(String id,Model model){
        //保存所有的会员角色
        model.addAttribute("employeeRole",zomoreEmployeeRoleServiceImpl.selectAllByState(1));
        model.addAttribute("result",zomoreCashierServiceImpl.selectByRuleId(id));
        return "forward:/pages/editzomoreCashier.jsp";
    }
    @RequestMapping("updateAjax")
    @ResponseBody
    public ZomoreCashier updateAjax(String id){
        return zomoreCashierServiceImpl.selectByRuleId(id);
    }

    //根据id修改收银员资料
    @RequestMapping("edit")
    public String updateZomoreCashierBy(ZomoreCashier zomoreCashier,Model model){
        zomoreCashierServiceImpl.update(zomoreCashier);
        return "redirect:/zomoreCashier/list.do";
    }
    //根据id删除收银员资料
    @RequestMapping("deleted")
    public String deletedZomoreCashierBy(String ids,Model model){
        zomoreCashierServiceImpl.deleted(ids);
        return "redirect:/zomoreCashier/list.do";
    }
    //跳转到收银员资料添加页面
    @RequestMapping("addUI")
    public String adddZomoreCashierUI(Model model){
        //保存所有的会员角色
        model.addAttribute("employeeRole",zomoreEmployeeRoleServiceImpl.selectAllByState(1));
        return "forward:/pages/addzomoreCashier.jsp";
    }
    //添加收银员资料
    @RequestMapping("add")
    public String adddZomoreCashier(ZomoreCashier zomoreCashier){
        zomoreCashierServiceImpl.insert(zomoreCashier);
        return "redirect:/zomoreCashier/list.do";
    }

}
