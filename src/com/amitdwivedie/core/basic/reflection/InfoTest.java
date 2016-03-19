package com.amitdwivedie.core.basic.reflection;

import java.lang.reflect.*;

class InfoTest {
    public static void main(String g[]) {
        try {
            Class c = Class.forName(g[0]);
            System.out.println(c.getName());
            System.out.println(c.getClass());

            System.out.println(c.isInterface());
            System.out.println(c.getModifiers());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
