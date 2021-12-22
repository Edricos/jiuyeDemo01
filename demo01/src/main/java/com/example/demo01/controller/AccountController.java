package com.example.demo01.controller;

import com.example.demo01.domain.Account;
import com.example.demo01.domain.Preach;
import com.example.demo01.domain.Work;
import com.example.demo01.service.StuService;
import com.example.demo01.service.AccountService;
import com.example.demo01.util.TokenUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@RestController
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
    @PostMapping(value = "/login")
//    @ResponseBody
    @CrossOrigin
    public String login(Account paccount, HttpServletRequest request, HttpSession session) throws JsonProcessingException {
//        HttpSession session = request.getSession();
//        Cookie[] cookies = request.getCookies();
//        System.out.println(cookies);
//        System.out.println(paccount);
        Account account = this.accountService.login(paccount);
        if (account != null) {
            account.setPassword("null");

            String token = TokenUtil.sign(account);
            HashMap<String,Object> hs=new HashMap<>();
            hs.put("token",token);
            hs.put("account", account);
            ObjectMapper objectMapper=new ObjectMapper();
//            session.setAttribute("account", account);

            return objectMapper.writeValueAsString(hs);

        }else{
            System.out.println("登陆失败");
            return null;
        }
    }

    @RequestMapping("/preregist")
    public String preregist(){
        return "register";
    }
    @RequestMapping("/regist")
    @CrossOrigin
    public Account regist(Account paccount, HttpSession session){
        Account account = this.accountService.regist(paccount);
        session.setAttribute("account", account);
        return account;
//        switch (paccount.getClasss()) {
//            case "inc":
//                return "redirect:/inc/incMainMana";
//            case "stu":
//                return "redirect:/user/stuMainMana";
//            case "admin":
//                return "adminMain";
//        }
//        return "main";
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
