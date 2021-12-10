package com.example.demo01.mapper;

import com.example.demo01.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminMapper {
    Admin queryById(int id);
    int update(Admin admin);
}
