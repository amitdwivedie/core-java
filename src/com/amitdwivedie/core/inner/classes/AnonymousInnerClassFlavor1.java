package com.amitdwivedie.core.inner.classes;

/**
 * @author Amit Dwivedi
 *
 */
public class AnonymousInnerClassFlavor1 {

    public static void main(String[] args) {
        Popcorn popcorn = new Popcorn() {
            public void pop() {
                System.out
                        .println("Anonymous implementation of Popcorn poped!!!");
            }

            public void sizzle() {
                System.out
                        .println("Anonymous implementation of Popcorn sizzled!!!");
            }
        };
        popcorn.pop();
        // popcorn.sizzle(); // will not find sizzle method which in not defined
        // in Popcorn class
    }
}

class Popcorn {
    public void pop() {
        System.out.println("Popcorn poped!!!");
    }
}
