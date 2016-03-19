package com.amitdwivedie.core.basic.io;

import java.io.*;

class KeyCharRead {
    public static void main(String g[]) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            FileWriter fw = new FileWriter("copy1.txt");
            PrintWriter pw = new PrintWriter(fw);
            while (true) {
                String s = br.readLine();
                if (s.equals("stop"))
                    break;
                pw.println(s);
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}