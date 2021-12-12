package com.example.demo01.controller;

import com.example.demo01.domain.*;
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

    /*
    * 申请面试
    * id：interview的id
    * */
    @RequestMapping("/applyInterview")
    public int applyInterview(int id, HttpSession session){
        Account account = (Account) session.getAttribute("account");
        int i = this.stuService.addInterview(id, account.getId());
        return i;
    }
    /*
    * 获得自己已经申请面试的列表
    * */
    @RequestMapping("/loadMyInterview")
    public List<Interviewpro> loadMyInterview(HttpSession session){
        Account account = (Account) session.getAttribute("account");
        List<Interviewpro> interviewList = this.stuService.loadMyInterview(account.getId());
        return interviewList;
    }

    /*
    * 获得自己已经申请面试的面试index
    * */
    @RequestMapping("/loadMyInPid")
    public List<Integer> loadMyInPid(HttpSession session){
        Account account = (Account) session.getAttribute("account");
        List<Integer> integerList = this.stuService.loadMyInPid(account.getId());
        return integerList;
    }

    /*
    * 获得所有宣讲会，时间降序
    * */
    @RequestMapping("/loadPreach")
    public List<Preach> loadPreach(){
        return this.stuService.allPreach();
    }

    /*
    * 获得个人信息
    * */
    @RequestMapping("/preChange")
    public Stu preChange(HttpSession session){
        Account account = (Account) session.getAttribute("account");
        Stu stu = this.stuService.query(account);
        return stu;
    }

    /*
    * 更改个人信息
    * */
    @RequestMapping("/change")
    public int change(Stu stu, HttpSession session){
        Account account = (Account) session.getAttribute("account");
        return this.stuService.change(account.getId(), stu);
    }
}
