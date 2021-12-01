package com.edric.inc.domain;

import java.util.Date;

public class Work {
    private int id;
    private String name;
    private String city;
    private String education;
    private int experience;
    private int salarymin;
    private int salarymax;
    private Date refresh;

    public Work() {
    }

    public Work(int id, String name, String city, String education, int experience, int salarymin, int salarymax, Date refresh) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.education = education;
        this.experience = experience;
        this.salarymin = salarymin;
        this.salarymax = salarymax;
        this.refresh = refresh;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", education='" + education + '\'' +
                ", experience=" + experience +
                ", salarymin=" + salarymin +
                ", salarymax=" + salarymax +
                ", refresh=" + refresh +
                '}';
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalarymin() {
        return salarymin;
    }

    public void setSalarymin(int salarymin) {
        this.salarymin = salarymin;
    }

    public int getSalarymax() {
        return salarymax;
    }

    public void setSalarymax(int salarymax) {
        this.salarymax = salarymax;
    }

    public Date getRefresh() {
        return refresh;
    }

    public void setRefresh(Date refresh) {
        this.refresh = refresh;
    }
}
