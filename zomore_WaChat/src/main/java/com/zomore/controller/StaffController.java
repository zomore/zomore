package com.zomore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("staffController")
public class StaffController {

    @RequestMapping("select")
    public String StaffMessage(){

        return "forward:/pages/staff.jsp";
    }
}
