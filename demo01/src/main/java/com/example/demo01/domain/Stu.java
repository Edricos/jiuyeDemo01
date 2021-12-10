package com.example.demo01.domain;

import java.util.Date;

public class Stu {
    private int id;
    private String name;
    private String school;
    private String college;
    private String grade;
    private String major;
    private Date birth;
    private String sex;
    private String resume;


    public Stu() {
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", college='" + college + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", birth=" + birth +
                ", sex='" + sex + '\'' +
                ", resume='" + resume + '\'' +
                '}';
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Stu(int id, String name, String school, String college, String grade, String major, Date birth, String sex) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.college = college;
        this.grade = grade;
        this.major = major;
        this.birth = birth;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
