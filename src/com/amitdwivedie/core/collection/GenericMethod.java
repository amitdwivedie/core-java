package com.amitdwivedie.core.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class GenericMethod {

    // Either define type in method declaration or class declaration
    public <T> void addIntoArrayList(T t) {
        List<T> list = new ArrayList<T>();
        list.add(t);
    }

    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.addIntoArrayList(new Animal());
        method.addIntoArrayList(new Dog1());
        method.addIntoArrayList(new Cat1());
    }
}
