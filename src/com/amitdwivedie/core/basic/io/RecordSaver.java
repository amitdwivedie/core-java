package com.amitdwivedie.core.basic.io;

import java.io.*;

class RecordSaver {
    public static void main(String g[]) {
        try {
            FileOutputStream fout = new FileOutputStream("record.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            Student s1 = new Student(20, 1, 700);
            Student s2 = new Student(21, 2, 800);

            out.writeObject(s1);
            out.writeObject(s2);

            System.out.println("Record are Saved ...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}