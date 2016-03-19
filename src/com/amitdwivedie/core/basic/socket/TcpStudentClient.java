package com.amitdwivedie.core.basic.socket;

import java.net.*;
import java.io.*;

class TcpStudentClient {
    public static void main(String g[]) {
        try {
            Socket sk = new Socket("localhost", 1234);
            System.out.println(sk);
            OutputStream os = sk.getOutputStream();
            ObjectOutputStream dout = new ObjectOutputStream(os);
            Student st = new Student("Amit", 22);
            dout.writeObject(st);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}