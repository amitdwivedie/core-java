package com.amitdwivedie.core.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class GenericExample {

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<Human>();
        humans.add(new Man());
        humans.add(new Girl());
        addHuman(humans);
        addHumen(humans);
    }
    
    static void addHuman(List<Human> humans){
        humans.add(new Man());
    }
    
    static void addHumen(List humans){
        humans.add(new Girl());
    }
}

class Human {

    public void eat() {
        System.out.println("Human eaating!!!");
    }
}

class Man extends Human {

    @Override
    public void eat() {
        System.out.println("Man eaating!!!");
    }
}

class Girl extends Human {

    @Override
    public void eat() {
        System.out.println("Girl eaating!!!");
    }
}
