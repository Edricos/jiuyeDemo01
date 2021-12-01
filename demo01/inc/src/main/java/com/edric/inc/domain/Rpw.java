package com.edric.inc.domain;

public class Rpw {
    private int workid;
    private int preachid;

    public Rpw() {
    }

    @Override
    public String toString() {
        return "Rpw{" +
                "workid=" + workid +
                ", preachid=" + preachid +
                '}';
    }

    public Rpw(int workid, int preachid) {
        this.workid = workid;
        this.preachid = preachid;
    }

    public int getWorkid() {
        return workid;
    }

    public void setWorkid(int workid) {
        this.workid = workid;
    }

    public int getPreachid() {
        return preachid;
    }

    public void setPreachid(int preachid) {
        this.preachid = preachid;
    }
}
