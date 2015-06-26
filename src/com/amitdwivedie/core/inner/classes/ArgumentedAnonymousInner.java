package com.amitdwivedie.core.inner.classes;

/**
 * @author Amit Dwivedi
 *
 */
public class ArgumentedAnonymousInner {

    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.doStuff(new Foo() {

            @Override
            public void foof() {
                System.out.println("Anonymous implemention of Foo interface");
            }
        });
    }
}

interface Foo {
    void foof();
}

class Bar {
    void doStuff(Foo foo) {
        System.out.println("Using Foo in Bar method");
        foo.foof();
    }
}