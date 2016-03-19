package com.amitdwivedie.core.basic.oops.nested.inner.nonstatic;

class NonStatic {
    static int i = 10;

    private int j = 20;

    protected int a = 40;

    int b = 5;

    void bar() {
        System.out.println("Lets get Drunk!!!");
    }

    static void car() {
        System.out.println("wow!!! having a car ");
    }

    class NestedClass {

        int k = 30;

        void disp() {

            System.out.println("DISP OF NESTED CLASS");

            System.out.println(i + j + k); // inner class can access the private
                                           // data member & member function to
                                           // thier enclosing class.

            System.out.println(i + j + k + a); // protected also;
            car();
            bar();
        }
    }

    public static void main(String kk[]) {
        System.out.println(i);// Outer.i

        NonStatic ns = new NonStatic();

        NonStatic.NestedClass nc = ns.new NestedClass();

        nc.disp();
    }
}
