package com.example.demo01.mapper;

import com.example.demo01.domain.Company;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IncMapper {
    Company findById(int id);
    int add(int id);
    int update(Company company);
}
