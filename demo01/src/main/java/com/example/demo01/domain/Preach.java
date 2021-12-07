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
    private String title;
    private String desc;
    private int envoyid;
    private String time2;

    @Override
    public String toString() {
        return "Preach{" +
                "id=" + id +
                ", time=" + time +
                ", ctime=" + ctime +
                ", addr='" + addr + '\'' +
                ", school='" + school + '\'' +
                ", classification='" + classification + '\'' +
                ", status='" + status + '\'' +
                ", comid=" + comid +
                ", principal='" + principal + '\'' +
                ", tel='" + tel + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", envoyid=" + envoyid +
                ", time2='" + time2 + '\'' +
                '}';
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getEnvoyid() {
        return envoyid;
    }

    public void setEnvoyid(int envoyid) {
        this.envoyid = envoyid;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Preach() {
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public int getTime2() {
        return time2;
    }

    public void setTime2(int time2) {
        this.time2 = time2;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Preach(int id, Date time, Time ctime, String addr, String school, String classification, String status, int comid, String principal, String tel) {
        this.id = id;
        this.time = time;
        this.ctime = ctime;
        this.addr = addr;
        this.school = school;
        this.classification = classification;
        this.status = status;
        this.comid = comid;
        this.principal = principal;
        this.tel = tel;
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
