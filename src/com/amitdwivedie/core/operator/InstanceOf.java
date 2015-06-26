package com.amitdwivedie.core.operator;

/**
 * @author Amit Dwivedi
 *
 */
public class InstanceOf {

    public static void main(String[] args) {
        int i = 10;
        /*
         * if(i instanceof Object){
         * 
         * }
         */

        /*
         * if(10 instanceof Object){
         * 
         * }
         */

        if (new Integer(1) instanceof Object) {
            System.out.println("Object of  Premitive ");
        }

        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Dog dog = new Dog();

        if (animal1 instanceof Animal) {
            System.out.println("animal1 is Animal object");
        }

        if (animal2 instanceof Animal) {
            System.out.println("animal2 is Animal object");
        }

        if (animal1 instanceof Dog) {
            System.out.println("animal1 is Dog object");
        }

        if (animal2 instanceof Dog) {
            System.out.println("animal2 is Dog object");
        }
        
        if (dog instanceof Animal) {
            System.out.println("dog is Animal object");
        }
        
        if (dog instanceof Dog) {
            System.out.println("dog is Dog object");
        }
    }
}

class Animal {

}

class Dog extends Animal {

}
