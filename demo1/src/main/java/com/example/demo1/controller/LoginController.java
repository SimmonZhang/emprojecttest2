package com.example.demo1.controller;

import com.example.demo1.dto.session.SessionUserInfo;
import com.example.demo1.model.User;
import com.example.demo1.service.LoginService;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/log")
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login() {

        return "html/log";
    }

    @RequestMapping("/logins")
    public String logSelectUser(User user, Model model) {
        String status = userService.selectUserByName(user);
        if (status.equals("success")){
            SessionUserInfo sessionUserInfo = loginService.selectIserInfo(user.getUserName());
            System.out.println("test:"+sessionUserInfo);
            model.addAttribute("userInfo",sessionUserInfo);
            return "html/main";
        }

        model.addAttribute("msg",status);
        return "html/log";
    }
}