package com.example.demo01.service;

import com.example.demo01.domain.*;
import com.example.demo01.mapper.IncMapper;
import com.example.demo01.mapper.InterviewMapper;
import com.example.demo01.mapper.PreachMapper;
import com.example.demo01.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StuService {

    @Autowired
    private StuMapper stuMapper;
    @Autowired
    private PreachMapper preachMapper;
    @Autowired
    private InterviewMapper interviewMapper;
    @Autowired
    private IncMapper incMapper;

    public List<Preach> allPreach(){
        return this.preachMapper.AllP();
    }
    public Preach aPreach(int id){
        Preach byId = this.preachMapper.findById(id);
        return byId;
    }

    public Stu query(Account account){
        Stu stu = this.stuMapper.findById(account.getId());
        return stu;
    }

    public int change(int id, Stu stu){
        stu.setId(id);
        return this.stuMapper.update(stu);
    }

    public int addInterview(int pid, int sid){
        Interview interview = new Interview();
        interview.setPid(pid);
        interview.setSid(sid);
//        interview.setApply(apply);
        int add = this.interviewMapper.add(interview);
        return add;
    }
    public List<Interviewpro> loadMyInterview(int sid){
        List<Interviewpro> interviewList = this.interviewMapper.findBySid(sid);
        for (Interviewpro interviewpro : interviewList) {
            interviewpro.setComname(this.incMapper.findNameByPid(interviewpro.getPid()));
            interviewpro.setPreachname(this.preachMapper.findNameById(interviewpro.getPid()));
            interviewpro.setTime(this.preachMapper.findTimeById(interviewpro.getPid()));
            interviewpro.setAddr(this.preachMapper.findAddrByTime(interviewpro.getPid()));
        }
        return interviewList;
    }
    public List<Integer> loadMyInPid(int sid){
        List<Integer> integerList = new ArrayList<Integer>();
        List<Interviewpro> interviewList = this.interviewMapper.findBySid(sid);
        for (Interviewpro interviewpro : interviewList) {
            integerList.add(interviewpro.getPid());
//            interviewpro.setComname(this.incMapper.findNameByPid(interviewpro.getPid()));
//            interviewpro.setPreachname(this.preachMapper.findNameById(interviewpro.getPid()));
        }
        return integerList;
    }

    public List<Work> getWorkInfo(){
        return null;
    }
    public List<Preach> getAppointment(int id){
        return null;
    }
}
