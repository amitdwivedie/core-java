package com.amitdwivedie.core.operator;

/**
 * @author Amit Dwivedi
 *
 */
public class ShortCircuit {

    public static void main(String[] args) {
        int i = 10;
        boolean b = false;
        
        if((i> 5) || (b=true)){
            System.out.println("Boolean value for b " + b);
        }
        
        if((i> 5) && (b=true)){
            System.out.println("Boolean value for b " + b);
        }
    }
}
