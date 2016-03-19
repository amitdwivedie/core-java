package com.amitdwivedie.core.basic.oops.Array;

/*
2)Given two array A & B and B has same elements same as A but one element missing? Write a program that take arrays A & B as input
and find missing element in B array?
*/
class MissingElement {
    public static void main(String g[]) {
        int a[] = new int[g.length];
        int b[];
        System.out.println("Elements of A ...");
        for (int i = 0; i < g.length; i++) {
            a[i] = Integer.parseInt(g[i]);
            System.out.println(a[i]);
        }
        b = a.clone();
        System.out.println("Elements of B ...");
        for (int i = 1; i < b.length; i++)
            System.out.println(a[i]);
    }
}
