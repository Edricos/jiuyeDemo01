package com.example.demo01.controller;

import com.example.demo01.domain.*;
import com.example.demo01.mapper.AdminMapper;
import com.example.demo01.service.AdminService;
import com.example.demo01.service.IncService;
import com.example.demo01.service.IndexService;
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
    @Autowired
    private IncService incService;
    @Autowired
    private IndexService indexService;


//    @RequestMapping("/toChange")
//    public Admin toChange(int id) {
//        Admin admin = this.adminService.idSearch(id);
//        return admin;
//    }

//    @RequestMapping("/change")
//    public int change(Admin admin) {
//        if (admin != null) {
//            int i = this.adminService.changeAdmin(admin);
//            return i;
//        } else {
//            System.out.printf("admin/change 未接收到admin");
//            return 0;
//        }
//    }

    /*
    * 加载已经激活的企业账户申请的宣讲会
    */
    @RequestMapping("/loadPreach")
    public List<Preach> loadPreach() {
        List<Preach> preachList = this.adminService.allPreach();
        System.out.println("admin/loadpreach   "+preachList);
        return preachList;
    }
    /*
    * 获取某个宣讲会信息
    * */
    @RequestMapping("/loadAPreach")
    public Preach loadAPreach(int id) {
        return this.adminService.aPreach(id);
    }

    /*
    * 审核宣讲会
    * */
    @RequestMapping("/passPreach")
    public int passPreach(int id, String note) {
        int passed = this.adminService.preachVerify(id, "Passed", note);
        return passed;
    }
    @RequestMapping("/refusePreach")
    public int refusePreach(int id, String note) {
        int Refused = this.adminService.preachVerify(id, "Refused", note);
        return Refused;
    }
    @RequestMapping("/cancelPreach")
    public int cancelPreach(int id, String note) {
        int Canceled = this.adminService.preachVerify(id, "Canceled", note);
        return Canceled;
    }



    /*
     *加载所以申请注册的公司
     */
    @RequestMapping("/loadCompany")
    public List<Company> loadCompany() {
        List<Company> companies = this.adminService.allCompany();
        System.out.println("admin/loadCompany   " + companies);
        return companies;
    }

    /*
    * 加载某个公司详情
    * */
    @RequestMapping("/loadACompany")
    public Company loadACompany(int id) {
        Company prechange = this.incService.prechange(id);
        System.out.println("admin/loadACompany   " + prechange);
        return prechange;
    }


    /*
    * 审核公司账户
    * */
    @RequestMapping("/activeCompany")
    public int activeCompany(int id, String note) {
        int i = this.adminService.companyVerify(id, "Active", note);
        return i;
    }
    @RequestMapping("/refuseCompany")
    public int refuseCompany(int id, String note) {
        int i = this.adminService.companyVerify(id, "Refused", note);
        return i;
    }
    @RequestMapping("/frozenCompany")
    public int frozenCompany(int id, String note) {
        int i = this.adminService.companyVerify(id, "Frozened", note);
        return i;
    }



    /*
    * 查看所有新闻
    * */
    @RequestMapping("/allNews")
    public List<News> news(){
        List<News> newsList = this.indexService.allNews();
        return newsList;
    }

    /*
    * 查看所有公告
    * */
    @RequestMapping("/allNotice")
    public List<Notice> notice(){
        List<Notice> noticeList = this.indexService.allNotice();
        return noticeList;
    }

    /*
    * 添加新闻、公告
    * */
    @RequestMapping("/addNews")
    public int addNews(News news){
        int i = this.adminService.addNews(news);
        return i;
    }
    @RequestMapping("/addNotice")
    public int addNotice(Notice notice){
        int i = this.adminService.addNotice(notice);
        return i;
    }


    /*
    * 删除新闻公告
    * */
    @RequestMapping("/delNews")
    public int delNews(int id){
        int i = this.adminService.delNews(id);
        return i;
    }
    @RequestMapping("/delNotice")
    public int delNotice(int id){
        int i = this.adminService.delNotice(id);
        return i;
    }


}
