package com.amitdwivedie.core.basic.collection;

import java.util.*;

class CustomList {
    public static void main(String g[]) {
        ArrayList al = new ArrayList();

        Student s1 = new Student("ram", 20, 001);
        Student s2 = new Student("ram", 20, 004);
        Student s3 = new Student("ram", 20, 004);
        Student s4 = new Student("mohan", 22, 002);
        Student s5 = new Student("shyam", 24, 003);
        String str = new String("india");
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.add(str);
        System.out.println(al);
        // Student s6=new Student("ram",20,004);
        Student s6 = new Student("shyam", 24, 003);
        al.add(s6);
        System.out.println(al);
        System.out.println(al.contains(s6));
        String str1 = new String("indiaa");
        System.out.println(al.contains(str1));
    }
}
