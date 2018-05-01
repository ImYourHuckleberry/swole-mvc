package com.swole.swolemvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity

public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String body;
    private Date date = new Date();

    public Post(){}

    public Post(Long id, String title, String body){
        this.id=id;
        this.title=title;
        this.body=body;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author='"  + '\'' + '}';
    }

}
