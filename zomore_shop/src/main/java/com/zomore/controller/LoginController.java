package com.zomore.controller;
import com.zomore.domain.ZomoreMember;
import com.zomore.service.ZomoreMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller("loginController")
@RequestMapping("loginController")
public class LoginController {
    @Autowired
    private ZomoreMemberService zomoreMemberServiceImpl;

    //会员登陆
    @RequestMapping("login")
    public String login(String username, String password,HttpSession session) {
        ZomoreMember select = zomoreMemberServiceImpl.login(username, password);
        /*if (select == null) {
            //返回登陆页面
            return "redirect:/pages/login.jsp";
        }*/
        //登陆成功
        session.setAttribute("user",select);
        return "redirect:/pages/index.jsp";
    }

}
