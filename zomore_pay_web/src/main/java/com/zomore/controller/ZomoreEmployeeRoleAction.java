package com.zomore.controller;

import com.zomore.domain.ZomoreEmployeeRole;
import com.zomore.service.ZomoreEmployeeRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

//员工角色
@Controller("zomoreEmployeeRoleAction")
@RequestMapping("zomoreEmployeeRole")
public class ZomoreEmployeeRoleAction {
    @Resource
    private ZomoreEmployeeRoleService zomoreEmployeeRoleServiceImpl;


    //分页查询员工角色
    @RequestMapping("list")
    public String selectZomoreEmployeeRoleByPage(Model model){
        model.addAttribute("result",zomoreEmployeeRoleServiceImpl.selectAllByPage(1,50));
        return "forward:/pages/zomoreEmployeeRole.jsp";
    }
    //跳转到编辑页面
    @RequestMapping("editUI")
    public String updateZomoreEmployeeRoleByUI(String id,Model model){
        model.addAttribute("result",zomoreEmployeeRoleServiceImpl.selectByRuleId(id));
        return "forward:/pages/editzomoreEmployeeRole.jsp";
    }
    //跳转到编辑页面
    @RequestMapping("updateAjax")
    @ResponseBody
    public ZomoreEmployeeRole updateAjax(String id,Model model){
        return zomoreEmployeeRoleServiceImpl.selectByRuleId(id);
    }
    //根据id修改员工角色
    @RequestMapping("edit")
    public String updateZomoreEmployeeRoleBy(ZomoreEmployeeRole zomoreEmployeeRole,String employeeRoleState1){
        if(employeeRoleState1!=null){
            zomoreEmployeeRole.setEmployeeRoleState(1);
        }else {
            zomoreEmployeeRole.setEmployeeRoleState(0);
        }
        zomoreEmployeeRoleServiceImpl.update(zomoreEmployeeRole);
        return "redirect:/zomoreEmployeeRole/list.do";
    }
    //根据id删除员工角色
    @RequestMapping("deleted")
    public String deletedZomoreEmployeeRoleBy(String ids,Model model){
        zomoreEmployeeRoleServiceImpl.deleted(ids);
        return "redirect:/zomoreEmployeeRole/list.do";
    }
    //跳转到员工角色添加页面
    @RequestMapping("addUI")
    public String adddZomoreEmployeeRoleUI(){
        return "redirect:/pages/addzomoreEmployeeRole.jsp";
    }
    //添加员工角色
    @RequestMapping("add")
    public String adddZomoreEmployeeRole(ZomoreEmployeeRole zomoreEmployeeRole,String employeeRoleState1){
        if(employeeRoleState1!=null){
            zomoreEmployeeRole.setEmployeeRoleState(1);
        }else {
            zomoreEmployeeRole.setEmployeeRoleState(0);
        }
        zomoreEmployeeRole.setEmployeeRoleRoleid(System.currentTimeMillis()+"");
        zomoreEmployeeRoleServiceImpl.insert(zomoreEmployeeRole);
        return "redirect:/zomoreEmployeeRole/list.do";
    }


}
