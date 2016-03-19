package com.amitdwivedie.core.basic.oops.Final;

class Test1 {

    final int i;
    static final int j;

    static {
        j = 10;
    }

    {
        System.out.println(getInt());
    }

    int getInt() {
        System.out.println(i);
        return i;
    }

    Test1() {
        i = 12;
    }

    public static void main(String g[]) {
        new Test1();
        System.out.println(j);
    }

}
