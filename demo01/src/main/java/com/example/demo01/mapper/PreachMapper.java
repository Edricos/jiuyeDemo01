package com.example.demo01.mapper;

import com.example.demo01.domain.Preach;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface PreachMapper {
    String findNameById(int id);
    Date findTimeById(int  id);
    String findAddrByTime(int id);
    int updateStatus(Preach preach);
    List<Preach> findAll(int id);
    List<Preach> All();
    List<Preach> AllP();
    int addPreach(Preach preach);
    Preach findById(int id);
    int updateById(Preach preach);

    List<Preach> fivePreach();
}
