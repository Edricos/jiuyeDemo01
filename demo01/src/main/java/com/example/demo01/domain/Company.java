package com.example.demo01.domain;

public class Company {
    private int id;
    private String name;
    private String trades;
    private int scale;
    private String tel;
    private String email;
    private String unicode;
    private String charger;
    private String intro;
    private String b_licence;
    private String note;
    private String status;
    private String addr;

    public Company() {
    }

    public Company(int id, String name, String trades, int scale, String tel, String email, String unicode, String charger, String intro, String b_licence, String note, String status) {
        this.id = id;
        this.name = name;
        this.trades = trades;
        this.scale = scale;
        this.tel = tel;
        this.email = email;
        this.unicode = unicode;
        this.charger = charger;
        this.intro = intro;
        this.b_licence = b_licence;
        this.note = note;
        this.status = status;
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
                ", unicode='" + unicode + '\'' +
                ", charger='" + charger + '\'' +
                ", intro='" + intro + '\'' +
                ", b_licence='" + b_licence + '\'' +
                ", note='" + note + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getB_licence() {
        return b_licence;
    }

    public void setB_licence(String b_licence) {
        this.b_licence = b_licence;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

}
