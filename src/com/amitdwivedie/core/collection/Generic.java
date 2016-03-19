package com.amitdwivedie.core.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class Generic {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog1());
        animals.add(new Dog1());
        animals.add(new Dog1());
        addAnimals(animals);

        List<Dog1> dogs = new ArrayList<Dog1>();
        dogs.add(new Dog1());
        dogs.add(new Dog1());
        dogs.add(new Dog1());
        addAnimal(dogs);
        addAnimal(animals);

        List<Cat1> cats = new ArrayList<Cat1>();
        cats.add(new Cat1());
        cats.add(new Cat1());
        cats.add(new Cat1());
        // addAnimal(cats);

        List<? extends Animal> assign1 = new ArrayList<Animal>();
        List<? extends Animal> assign2 = new ArrayList<Dog1>();
        List<? extends Animal> assign3 = new ArrayList<Cat1>();
        // only we can manipulate the data cant add into collection.
        /*
         * assign1.add(new Animal()); assign2.add(new Dog1()); assign3.add(new
         * Cat1());
         */
        
        List<Object> test = new ArrayList<Object>();
        test.add(new Animal());
        test.add(new Dog("d"));
        test.add(new Cat1());
        addTest(test);

    }

    private static void addTest(List<?> test) {
       //test.add(new Animal()); //adding is not allowed
    }

    /**
     * This method will accept the list of type Dog1 or its super type. Nothing
     * lower in inheritance tree come in, but anything higher than Dog is
     * acceptable.
     * 
     * @param animals
     */
    private static void addAnimal(List<? super Dog1> animals) {
        animals.add(new Dog1());
    }

    private static void addAnimals(List<Animal> animals) {
        animals.add(new Dog1());
    }
}

class Animal {

}

class Dog1 extends Animal {

}

class Cat1 extends Animal {

}
