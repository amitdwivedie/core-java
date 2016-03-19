package com.amitdwivedie.core.basic.collection;

import java.util.*;

class ArrayListTest {
    public static void main(String g[]) {
        ArrayList al = new ArrayList();
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("two");
        al.add(0, "zero");
        System.out.println(al.size());
        System.out.println(al);
        al.set(1, "first");
        System.out.println(al);
        System.out.println("Existance of first :" + al.contains("first"));
        al.remove(0);
        System.out.println("Existance of zero :" + al.contains("zero"));
        System.out.println(al);
        Iterator itr = al.iterator();
        System.out.println(itr);
        ArrayList al1 = new ArrayList(al);
        System.out.println(" *** Elements of al *** ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
            // itr.remove();
        }
        // itr.remove();
        System.out.println(al.isEmpty());
        al1.add("four");
        al1.add("five");
        System.out.println(" *** Elements of al1  in Forward Direction *** ");
        ListIterator ltr = al1.listIterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }
        System.out.println(" *** Elements of al1  in Backward Direction *** ");
        while (ltr.hasPrevious()) {
            System.out.println(ltr.previous());
        }
    }
}