package com.amitdwivedie.core.basic.socket;

import java.net.*;
import java.io.*;

class UdpServer {
    public static void main(String g[]) {
        try {
            DatagramSocket dsk = new DatagramSocket(1234);
            System.out.println(
                    "Server is started & wait for a client request ...");
            DatagramPacket dp = null;
            byte b[] = null;
            while (true) {
                b = new byte[100];
                dp = new DatagramPacket(b, b.length);
                dsk.receive(dp);
                System.out.println(new String(dp.getData()));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}