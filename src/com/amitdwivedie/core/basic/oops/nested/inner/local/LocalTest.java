package com.amitdwivedie.core.basic.oops.nested.inner.local;

class LocalTest {
    void show() {
        class A {
            void disp() {
                System.out.println("DISP");

            }

        }
        A a = new A();
        a.disp();

    }

    public static void main(String f[]) {
        LocalTest l = new LocalTest();
        l.show();
    }
}
