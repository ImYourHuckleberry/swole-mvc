package com.swole.swolemvc.models;

public class Rep extends ORM{

    static int weekOnePercent = (7/10);

    public static void main(String [] args){
        Rep deadliftRep = new Rep();
        deadliftRep.deadlift = deadliftRep.deadlift * weekOnePercent;
        System.out.println(deadliftRep.deadlift);
    }
}
