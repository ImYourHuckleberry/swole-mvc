package com.swole.swolemvc.models;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class BenchPress {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String benchpress;
    public benchpress(String benchpress) {
        this.benchpress = benchpress;
    }
    public benchpress(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBenchpress() {
        return benchpress;
    }

    public void setBenchpress(String benchpress) {
        this.benchpress = benchpress;
    }
}
