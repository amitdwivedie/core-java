package com.amitdwivedie.core.collection;

import java.util.Arrays;

/**
 * @author Amit Dwivedi
 *
 */
public class ArraySort {

    public static void main(String[] args) {
        String[] names = { "Vikas", "Ratipal", "Gurpreet", "Deepak", "Cyril" };
        StringBuilder builder = new StringBuilder();
        
        for (String name : names) {
            
            builder.append(name);
            builder.append(",");
        }
        System.out.println("Name - " + builder.toString());

        Arrays.sort(names);
        builder = new StringBuilder();
        for (String name : names) {
            builder.append(name);
            builder.append(",");
        }
        System.out.println("Sorted Name - " + builder.toString());
    }
}
