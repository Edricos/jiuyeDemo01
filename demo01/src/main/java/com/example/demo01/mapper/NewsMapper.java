package com.example.demo01.mapper;

import com.example.demo01.domain.News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NewsMapper {
    List<News> fiveNews();

    News aNews(int id);

    List<News> news();

    int add(News news);

    int del(int id);

}
