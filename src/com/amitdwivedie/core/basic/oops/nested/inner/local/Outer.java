package com.amitdwivedie.core.basic.oops.nested.inner.local;

class Outer {

    LSuper show() {
        final int i = 10;

        class In extends LSuper// implements LSuper
        {
            int k = 30;

            public void disp() {
                System.out.println("disp of local: " + i);
            }
        }

        // LSuper ref=new In();
        In ref = new In();
        ref.disp();
        return ref;
    }

    public static void main(String g[]) {
        Outer oref = new Outer();
        LSuper iref = oref.show();
        // iref.disp();
    }
}

abstract class LSuper {
    abstract void disp();
}
/*
 * / interface LSuper { void disp(); }
 */
