package org.qa.skytdd;

public class Wrapper<T> {

    private T myNumber;

    public Wrapper(T myNumber){
        this.myNumber = myNumber;
    }

    public T getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(T myNumber) {
        this.myNumber = myNumber;
    }

}
