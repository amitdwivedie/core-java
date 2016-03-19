package com.amitdwivedie.core.basic.io;

import java.io.*;

class RecordGetter {
    public static void main(String g[]) {
        try {
            FileInputStream fin = new FileInputStream("record.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);

            Student s1 = (Student) oin.readObject();
            Student s2 = (Student) oin.readObject();

            System.out.println("Record are  ...");
            System.out.println("age of s1=" + s1.age);
            System.out.println("marks of s1=" + s1.marks);
            System.out.println("age of s2=" + s2.age);
            System.out.println("marks of s2=" + s2.marks);
            ;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}