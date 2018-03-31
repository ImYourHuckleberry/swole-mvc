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
    @Size(min=1, max=20)
    private String deadlift;
    @NotNull
    @Size(min=1, max=20)
    private String benchpress;
    @NotNull
    @Size(min=1, max=20)
    private String squat;
    @NotNull
    @Size(min=1, max=20)
    private String overheadpress;
    @NotNull
    @Size(min=1, max=20)
    private String bentoverrow;

    public ORM(String deadlift, String benchpress, String squat, String overheadpress, String bentoverrow){
        this.benchpress=benchpress;
        this.deadlift=deadlift;
        this.squat=squat;
        this.overheadpress=overheadpress;
        this.bentoverrow=bentoverrow;
    }

    public ORM(){

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

    public String getSquat() {
        return squat;
    }

    public void setSquat(String squat) {
        this.squat = squat;
    }

    public String getOverheadpress() {
        return overheadpress;
    }

    public void setOverheadpress(String overheadpress) {
        this.overheadpress = overheadpress;
    }

    public String getBentoverrow() {
        return bentoverrow;
    }

    public void setBentoverrow(String bentoverrow) {
        this.bentoverrow = bentoverrow;
    }
}
