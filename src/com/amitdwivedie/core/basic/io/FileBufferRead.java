package com.amitdwivedie.core.basic.io;

import java.io.*;

class FileBufferRead {
    public static void main(String g[]) {
        BufferedInputStream br = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("FileRead.java");
            br = new BufferedInputStream(fin);
            Timer.startTimer();
            while (true) {
                int i = br.read();
                if (i == -1)
                    break;
                System.out.println((char) i);
            }
            Timer.stopTimer();

        } catch (Exception e) {
        } finally {
            try {
                fin.close();
                br.close();
            } catch (Exception e) {
            }
        }
    }
}