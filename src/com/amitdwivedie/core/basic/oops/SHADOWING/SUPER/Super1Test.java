package com.amitdwivedie.core.basic.oops.SHADOWING.SUPER;

class A1 {
    void show() {
        System.out.println("SHOW OF A");

    }
}

class B1 extends A1 {
    B1() {
        System.out.println("CONSTRUCTOR OF B ");
        super.show();
        show();
    }

    void show() {
        System.out.println("SHOW OF B");
        super.show();
    }
}

class Super1Test {
    public static void main(String g[]) {
        B1 b = new B1();
        b.show();
    }
}
