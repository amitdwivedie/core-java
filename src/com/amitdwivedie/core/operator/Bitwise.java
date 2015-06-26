package com.amitdwivedie.core.operator;

/**
 * @author Amit Dwivedi
 *
 */
public class Bitwise {

    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        if (i > 5 | ++j > 20) {
            System.out.println("i " + i + " j " + j);
        }

        /* In XOR are one part should be true and else part should be false */
        if (true ^ false) {
            System.out.println("Xor");
        }

        /* Either of bit should be 1. */
        System.out.println(2 | 3);

        /* Both should be 1. */
        System.out.println(2 & 3);

        /* In XOR are one should be 1 and other one should be 0 */
        System.out.println(2 ^ 3);
    }

}
