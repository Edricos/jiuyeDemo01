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
    private String intro;
    private int envoyid;
    private int time2;
    private String interviewRoom;

    public Preach() {
    }

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
                ", intro='" + intro + '\'' +
                ", envoyid=" + envoyid +
                ", time2=" + time2 +
                ", interviewRoom='" + interviewRoom + '\'' +
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

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getEnvoyid() {
        return envoyid;
    }

    public void setEnvoyid(int envoyid) {
        this.envoyid = envoyid;
    }

    public int getTime2() {
        return time2;
    }

    public void setTime2(int time2) {
        this.time2 = time2;
    }

    public String getInterviewRoom() {
        return interviewRoom;
    }

    public void setInterviewRoom(String interviewRoom) {
        this.interviewRoom = interviewRoom;
    }
}
