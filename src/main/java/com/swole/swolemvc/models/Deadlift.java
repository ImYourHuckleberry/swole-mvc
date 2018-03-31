package com.swole.swolemvc.models;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Deadlift {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String deadlift;
    public Deadlift(String deadlift) {
        this.deadlift = deadlift;
    }
    public Deadlift(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeadlift() {
        return deadlift;
    }

    public void setDeadlift(String deadlift) {
        this.deadlift = deadlift;
    }
}
