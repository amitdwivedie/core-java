package com.amitdwivedie.core.basic.collection;

import java.util.*;

class LinkedListTest {
    public static void main(String g[]) {
        LinkedList l = new LinkedList();
        l.add("one");
        l.add("two");
        l.add("three");
        System.out.println(l);
        l.addFirst("first");
        l.addLast("last");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
    }
}