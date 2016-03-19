package com.amitdwivedie.core.basic.io;

import java.io.*;

class CopyTest {
    public static void main(String g[]) {
        try {
            FileInputStream fin = new FileInputStream("KeyboardTest.java");
            FileOutputStream fout = new FileOutputStream("Copy.java", true);
            System.out.println("Copying File ...");

            while (true) {
                int i = fin.read();
                if (i == -1)
                    break;

                fout.write((char) i);
                // fout.write(i);
            }
            System.out.println("File is copied ");
            fin.close();
            fout.close();
        } catch (Exception e) {
        }

    }
}
