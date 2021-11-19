package com.example.demo01.domain;

public class Account {
    private int id;
    private String username;
    private String password;
    private String classs;

    public Account() {
    }

    public Account(int id, String username, String password, String classs) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.classs = classs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", classs='" + classs + '\'' +
                '}';
    }
}
