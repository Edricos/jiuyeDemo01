package com.example.demo01.domain;

import java.util.Date;

public class News {
    private int id;
    private String title;
    private Date time;
    private String writer;
    private String content;

    public News() {
    }

    @Override
    public String toString() {
        return "news{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", time=" + time +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
