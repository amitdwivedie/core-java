package com.amitdwivedie.core.assignment;

/**
 * @author Amit Dwivedi
 *
 */
public class InitializationBlock extends SuperInitializationBlock{

    public InitializationBlock() {
        System.out.println("Default constructor of InitializationBlock...");
        System.out.println("**********************************************");
    }

    public InitializationBlock(int i) {
        this();
        System.out.println("Argumented constructor of InitializationBlock...");
        System.out.println("**********************************************");
    }

    static {
        System.out.println("First static block of InitializationBlock..");
    }
    static {
        System.out.println("Second static block of InitializationBlock..");
    }
    {
        System.out.println("First non static block of InitializationBlock..");
    }
    {
        System.out.println("Second non static block of InitializationBlock..");
    }

    public static void main(String[] args) {
        new InitializationBlock();
        new InitializationBlock(0);
    }
}

class SuperInitializationBlock{
    public SuperInitializationBlock() {
        System.out.println("Default constructor of SuperInitializationBlock...");
    }

    public SuperInitializationBlock(int i) {
        System.out.println("Argumented constructor of SuperInitializationBlock...");
    }

    static {
        System.out.println("First static block of SuperInitializationBlock..");
    }
    static {
        System.out.println("Second static block of SuperInitializationBlock..");
    }
    {
        System.out.println("First non static block of SuperInitializationBlock..");
    }
    {
        System.out.println("Second non static block of SuperInitializationBlock..");
    }

}
