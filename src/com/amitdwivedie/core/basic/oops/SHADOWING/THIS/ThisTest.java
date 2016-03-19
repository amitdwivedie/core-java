package com.amitdwivedie.core.basic.oops.SHADOWING.THIS;

class ThisTest {
    int i = 10;
    static ThisTest t;

    void show() {
        int i = 20;
        System.out.println(i);
        System.out.println(t.i);
        System.out.println(this); // refered that referance on which u call that
                                  // method
        System.out.println(this.i);
    }

    public static void main(String g[]) {
        t = new ThisTest();
        ThisTest t1 = new ThisTest();

        System.out.println(t);
        t.show();

        System.out.println(t1);
        t1.show();

        // System.out.println(this); //it is a non static variable so can't be
        // use in static methods

    }
}