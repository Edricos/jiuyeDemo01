package com.example.demo01.domain;

import java.util.Date;

public class Interviewpro extends Interview{
    private String comname;
    private String preachname;
    private Date time;
    private String addr;

    @Override
    public String toString() {
        return "Interviewpro{" +
                "comname='" + comname + '\'' +
                ", preachname='" + preachname + '\'' +
                ", time=" + time +
                ", addr='" + addr + '\'' +
                '}';
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Interviewpro(String comname, String preachname) {
        this.comname = comname;
        this.preachname = preachname;
    }

    public Interviewpro(int id, int sid, int pid, int wid, String apply, String reply, String status, String comname, String preachname) {
        super(id, sid, pid, wid, apply, reply, status);
        this.comname = comname;
        this.preachname = preachname;
    }

    public Interviewpro() {
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getPreachname() {
        return preachname;
    }

    public void setPreachname(String preachname) {
        this.preachname = preachname;
    }
}
