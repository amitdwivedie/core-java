package com.amitdwivedie.core.basic.collection;

import java.util.*;

class HashSetTest {
    public static void main(String g[]) {
        ArrayList al = new ArrayList();
        al.add("one");
        al.add("one");
        al.add("one");
        al.add("two");
        System.out.println(al);

        HashSet hs = new HashSet(al);
        hs.add("three");
        hs.add("four");
        System.out.println(hs);
    }
}