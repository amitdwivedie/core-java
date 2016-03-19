package com.amitdwivedie.core.basic.oops.Array;

class ZaggedArray {
    public static void main(String k[]) {
        int a[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
        /*
         * System.out.println("ELEMENT AT INDEX A[0][0] IS --->"+a[0][0]);
         * System.out.println("ELEMENT AT INDEX A[0][1] IS --->"+a[0][1]);
         * System.out.println("ELEMENT AT INDEX A[0][2] IS --->"+a[0][2]);
         * System.out.println("ELEMENT AT INDEX A[1][0] IS --->"+a[1][0]);
         * System.out.println("ELEMENT AT INDEX A[1][1] IS --->"+a[1][1]);
         * System.out.println("ELEMENT AT INDEX A[2][0] IS --->"+a[2][0]);
         * System.out.println("ELEMENT AT INDEX A[2][1] IS --->"+a[2][1]);
         * System.out.println("ELEMENT AT INDEX A[2][2] IS --->"+a[2][2]);
         * System.out.println("ELEMENT AT INDEX A[2][3] IS --->"+a[2][3]);
         * 
         */

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                // System.out.println(a[i]);
                System.out.println(a[i][j]);
                // System.out.println(a[j]);
            }

        }

    }

}
