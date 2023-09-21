package org.qa.skytdd;

import javafx.geometry.Point2D;

import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {

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

//        IPrinter<String> sp = new StringPrinter();
////        sp.PrintThis(512);
//        sp.PrintThis("Hello World!");
//
//        IPrinter<BankAccount> bp = new GenericPrinter<>();
//        bp.PrintThis(new BankAccount(421));

        Bank bank = new Bank();
        bank.AddAccount(new BankAccount(4));
        bank.AddAccount(new BankAccount(1));
        bank.AddAccount(new BankAccount(421));
        bank.AddAccount(new BankAccount(6));

        bank.PrintAlls();

        bank.Sort();

        bank.PrintAlls();

        for (BankAccount o : bank){
            System.out.println(o);
        }


    }


}