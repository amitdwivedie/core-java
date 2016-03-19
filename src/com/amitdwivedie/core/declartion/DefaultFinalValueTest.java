package com.amitdwivedie.core.declartion;

/**
 * @author amit
 *
 */
public class DefaultFinalValueTest {
    final int val;
    
    public DefaultFinalValueTest() {
        val = 10;
        System.out.println("Value of final variable " + getFinalVal());
    }
    {
        System.out.println("Default value of final variable val is " + getFinalVal());
    }
    
    public int getFinalVal(){
        return val;
    }
    public static void main(String[] args) {
        new DefaultFinalValueTest();
    }
}
