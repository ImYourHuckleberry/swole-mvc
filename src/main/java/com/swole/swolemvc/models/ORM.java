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

    public int deadlift;
    @NotNull

    public int benchpress;
    @NotNull

    public int squat;
    @NotNull

    public int overheadpress;
    @NotNull

    public int bentoverrow;

    public ORM(int deadlift, int benchpress, int squat, int overheadpress, int bentoverrow) {
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

    public int getDeadlift() {
        return deadlift;
    }

    public void setDeadlift(int deadlift) {
        this.deadlift = deadlift;
    }

    public int getBenchpress() {
        return benchpress;
    }

    public void setBenchpress(int benchpress) {
        this.benchpress = benchpress;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }

    public int getOverheadpress() {
        return overheadpress;
    }

    public void setOverheadpress(int overheadpress) {
        this.overheadpress = overheadpress;
    }

    public int getBentoverrow() {
        return bentoverrow;
    }

    public void setBentoverrow(int bentoverrow) {
        this.bentoverrow = bentoverrow;
    }


}
