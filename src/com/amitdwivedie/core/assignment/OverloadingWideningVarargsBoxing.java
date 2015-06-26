package com.amitdwivedie.core.assignment;

/**
 * Widening beats boxing
 * Widening beats var-args
 * 
 * @author Amit Dwivedi
 *
 */
public class OverloadingWideningVarargsBoxing {

    public static void main(String[] args) {
        int i = 10;
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(11);
        go(10);
        go(i);
        go(0, 0);
        go(integer1, integer2);
    }
    
    static void go(Integer integer){
        System.out.println("Integer");
    }
    
    static void go(long l){
        System.out.println("long");
    }
    
    static void go(int i, int j){
        System.out.println("int int");
    }
    
    static void go(int ...i){
        System.out.println("var-args");
    }
}
