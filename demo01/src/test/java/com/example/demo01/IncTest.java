package com.example.demo01;

import com.example.demo01.domain.Account;
import com.example.demo01.domain.Company;
import com.example.demo01.service.IncService;
import com.example.demo01.util.TokenUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IncTest {
    @Autowired
    private IncService incService;

    @Test
    public void test1(){
        Company prechange = incService.prechange(9);
        System.out.println(prechange);
    }
    @Test
    public void tokentest1(){
        Account account = new Account();
        account.setId(3);
        String token = TokenUtil.sign(account);
        boolean verify = TokenUtil.verify(token);
    }
}
