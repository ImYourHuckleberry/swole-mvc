package com.swole.swolemvc.models;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Squat {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String squat;
    public Squat(String squat) {
        this.squat = squat;
    }
    public Squat(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSquat() {
        return squat;
    }

    public void setSquat(String squat) {
        this.squat = squat;
    }
}
