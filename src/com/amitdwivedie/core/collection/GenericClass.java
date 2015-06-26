package com.amitdwivedie.core.collection;

/**
 * @author Amit Dwivedi
 *
 */
public class GenericClass {

    public <T> GenericClass(T t) {

    }
    
    public static void main(String[] args) {
        GenericClass genericClass1 = new GenericClass(new Animal());
        GenericClass genericClass2 = new GenericClass(new Dog1());
        GenericClass genericClass3 = new GenericClass(new Cat1());
    }
}
