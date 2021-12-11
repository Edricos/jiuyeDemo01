package com.example.demo01.domain;

public class Interviewstu extends Interview{
    private Stu stu;

    public Interviewstu() {
    }

    public Interviewstu(Stu stu) {
        this.stu = stu;
    }

    public Interviewstu(int id, int sid, int pid, int wid, String apply, String reply, String status, Stu stu) {
        super(id, sid, pid, wid, apply, reply, status);
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Interviewstu{" +
                "stu=" + stu +
                '}';
    }

    public Stu getStu() {
        return stu;
    }

    public void setStu(Stu stu) {
        this.stu = stu;
    }
}
