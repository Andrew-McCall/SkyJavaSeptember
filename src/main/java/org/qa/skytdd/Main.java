package org.qa.skytdd;

import javafx.geometry.Point2D;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        // Using a map. create a method which takes a decimal from -1000000000, to +1000000000 and translates it into english.
        // e.i pretty bank account readout. 12354.5 -> twelve thousand, three hundred, fifty-four and 50p
        // Write tests for that method

        //        NumberToText t = new NumberToText();
        //        System.out.println(t.Translate(5));
        //        System.out.println(t.Translate(14));
        //        System.out.println(t.Translate(19));
        //        System.out.println(t.Translate(20));
        //        System.out.println(t.Translate(36));
        //        System.out.println(t.Translate(47));
        //        System.out.println(t.Translate(0));
        //        System.out.println(t.Translate(39));

        Wrapper<Integer> w1 = new Wrapper<>(354);

//      ERROR:  Wrapper<Integer> w2 = new Wrapper<>("354"); Type SAFE

        Wrapper<String> w3 = new Wrapper<>("354");
        Wrapper<BankAccount> w4 = new Wrapper<>(new BankAccount());


        IndexMap<String> map = new IndexMap<>();
        map.AddItem(1, "Hello");
        map.AddItem(2, "World");
        map.AddItem(5235, "Secret");

        System.out.println(map.GetItem(5235));

        AndrewMap<String, Point2D> myMap = new AndrewMap<>();
        myMap.put("Andrew", new Point2D(421, 521));
        myMap.put("Home", new Point2D(8121, 121));
        myMap.put("World", new Point2D(121, 921));

        System.out.println(myMap.get("Andrew"));
        System.out.println(myMap.get("World"));

        AndrewMap<String, String> myMap2 = new AndrewMap<>();
        myMap2.put("Andrew", "geg");
        myMap2.put("Home", "vgsvx4");
        myMap2.put("World", " vsd");

        System.out.println(myMap2.get("Andrew"));
        System.out.println(myMap2.get("World"));

        // Create a Wrapper Generic Class <T>
        // Add a second property of type <E> to the class
        // Wrapper<Integer, String>... Stores one of each. Getters and Setters
        // Create an interface that takes in a single generic type
        // implement that interface and set the type   - Class
        // implement that interface and pass a generic - Class
        // EXTRA: take note of how the idea knows the type in the editor
    }


}