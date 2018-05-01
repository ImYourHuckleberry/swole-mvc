package com.swole.swolemvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class ORM {
    @Id
    @GeneratedValue
    private int id;


    @NotNull

    public float deadlift;
    @NotNull

    public float benchpress;
    @NotNull

    public float squat;
    @NotNull

    public float overheadpress;
    @NotNull

    public float bentoverrow;

    public int dtype;

    public ORM(float deadlift, float benchpress, float squat, float overheadpress, float bentoverrow) {
        this.benchpress = benchpress;
        this.deadlift = deadlift;
        this.squat = squat;
        this.overheadpress = overheadpress;
        this.bentoverrow = bentoverrow;
    }


    public ORM() {

    }

    public int getId() {
        return id;
    }

    public float getDeadlift() {
        return deadlift;
    }

    public void setDeadlift(float deadlift) {
        this.deadlift = deadlift;
    }

    public float getBenchpress() {
        return benchpress;
    }

    public void setBenchpress(float benchpress) {
        this.benchpress = benchpress;
    }

    public float getSquat() {
        return squat;
    }

    public void setSquat(float squat) {
        this.squat = squat;
    }

    public float getOverheadpress() {
        return overheadpress;
    }

    public void setOverheadpress(float overheadpress) {
        this.overheadpress = overheadpress;
    }

    public float getBentoverrow() {
        return bentoverrow;
    }

    public void setBentoverrow(float bentoverrow) {
        this.bentoverrow = bentoverrow;
    }

}
