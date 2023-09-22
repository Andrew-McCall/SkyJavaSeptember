package org.qa.skytdd;

import java.util.ArrayList;

public class IntStringMap implements MapInterface<Integer, String>{

    private AndrewMap<Integer, String> data = new AndrewMap<>();

    @Override
    public String get(Integer key) {
        return data.get(key);
    }

    @Override
    public void put(Integer key, String Value) {
        data.put(key, Value);
    }
}
