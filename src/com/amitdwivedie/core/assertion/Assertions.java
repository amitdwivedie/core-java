package com.amitdwivedie.core.assertion;

/**
 * @author Amit Dwivedi
 *
 */
public class Assertions {

    public static void main(String[] args) {
        show(10);
        display(10);
        show(4);
    }

    private static void show(int a) {
        assert (a > 0);
        System.out.println("a -" + a);

        assert (a > 5) : "assert a - " + a;
        System.out.println("a -" + a);
    }

    /**
     * not a good practice to put assertion for public method
     * 
     * @param b
     */
    public static void display(int b) {
        assert (b > 0);
        System.out.println("b - " + b);
    }
}
