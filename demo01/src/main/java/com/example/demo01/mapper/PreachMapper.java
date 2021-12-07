package com.example.demo01.mapper;

import com.example.demo01.domain.Preach;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PreachMapper {
    List<Preach> findAll(int id);
    List<Preach> All();
    int addPreach(Preach preach);
    Preach findById(int id);
    int updateById(Preach preach);
}
