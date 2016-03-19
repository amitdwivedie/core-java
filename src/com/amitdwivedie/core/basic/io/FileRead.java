package com.amitdwivedie.core.basic.io;

import java.io.*;

class FileRead {
    public static void main(String g[]) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("FileRead.java");
            /*
             * Timer.startTimer(); while(true) { int i=fin.read(); if(i==-1)
             * break; //System.out.println((char)i); } Timer.stopTimer();
             */
            byte b[] = new byte[fin.available()];
            System.out.println(fin.read(b));
            Timer.startTimer();
            fin.read(b);

            Timer.stopTimer();
            System.out.println(new String(b));
        } catch (Exception e) {
        } finally {
            try {
                fin.close();
            } catch (Exception e) {
            }
        }
    }
}
