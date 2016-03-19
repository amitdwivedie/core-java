package com.amitdwivedie.core.basic.io;

import java.io.*;

class KeyToFileTest {
    public static void main(String g[]) {
        try {
            DataInputStream din = new DataInputStream(System.in);
            FileOutputStream fout = new FileOutputStream("key.txt", true);
            DataOutputStream dout = new DataOutputStream(fout);
            PrintStream ps = new PrintStream(fout);
            System.out.println("Enter text to store ...  , stop");
            int i = 0;
            while (true) {
                String s = din.readLine();
                if (s.equals("stop"))
                    break;
                // dout.writeBytes(s);
                // dout.writeChars(s); it write one one character
                dout.writeUTF(s);
                ps.println(++i + ".");
                ps.print(s);
            }
            fout.close();

        } catch (Exception e) {
        }

    }
}
