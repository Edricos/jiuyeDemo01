package com.example.demo01.controller;

import com.example.demo01.domain.*;
import com.example.demo01.mapper.PreachMapper;
import com.example.demo01.service.IncService;
import com.example.demo01.util.TokenUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/inc")
@CrossOrigin
public class IncController {


    private static final String PRIVATE_KEY = "abcde";  //密钥
    @Autowired
    private IncService incService;

    /*
    * 获取当前企业收到的面试申请
    *
    * */
    @RequestMapping("/laodMyInterview")
    public List<Interviewstu> laodMyInterview(HttpServletRequest request, HttpSession session){
//        Account account = (Account) session.getAttribute("account");
//        String token = request.getHeader("token");
//        int id = TokenUtil.getData(token);
        Cookie[] cookies = request.getCookies();
        int id=TokenUtil.getDataCookie(cookies);
        List<Interviewstu> interviewList = this.incService.findByComid(id);
        return interviewList;
    }
    /*
    * 获取某个面试详情
    * id:interview的id
    * */
    @RequestMapping("/aInterviewstu")
    public Interviewstu aInterviewstu(int id){
        Interviewstu interviewstu = this.incService.aInterviewstu(id);
        return interviewstu;
    }
    /*
    * 面试通过
    * */
    @RequestMapping("/passIn")
    public int passIn(int id, String reply){
        int passed = this.incService.interviewVerify(id, "Passed", reply);
        return passed;
    }
    /*
    * 面试拒绝
    * */
    @RequestMapping("/refuseIn")
    public int refuseIn(int id, String reply){
        int passed = this.incService.interviewVerify(id, "Refused", reply);
        return passed;
    }


//    @RequestMapping("/incMainMana")
//    public String incMainMana(HttpSession session) {
//        return "incMain";
//    }

    /*
    * 获取企业信息
    * */
    @RequestMapping("/prechange")
    public Company prechange(Model model, HttpSession session, HttpServletRequest request) {
//        Account account = (Account) session.getAttribute("account");
//        String token = request.getHeader("token");
//        int id = TokenUtil.getData(token);
        Cookie[] cookies = request.getCookies();
        int id=TokenUtil.getDataCookie(cookies);
        Company company = this.incService.prechange(id);
//        Company nullCompany = this.incService.getVoidCompany();
//        model.addAttribute("company", Objects.requireNonNullElse(company, nullCompany));
        System.out.println("inc/prechange  "+company);
        return company;
    }
    /*
    * 修改个人信息
    * */
    @RequestMapping("/change")
    public int change(Company company, HttpSession session, HttpServletRequest request){
        System.out.println("inc/change   "+company);
//        Account account = (Account) session.getAttribute("account");
//        String token = request.getHeader("token");
//        int id = TokenUtil.getData(token);
        Cookie[] cookies = request.getCookies();
        int id=TokenUtil.getDataCookie(cookies);
        company.setId(id);
        int update = this.incService.update(company);
//        return "redirect:/inc/incMainMana";
        return update;
    }


    /*
    * 获取企业已经提交的宣讲会申请
    * */
    @RequestMapping("/preApply")
    public List<Preach> preApply(Model model, HttpServletRequest request, HttpSession session){
//        Account account = (Account) session.getAttribute("account");
//        String token = request.getHeader("token");
//        int id = TokenUtil.getData(token);
        Cookie[] cookies = request.getCookies();
        int id=TokenUtil.getDataCookie(cookies);
//        System.out.println(account);
//        List<Preach> preachList = this.incService.getIncPreach(account.getId());
        List<Preach> preachList = this.incService.getIncPreach(id);
//        List<Preach> preachList = this.incService.getIncPreach(id);
//        if (preachList == null)
//            return "inc-apply-preach";
//        else{
//            model.addAttribute("preachList", preachList);
//            return "inc-applied-list";
//        }
//        System.out.println(preachList);
        return preachList;
    }
//    @RequestMapping("/toApply")
//    public String toApply(){
//        return "inc-apply-preach";
//    }

    /*
    * 申请宣讲会
    * */
    @RequestMapping("/applyPreach")
    public int applyPreach(Preach preach, HttpSession session, HttpServletRequest request){
//        Account account = (Account) session.getAttribute("account");
        System.out.println("applypreach"+preach);
//        String token = request.getHeader("token");
//        int id = TokenUtil.getData(token);
        Cookie[] cookies = request.getCookies();
        int id=TokenUtil.getDataCookie(cookies);
//        int i = this.incService.addPreach(account.getId(), preach);
        int i = this.incService.addPreach(id, preach);
        return i;
    }


    /*
    * 获得某个宣讲会详情
    * */
    @RequestMapping("/toChangePreach")
    public Preach toChangePreach(int id, Model model){
        System.out.println("tcp");
        System.out.println(id);
        Preach preach = this.incService.queryPreach(id);
        model.addAttribute("preach", preach);
        System.out.println("inc/tcp2  "+preach);
        return preach;
    }
    /*
    * 修改宣讲会信息
    * */
    @RequestMapping("/changePreach")
    public int changePreach(Preach preach){
        System.out.println("inc/cp   "+preach);
        int i = this.incService.updatePreach(preach);
//        if (i==0){
//            return "";
//        } else
//            return "redirect:/inc/preApply";
        return i;
    }


//    @RequestMapping("/toWorkList")
//    public List<Work> toWorkList(int id, Model model, HttpSession session){
//        List<Work> workList = this.incService.workOfPreach(id);
//        model.addAttribute("workList", workList);
//        session.setAttribute("pid", id);
//        return workList;
//    }
//    @RequestMapping("/toWorkChange")
//    public Work toWorkChange(int wid, Model model, HttpSession session){
//        Work work = this.incService.queryAWork(wid);
//        model.addAttribute("work", work);
//        return work;
//    }
//    @RequestMapping("/workChange")
//    public int workChange(Work work, HttpSession session){
//        int pid = (int) session.getAttribute("pid");
//        session.removeAttribute("pid");
//        int i = this.incService.updateWork(work);
////        return "redirect:/inc/toWorkList?id="+pid;
//        if (i==0){
//            return 0;
//        }else {
//            return pid;
//        }
//    }
//    @RequestMapping("/toAddWork")
//    public String toAddWork(){
//        return "inc-work-add";
//    }
//    @RequestMapping("/addWork")
//    public int addWork(Work work,HttpSession session){
//        int pid = (int) session.getAttribute("pid");
//        int i = this.incService.addWork(work, pid);
//        session.removeAttribute("pid");
////        return "redirect:/inc/toWorkList?id="+pid;
//        if (i==0){
//            return 0;
//        }else {
//            return pid;
//        }
//    }

    @RequestMapping("/test")
    public int test(){
        return 1;
    }



}
