package com.example.demo01.service;

import com.example.demo01.domain.Company;
import com.example.demo01.mapper.IncMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncService {

    @Autowired
    private IncMapper incMapper;

    public Company prechange(int id){
        return this.incMapper.findById(id);
    }

    public Company getVoidCompany(){
        Company company = new Company();
        company.setEmail("");
        company.setScale(0);
        company.setTel("");
        company.setTrades("");
        company.setName("");
        return company;
    }
    public int add(int id){
        return this.incMapper.add(id);
    }

    public int update(Company company){
        int update = this.incMapper.update(company);
        return update;
    }
}
