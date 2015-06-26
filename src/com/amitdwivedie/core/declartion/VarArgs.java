package com.amitdwivedie.core.declartion;

/**
 * overloaded var-args method are choosen last
 * 
 * @author Amit Dwivedi
 * 
 */
public class VarArgs {

    public static void main(String[] args) {
        show(2, 3, 4);
        show();

        show(1);
    }

    static void show(int... value) {
        System.out.println(value.length);
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }

    static void show(Object value) {
        System.out.println("Object method of show");
    }

    static void show(int value) {
        System.out.println("Int method of show");
    }

}
