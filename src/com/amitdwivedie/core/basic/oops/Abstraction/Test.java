package com.amitdwivedie.core.basic.oops.Abstraction;

abstract class BB {
    static int i;
    int j;
    int k;
    // final int a;
    final int b;

    {
        b = 111;
    }

    final static int c;

    static {
        c = 112;
    }

    final int d;

    BB() {
        d = 101;
    }

}

class Test extends BB {
    /*
     * { a=11; // we cannot assign the final variable value in subclass }
     */
    Test() {
        k = 13;
        // a=14;
    }

    void show() {
        j = 12;
        System.out.println(j);
    }

    public static void main(String g[]) {
        Test t = new Test();
        // Test t=new Test(12);
        i = 20;
        System.out.println(t.i);
        t.show();
        System.out.println(t.k);
        // System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        System.out.println(t.d);
    }

}