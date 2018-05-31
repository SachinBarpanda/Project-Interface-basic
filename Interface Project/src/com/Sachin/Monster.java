package com.Sachin;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaved {
    private String name;
    private int hitpoint;
    private int Strength;

    public Monster(String name, int hitpoint, int strength) {
        this.name = name;
        this.hitpoint = hitpoint;
        Strength = strength;
        }

    public String getName() {
        return name;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public int getStrength() {
        return Strength;
    }

    @Override
    public List <String> object() {
        List<String>playersStats=new ArrayList<String>();
        playersStats.add(0,name);
        playersStats.add(1,""+this.hitpoint);
        playersStats.add(2,""+this.Strength);


        return playersStats;
    }

    @Override
    public void read(List <String> savedObjects) {
        if (savedObjects != null && !savedObjects.isEmpty()) {
            this.name = savedObjects.get(0);
            this.hitpoint = Integer.parseInt(savedObjects.get(1));
            this.Strength = Integer.parseInt(savedObjects.get(2));

        }
    }
    public String toString() {
        return "Monster {" + " name "+name+"\n"
                + " heath "+hitpoint+"\n"
                + " strength "+Strength+"\n"
                + "}";
    }

}
