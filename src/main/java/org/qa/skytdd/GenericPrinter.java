package org.qa.skytdd;

public class GenericPrinter<E> implements IPrinter<E> {
    @Override
    public void PrintThis(E Object) {
        System.out.println(Object.toString());
    }
}
