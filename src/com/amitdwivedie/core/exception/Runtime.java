package com.amitdwivedie.core.exception;

/**
 * @author Amit Dwivedi
 *
 */
public class Runtime {

    static void test() {
        test1();
    }

    static void test1() {
        System.out.println("test");
        try {
            int i = 9 / 0;
            System.out.println(i);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        test();
    }
}
