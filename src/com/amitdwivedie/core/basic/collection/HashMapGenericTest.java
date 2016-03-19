package com.amitdwivedie.core.basic.collection;

import java.util.*;

class HashMapGenericTest {
    public static void main(String g[]) {
        HashMap<String, String> hm = new HashMap<String, String>(); // store the
                                                                    // value in
                                                                    // radom
                                                                    // order not
                                                                    // in
                                                                    // insersion
                                                                    // order
        System.out.println(hm.put("001", "ram"));
        hm.put("002", "shyam");
        hm.put("003", "mohan");
        // hm.put(004,"mohan"); compile time error
        System.out.println(hm + "\n");

        Set se = hm.entrySet();
        Iterator etr = se.iterator();
        System.out.println(" * * * entris are * * * ");
        while (etr.hasNext()) {
            Map.Entry m = (Map.Entry) etr.next();
            System.out.println(m);
            System.out.println("key : " + m.getKey());
            System.out.println("value : " + m.getValue() + "\n");
        }
    }
}