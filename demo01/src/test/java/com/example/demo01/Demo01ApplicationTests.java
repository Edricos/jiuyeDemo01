package com.example.demo01;

import com.example.demo01.controller.IncController;
import com.example.demo01.domain.Account;
import com.example.demo01.mapper.AccountMapper;
import com.example.demo01.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo01ApplicationTests {

    @Autowired
    AccountMapper userMapper;

    @Autowired
    AccountService accountService;

    @Autowired
    private IncController incController;


    @Test
    void contextLoads() {}
    @Test
    void test1(){
        Account account = new Account(2, "tom", "123", "stu");
        Account account1 = userMapper.findByCondition(account);
        System.out.println(account1);
    }



}
