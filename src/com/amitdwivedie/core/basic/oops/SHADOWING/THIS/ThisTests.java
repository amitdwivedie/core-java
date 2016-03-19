package com.amitdwivedie.core.basic.oops.SHADOWING.THIS;

class A11 {
    static void disp(ThisTests t) {
        System.out.println("disp of A1");
        t.mark();
    }

    static void show() {
        System.out.println("show of A1");
    }
}

class ThisTests {
    void mask() {
        System.out.println("mask ");
        A11.disp(this);
    }

    void mark() {
        System.out.println("mark is made for u");
        A11.show();
    }

    public static void main(String g[]) {
        ThisTests t = new ThisTests();
        t.mask();
    }
}
