package com.amitdwivedie.core.assignment;

/**
 * Two objects of a wrapper class will always be == when their premitive values
 * are same Boolean Byte Character from \u0000 to \u007f Shorts and Integer from
 * -128 to 127
 * 
 * @author Amit Dwivedi
 * 
 */
public class Boxing {

    public static void main(String[] args) {
        Integer integer1 = 128;
        Integer integer2 = 128;

        if (integer1 != integer2)
            System.out.println("Diffrent object");
        if (integer1.equals(integer2))
            System.out.println("Meaningfully equals");

        integer1 = 10;
        integer2 = 10;

        if (integer1 == integer2)
            System.out.println("Same object");
        if (integer1.equals(integer2))
            System.out.println("Meaningfully equals");
    }
}
