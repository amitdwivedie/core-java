package com.amitdwivedie.core.basic.collection;

import java.util.*;

class TreeSetTest {
    public static void main(String g[]) {
        TreeSet ts = new TreeSet();
        Student s1 = new Student("ram", 20, 001);
        Student s2 = new Student("ram", 20, 004);
        Student s3 = new Student("ram", 20, 004);
        Student s4 = new Student("Mohan", 24, 002);
        Student s5 = new Student("shyam", 22, 003);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts);
    }

}