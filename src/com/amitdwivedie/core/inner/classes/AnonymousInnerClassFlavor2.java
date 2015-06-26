package com.amitdwivedie.core.inner.classes;

/**
 * @author Amit Dwivedi
 *
 */
public class AnonymousInnerClassFlavor2 {

    public static void main(String[] args) {
        Cookable cookable = new Cookable() {

            @Override
            public void cook() {
                System.out
                        .println("Anonymous implemention of Cookable interface");

            }
        };
        cookable.cook();
    }
}

interface Cookable {
    void cook();
}
