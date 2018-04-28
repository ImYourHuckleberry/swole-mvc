package com.swole.swolemvc.models;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



abstract public class RepCalculator extends ORM {
//lift method that i can call and onerepmax is an input
    static public float[][] Lift(ORM oneRepMax) {

        float[][] todaysRep = new float[6][5];


        float[] lift = new float[5];
        lift[0] = oneRepMax.getDeadlift();
        lift[1] = oneRepMax.getSquat();
        lift[2] = oneRepMax.getOverheadpress();
        lift[3] = oneRepMax.getBenchpress();
        lift[4] = oneRepMax.getBentoverrow();


        float[] week = new float[6];
        week[0] = (7 / 10.f);
        week[1] = (75 / 100.f);
        week[2] = (8 / 10.f);
        week[3] = (825 / 1000.f);
        week[4] = (85 / 100.f);
        week[5] = (1.f);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                todaysRep[i][j] = week[i] * lift[j];
            }
        }
        return todaysRep;
    }
}










