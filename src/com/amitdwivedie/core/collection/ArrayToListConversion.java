package com.amitdwivedie.core.collection;

import java.util.Arrays;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class ArrayToListConversion {

    public static void main(String[] args) {
        String[] counts = {"one", "two", "three", "four", "five"};
        
        List countList = Arrays.asList(counts);
        System.out.println(countList.size());
        
        String[] numbers = (String[]) countList.toArray(new String[countList.size()]);
        System.out.println(numbers.length);
    }
}
