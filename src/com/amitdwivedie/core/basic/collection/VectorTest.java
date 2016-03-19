package com.amitdwivedie.core.basic.collection;

import java.util.*;

class VectorTest {
    public static void main(String g[]) {
        Vector v = new Vector();
        v.addElement("one");
        v.addElement("two");
        v.addElement("three");
        System.out.println(v);

        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
