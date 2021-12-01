package com.edric.inc.mapper;

import com.edric.inc.domain.Rpw;
import com.edric.inc.domain.Work;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorkMapper {
    List<Work> findByPid(int pid);
    Work findById(int wid);
    int update(Work work);
    int add(Work work);
    int addPW(Rpw rpw);
}
