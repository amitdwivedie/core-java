package com.amitdwivedie.core.basic.oops.Final;

final class FinalTest {
    static int i = 10;

    static void show() {
        System.out.println("SHOW");
    }

    public static void main(String g[]) {
        System.out.println(i);
        show();
    }
}
/*
 * class B extends FinalTest // final class cann't be inherited ... { }
 */