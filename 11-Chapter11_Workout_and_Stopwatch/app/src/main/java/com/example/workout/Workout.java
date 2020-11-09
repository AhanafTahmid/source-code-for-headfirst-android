package com.example.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener","5 handstand \n 10 push ups \n 2 backflips"),
            new Workout("The wimp special","5 backflip \n 10 lafalafi \n 2 situps"),
            new Workout("Hand Strengthening","5 jumping jacks\n 10 situps \n 2 jumping squads"),
            new Workout("Building Muscles","5 jumping squads\n 10 situps \n 2 jumping squads"),
    };
    //Workouts
    private Workout(String name,String description){
        this.name = name;
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }
}
