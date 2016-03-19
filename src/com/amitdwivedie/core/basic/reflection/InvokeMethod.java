package com.amitdwivedie.core.basic.reflection;

import java.lang.reflect.*;

class InvokeMethod {
    public static void main(String g[]) {
        try {
            Class c = Class.forName(g[0]);
            Object o = c.newInstance();
            Method m[] = c.getDeclaredMethods();
            m[0].invoke(0, 20, "hello");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}