package com.example.demo01.controller;

import com.example.demo01.domain.Admin;
import com.example.demo01.domain.Company;
import com.example.demo01.domain.Preach;
import com.example.demo01.mapper.AdminMapper;
import com.example.demo01.service.AdminService;
import com.example.demo01.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private StuService stuService;


    @RequestMapping("/toChange")
    public Admin toChange(int id){
        Admin admin = this.adminService.idSearch(id);
        return admin;
    }
    @RequestMapping("/change")
    public int change(Admin admin){
        if (admin!=null){
            int i = this.adminService.changeAdmin(admin);
            return i;
        } else {
            System.out.printf("inc/change 未接收到admin");
            return 0;
        }
    }

    @RequestMapping("/loadPreach")
    public List<Preach> loadPreach(){
        return this.stuService.allPreach();
    }
    @RequestMapping("/passPreach")
    public int passPreach(int pid){
        return 0;
    }
    @RequestMapping("/refusePreach")
    public int refusePreach(int pid){
        return 0;
    }
    @RequestMapping("/cancelPreach")
    public int cancelPreach(int pid){
        return 0;
    }


    @RequestMapping("/loadCompany")
    public List<Company> loadCompany(){
        List<Company> companies = this.adminService.allCompany();
        return companies;
    }
    @RequestMapping("/activeCompany")
    public int activeCompany(int cid){
        return 0;
    }
    @RequestMapping("/refuseCompany")
    public int refuseCompany(int cid, String note){
        return 0;
    }
    @RequestMapping("/frozenCompany")
    public int frozenCompany(int cid, String note){
        return 0;
    }
}
