package com.amitdwivedie.core.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * @author Amit Dwivedi
 *
 */
public class NavigableMapExample {

    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "one");
        map.put(0, "zero");
        map.put(5, "five");
        map.put(9, "nine");
        map.put(3, "three");
        map.put(8, "eight");
        map.put(7, "seven");
        map.put(2, "two");
        map.put(4, "four");
        map.put(6, "six");

        System.out.println("Map " + map);
        System.out.println("Descending Map " + map.descendingMap());

        System.out.println("Head Map " + map.headMap(3));
        System.out.println("Head Map with end key 3" + map.headMap(3, true));

        System.out.println("Tail Map " + map.tailMap(5));
        System.out
                .println("Tail Map with excluding 5 " + map.tailMap(5, false));

        System.out.println("Poll first entry " + map.pollFirstEntry());
        System.out.println("Map " + map);

        System.out.println("Poll last entry " + map.pollLastEntry());
        System.out.println("Map " + map);
    }
}
