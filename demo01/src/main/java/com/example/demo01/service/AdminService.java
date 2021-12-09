package com.example.demo01.service;

import com.example.demo01.domain.Admin;
import com.example.demo01.domain.Company;
import com.example.demo01.mapper.AdminMapper;
import com.example.demo01.mapper.IncMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private IncMapper incMapper;

    public Admin idSearch(int id){
        return this.adminMapper.queryById(id);
    }

    public List<Company> allCompany(){
        return this.incMapper.findAll();
    }

}
