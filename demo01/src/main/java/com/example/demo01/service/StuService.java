package com.example.demo01.service;

import com.example.demo01.domain.Account;
import com.example.demo01.domain.Preach;
import com.example.demo01.domain.Stu;
import com.example.demo01.domain.Work;
import com.example.demo01.mapper.PreachMapper;
import com.example.demo01.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService {

    @Autowired
    private StuMapper stuMapper;
    @Autowired
    private PreachMapper preachMapper;

    public List<Preach> allPreach(){
        return this.preachMapper.All();
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

    public List<Work> getWorkInfo(){
        return null;
    }
    public List<Preach> getAppointment(int id){
        return null;
    }
}
