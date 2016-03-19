package com.amitdwivedie.core.basic.oops.Array;

class TwoDimensional {
    public static void main(String k[]) {
        int a[][] = new int[3][5];

        a[0][0] = 0;
        a[0][1] = 1;
        a[0][2] = 2;
        a[0][3] = 3;
        a[0][4] = 4;
        a[1][0] = 10;
        a[1][1] = 20;
        a[1][2] = 30;
        a[1][3] = 40;
        a[1][4] = 50;
        a[2][0] = 60;
        a[2][1] = 70;
        a[2][2] = 80;
        a[2][3] = 90;
        a[2][4] = 100;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(a[i][j]);
            }
        }

        char b[][] = new char[3][5];

        b[0][0] = 'a';
        b[1][1] = 'b';
        b[2][2] = 'c'; // others are by default null

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("b[" + i + "][" + j + "]" + " is:---> " + i
                        + " & " + j + ">>>" + b[i][j]);
            }
        }

    }
}