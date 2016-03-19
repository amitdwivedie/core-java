package com.amitdwivedie.core.basic.oops.BINDING;

class A {
    int i = 10;
    static int j = 20;

    void show() {
        System.out.println("SHOW OF A");
    }

    static void disp() {
        System.out.println("DISP OF A");
    }
}

class B extends A {
    int k = 1;
    int i = 100;
    static int j = 200;

    void show() {
        System.out.println("SHOW OF B");
    }

    static void disp() {
        System.out.println("DISP OF B");
    }
}

class BindingTest {
    public static void main(String g[]) {
        A a = new B();
        a.show();
        a.disp();
        System.out.println(a.j);
        System.out.println(a.i);
        // System.out.println(a.k); //compile time error
    }
}