package com.amitdwivedie.core.basic.io;

import java.io.*;
import java.util.*;

class ScannerTest {
    public static void main(String g[]) {
        try {
            Scanner sc = new Scanner(System.in);
            /*
             * System.out.println("Enter your Name ..."); String
             * s=sc.nextLine(); System.out.println("Enter 1st Number ..."); int
             * i=sc.nextInt(); System.out.println("Enter 2nd Number ..."); int
             * j=sc.nextInt();
             */
            System.out.println("Enter ur Name ,1st Number ,2nd Number ");
            String s = sc.next();
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println("Your Name is :" + s);
            System.out.println("Addition is:" + (i + j));
        } catch (Exception e) {
        }
    }
}