package com.amitdwivedie.core.basic.reflection;

class A1 {
    int i = 10;
    static int j = 20;

    public A1() {
        System.out.println("Constructors of A");
    }

    public void show(int i, String s) {
        System.out.println("Show of A");
        System.out.println("i=" + i);
        System.out.println("s=" + s);
    }

    public void disp() {
    }
}