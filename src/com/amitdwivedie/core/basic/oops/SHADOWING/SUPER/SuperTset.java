package com.amitdwivedie.core.basic.oops.SHADOWING.SUPER;

class Top {
    int i = 5;
}

class A extends Top {
    int i = 10;
}

class B extends A {
    int i = 15;

    void show() {
        int i = 20;
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(((B) this).i);
        System.out.println(super.i);
        System.out.println(((A) this).i);

        System.out.println(((Top) this).i); // real great Deal

        // how to access i of Top
    }
}

class SuperTset {
    public static void main(String g[]) {
        B b = new B();
        b.show();
    }
}
