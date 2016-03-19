package com.amitdwivedie.core.basic.socket;

import java.net.*;
import java.io.*;

class TcpServer {
    public static void main(String g[]) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out
                    .println("Server is started & wait for client request...");
            Socket sk = ss.accept();// sk reffered the client socket at server
                                    // side & by calling accept method it block
                                    // for a while when client socket interact
                                    // with it it resumed.
            System.out.println("Client is Connected ...");
            System.out.println(sk);
            InputStream in = sk.getInputStream();
            DataInputStream din = new DataInputStream(in);
            while (true) {
                String msg = din.readUTF();
                if (msg.equals("stop"))
                    break;
                System.out.println(msg);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}