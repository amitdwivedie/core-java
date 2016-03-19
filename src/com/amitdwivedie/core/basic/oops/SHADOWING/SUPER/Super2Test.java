package com.amitdwivedie.core.basic.oops.SHADOWING.SUPER;

class A2 {
    {
        System.out.println("INIT BLOCK OF A2");
    }

    A2(int i) {
        System.out.println("ARGUMENTED CONSTRUCTOR OF A2");
    }
}

class B2 extends A2 {
    {
        System.out.println("INIT BLOCK OF B2");
    }

    B2() {
        this(10);
        System.out.println("DEFAULT CONSTRUCTOR OF B2");
    }

    B2(int i) {
        super(10);
        System.out.println("ARGUMENTED CONSTRUCTOR OF B2");
    }
}

class Super2Test {
    public static void main(String g[]) {
        B2 b = new B2();
        B2 b1 = new B2(10);
    }
}