package com.example.mycoffeeshop;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    //Array of drinks
    public static final Drink[] drinks = {
            new Drink("Latte","A couple of espresso shots",R.drawable.latte),
            new Drink("Cappuccino","It's only cappuccino with streamed milk",R.drawable.cappuccino),
            new Drink("Filter","Filter Filter Filter Filter Filter",R.drawable.filter),
    };
    private Drink(String name,String description,int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}
