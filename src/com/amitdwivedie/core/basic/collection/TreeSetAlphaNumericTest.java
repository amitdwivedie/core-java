package com.amitdwivedie.core.basic.collection;

import java.util.*;

class TreeSetAlphaNumericTest {
    public static void main(String g[]) {
        TreeSet ts = new TreeSet();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("one");
        ts.add("four");
        ts.add("five");
        ts.add("1"); // in alphanumeric string numeric comes first ;
        // ts.add(1);
        // ts.add(0,"five"); // we can't add at index no.
        System.out.println(ts);
    }

}