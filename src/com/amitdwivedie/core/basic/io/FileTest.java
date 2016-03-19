package com.amitdwivedie.core.basic.io;

import java.io.*;

class FileTest {
    public static void main(String g[]) {
        try {
            File f = new File("F:\\java\\io");

            System.out.println(f.isDirectory());

            File ff[] = f.listFiles();
            for (int i = 0; i < ff.length; i++) {
                System.out.println("name is :" + ff[i].getName());
            }
            File f1 = new File("F:\\java\\io\\MyFolder");
            if (f1.exists()) {
                System.out.println("Directory exist");
            } else {
                f1.mkdir();
            }
            File f2 = new File("F:\\java\\io\\copy1.txt");
            System.out.println(f2.getCanonicalPath());
            System.out.println(f2.getAbsolutePath());
            System.out.println(f2.getCanonicalFile());
            System.out.println(f2.getAbsoluteFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
