package com.amitdwivedie.core.basic.collection;

import java.util.*;

class CollectionsTest {
    public static void main(String g[]) {
        ArrayList al = new ArrayList();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("two");
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);

        Collections.shuffle(al);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));

        List i = Collections.unmodifiableList(al);
        Iterator itr = i.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // i.add("five"); run time error;
    }

}
