package com.amitdwivedie.core.basic.io;

import java.io.*;

class FileWriterTest {
    public static void main(String g[]) throws IOException {
        FileReader f = new FileReader("FileReaderTest.java");

        FileWriter fw = new FileWriter("FileWriterTest.txt");
        while (true) {
            int s = f.read();
            if (s == -1)
                break;
            fw.write((char) s);
        }
    }
}
