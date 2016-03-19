package com.amitdwivedie.core.basic.collection;

import java.util.*;

class TreeMapTest {
    public static void main(String g[]) {
        TreeMap tm = new TreeMap();
        tm.put("002", "shyam");
        tm.put("003", "mohan");
        tm.put("004", "ravi");
        tm.put("001", "ram");
        tm.put("abc", "Viru");
        tm.put("@@@", "Sachin");
        tm.put("xyz", "dhoni");
        System.out.println(tm);
    }
}