package com.example.demo01.mapper;

import com.example.demo01.domain.Company;
import com.example.demo01.domain.Preach;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IncMapper {
    Company findById(int id);
    List<Company> findAll();
    int add(int id);
    int update(Company company);
}
