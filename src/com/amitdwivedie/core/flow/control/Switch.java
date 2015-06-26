package com.amitdwivedie.core.flow.control;

/**
 * The CASE constant must be compile time constant, so we can only use constant
 * or final variable that assigned a literal value.
 * 
 * @author Amit Dwivedi
 * 
 */
public class Switch {

    enum Color {RED, BLUE, GREEN}
    public static void main(String[] args) {
        final int a = 10;
        final int b;
        b = 11;
        int x = 0;
        switch (x) {
        case a:

            break;
/*        case b://compile time error

            break;*/
        default:
            break;
        }
        
        byte b1 = 10;
        switch (b1) {
        case 24:
        /*case 128:*/ //loss of precision 
        }
        
        switch (new Integer(4)) {
        case 4:
            System.out.println("4");
            break;

        default:
            break;
        }
        
        Color c = Color.GREEN;
        switch (c) {
        case GREEN:{
            System.out.println("Green");
        }
        case BLUE: 
            System.out.println("Blue");
        case RED: 
            System.out.println("Red");
        default:
            System.out.println("Default");
        }
    }
}
