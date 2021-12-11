package com.example.demo01.domain;

public class Interview {
    private int id;
    private int sid;
    private int pid;
    private int wid;
    private String apply;
    private String reply;
    private String status;

    public Interview() {
    }

    public Interview(int id, int sid, int pid, int wid, String apply, String reply, String status) {
        this.id = id;
        this.sid = sid;
        this.pid = pid;
        this.wid = wid;
        this.apply = apply;
        this.reply = reply;
        this.status = status;
    }

    @Override
    public String toString() {
        return "interview{" +
                "id=" + id +
                ", sid=" + sid +
                ", pid=" + pid +
                ", wid=" + wid +
                ", apply='" + apply + '\'' +
                ", reply='" + reply + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
