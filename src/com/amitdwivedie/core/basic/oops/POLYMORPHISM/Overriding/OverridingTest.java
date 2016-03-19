package com.amitdwivedie.core.basic.oops.POLYMORPHISM.Overriding;

class A {
    void disp() {
        System.out.println(" Default DISP of A");
    }

    int disp(int i) {
        System.out.println("Argumented DISP of A");
        return 10;
    }
}

class OverridingTest extends A {
    OverridingTest() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    OverridingTest(int i, int j) {
        System.out.println("ARGUMENTED CONSTRUCTOR");
    }

    void disp() {
        System.out.println("DEFAULT DISP OverridingTest");
    }

    int disp(int i) {
        System.out.println("ARGUMENTED DISP of OverridingTest");
        return 3;
    }

    public static void main(String g[]) {
        A o1 = new OverridingTest();
        o1.disp();
        o1.disp(12);

    }

}
