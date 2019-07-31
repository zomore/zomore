package com.zomore.utils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    //ServletContext创建时调用该方法
    public void contextInitialized(ServletContextEvent event){
        ServletContext servletContext = event.getServletContext();
        servletContext.setAttribute("aa",1);
        System.out.println("ServletContext创建！");
    }
    //ServletContext销毁时调用该方法
    public void contextDestroyed(ServletContextEvent event){
        System.out.println("ServletContext销毁！");
    }
}