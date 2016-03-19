package com.amitdwivedie.core.basic.oops.TypeCating;

class A {
    void show() {
        System.out.println("SHOW OF A");
    }

    void disp() {
        System.out.println("DISP OF A");
    }
}

class B extends A {
    void disp() {
        System.out.println("DISP OF B");
    }

}

class UpCasting {
    public static void main(String g[]) {
        A a = new B();
        a.show();
        a.disp();

        B b = new B();
        A a1 = b;
        a1.show();
        a1.disp();
    }

}