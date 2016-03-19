package com.amitdwivedie.core.basic.io;

import java.io.*;

class BufferedReaderTest {
    public static void main(String g[]) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int i = 0;
        while (true) {
            String str = br.readLine();
            if (str.equals("stop"))
                break;
            System.out.println(++i + "." + str);
        }
    }
}
