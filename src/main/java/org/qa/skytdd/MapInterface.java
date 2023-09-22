package org.qa.skytdd;

public interface MapInterface<T,E> {

    public E get(T key);
    public void put(T key, E Value);


}
