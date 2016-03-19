package com.amitdwivedie.core.basic.oops.Array;

class ArrayTest {
    int a[];

    ArrayTest show(int j[]) {
        for (int i = 0; i < (new int[] { 10, 20, 30, 40, 50 }).length; i++)
            System.out.println(j[i]);
        return (new ArrayTest());
    }

    public static void main(String g[]) {

        ArrayTest at = new ArrayTest();
        ArrayTest ar[] = new ArrayTest[4];

        for (int i = 0; i < ar.length; i++)
            ar[i] = at.show(new int[] { 10, 20, 30, 40, 50 });
    }
}
