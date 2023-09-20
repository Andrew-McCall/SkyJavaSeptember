package org.qa.skytdd;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        // Lists
        // ArrayList
        // Vector
        // LinkedList

        List<List<Integer>> my2dList = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(20);
        row1.add(30);
        row1.add(40);

        my2dList.add(row1);
        my2dList.get(0).set(2,52);

        int[][] my2dArray = new int[5][5];
        my2dArray[0][2] = 52;


        // Sets are lists of unique items. They have better performance. Especially reading
        Set<Integer> myNumbers = new HashSet<>();
        myNumbers.add(1);
        myNumbers.add(1);
        myNumbers.add(23);
        myNumbers.add(52);
        myNumbers.add(19);
        myNumbers.add(52);

        for (Integer i : myNumbers) // Collection
        {
            System.out.println(i);
        }

        Set<String> myStrings = new TreeSet<>();
        myStrings.add("Hello");
        myStrings.add("Hello");
        myStrings.add("World");
        myStrings.add("Jon");
        myStrings.add("Andrew");

        for (String s : myStrings){
            System.out.println(s);
        }

        // Maps
        Map<Integer, String> myDictionary = new HashMap<>(); // Python Dictionary
        // Index is a type you give
        myDictionary.put(1, "One");
        myDictionary.put(2, "Three");
        myDictionary.put(5, "THIS IS FIVES TEXT");

        System.out.println(myDictionary.get(2));
        System.out.println(myDictionary.get(5));
        System.out.println(myDictionary.get(6));

    }


}