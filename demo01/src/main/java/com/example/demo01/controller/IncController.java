package com.example.demo01.controller;

import com.example.demo01.domain.Account;
import com.example.demo01.domain.Company;
import com.example.demo01.domain.Preach;
import com.example.demo01.domain.Work;
import com.example.demo01.mapper.PreachMapper;
import com.example.demo01.service.IncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/inc")
@CrossOrigin
public class IncController {

    @Autowired
    private IncService incService;

    @RequestMapping("/incMainMana")
    public String incMainMana(HttpSession session) {
        return "incMain";
    }

    @RequestMapping("/prechange")
    public Company prechange(Model model, HttpSession session) {
        Account account = (Account) session.getAttribute("account");
        Company company = this.incService.prechange(account.getId());
        Company nullCompany = this.incService.getVoidCompany();
        model.addAttribute("company", Objects.requireNonNullElse(company, nullCompany));
        return company;
    }
    @RequestMapping("/change")
    public int change(Company company, HttpSession session){
        Account account = (Account) session.getAttribute("account");
        company.setId(account.getId());
        int update = this.incService.update(company);
//        return "redirect:/inc/incMainMana";
        return update;
    }


    @RequestMapping("/preApply")
    public List<Preach> preApply(int id, HttpSession session, Model model){
        Account account = (Account) session.getAttribute("account");
//        List<Preach> preachList = this.incService.getIncPreach(account.getId());
        List<Preach> preachList = this.incService.getIncPreach(id);
//        if (preachList == null)
//            return "inc-apply-preach";
//        else{
//            model.addAttribute("preachList", preachList);
//            return "inc-applied-list";
//        }
        System.out.println(preachList);
        return preachList;
    }
    @RequestMapping("/toApply")
    public String toApply(){
        return "inc-apply-preach";
    }

    @RequestMapping("/applyPreach")
    public int applyPreach(Preach preach, HttpSession session){
//        Account account = (Account) session.getAttribute("account");
        System.out.println(preach);
        int i = this.incService.addPreach(preach.getComid(), preach);
        return i;
    }


    @RequestMapping("/toChangePreach")
    public Preach toChangePreach(int id, Model model){
        Preach preach = this.incService.queryPreach(id);
        model.addAttribute("preach", preach);
        return preach;
    }
    @RequestMapping("/changePreach")
    public int changePreach(Preach preach){
        int i = this.incService.updatePreach(preach);
//        if (i==0){
//            return "";
//        } else
//            return "redirect:/inc/preApply";
        return i;
    }


    @RequestMapping("/toWorkList")
    public List<Work> toWorkList(int id, Model model, HttpSession session){
        List<Work> workList = this.incService.workOfPreach(id);
        model.addAttribute("workList", workList);
        session.setAttribute("pid", id);
        return workList;
    }
    @RequestMapping("/toWorkChange")
    public Work toWorkChange(int wid, Model model, HttpSession session){
        Work work = this.incService.queryAWork(wid);
        model.addAttribute("work", work);
        return work;
    }
    @RequestMapping("/workChange")
    public int workChange(Work work, HttpSession session){
        int pid = (int) session.getAttribute("pid");
        session.removeAttribute("pid");
        int i = this.incService.updateWork(work);
//        return "redirect:/inc/toWorkList?id="+pid;
        if (i==0){
            return 0;
        }else {
            return pid;
        }
    }
    @RequestMapping("/toAddWork")
    public String toAddWork(){
        return "inc-work-add";
    }
    @RequestMapping("/addWork")
    public int addWork(Work work,HttpSession session){
        int pid = (int) session.getAttribute("pid");
        int i = this.incService.addWork(work, pid);
        session.removeAttribute("pid");
//        return "redirect:/inc/toWorkList?id="+pid;
        if (i==0){
            return 0;
        }else {
            return pid;
        }
    }


}
