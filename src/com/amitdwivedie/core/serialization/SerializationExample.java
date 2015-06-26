package com.amitdwivedie.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Objects must be read in order which it is saved.
 * 
 * @author Amit Dwivedi
 *
 */
public class SerializationExample {

    public static void main(String[] args) {

        try {
            Cat cat = new Cat("Cat", 8);
            Dog dog = new Dog("Doggy", 7);
            System.out.println(cat);
            System.out.println(dog);

            FileOutputStream outputStream = new FileOutputStream("cat.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    outputStream);

            objectOutputStream.writeObject(dog);
            objectOutputStream.writeObject(cat);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("cat.ser");
            ObjectInputStream inputStream = new ObjectInputStream(
                    fileInputStream);

            Dog dog2 = (Dog) inputStream.readObject();
            Cat cat2 = (Cat) inputStream.readObject();
            System.out.println(cat2);
            System.out.println(dog2);
            inputStream.close();

        } catch (Exception e) {

        }
    }
}

class Cat implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8297690882009409814L;

    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }

}

class Dog implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }

}