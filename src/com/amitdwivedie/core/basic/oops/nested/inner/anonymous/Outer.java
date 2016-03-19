package com.amitdwivedie.core.basic.oops.nested.inner.anonymous;

class Outer {
    int i = 10;

    A a = new A() {
        public void disp() {
            System.out.println("DISP OF NEW A()");
        }
    };

    void show() {
        A ref = new A() {
            public void disp() {
                System.out.println("DISP OF SHOW");
            }
        };
        ref.disp();
    }

    public void show1(A a) {
        a.disp();
    }

    public static void main(String g[]) {
        Outer oref = new Outer();
        oref.show();
        System.out.println(oref.i);
        System.out.println(oref.a);
        oref.a.disp();
        oref.show1(new A() {
            public void disp() {
                System.out.println("DISP OF SHOW 1");
            }
        });
    }
}

/*
 * abstract class A { abstract void disp(); }
 */
interface A {
    void disp();
}
