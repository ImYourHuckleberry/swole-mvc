package com.swole.swolemvc.models;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class OverHeadPress {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String overheadpress;
    public overheadpress(String overheadpress) {
        this.overheadpress = overheadpress;
    }
    public overheadpress(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOverheadpress() {
        return overheadpress;
    }

    public void setOverheadpress(String overheadpress) {
        this.overheadpress = overheadpress;
    }
}
