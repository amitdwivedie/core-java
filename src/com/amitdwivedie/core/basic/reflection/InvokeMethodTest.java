package com.amitdwivedie.core.basic.reflection;

import java.lang.reflect.*;

class InvokeMethodTest {
    public static void main(String g[]) {
        try {
            Class c = Class.forName(g[0]);
            Constructor ctr[] = c.getDeclaredConstructors();
            ctr[0].setAccessible(true);
            Object o = ctr[0].newInstance();

            Field f[] = c.getDeclaredFields();
            System.out.println(f[0].getInt(o));
            System.out.println(f[1].getInt(o));
            // System.out.println(f[2].getInt(o));
            // System.out.println(f[3].getInt(o));
            // System.out.println(c.getType());

            Method m[] = c.getDeclaredMethods();
            m[0].setAccessible(true);
            m[0].invoke(o, 30, "byeee", 'a');
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}