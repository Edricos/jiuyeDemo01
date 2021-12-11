package com.example.demo01.service;

import com.example.demo01.domain.*;
import com.example.demo01.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IncService {

    @Autowired
    private IncMapper incMapper;
    @Autowired
    private PreachMapper preachMapper;
    @Autowired
    private WorkMapper workMapper;
    @Autowired
    private InterviewMapper interviewMapper;
    @Autowired
    private StuMapper stuMapper;

    public Interviewstu aInterviewstu(int inid){
        Interviewstu interviewstu = this.interviewMapper.findById(inid);
        interviewstu.setStu(stuMapper.findById(interviewstu.getSid()));

        return interviewstu;
    }

    public List<Interviewstu> findByComid(int comid){
        List<Interviewstu> interviewList = this.interviewMapper.findByComid(comid);
        for (Interviewstu interviewstu : interviewList) {
            interviewstu.setStu(stuMapper.findById(interviewstu.getSid()));
        }
        return interviewList;
    }

    public int interviewVerify(int inid, String status, String reply){
        Interview interview = new Interview();
        interview.setId(inid);
        interview.setStatus(status);
        interview.setReply(reply);
        int i = this.interviewMapper.updateStatus(interview);
        return i;

    }

    public int addWork(Work work, int pid){
        work.setRefresh(new Date());
        int add = this.workMapper.add(work);
        Rpw rpw = new Rpw();
        rpw.setPreachid(pid);
        rpw.setWorkid(work.getId());
        int i = this.workMapper.addPW(rpw);
        return i;
    }

    public int updateWork(Work work){
        Date date = new Date();
        work.setRefresh(date);
        return this.workMapper.update(work);
    }

    public Work queryAWork(int id){
        return this.workMapper.findById(id);
    }

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
        preach.setCtime(new Date());
//        preach.setDesc(null);
        int i = this.preachMapper.addPreach(preach);
        return i;
    }

}
