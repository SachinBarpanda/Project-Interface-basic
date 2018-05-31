package com.Sachin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Player Danny = new Player("Drake", 100, 80, "Atom Bomb");
        //let's print these thing here
        System.out.println(Danny.toString());
        ObjectSaver(Danny);

        Danny.setStrength(80);
        Danny.setWeapons("Atom Bomb");
        ObjectSaver(Danny);
        loadObject(Danny);
        System.out.println(Danny);



        ISaved zombies= new Monster("Zombies",65,55);
        //One new thing that is in there
        //we're using a cast operator
        System.out.println("Strength" + ((Monster) zombies).getStrength());
        System.out.println(zombies);
        ObjectSaver(zombies);
    }
    /*
     *
     **we're creating a method to show the values after taking the input
     *
     *
     * */

    public static ArrayList readValues() {
        ArrayList <String> values = new ArrayList <>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Enter '1' String \n Enter '0' to quit ");
        while (!quit) {
            System.out.println("Choose a option : \t");
            int choice = scanner.nextInt();

            scanner.nextLine();


            switch (choice) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter a String ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }


        return values;
    }

    /*
     *
     ** WRite a method which takes an object ,implements
     *
     *
     * */

    public static void ObjectSaver(ISaved objectSaver){
        //So in here we are using implement parameter as we can now use any method using this parameters
        int i=0;
        do{
            System.out.println("Saving "+ objectSaver.object().get(i));
            i++;
        }while(i>objectSaver.object().size());
    }
    public static void loadObject(ISaved objectSaver){
        ArrayList<String>values=readValues();
        objectSaver.read(values);
    }

}
