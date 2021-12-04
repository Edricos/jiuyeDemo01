package com.example.demo01.domain;

public class Envoy {
    private int id;
    private String intro;

    public Envoy() {
    }

    public Envoy(int id, String intro) {
        this.id = id;
        this.intro = intro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "Envoy{" +
                "id=" + id +
                ", intro='" + intro + '\'' +
                '}';
    }
}
