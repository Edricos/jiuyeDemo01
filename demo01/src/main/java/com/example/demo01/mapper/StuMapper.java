package com.example.demo01.mapper;

import com.example.demo01.domain.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StuMapper {
    Stu findById(int id);
    int update(Stu stu);
}
