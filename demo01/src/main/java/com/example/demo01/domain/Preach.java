package com.example.demo01.domain;

import java.sql.Time;
import java.util.Date;

public class Preach {
    private int id;
    private Date time;
    private Time ctime;
    private String addr;
    private String school;
    private String classification;
    private String status;
    private int comid;
    private String principal;
    private String tel;

    public Preach() {
    }

    public Preach(int id, Date time, String addr, String school, String classification, String status, int comid) {
        this.id = id;
        this.time = time;
        this.addr = addr;
        this.school = school;
        this.classification = classification;
        this.status = status;
        this.comid = comid;
    }

    @Override
    public String toString() {
        return "Preach{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", addr='" + addr + '\'' +
                ", school='" + school + '\'' +
                ", classification='" + classification + '\'' +
                ", status='" + status + '\'' +
                ", comid=" + comid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Time getCtime() {
        return ctime;
    }

    public void setCtime(Time ctime) {
        this.ctime = ctime;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getComid() {
        return comid;
    }

    public void setComid(int comid) {
        this.comid = comid;
    }
}
