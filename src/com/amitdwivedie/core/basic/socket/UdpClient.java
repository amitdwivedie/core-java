package com.amitdwivedie.core.basic.socket;

import java.net.*;
import java.io.*;

class UdpClient {
    public static void main(String g[]) {
        try {
            DatagramSocket dsk = new DatagramSocket();
            DatagramPacket dp = null;
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            while (true) {
                String msg = br.readLine();
                dp = new DatagramPacket(msg.getBytes(), msg.length(),
                        InetAddress.getLocalHost(), 1234);
                dsk.send(dp);
                if (msg.equals("stop"))
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}