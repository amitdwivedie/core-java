package com.amitdwivedie.core.basic.reflection;

class A2 {
    int i = 20;
    static int j = 30;

    private A2() {
        int k = 40;
        System.out.println("Constructors of A2");
    }

    private void show(int i, String s, char c) {
        System.out.println("Show of A");
        System.out.println("i=" + i);
        System.out.println("s=" + s);
        System.out.println("c=" + c);
    }

    private void disp() {
        int i = 10;
        System.out.println("DISP OF A2");
    }

}