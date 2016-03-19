package com.amitdwivedie.core.basic.exception;

class Throw extends Exception {
    Throw() {
        System.out.println("Number Format Error");
    }

}

class ThrowTest {
    static String g[];

    public static void show() throws Throw {
        // Throw t=new Throw();
        if (true) {
            int i = Integer.parseInt(g[0]);
        } else
            throw new Throw();
        // throws (new Throw());
    }

    public static void main(String g[]) {
        try {
            show();
        } catch (Throw t) {
            System.out.println(t);
        }
    }
}
