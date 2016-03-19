package com.amitdwivedie.core.basic.collection;

import java.util.*;

class HashMapTest {
    public static void main(String g[]) {
        HashMap hm = new HashMap(); // store the value in radom order not in
                                    // insersion order
        System.out.println(hm.put("001", "ram"));
        hm.put("002", "shyam");
        hm.put("003", "mohan");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsKey("100"));
        System.out.println(hm.containsValue("ram"));
        System.out.println(hm.get("001"));

        Set sk = hm.keySet();
        Iterator ktr = sk.iterator();
        System.out.println(" * * * keys are * * *");
        while (ktr.hasNext()) {
            System.out.println(ktr.next());
        }

        Collection cl = hm.values();
        Iterator vtr = cl.iterator();
        System.out.println(" * * * values are * * * ");
        while (vtr.hasNext()) {
            System.out.println(vtr.next());
        }

        Set se = hm.entrySet();
        Iterator etr = se.iterator();
        System.out.println(" * * * entris are * * * ");
        while (etr.hasNext()) {
            Map.Entry m = (Map.Entry) etr.next();
            System.out.println(m);
            System.out.println("key : " + m.getKey());
            System.out.println("value : " + m.getValue());
        }
    }
}