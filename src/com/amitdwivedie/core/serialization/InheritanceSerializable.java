package com.amitdwivedie.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * During the deserialization inherited variable from the non serializable super class will come back with
 * their default/initially assigned value rather than a value that had assigned during serialization.
 * 
 *  means all things happen to super class same as it happen during the initialization(like constructor calling and initializing
 *  default values to instance variables)
 * 
 * @author Amit Dwivedi
 *
 */
public class InheritanceSerializable {

    public static void main(String[] args) {

        try {
            Man man = new Man("Amit", 5);
            System.out.println(man);

            FileOutputStream stream = new FileOutputStream("human.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
            objectOutputStream.writeObject(man);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("human.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            man = (Man) inputStream.readObject();
            System.out.println(man);
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Human {
    int height = 100;
    
    public Human() {
        System.out.println("Human constructor");
    }
}

class Man extends Human implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -9140600092417101617L;

    private String name;

    public Man(String name, int height) {
        this.name = name;
        this.height = height;
        System.out.println("Human constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man [name=" + name + ", height=" + height + "]";
    }

}