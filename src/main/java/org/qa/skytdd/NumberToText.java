package org.qa.skytdd;

import java.util.HashMap;
import java.util.Map;

public class NumberToText {

    public final Map<Integer, String> TRANSLATOR = new HashMap<>();

    public NumberToText(){
        this.TRANSLATOR.put(0, "zero");
        this.TRANSLATOR.put(1, "one");
        this.TRANSLATOR.put(2, "two");
        this.TRANSLATOR.put(3, "three");
        this.TRANSLATOR.put(4, "four");
        this.TRANSLATOR.put(5, "five");
        this.TRANSLATOR.put(6, "six");
        this.TRANSLATOR.put(7, "seven");
        this.TRANSLATOR.put(8, "eight");
        this.TRANSLATOR.put(9, "nine");
        this.TRANSLATOR.put(10, "ten");
        this.TRANSLATOR.put(11, "eleven");
        this.TRANSLATOR.put(12, "twelve");
        this.TRANSLATOR.put(13, "thirteen");
        this.TRANSLATOR.put(14, "fourteen");
        this.TRANSLATOR.put(15, "fifteen");
        this.TRANSLATOR.put(16, "sixteen");
        this.TRANSLATOR.put(17, "seventeen");
        this.TRANSLATOR.put(18, "eighteen");
        this.TRANSLATOR.put(19, "nineteen");
        this.TRANSLATOR.put(20, "twenty");
        this.TRANSLATOR.put(30, "thirty");
        this.TRANSLATOR.put(40, "forty");
        this.TRANSLATOR.put(50, "fifty");
    }

    public String Translate(int number){
        if (number < 20) return this.TRANSLATOR.get(number);

        int digit = number%10;
        if (digit == 0){
            return this.TRANSLATOR.get(number - digit);
        }

        return this.TRANSLATOR.get(number - digit) +"-"+ this.TRANSLATOR.get(digit);
    }

}
