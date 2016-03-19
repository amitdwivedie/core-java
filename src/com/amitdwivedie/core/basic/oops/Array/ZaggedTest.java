package com.amitdwivedie.core.basic.oops.Array;

class ZaggedTest {
    public static void main(String g[]) {

        int[][] triangle = new int[10][];

        for (int j = 0; j < triangle.length; j++)
            triangle[j] = new int[j + 1];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++)
                System.out.print(triangle[i][j] + "  ");
            System.out.println();
        }

    }
}
