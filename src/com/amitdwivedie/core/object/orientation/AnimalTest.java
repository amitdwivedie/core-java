package com.amitdwivedie.core.object.orientation;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * @author Amit Dwivedi
 *
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal horse = new Horse();
        animal.eat();
        horse.eat();

        animal.drink();
        horse.drink();

        animal.sleep();
        horse.sleep();

        new Horse().checked();
        // throws compile time exception
        //horse.checked();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eat method");
        return;
    }

    protected void drink() {
        System.out.println("Animal drink method");
        return;
    }

    public void sleep() {
        System.out.println("Animal sleep method");
        return;
    }

    public void bath() throws FileNotFoundException, SQLException {
        System.out.println("Animal bath method");
        return;
    }

    public void checked() throws Exception {
        System.out.println("Animal cheked  method");
        throw new Exception();
    }
}

class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eat method");
        return;
    }

    public void drink() {
        System.out.println("Horse drink method");
        return;
    }

    /*
     * (non-Javadoc) overriding method can throw any unchecked exception
     * regardless of superclass mehod
     * 
     * @see com.amitdwivedie.core.object.orientation.Animal#sleep()
     */
    public void sleep() throws NullPointerException {
        System.out.println("Horse sleep method");
        return;
    }

    /*
     * public void sleep() throws Exception {
     * System.out.println("Horse sleep method"); return; }
     */

    /*
     * (non-Javadoc) If overridden method throwing some checked exception then
     * subper class will also throw the same or broader
     * 
     * @see com.amitdwivedie.core.object.orientation.Animal#bath()
     */
    public void bath() throws SQLException {
        System.out.println("Horse bath method");
        return;
    }

    public void checked() {
        System.out.println("Horse cheked  method");
        return;
    }
}