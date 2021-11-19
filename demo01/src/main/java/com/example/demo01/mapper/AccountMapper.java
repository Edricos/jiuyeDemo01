package com.example.demo01.mapper;

import com.example.demo01.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AccountMapper {
    Account findByCondition(Account account);
    int add(Account account);
    Account findById(int id);
    Account login(Account account);
}
