package com.amitdwivedie.core.inner.classes;

/**
 * @author Amit Dwivedi
 *
 */
public class InnerMethodClass {
    
    private String outer = "Outer-variable";

    public static void main(String[] args) {
        InnerMethodClass innerMethodClass = new InnerMethodClass();
        innerMethodClass.show();
    }
    
    public void show(){
        final int x = 12;
        
        class InnerLocal{
            public void stuff(){
                System.out.println("Inner class inside method.");
                System.out.println("Accessing final varibal of method - " + x);
                System.out.println("Accessing  varibal of Outer - " + outer);
            }
        }
        InnerLocal local = new InnerLocal();
        local.stuff();
    }
}
