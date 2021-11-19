package com.example.demo01.service;

import com.example.demo01.domain.Account;
import com.example.demo01.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private IncService incService;

    public Account login(Account account){
        return this.accountMapper.login(account);
    }

    public Account regist(Account account){
        int i = this.accountMapper.add(account);
        if (account.getClasss().equals("inc")){
            this.incService.add(account.getId());
        }
        System.out.println(i);
        return account;
    }

}
