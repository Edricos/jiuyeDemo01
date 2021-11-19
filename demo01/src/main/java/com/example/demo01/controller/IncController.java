package com.example.demo01.controller;

import com.example.demo01.domain.Account;
import com.example.demo01.domain.Company;
import com.example.demo01.service.IncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
@RequestMapping("/inc")
public class IncController {

    @Autowired
    private IncService incService;

    @RequestMapping("/incMainMana")
    public String incMainMana(HttpSession session) {
        return "incMain";
    }

    @RequestMapping("/prechange")
    public String prechange(Model model, HttpSession session) {
        Account account = (Account) session.getAttribute("account");
        Company company = this.incService.prechange(account.getId());
        Company nullCompany = this.incService.getVoidCompany();
        model.addAttribute("company", Objects.requireNonNullElse(company, nullCompany));
        return "inc-change";
    }
    @RequestMapping("/change")
    public String change(Company company, HttpSession session){
        Account account = (Account) session.getAttribute("account");
        company.setId(account.getId());
        int update = this.incService.update(company);
        return "redirect:/inc/incMainMana";
    }

    @RequestMapping("/preApply")
    public String preApply(){
        return "inc-apply-preach";
    }
}
