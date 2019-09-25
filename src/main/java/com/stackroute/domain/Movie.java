package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {
    @Autowired
    @Qualifier("a")
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void display()
    {
        System.out.println("Name: " + actor.getName());
        System.out.println("Age: " + actor.getAge());
        System.out.println("Gender: " + actor.getGender());
    }
}
