package com.amitdwivedie.core.basic.collection;

import java.util.*;

class ArrayGenericListTest {
    public static void main(String g[]) {
        // ArrayList al=new ArrayList();
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        // al.add(10);

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s + "length= " + s.length());
        }
        System.out.println("---> * * * @ @ @ $ $ $ <---");
        for (int i = 0; i < al.size(); i++) {
            String s = al.get(i);
            System.out.println(al.get(i));
            System.out.println(s + "length = " + s.length());
        }
    }
}