package com.amitdwivedie.core.basic.io;

import java.io.*;

class InputStreamReaderTest {
    public static void main(String g[]) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        System.out.println("Enter name");
        int name = in.read();
        System.out.println((char) name);
    }
}
