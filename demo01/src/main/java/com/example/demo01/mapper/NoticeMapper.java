package com.example.demo01.mapper;

import com.example.demo01.domain.News;
import com.example.demo01.domain.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NoticeMapper {

    List<Notice> five();

    Notice a(int id);

    List<Notice> all();

    int add(Notice notice);
}
