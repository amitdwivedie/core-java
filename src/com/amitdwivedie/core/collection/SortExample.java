package com.amitdwivedie.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class SortExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        
        System.out.println("Fruits - " + fruits);

        Collections.sort(fruits);
        System.out.println("Sorted Fruits - " + fruits);
    }
}
