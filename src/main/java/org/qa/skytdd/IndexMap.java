package org.qa.skytdd;

import java.util.HashMap;
import java.util.Map;

public class IndexMap <E> {

    private Map<Integer, E> myMap = new HashMap<>();

    public void AddItem(Integer key, E value){
        this.myMap.put(key, value);
    }

    public E GetItem(Integer key){
        return this.myMap.get(key);
    }

}
