package com.amitdwivedie.core.basic.reflection;

import java.lang.reflect.*;

class StudentTest {
    public static void main(String g[]) {
        try {
            Class c = Class.forName(g[0]);
            System.out.println(c.getName());
            System.out.println(c.getClass());
            // System.out.println(c.getType());

            Constructor ctr[] = c.getDeclaredConstructors();
            System.out.println("\n ***** Declared Constructors are ****");
            for (Constructor ct : ctr)
                System.out.println(ct);

            System.out.println("   *** Constructor calling ***");
            ctr[0].newInstance();
            ctr[1].newInstance(10);
            ctr[2].newInstance(10, 20);

            ctr[3].setAccessible(true);
            Object o = ctr[3].newInstance("hello");
            System.out.println(" *** Method Calling ***");
            Method m[] = c.getDeclaredMethods();
            m[0].invoke(o, 20, "hello");
            m[1].setAccessible(true); // this method is used to access private
                                      // members
            m[1].invoke(o);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
