package com.stackroute.domain;

public class Movie {
    private Actor actor;
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void display()
    {
        System.out.println("Name: " + actor.getName());
        System.out.println("Age: " + actor.getAge());
        System.out.println("Gender: " + actor.getGender());
    }
}
