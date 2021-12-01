package com.edric.inc.domain;

public class Company {
    private int id;
    private String name;
    private String trades;
    private int scale;
    private String tel;
    private String email;

    public Company() {
    }

    public Company(int id, String name, String trades, int scale, String tel, String email) {
        this.id = id;
        this.name = name;
        this.trades = trades;
        this.scale = scale;
        this.tel = tel;
        this.email = email;
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

    public String getTrades() {
        return trades;
    }

    public void setTrades(String trades) {
        this.trades = trades;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trades='" + trades + '\'' +
                ", scale=" + scale +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
