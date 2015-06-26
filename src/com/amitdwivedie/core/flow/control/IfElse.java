package com.amitdwivedie.core.flow.control;

/**
 * Else clause belongs to innermost if statement which doesn't have else.
 * 
 * @author Amit Dwivedi
 * 
 */
public class IfElse {

    public static void main(String[] args) {
        int x = 1;
        if (x == 2)
            System.out.println('2');
        if (x == 3)
            System.out.println('3');
        else
            System.out.println('1');

        boolean test = false;
        if(test = true)
            System.out.println("And.. here we go!!!");
    }
}
