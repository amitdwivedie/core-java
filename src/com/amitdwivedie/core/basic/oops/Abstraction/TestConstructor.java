package com.amitdwivedie.core.basic.oops.Abstraction;

abstract class AB {
    AB() {
        System.out.println("Def AB");
    }

    AB(int i) {
        System.out.println("Arg AB");
    }
}

class TestConstructor extends AB {

    TestConstructor() {
        System.out.println("Def TestConstructor");
    }

    TestConstructor(int t) {
        super(1);
        System.out.println("Arg TestConstructor");
    }

    public static void main(String g[]) {

        TestConstructor t = new TestConstructor(1);
        TestConstructor t1 = new TestConstructor();
    }

}