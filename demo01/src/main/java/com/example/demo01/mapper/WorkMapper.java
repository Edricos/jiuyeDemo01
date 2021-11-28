package com.example.demo01.mapper;

import com.example.demo01.domain.Work;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkMapper {
    List<Work> findByPid(int pid);
}
