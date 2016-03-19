package com.amitdwivedie.core.basic.oops.TypeCating;

class ImplicitCasting {
    public static void main(String g[]) {
        byte b1 = 1, b2 = 2;
        int b3 = b1 + b2;
        System.out.println(b3);

        byte a1 = 10;
        byte a2 = 10 + 20 + 30;
        // byte a3=10+20+30+100; //error precision loss
        System.out.println(a1);
        System.out.println(a2);
        // System.out.println(a3);

        final int i = 100;
        long b11 = i; // wastage of m/r
        System.out.println(b11);

        long d = 100000;
        System.out.println(d);

        long d1 = 999999999;// 9 digit
        System.out.println(d1);

        long d2 = 9999999999l;// l(L) is required
        // long d2=(long)9999999999;
        System.out.println(d2);

    }
}