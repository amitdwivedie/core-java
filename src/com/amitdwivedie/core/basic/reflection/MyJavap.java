package com.amitdwivedie.core.basic.reflection;

import java.lang.reflect.*;

class MyJavap {
    public static void main(String g[]) {
        try {
            Class c = Class.forName(g[0]);
            Method m[] = c.getDeclaredMethods();
            System.out.println(" *** METHODS ARE *** ");
            for (Method mm : m)
                System.out.println(mm);

            Field f[] = c.getFields();
            System.out.println(" *** FIELDS  ARE *** ");
            for (Field ff : f)
                System.out.println(ff);

            Constructor ctr[] = c.getConstructors();
            System.out.println(" *** CONSTRUCTORS ARE *** ");
            for (Constructor cc : ctr)
                System.out.println(cc);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}