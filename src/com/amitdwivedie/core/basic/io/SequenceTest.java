package com.amitdwivedie.core.basic.io;

import java.io.*;

class SequenceTest {
    public static void main(String g[]) {
        SequenceInputStream sin = null;
        FileInputStream fin1 = null, fin2 = null;
        try {
            fin1 = new FileInputStream("FileRead.java");
            fin2 = new FileInputStream("FileBufferRead.java");
            sin = new SequenceInputStream(fin1, fin2);
            System.out.println(sin.available());
            while (true) {
                int i = sin.read();
                if (i == -1)
                    break;
                System.out.println((char) i);
            }

        } catch (Exception e) {
        } finally {
            try {
                fin1.close();
                fin2.close();
                sin.close();
            } catch (Exception e) {
            }
        }
    }
}
