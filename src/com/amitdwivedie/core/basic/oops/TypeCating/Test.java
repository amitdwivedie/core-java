package com.amitdwivedie.core.basic.oops.TypeCating;

class Test {
    public static void main(String g[]) {
        short s = 97;
        // char c=s; error
        char c = (char) s;
        System.out.println(c);

        char c1 = 97;
        // short s1=c1; possible loss of precision
        short s1 = (short) c1;
        System.out.println(s1);

        short s2 = -97;
        char c2 = (char) s2;
        System.out.println(c2);
    }
}
