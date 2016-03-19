package com.amitdwivedie.core.basic.oops.SHADOWING.THIS;

class A1 {
    A1 show() {
        System.out.println("SHOW OF A1");

        return this;
    }

    void show1() {
        System.out.println("SHOW 1 OF A1");
    }
}

class This2Test {
    public static void main(String g[]) {
        A1 a = new A1();

        a.show().show1();
    }
}