package org.qa.skytdd;

public class StringPrinter implements IPrinter<String>{
    @Override
    public void PrintThis(String Object) {
        System.out.println(Object);
    }
}
