package com.Sachin;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaved {
    private String name;
    private int health;
    private int strength;
    private String weapons;

    public Player(String name, int health, int strength, String weapons) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.weapons = "AK 47";
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Player {" + " name "+name+"\n"
                + " heath "+health+"\n"
                + " strength "+strength+"\n"
                + " weapons "+weapons+"\n"
                + "}";
    }

    @Override
    public List<String> object() {
       //add values of the objects
       List<String>playersStats=new ArrayList<String>();
       playersStats.add(0,name);
       playersStats.add(1,""+this.health);
       playersStats.add(2,""+this.strength);
       playersStats.add(3,"" + this.weapons);

        return playersStats;
    }

    @Override
    public void read(List <String> savedObjects) {
        if(savedObjects !=null &&!savedObjects.isEmpty()){
            this.name=savedObjects.get(0);
            this.health= Integer.parseInt(savedObjects.get(1));
            this.strength=Integer.parseInt(savedObjects.get(2));
            this.weapons=savedObjects.get(3);
        }
    }
}

