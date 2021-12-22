package com.example.demo01.controller;

import com.example.demo01.domain.*;
import com.example.demo01.service.StuService;
import com.example.demo01.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
    public int applyInterview(int id, HttpSession session, HttpServletRequest request){
        Account account = (Account) session.getAttribute("account");
        String token = request.getHeader("token");
        int aid = TokenUtil.getData(token);
        int i = this.stuService.addInterview(id, aid);
        return i;
    }
    /*
    * 获得自己已经申请面试的列表
    * */
    @RequestMapping("/loadMyInterview")
    public List<Interviewpro> loadMyInterview(HttpSession session, HttpServletRequest request){
//        Account account = (Account) session.getAttribute("account");
        String token = request.getHeader("token");
        int id = TokenUtil.getData(token);
        List<Interviewpro> interviewList = this.stuService.loadMyInterview(id);
        return interviewList;
    }

    /*
    * 获得自己已经申请面试的面试index
    * */
    @RequestMapping("/loadMyInPid")
    public List<Integer> loadMyInPid(HttpSession session, HttpServletRequest request){
//        Account account = (Account) session.getAttribute("account");

        String token = request.getHeader("token");
        int id = TokenUtil.getData(token);
        List<Integer> integerList = this.stuService.loadMyInPid(id);
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
    public Stu preChange(HttpSession session, HttpServletRequest request){
//        Account account = (Account) session.getAttribute("account");
        String token = request.getHeader("token");
        int id = TokenUtil.getData(token);
        Account account1 = new Account();
        account1.setId(id);
        Stu stu = this.stuService.query(account1);
        return stu;
    }

    /*
    * 更改个人信息
    * */
    @RequestMapping("/change")
    public int change(Stu stu, HttpSession session, HttpServletRequest request){
//        Account account = (Account) session.getAttribute("account");
        String token = request.getHeader("token");
        int id = TokenUtil.getData(token);
        return this.stuService.change(id, stu);
    }
}
