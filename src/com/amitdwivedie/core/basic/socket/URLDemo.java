package com.amitdwivedie.core.basic.socket;

import java.net.*;
import java.io.*;

class URLDemo {
    public static void main(String g[]) {
        try {
            URL u = new URL("http://www.google.com/");
            URLConnection con = u.openConnection();
            InputStream in = con.getInputStream();
            FileOutputStream fout = new FileOutputStream("Google.html");
            while (true) {
                int i = in.read();
                if (i == -1)
                    break;
                System.out.println((char) i);
                fout.write((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}