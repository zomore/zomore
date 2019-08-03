package com.zomore.controller;

import com.zomore.domain.ZomoreCashierPerformance;
import com.zomore.service.ZomoreCashierPerformanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

//员工业绩表
@Controller("zomoreCashierPerformanceAction")
@RequestMapping("zomoreCashierPerformance")
public class ZomoreCashierPerformanceAction {
    @Resource
    private ZomoreCashierPerformanceService zomoreCashierPerformanceServiceImpl;

    //分页查询员工业绩表
    @RequestMapping("list")
    public String select(Model model) {
     /*   List<ZomoreCashierPerformance> zomoreCashierPerformances = zomoreCashierPerformanceServiceImpl.selectAllByPage(1, 50);*/
    /*    model.addAttribute("result",zomoreCashierPerformances);*/
        return "forward:/pages/zomoreCashierPerformance.jsp";
    }
    //跳转到添加员工业绩页面
    @RequestMapping("addUI")
    public String addUI() {
        return "forward:/pages/addzomoreCashierPerformance.jsp";
    }
    //添加员工业绩信息
    @RequestMapping("add")
    public String add(ZomoreCashierPerformance zomoreCashierPerformance){
        zomoreCashierPerformance.setZomoreCashierPerformanceId(Long.toString(System.currentTimeMillis()));
        zomoreCashierPerformanceServiceImpl.insert(zomoreCashierPerformance);
        return "redirect:/zomoreCashierPerformance/list.do";
    }
    //跳转到员工业绩编辑页面
    @RequestMapping("editUI")
    public String editUI(String id,Model model) {
        model.addAttribute("result",zomoreCashierPerformanceServiceImpl.selectById(id));
        return "forward:/pages/editzomoreCashierPerformance.jsp";
    }
    //更新员工业绩信息
    @RequestMapping("edit")
    public String edit(ZomoreCashierPerformance zomoreCashierPerformance) {
        zomoreCashierPerformanceServiceImpl.update(zomoreCashierPerformance);
        return "redirect:/zomoreCashierPerformance/list.do";
    }
    //删除员工业绩信息
    @RequestMapping("deleted")
    public String deleted(String ids) {
        zomoreCashierPerformanceServiceImpl.deleted(ids);
        return "redirect:/zomoreCashierPerformance/list.do";
    }
}
