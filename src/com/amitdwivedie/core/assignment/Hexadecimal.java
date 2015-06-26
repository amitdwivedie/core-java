package com.amitdwivedie.core.assignment;

/**
 * @author Amit Dwivedi
 *
 */
public class Hexadecimal {

    public static void main(String[] args) {
        int six = 0x6;
        int sixteen = 0x10;
        int seventeen = 0X11;
        System.out.println("Six - " + six + " eight - " + sixteen + " nine - "
                + seventeen);
        System.out.println("Max value of integer - " + Integer.MAX_VALUE);
        System.out.println("Min value of integer - " + Integer.MIN_VALUE);
        
        int x = 0xfffffff;
        int y = 0XDeadCafe;
        System.out.println(x);
        System.out.println(y);
        
    }
}
