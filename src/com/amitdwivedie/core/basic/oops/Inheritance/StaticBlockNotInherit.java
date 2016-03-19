package com.amitdwivedie.core.basic.oops.Inheritance;

class A1 {
    static int i = 10;

    static {
        System.out.println("STATIC BLOCK OF A1");
    }
}

class StaticBlockNotInherit extends A1 {
    static {
        System.out.println(i);
        System.out.println("STATIC BLOCK OF StaticBlockNotInherit");
    }

    public static void main(String g[]) {
        System.out.println("MAIN");
    }
}
