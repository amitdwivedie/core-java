package com.amitdwivedie.core.basic.oops.nested.inner.anonymous;

class AnonyTest {
    int i = 10;

    B b = new B() {
        public void disp() {
            System.out.println("DISP");
        }
    };

    public static void main(String g[]) {
        AnonyTest a = new AnonyTest();
        a.b.disp();
    }

}

interface B {
    void disp();
}
