package com.amitdwivedie.core.basic.io;

import java.io.*;

class FileReaderTest {
    public static void main(String g[]) throws IOException {
        FileReader f = new FileReader("FileReaderTest.java");
        BufferedReader br = new BufferedReader(f);
        int i = 0;
        while (true) {
            String str = br.readLine();
            if (str == null)
                break;
            System.out.println(++i + "." + str);
        }

    }
}
