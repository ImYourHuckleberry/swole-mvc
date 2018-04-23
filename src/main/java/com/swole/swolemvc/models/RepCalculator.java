package com.swole.swolemvc.models;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



public class RepCalculator extends ORM{



    private ORM oneRepMax;

    int weekOnePercent = (7/10);


    public RepCalculator(ORM oneRepMax){
        this.oneRepMax  = oneRepMax;
    }

    public int WeeklyLiftWeights(){
        int lift[]=new int[100];
        int deadlift = oneRepMax.getDeadlift();
        int squat = oneRepMax.getSquat();
        int overheadpress = oneRepMax.getOverheadpress();
        int benchpress = oneRepMax.getBenchpress();
        int bentoverrow = oneRepMax.getBentoverrow();
        return (deadlift*weekOnePercent);

    }





}
