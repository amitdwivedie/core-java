package com.amitdwivedie.core.basic.oops.Array;

/*
3)Write a program that taking array values from keyboard? And should return the position of given integer in array? If the given
input integer is not in array then it should return -1?
*/
class PostionOfArray {
    public static void main(String g[]) {
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = new int[g.length];

        for (int i = 0; i < g.length; i++) {
            b[i] = Integer.parseInt(g[i]);
        }

        for (int j = 0; j < g.length; j++) {
            for (int i = 0; i < a.length; i++)
                if (a[i] == b[j]) {
                    System.out.println("Position of " + b[j] + " is " + i);
                } else if (b[j] != a[i])
                    System.out.println("Position of " + b[j] + " is -1");
        }

        /*
         * int i=0,j=0; if(a[i]==b[j]) continue ; {
         * 
         * System.out.println("Position of "+b[j]+" is "+i); i++; j++;
         * 
         * }
         * 
         * if(a[i]!=b[j]) continue ; { System.out.println("Position of "+b[j]+
         * " is -1"); }
         * 
         */

    }
}
