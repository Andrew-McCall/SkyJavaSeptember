package org.qa.skytdd;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

//        ArrayDemo();
//        ListDemo();

        Bank myBank = new Bank();

        try {
            myBank.AddAccount(new BankAccount(423521, 138));
            myBank.AddAccount(new BankAccount(5235621, 142));
            myBank.AddAccount(new BankAccount(52345621, 320));
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(myBank.average());

        myBank.DeleteByAccountNumber(52345621);

        System.out.println(myBank.average());

        myBank.PrintAlls();

    }

    public static void ListDemo(){
        // Collection Interface -> List Interface -> ArrayList/Vector

        // Collection's (Interfaces) use Generics <>
        // Generics are asking for a DataType (Should be Non-Primitive)
        // List<TYPE>
        ArrayList<String> myStrings3 = new ArrayList<String>();

        myStrings3.add("Hello World");
        myStrings3.add("Hello World");

        System.out.println(myStrings3.get(0)); // String[].... [0]
        System.out.println(myStrings3.size()); // String[].... .length

        for (String s : myStrings3){
            System.out.println(s);
        }

        Vector<Integer> myNumbers = new Vector<Integer>();

        myNumbers.add(6256);
        myNumbers.add(2625546);
        myNumbers.add(3625256);
        myNumbers.add(162156);

        for (int i = 0; i < myNumbers.size(); i++){
            System.out.println(myNumbers.get(i));
        }

        List<Point> myPoints = new ArrayList<Point>();
        myPoints.add(new Point(0,0));
        System.out.println(myPoints.get(0));

        LinkedList<Double> doubles = new LinkedList<>();
        doubles.add(2.532);
        System.out.println(doubles.get(0));

    }
    public static void ArrayDemo(){
        // Arrays are immutable, just like strings
        // Cant's change the length of an array. Everytime you change a string, a new one is created
        int[] myNumbers = new int[5];      // primitives default to 0/default value
        Point[] myStrings = new Point[5];  // all non-primitives default to null

        System.out.println(myNumbers.length);
        System.out.println(myNumbers);

        for (int x : myNumbers){
            System.out.println(x);
        }

        for (Point p: myStrings){
            System.out.println(p);
        }
    }

}