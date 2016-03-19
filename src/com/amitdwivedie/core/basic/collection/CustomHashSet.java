package com.amitdwivedie.core.basic.collection;

import java.util.*;

class CustomHashSet {
    public static void main(String g[]) {
        HashSet hs = new HashSet();
        Student s1 = new Student("ram", 20, 001);
        Student s2 = new Student("ram", 20, 004);
        Student s3 = new Student("ram", 20, 004);
        Student s4 = new Student("mohan", 24, 002);
        Student s5 = new Student("shyam", 22, 003);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);
        lhs.add(s5);
        System.out.println(lhs);
    }
}