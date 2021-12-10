package com.example.demo01.service;

import com.example.demo01.domain.News;
import com.example.demo01.domain.Notice;
import com.example.demo01.mapper.NewsMapper;
import com.example.demo01.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {
    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private NoticeMapper noticeMapper;

    public List<News> fiveNews(){
        return this.newsMapper.fiveNews();
    }
    public News aNews(int id){
        return this.newsMapper.aNews(id);
    }
    public List<News> allNews(){
        return this.newsMapper.news();
    }



    public List<Notice> fiveNotice(){
        return this.noticeMapper.five();
    }
    public Notice aNotice(int id){
        return this.noticeMapper.a(id);
    }
    public List<Notice> allNotice(){
        return this.noticeMapper.all();
    }

}
