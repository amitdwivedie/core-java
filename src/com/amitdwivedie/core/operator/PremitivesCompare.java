package com.amitdwivedie.core.operator;

/**
 * @author Amit Dwivedi
 *
 */
public class PremitivesCompare {

    public static void main(String[] args) {
        char b = 'a';
        System.out.println("Character comparision " + (b == 'a'));

        double d = 52.0;
        System.out.println("Double comparision " + (d == 52L));

        System.out.println("Boolean comparision " + (true == false));
        
        boolean c = false;
        if(c = true)
            System.out.println("Boolen True");
        else
            System.out.println("Boolen False");

    }
}
