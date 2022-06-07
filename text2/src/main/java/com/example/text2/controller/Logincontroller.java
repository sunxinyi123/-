package com.example.text2.controller;


import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class Logincontroller {
    @RequestMapping("/user/login")

    public  String login(@RequestParam("username") String username,
                         @RequestParam("password")String password,
                         Model model, HttpSession session){//用于接受 model用于回显数据

        //具体业务
        if(!StringUtils.isEmpty("username")&&"123456".equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";//用于跳转成功后显示main
        }else {
            //告诉用户登录失败
            model.addAttribute("msg","用户或者密码错误!");
            return "index";
        }



    }
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";

    }
//    private SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd/");





}
