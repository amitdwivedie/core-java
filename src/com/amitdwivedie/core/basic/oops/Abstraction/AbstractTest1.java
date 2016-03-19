package com.amitdwivedie.core.basic.oops.Abstraction;

abstract class A {
    int i = 10;
    /*
     * abstract A() { System.out.println("constructor"); }
     */

    A() {
        System.out.println("constructor of A");
    }

    // abstract static void show();
    // abstract final void show();

    abstract void show();

    void disp() {
        System.out.println("disp");
    }

}

class AbstractTest1 extends A {
    void show() {
        System.out.println("show");
        // super.show();

    }

    public static void main(String g[]) {
        // A a=new A(); //error

        A a1, a2;

        a1 = new AbstractTest1();
        a1.show();
        a1.disp();
        System.out.println(a1.i);

    }
}
