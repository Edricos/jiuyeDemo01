package com.example.demo01.service;

import com.example.demo01.domain.Company;
import com.example.demo01.domain.Preach;
import com.example.demo01.domain.Work;
import com.example.demo01.mapper.IncMapper;
import com.example.demo01.mapper.PreachMapper;
import com.example.demo01.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncService {

    @Autowired
    private IncMapper incMapper;
    @Autowired
    private PreachMapper preachMapper;
    @Autowired
    private WorkMapper workMapper;


    public List<Work> workOfPreach(int id){
        return this.workMapper.findByPid(id);
    }

    public int updatePreach(Preach preach){
        return this.preachMapper.updateById(preach);
    }

    public Preach queryPreach(int id){
        return preachMapper.findById(id);
    }

    public List<Preach> getIncPreach(int id){
        List<Preach> preachList = preachMapper.findAll(id);
        return preachList;
    }

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

    public int addPreach(int comid, Preach preach){
        preach.setComid(comid);
        int i = this.preachMapper.addPreach(preach);
        return i;
    }


}
