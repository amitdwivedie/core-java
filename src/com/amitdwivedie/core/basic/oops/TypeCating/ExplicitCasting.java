package com.amitdwivedie.core.basic.oops.TypeCating;

class ExplicitCasting {
    public static void main(String g[]) {
        final int i = 10;
        byte b = i;
        System.out.println(b);

        final int i1 = 50;
        // int i1=50; //error becoz we can change the value of i1
        byte b1 = i1;
        System.out.println(b1);

        char c = 'a';
        System.out.println(c);

        short s1 = 97;
        // char c1=s1; //becoz value of s1 may be -ive
        char c1 = (char) s1;
        System.out.println(c1);

        short s2 = -97;
        char c2 = (char) s2;
        System.out.println(c2);

        short s3 = 'a';
        System.out.println(s3);

        char c4 = 97;
        // short s4=c4;//error range of char> short
        // System.out.println(s4);
        System.out.println(c4);
    }
}