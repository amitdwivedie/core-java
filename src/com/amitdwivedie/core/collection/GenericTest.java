package com.amitdwivedie.core.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List<Object> can take only Object but List<?> will take anything Animal, Dog,
 * Cat, Object etc
 * 
 * @author Amit Dwivedi
 * 
 */
public class GenericTest {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<Object>();
        objects.add("amit");
        objects.add(17);
        objects.add(new Animal());

        // objects = new ArrayList<Animal2>(); // must be type same.

        List<?> anything = new ArrayList<Object>();
        anything = new ArrayList<Animal2>();
        anything = new ArrayList<Dog2>();
        anything = new ArrayList<Cat2>();
        System.out.println(anything);

    }
}

class Animal2 {

}

class Dog2 extends Animal2 {

}

class Cat2 extends Animal2 {

}
