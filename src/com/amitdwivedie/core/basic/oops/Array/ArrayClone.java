package com.amitdwivedie.core.basic.oops.Array;

class ArrayClone {
    public static void main(String g[]) {
        int a[] = { 10, 20, 30, 40, 50 };
        int b[];

        b = a.clone();

        System.out.println("Original elements of An Array--->");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        System.out.println("clone of Array is --->");
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
    }
}
