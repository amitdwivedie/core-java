package com.amitdwivedie.core.basic.oops.POLYMORPHISM.Hiding;

class A {
    int i = 10;
    static int j = 20;

    static void show() {
        System.out.println("SHOW OF A");
    }
}

class Hiding extends A {
    int i = 30;
    static int j = 40;

    static void show() {
        System.out.println("SHOW OF HIDING");
    }

    public static void main(String g[]) {
        A a = new Hiding();
        System.out.println(a.i);
        System.out.println(a.j);
        a.show();
    }
}
