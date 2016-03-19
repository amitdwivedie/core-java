package com.amitdwivedie.core.basic.io;

import java.io.*;

class DataTest {
    public static void main(String g[]) {
        DataInputStream din = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("FileRead.java");
            din = new DataInputStream(fin);
            int i = 0;
            while (true) {
                String s = din.readLine();
                if (s == null)
                    break;
                System.out.print(++i + ".");
                System.out.println(s);
            }

        } catch (Exception e) {
        } finally {
            try {
                fin.close();
                din.close();
            } catch (Exception e) {
            }
        }
    }
}