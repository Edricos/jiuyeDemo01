package com.example.demo01.controller;

import com.example.demo01.domain.Account;
import com.example.demo01.domain.Preach;
import com.example.demo01.domain.Stu;
import com.example.demo01.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/applyInterview")
    public int applyInterview(int wid){

        return 0;
    }

    @RequestMapping("/loadPreach")
    public List<Preach> loadPreach(){
        return this.stuService.allPreach();
    }

    @RequestMapping("/preChange")
    public Stu preChange(HttpSession session){
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
