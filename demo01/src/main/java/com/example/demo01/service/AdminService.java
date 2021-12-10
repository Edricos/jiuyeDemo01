package com.example.demo01.service;

import com.example.demo01.domain.Admin;
import com.example.demo01.domain.Company;
import com.example.demo01.domain.Preach;
import com.example.demo01.mapper.AdminMapper;
import com.example.demo01.mapper.IncMapper;
import com.example.demo01.mapper.PreachMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private IncMapper incMapper;

    @Autowired
    private PreachMapper preachMapper;

    public List<Preach> allPreach(){
        List<Preach> preachList = this.preachMapper.All();
        for (Preach preach : preachList) {
            preach.setComname(this.incMapper.findNameById(preach.getComid()));
        }
        return preachList;
    }
    public Preach aPreach(int id){
        Preach preach = this.preachMapper.findById(id);
        preach.setComname(this.incMapper.findNameById(preach.getComid()));
        return preach;
    }

    public int preachVerify(int pid, String status){
        Preach preach = new Preach();
        preach.setId(pid);
        preach.setStatus(status);
        int i = this.preachMapper.updateStatus(preach);
        return i;
    }
    public int preachVerify(int pid, String status, String note){
        Preach preach = new Preach();
        preach.setId(pid);
        preach.setNote(note);
        preach.setStatus(status);
        int i = this.preachMapper.updateStatus(preach);
        return i;
    }


    public int companyVerify(int cid, String status){
        Company company = new Company();
        company.setId(cid);
        company.setStatus(status);
        int i = this.incMapper.changeStatus(company);
        return i;
    }
    public int companyVerify(int cid, String status, String note){
        Company company = new Company();
        company.setId(cid);
        company.setStatus(status);
        company.setNote(note);
        int i = this.incMapper.changeStatus(company);
        return i;
    }

    public int changeAdmin(Admin admin){
        int update = this.adminMapper.update(admin);
        return update;
    }

    public Admin idSearch(int id){
        return this.adminMapper.queryById(id);
    }

    public List<Company> allCompany(){
        return this.incMapper.findAll();
    }

}
