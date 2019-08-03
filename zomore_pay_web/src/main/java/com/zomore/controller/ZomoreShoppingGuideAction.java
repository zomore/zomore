package com.zomore.controller;

import com.zomore.domain.ZomoreCashier;
import com.zomore.domain.ZomoreShoppingGuide;
import com.zomore.service.ZomoreCashierService;
import com.zomore.service.ZomoreShoppingGuideService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.io.File;
import java.util.*;

//导购员
@Controller("zomoreShoppingGuideAction")
@RequestMapping("zomoreShoppingGuide")
public class ZomoreShoppingGuideAction {
    @Resource
    private ZomoreShoppingGuideService zomoreShoppingGuideServiceImpl;
    @Resource
    private ZomoreCashierService zomoreCashierServiceImpl;
    @Resource
    ServletContext servletContext;

    //员工概览
    @RequestMapping("showEChart")
    public String showEChart(Model model) {
        //收银员
        List<ZomoreCashier> zomoreCashiers = zomoreCashierServiceImpl.selectAll();
        Integer num = zomoreCashiers.size();
        model.addAttribute("CashierNum", zomoreCashiers.size());
        //导购员
        List<ZomoreShoppingGuide> zomoreShoppingGuides = zomoreShoppingGuideServiceImpl.selectAll();
        Integer num1 = zomoreShoppingGuides.size();
        model.addAttribute("GuideNum", zomoreShoppingGuides.size());
        //员工总数(收银员+导购员)
        model.addAttribute("allEmpNum", num + num1);
        //员工业绩排名

        return "forward:/pages/zomoreShoppingGuideChart.jsp";
    }

    //查询所有导购员信息
    @RequestMapping("listAll")
    @ResponseBody
    public List<ZomoreShoppingGuide> selectAll() {
        return zomoreShoppingGuideServiceImpl.selectAll();
    }

    //根据id或者导购员名称
    // 查找导购员（用于前台收款时添加导购员）
    @RequestMapping("selectByidAjax")
    @ResponseBody
    public List selectByidAjax(String GuideId) {
        List<ZomoreShoppingGuide> zomoreShoppingGuides = zomoreShoppingGuideServiceImpl.selectByRuleIds(GuideId);
        List list = new ArrayList();
        for (ZomoreShoppingGuide zomoreShoppingGuide : zomoreShoppingGuides) {
            Map map = new HashMap<>();
            map.put("name", zomoreShoppingGuide.getShoppingGuideName());
            map.put("id", zomoreShoppingGuide.getShoppingGuideId());
            map.put("phone", zomoreShoppingGuide.getShoppingGuideId());
            list.add(map);
        }
        return list;
    }
    //跳转到编辑页面
    @RequestMapping("editUI")
    public String updateZomoreShoppingGuideByUI(String id, Model model) {
        model.addAttribute("result", zomoreShoppingGuideServiceImpl.selectByRuleId(id));
        return "forward:/pages/editzomoreShoppingGuide.jsp";
    }
    //跳转到编辑页面
    @RequestMapping("updateAjax")
    @ResponseBody
    public ZomoreShoppingGuide updateAjax(String id) {
        return zomoreShoppingGuideServiceImpl.selectByRuleId(id);
    }

    //根据id修改导购员
    @RequestMapping("edit")
    public String updateZomoreShoppingGuideBy(ZomoreShoppingGuide zomoreShoppingGuide, MultipartFile file, Model model) {
        zomoreShoppingGuide.setUpdatetime(new Date());
        String path = "";
        String filename = "";
        if (file != null && !file.isEmpty()) {
            //删除原来头像（*）
            if (zomoreShoppingGuide.getShoppingGuideImage() != null && !zomoreShoppingGuide.getShoppingGuideImage().equals("")) {
                path = servletContext.getRealPath("/") + "upload/" + zomoreShoppingGuide.getShoppingGuideImage();
                //删除原来的头像文件
                File oldfile = new File(path);
                if (oldfile.exists()) {//判断头像是否存在
                    oldfile.delete();
                }
                //保存新添加的头像（*）
                try {
                    //文件名称
                    filename = UUID.randomUUID().toString().replaceAll("-", "") + file.getOriginalFilename();
                    //保存路径
                    path = servletContext.getRealPath("/") + "upload/" + filename;  //保存新文件
                    FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            zomoreShoppingGuide.setShoppingGuideImage(filename);
        }
        zomoreShoppingGuideServiceImpl.update(zomoreShoppingGuide);
        return "redirect:/zomoreShoppingGuide/list.do";
    }

    //根据id删除导购员
    @RequestMapping("deleted")
    public String deletedZomoreShoppingGuideBy(String ids, Model model) {
        //删除头像图片
        ZomoreShoppingGuide zomoreShoppingGuide = zomoreShoppingGuideServiceImpl.selectByRuleId(ids);
        if (zomoreShoppingGuide.getShoppingGuideImage() != null && !zomoreShoppingGuide.getShoppingGuideImage().equals("")) {
            String path = "";
            String filename = "";
            path = servletContext.getRealPath("/") + "upload/" + zomoreShoppingGuide.getShoppingGuideImage();
            //删除原来的头像文件
            File oldfile = new File(path);
            if (oldfile.exists()) {//判断头像是否存在
                oldfile.delete();
            }
        }
        zomoreShoppingGuideServiceImpl.deleted(ids);
        return "redirect:/zomoreShoppingGuide/list.do";
    }

    //跳转到导购员添加页面
    @RequestMapping("addUI")
    public String adddZomoreShoppingGuideUI(Model model) {
        return "forward:/pages/addzomoreShoppingGuide.jsp";
    }

    //添加导购员
    @RequestMapping("add")
    public String adddZomoreShoppingGuide(ZomoreShoppingGuide zomoreShoppingGuide, MultipartFile file) {
        Date date = new Date();
        zomoreShoppingGuide.setCreatetime(date);
        zomoreShoppingGuide.setUpdatetime(date);
        String path = "";
        String filename = "";
        if (file != null && !file.isEmpty()) {
            //保存头像
            try {
                //文件名称
                filename = UUID.randomUUID().toString().replaceAll("-", "") + file.getOriginalFilename();
                //保存路径
                path = servletContext.getRealPath("/") + "upload/" + filename;  //保存新文件
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
            } catch (Exception e) {
                e.printStackTrace();
            }
            zomoreShoppingGuide.setShoppingGuideImage(filename);
        }
        zomoreShoppingGuideServiceImpl.insert(zomoreShoppingGuide);
        return "redirect:/zomoreShoppingGuide/list.do";
    }

    //默认查询所有导购员信息
    @RequestMapping("selectAllAjax")
    @ResponseBody
    public List selectAllAjax(){
        List<ZomoreShoppingGuide> zomoreShoppingGuides = zomoreShoppingGuideServiceImpl.selectAll();
        List list = new ArrayList();
        for (ZomoreShoppingGuide zomoreShoppingGuide : zomoreShoppingGuides) {
            Map map = new HashMap<>();
            map.put("name", zomoreShoppingGuide.getShoppingGuideName());
            map.put("id", zomoreShoppingGuide.getShoppingGuideId());
            map.put("phone", zomoreShoppingGuide.getShoppingGuideId());
            list.add(map);
        }
        return list;
    }


}
