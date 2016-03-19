package com.amitdwivedie.core.basic.exception;

import java.io.*;

class IoTest {
    public static void main(String arg[]) throws IOException {

        // MyIo.readFromFile();

        try {
            int a = 7 / 0;
            // MyIo.readFromFile();
        }

        catch (Exception e) {
            System.out.println("hello!!!");
        }

    }
}
