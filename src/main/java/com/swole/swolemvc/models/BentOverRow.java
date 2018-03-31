package com.swole.swolemvc.models;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class BentOverRow {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String bentoverrow;
    public bentoverrow(String bentoverrow) {
        this.bentoverrow = getBentoverrow();
    }
    public bentoverrow(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBentoverrow() {
        return bentoverrow;
    }

    public void setBentoverrow(String bentoverrow) {
        this.bentoverrow = bentoverrow;
    }
}
