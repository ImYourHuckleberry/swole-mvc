package com.swole.swolemvc.models;

import com.swole.swolemvc.controllers.ORM;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rep extends ORM{
    public int deadliftRep;
    deadliftRep=(ORM.deadlift*.7);
    return deadliftRep;
}
