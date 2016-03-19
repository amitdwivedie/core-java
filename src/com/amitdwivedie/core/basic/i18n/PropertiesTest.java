package com.amitdwivedie.core.basic.i18n;

import java.io.*;
import java.util.*;

class PropertiesTest {
    public static void main(String g[]) {
        try {

            Properties p1 = new Properties();
            p1.put("001", "ram");
            p1.put("002", "shyam");
            p1.put("003", "ravi");
            p1.put("004", "mohan");

            FileOutputStream fout = new FileOutputStream("data.properties");
            p1.save(fout, "mydata");

            Properties p2 = new Properties();
            System.out.println(p2);

            p2.load(new FileInputStream("data.properties"));
            System.out.println(p2);
            System.out.println(p1);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
