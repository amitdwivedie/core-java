package com.amitdwivedie.core.basic.socket;

import java.net.*;
import java.io.*;

class TcpClient {
    public static void main(String g[]) {
        try {
            Socket sk = new Socket("localhost", 1234);
            System.out.println(sk);
            OutputStream os = sk.getOutputStream();
            DataOutputStream dout = new DataOutputStream(os);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            while (true) {
                String msg = br.readLine();
                dout.writeUTF(msg);
                if (msg.equals("stop"))
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}