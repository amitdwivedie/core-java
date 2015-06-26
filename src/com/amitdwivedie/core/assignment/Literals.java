package com.amitdwivedie.core.assignment;

/**
 * @author Amit Dwivedi
 *
 */
public class Literals {

    public static void main(String[] args) {

        /* true as string will be treated as true else all string will be false */
        Boolean boolean1 = new Boolean("true");
        System.out.println(boolean1);

        Boolean boolean2 = new Boolean("amit");
        System.out.println(boolean2);

        byte b = (byte) (129);
        System.out.println(b);
        
        byte cs = (byte) (257);
        System.out.println(cs);
    }
}
