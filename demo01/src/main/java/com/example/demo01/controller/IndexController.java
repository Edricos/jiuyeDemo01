package com.example.demo01.controller;

import com.example.demo01.domain.News;
import com.example.demo01.domain.Notice;
import com.example.demo01.domain.Preach;
import com.example.demo01.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;


    /*
    * 获得最新5个新闻
    * */
    @RequestMapping("/fiveNews")
    public List<News> fiveNews(){
        List<News> newsList = this.indexService.fiveNews();
        return newsList;
    }
    /*
    * 获取某新闻详情
    * */
    @RequestMapping("/aNews")
    public News aNews(int id){
        News news = this.indexService.aNews(id);
        return news;
    }

    /*
    * 所有新闻，时间降序
    * */
    @RequestMapping("/news")
    public List<News> news(){
        List<News> newsList = this.indexService.allNews();
        return newsList;
    }

    @RequestMapping("/fiveNotice")
    public List<Notice> fiveNotice(){
        List<Notice> noticeList = this.indexService.fiveNotice();
        return noticeList;
    }
    @RequestMapping("/aNotice")
    public Notice aNotice(int id){
        Notice notice = this.indexService.aNotice(id);
        return notice;
    }
    @RequestMapping("/notice")
    public List<Notice> notice(){
        List<Notice> noticeList = this.indexService.allNotice();
        return noticeList;
    }

    @RequestMapping("/fivePreach")
    public List<Preach> fivePreach(){
        return this.indexService.fivePreach();
    }






//    @RequestMapping(value = "/")
//    public String index(Model model){
//        return "index";
//    }

//    @RequestMapping("/indexs")
//    public String indexs(){
//        return "indexs";
//    }
}
