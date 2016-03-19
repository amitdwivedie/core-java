package com.amitdwivedie.core.basic.oops.GEN;

class ExecutionOfStaticBlock {
    static int i;

    public static void main(String g[]) {
        System.out.println("main");
        System.out.println(i);
    }

    static {
        System.out.println(i);
        i = 10;
        System.out.println("STATIC BLOCK 1");
    }

    static {
        System.out.println(i);
        System.out.println("STATIC BLOCK 2");
        i = 20;

    }

}