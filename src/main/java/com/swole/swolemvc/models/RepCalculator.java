package com.swole.swolemvc.models;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



abstract public class RepCalculator extends ORM {
    static public class WeekSchedule {
        public String weekName;
        public float[] reps;
    }

    private static final String[] numberNames = {
            "Zero", "One:Work up to a 10RM then perform 70% of (TM) x 6 reps x 3+ sets", "Two:Work up to an 8RM then perform 75% of  (TM) x 5 reps x 3+ sets", "Three: Work up to a 6RM then perform 80% of (TM) x 4 reps x 3+ sets", "Four:Work up to a 4RM then perform 82.5% of (TM) x 3 reps x 3+ sets", "Five: Work up to an 2RM then perform 85% of (TM) x 2 reps x 4+ sets", "Six: Work up to a new One Rep Max then 100%(TM)"
    };

    private static final float[] weeklyMultipliers = {
            0.7f, 0.75f, 0.8f, 0.825f, 0.85f, 1.f
    };

    static public WeekSchedule[] Lift(ORM oneRepMax) {
        WeekSchedule[] todaysRep = new WeekSchedule[6];

        for (int i = 0; i<todaysRep.length; i++) {
            WeekSchedule w = new WeekSchedule();

            w.weekName = "Week " + numberNames[i+1];

            w.reps = new float[5];
            float multiplier = weeklyMultipliers[i];
            w.reps[0] = multiplier * oneRepMax.getDeadlift();
            w.reps[1] = multiplier * oneRepMax.getSquat();
            w.reps[2] = multiplier * oneRepMax.getOverheadpress();
            w.reps[3] = multiplier * oneRepMax.getBenchpress();
            w.reps[4] = multiplier * oneRepMax.getBentoverrow();

            todaysRep[i] = w;
        }

        return todaysRep;
    }
}










