package com.example.demo01.controller;

import com.example.demo01.domain.Account;
import com.example.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class AccountController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String username,String password, String classs, HttpSession session){
        Account account = this.userService.login(username, password, classs);
        return "";
    }
}
