package com.example.demo01.mapper;

import com.example.demo01.domain.Interview;
import com.example.demo01.domain.Interviewpro;
import com.example.demo01.domain.Interviewstu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InterviewMapper {

    int add(Interview interview);

    List<Interview> findBySid(int sid);

    int updateStatus(Interview interview);
}
