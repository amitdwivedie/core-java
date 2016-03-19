package com.amitdwivedie.core.basic.oops.SHADOWING.THIS;

class Other {
    static void disp(A a) {
        System.out.println("DISP OF OTHER");
        a.show1();
    }

}

class A {
    void show() {
        System.out.println("SHOW OF A");
        Other.disp(this);
    }

    void show1() {
        System.out.println("SHOW 1 OF A");
    }
}

class This1Test {
    public static void main(String g[]) {
        A a = new A();
        a.show();
    }

}