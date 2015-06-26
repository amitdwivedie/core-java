package com.amitdwivedie.core.operator;

/**
 * @author Amit Dwivedi
 *
 */
public class EnumCompare {

    enum Color {RED, BLUE}
    
    public static void main(String[] args) {
        Color color1 = Color.RED;
        Color color2 = Color.RED;
        
        System.out.println(color1 == color2);
        System.out.println(color1.equals(color2));
    }
}
