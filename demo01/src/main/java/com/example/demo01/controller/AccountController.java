package com.example.demo01.controller;

import com.example.demo01.domain.Account;
import com.example.demo01.domain.Preach;
import com.example.demo01.domain.Work;
import com.example.demo01.service.StuService;
import com.example.demo01.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @Autowired
    private StuService stuService;

    @RequestMapping("prelogin")
    public String preLogin(){
        return "login";
    }
    @RequestMapping("/login" )
    public String login(Account paccount, HttpSession session){
        Account account = this.accountService.login(paccount);
        if (account == null){
            session.setAttribute("loginerro", "信息不匹配，登陆失败，请重试。");
            return "login";
        }
        account.setPassword("nulls");
        session.setAttribute("account", account);
        switch (paccount.getClasss()) {
            case "inc":
                return "redirect:/inc/incMainMana";
            case "stu":
                return "redirect:/user/stuMainMana";
            case "admin":
                return "adminMain";
        }
        return "main";
    }

    @RequestMapping("/preregist")
    public String preregist(){
        return "register";
    }
    @RequestMapping("/regist")
    public String regist(Account paccount, HttpSession session){
        Account account = this.accountService.regist(paccount);
        session.setAttribute("account", account);
        switch (paccount.getClasss()) {
            case "inc":
                return "redirect:/inc/incMainMana";
            case "stu":
                return "redirect:/user/stuMainMana";
            case "admin":
                return "adminMain";
        }
        return "main";
    }

    @RequestMapping("/stuMainMana")
    public String sutMainMana(Model model, HttpSession session){
        Account account = (Account) session.getAttribute("account");
        List<Work> works = this.stuService.getWorkInfo();
        List<Preach> preaches = this.stuService.getAppointment(account.getId());
        model.addAttribute("workInfo", works);
        model.addAttribute("appointments", preaches);
        return "stuMain";
    }

}
