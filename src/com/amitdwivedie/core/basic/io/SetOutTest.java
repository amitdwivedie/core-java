package com.amitdwivedie.core.basic.io;

import java.io.*;

class SetOutTest {
    public static void main(String g[]) {
        try {
            FileOutputStream fout = new FileOutputStream("out.txt");
            PrintStream ps = new PrintStream(fout);
            System.setOut(ps);
            System.out.println("hello ...");
            System.out.println("hello!!! not a bad deal ...");
            fout.close();
        } catch (Exception e) {
        }
    }
}
