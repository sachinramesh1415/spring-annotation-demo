package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
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
