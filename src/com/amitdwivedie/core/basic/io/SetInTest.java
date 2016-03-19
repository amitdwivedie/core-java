package com.amitdwivedie.core.basic.io;

import java.io.*;

class SetInTest {
    public static void main(String g[]) {

        try {
            FileInputStream fin = new FileInputStream("FileRead.java");
            System.setIn(fin);
            DataInputStream din = new DataInputStream(System.in);

            while (true) {
                String s = din.readLine();
                if (s == null)
                    break;

                System.out.println(s);
            }

        } catch (Exception e) {
        }

    }
}