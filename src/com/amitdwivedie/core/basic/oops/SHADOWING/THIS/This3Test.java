package com.amitdwivedie.core.basic.oops.SHADOWING.THIS;

class This3Test {
    This3Test() {
        this(10, 20);
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    {
        System.out.println("init block");
    }

    This3Test(int i) {
        // this(); //default calling
        System.out.println("one argumented constructor");
    }

    This3Test(int i, int j) {
        this(10);
        System.out.println("two argumented constructor");
    }

    public static void main(String g[]) {
        This3Test t30t = new This3Test();
        // This3Test t31t=new This3Test(10);
        // This3Test t32t=new This3Test(10,20);
    }
}