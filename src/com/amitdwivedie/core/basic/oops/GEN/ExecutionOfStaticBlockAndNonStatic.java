package com.amitdwivedie.core.basic.oops.GEN;

class ExecutionOfStaticBlockAndNonStatic {
    int i = 5;

    static {
        // ExecutionOfStaticBlockAndNonStatic b=new
        // ExecutionOfStaticBlockAndNonStatic();
        System.out.println("STATIC BLOCK 1");
        ExecutionOfStaticBlockAndNonStatic b0 = new ExecutionOfStaticBlockAndNonStatic();
    }

    {
        System.out.println("NON STATIC BLOCK 1");
    }

    public static void main(String g[]) {
        System.out.println("MAIN");
        // ExecutionOfStaticBlockAndNonStatic b1=new
        // ExecutionOfStaticBlockAndNonStatic();
    }

    static {
        System.out.println("STATIC BLOCK 2");
        // ExecutionOfStaticBlockAndNonStatic b2=new
        // ExecutionOfStaticBlockAndNonStatic();
    }

    {
        System.out.println("NON STATIC BLOCK 2");
    }

}