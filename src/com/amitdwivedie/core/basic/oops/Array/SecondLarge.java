package com.amitdwivedie.core.basic.oops.Array;

/*
1)write a program that take integer array as input and find the second largest number in array?(Array values taken from keyboard)?
*/
import java.util.Arrays;

class SecondLarge {
    public static void main(String g[]) {
        int a[] = new int[g.length];
        for (int i = 0; i < g.length; i++) {
            a[i] = Integer.parseInt(g[i]);
            System.out.println("number at position " + i + " is " + g[i]);
        }
        Arrays.sort(a);
        System.out.println("Second Largest Number is--->" + a[a.length - 2]);
    }
}
