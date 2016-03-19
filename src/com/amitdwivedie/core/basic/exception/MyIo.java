package com.amitdwivedie.core.basic.exception;

import java.io.*;

class MyIo {
    public static void readFromFile() throws IOException {
        IOException ie = new IOException();

        // NumberFormatException ne=new NumberFormatException();

        // throw ie;

        try {
            throw ie;

        } catch (Exception e) {
            System.out.println("exception is handled..");
        }

    }

}
