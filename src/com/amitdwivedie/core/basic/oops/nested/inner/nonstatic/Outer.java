package com.amitdwivedie.core.basic.oops.nested.inner.nonstatic;

class Outer {
    static int i = 10;

    private int j = 20;

    protected int a = 40;

    int b = 5;

    class In {

        int k = 30;

        void disp() {

            System.out.println("DISP OF NESTED CLASS");

            System.out.println(i + j + k); // inner class can access the private
                                           // data member & member function to
                                           // thier enclosing class.

            System.out.println(i + j + k + a); // protected also;
        }

    }

    public static void main(String kk[]) {
        System.out.println(i);// Outer.i

        Outer oref = new Outer();

        Outer.In iref = oref.new In();

        iref.disp();
    }
}
