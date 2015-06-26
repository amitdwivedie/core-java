package com.amitdwivedie.core.assignment;

/**
 * 
 * @author Amit Dwivedi
 * 
 */
public class Overloading {

    public static void main(String[] args) {
        short short1 = 1;
        byte byte1 = 12;
        char c = 'c';
        long l = 10;
        double d = 10.4;
        float f = 12f;
        Integer integer = new Integer(10);

        go(short1);
        go(byte1);
        go(c);
        go(l);
        go(d);
        go(f);
        go(integer);

    }

    static void go(int i) {
        System.out.println("int");
    }

    static void go(long l) {
        System.out.println("long");
    }

    static void go(double d) {
        System.out.println("double");
    }
    
    static void go(Integer integer) {
        System.out.println("Integer");
    }
}
