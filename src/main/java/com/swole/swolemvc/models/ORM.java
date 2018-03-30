package com.swole.swolemvc.models;

public class ORM {

    private long id;
    private String deadlift;
    private String benchpress;
    private String overheadpress;
    private String squat;
    private String bentoverrow;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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