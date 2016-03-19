package com.amitdwivedie.core.basic.oops.Inheritance;

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
    int k = 30;

    void showB() {
        System.out.println("SHOW OF B");
    }
}

class InheritanceTest {
    public static void main(String g[]) {
        System.out.println(B.j);
        B.disp();

        B b = new B();
        System.out.println(b.i);

        b.show();
        System.out.println(b.k);
        b.showB();
    }
}