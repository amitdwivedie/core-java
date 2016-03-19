package com.amitdwivedie.core.object.orientation;

/**
 * @author Amit Dwivedi
 *
 */
public class Static {

    int i = 0;
    static int j = 1;
    public Static() {
        // cannot invoke instance variable and methods while constructor invocation.
        //this(i);
        // we can invoke static variable or methods.
        //this(j);
        this(getInt());
        System.out.println("Default");
    }

    public Static(int val) {
        System.out.println("Argumented");
    }

    public static int getInt() {
        System.out.println("Static method");
        return 0;
    }

    public void name() {
        System.out.println("non static method");
    }

    public static void main(String[] args) {
        new Static();
    }
}
