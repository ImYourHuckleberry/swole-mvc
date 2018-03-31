package com.swole.swolemvc.models;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ORM {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String deadlift;
    @NotNull
    private String benchpress;
    @NotNull
    private String overheadpress;
    @NotNull
    private String squat;
    @NotNull
    private String bentoverrow;

    public Deadlift(String deadlift) {
        this.deadlift = deadlift;
    }
    public Deadlift(){

    }
    public overheadpress(String overheadpress) {
        this.overheadpress = overheadpress;
    }
    public overheadpress(){

    }

    public benchpress(String benchpress) {
        this.benchpress = benchpress;
    }
    public benchpress(){

    }
    public Squat(String squat) {
        this.squat = squat;
    }
    public Squat(){

    }
    public bentoverrow(String bentoverrow) {
        this.bentoverrow = getBentoverrow();
    }
    public bentoverrow(){

    }


    public int getId() {
        return id;
    }


    public String getDeadlift() {
        return deadlift;
    }

    public void setDeadlift(String deadlift) {
        this.deadlift = deadlift;
    }

    public String getBenchpress() {
        return benchpress;
    }

    public void setBenchpress(String benchpress) {
        this.benchpress = benchpress;
    }

    public String getOverheadpress() {
        return overheadpress;
    }

    public void setOverheadpress(String overheadpress) {
        this.overheadpress = overheadpress;
    }

    public String getSquat() {
        return squat;
    }

    public void setSquat(String squat) {
        this.squat = squat;
    }

    public String getBentoverrow() {
        return bentoverrow;
    }

    public void setBentoverrow(String bentoverrow) {
        this.bentoverrow = bentoverrow;
    }


}