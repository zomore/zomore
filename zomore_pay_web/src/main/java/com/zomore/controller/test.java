package com.zomore.controller;

import javax.swing.*;
import java.awt.*;

public class test
{
    public static void main(String[] args)
    {
        JFrame jf = new JFrame();
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);
        test.showOnScreen2(1, jf);
    }
    //screen 显示器序号
    public static void showOnScreen2(int screen, JFrame frame)
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gd = ge.getScreenDevices();
        if (screen > -1 && screen < gd.length)
        {
            frame.setLocation(gd[screen].getDefaultConfiguration().getBounds().x, frame.getY());
        } else if (gd.length > 0)
        {
            frame.setLocation(gd[0].getDefaultConfiguration().getBounds().x, frame.getY());
        } else
        {
            throw new RuntimeException("No Screens Found");
        }
    }
}