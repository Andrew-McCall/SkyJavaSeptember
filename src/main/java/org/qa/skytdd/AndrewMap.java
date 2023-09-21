package org.qa.skytdd;

import java.util.ArrayList;

public class AndrewMap<A,B> implements MapInterface<A, B>{

    private ArrayList<A> keys = new ArrayList<>();
    private ArrayList<B> values = new ArrayList<>();

    public void put(A key, B value){
        keys.add(key);
        values.add(value);
    }

    public B get(A key){
        for (int i = 0; i < keys.size(); i++){
            if (keys.get(i) == key){
                return values.get(i);
            }
        }
        return null;
    }

}
