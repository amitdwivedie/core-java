package com.amitdwivedie.core.collection;

/**
 * @author Amit Dwivedi
 *
 * @param <T>
 */
public class AnimalHoder<T extends Animal> {

    public static void main(String[] args) {
        AnimalHoder<Animal> animalHoder = new AnimalHoder<Animal>();
        AnimalHoder<Dog1> dogHoder = new AnimalHoder<Dog1>();
        AnimalHoder<Cat1> catHoder = new AnimalHoder<Cat1>();
        
        //Animal holder will hold the animal and its subtype
        /*AnimalHoder<Integer> intHoder = new AnimalHoder<Integer>();
        AnimalHoder<Object> objHoder = new AnimalHoder<Object>();*/
    }
}
