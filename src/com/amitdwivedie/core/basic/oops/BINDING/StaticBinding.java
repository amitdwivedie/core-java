package com.amitdwivedie.core.basic.oops.BINDING;

class A1 {
    A1() {
        System.out.println("A1");
    }

    int a = 10;
    static int b = 20;

    static void show() {
        System.out.println("show of A1");
    }

    final void disp() {
        System.out.println("disp of A1");
    }

    private void privateMethod() {
        System.out.println("privateMethod of A1");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("B1");
    }

    int a = 100;
    static int b = 200;

    static void show() {
        System.out.println("show of B1");
    }

}

class StaticBinding {
    public static void main(String g[]) {
        A1 a1 = new B1();
        System.out.println("a: " + a1.a + " b: " + a1.b);
        a1.show();
        a1.disp();

    }
}