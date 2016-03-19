package com.amitdwivedie.core.basic.collection;

import java.util.*;

class CustomTreeTest {
    public static void main(String g[]) {
        ArrayList al = new ArrayList();
        Student s1 = new Student("ram", 20, 001);
        Student s2 = new Student("ram", 20, 004);
        Student s3 = new Student("ram", 20, 004);
        Student s4 = new Student("mohan", 22, 003);
        Student s5 = new Student("shyam", 24, 005);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

        TreeSet tsn = new TreeSet(new NameComp());
        tsn.addAll(al);
        System.out.println(tsn);

        TreeSet tsa = new TreeSet(new AgeComp());
        tsa.addAll(al);
        System.out.println(tsa);

        TreeSet tsr = new TreeSet(new RollComp());
        tsr.addAll(al);
        System.out.println(tsr);

    }
}
