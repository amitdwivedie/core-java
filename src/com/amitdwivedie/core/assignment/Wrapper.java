package com.amitdwivedie.core.assignment;

/**
 * @author Amit Dwivedi
 *
 */
public class Wrapper {

    public static void main(String[] args) {
        Integer integer = new Integer(1);
        System.out.println(integer);
        
        integer = new Integer("21");
        System.out.println(integer);
        
        if(!new Boolean("ana")){
            System.out.println("nice!!!");
        }
        
        integer = Integer.valueOf(11);
        System.out.println(integer);
        
        int xx = Integer.parseInt("1");
        System.out.println(xx);
        
        xx = Integer.parseInt("11", 2);
        System.out.println(xx);
        
        xx = Integer.parseInt("11", 8);
        System.out.println(xx);
        
        xx = Integer.parseInt("11", 16);
        System.out.println(xx);
        
        String str = Integer.toString(10);
        System.out.println(str);
        
        System.out.println("Binary - " + Integer.toBinaryString(2));
        System.out.println("Octal - " + Integer.toOctalString(10));
        System.out.println("Hexadecimal - " + Integer.toHexString(19));
    }
}
