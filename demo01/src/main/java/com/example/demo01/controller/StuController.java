package com.example.demo01.controller;

import com.example.demo01.domain.Account;
import com.example.demo01.domain.Stu;
import com.example.demo01.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/query")
    public Stu query(HttpSession session){
        Account account = (Account) session.getAttribute("account");
        Stu stu = this.stuService.query(account);
        return stu;
    }

    @RequestMapping("/change")
    public int change(Stu stu, HttpSession session){
        Account account = (Account) session.getAttribute("account");
        return this.stuService.change(account.getId(), stu);
    }
}
