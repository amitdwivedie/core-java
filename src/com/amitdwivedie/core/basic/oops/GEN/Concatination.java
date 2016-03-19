package com.amitdwivedie.core.basic.oops.GEN;

class Concatination {

    public static void main(String g[]) {
        int i = 10;
        int j = 20;
        int k = 30;

        int l = i + j + k;
        System.out.println(i + j + k);
        System.out.println(+l);// (+l) is standard

        System.out.println("there are " + l + " student in the class in which "
                + j + " are Girls " + " and " + k + " are Boys");
    }
}