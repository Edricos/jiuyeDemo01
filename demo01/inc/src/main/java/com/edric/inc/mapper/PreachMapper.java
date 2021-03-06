package com.edric.inc.mapper;


import com.edric.inc.domain.Preach;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PreachMapper {
    List<Preach> findAll(int id);
    int addPreach(Preach preach);
    Preach findById(int id);
    int updateById(Preach preach);
}
