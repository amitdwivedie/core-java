package com.amitdwivedie.core.collection;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Amit Dwivedi
 *
 */
public class BackedCollections {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");

        SortedMap<String, String> backCollection = map.subMap("b", "g");
        System.out.println("Map - " + map);
        System.out.println("Backed Collections - " + backCollection);

        map.put("b", "bat");
        map.put("r", "raccoon");
        backCollection.put("f", "fish");
        // backCollection.put("p", "pig"); //throws an exception key out of
        // range

        System.out.println("Map - " + map);
        System.out.println("Backed Collections - " + backCollection);

        map.pollFirstEntry();
        System.out.println("Map - " + map);
        System.out.println("Backed Collections - " + backCollection);

    }
}
