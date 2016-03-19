package com.amitdwivedie.core.basic.oops.GEN;

class StaticAndNonStatic {
    int i = 10;
    static int j = 20;

    void show() {
        System.out.println("show of StaticAndNonStatic");
        System.out.println(i);
        System.out.println(j);
        System.out.println(StaticAndNonStatic.j);

    }

    static void disp() {
        System.out.println("disp of StaticAndNonStatic");
        System.out.println(j);
    }

    public static void main(String g[]) {
        System.out.println(j);
        disp();

        StaticAndNonStatic sns = new StaticAndNonStatic();

        System.out.println(sns.i);
        sns.show();

        StaticAndNonStatic1 b = new StaticAndNonStatic1();
        System.out.println("member of StaticAndNonStatic1");
        System.out.println(StaticAndNonStatic1.j);
        StaticAndNonStatic1.disp();
        System.out.println(b.j);
        b.disp();

    }
}

class StaticAndNonStatic1 {
    static int j = 30;

    static void disp() {
        System.out.println("disp of StaticAndNonStatic1");
    }
}