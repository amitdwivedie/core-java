package com.amitdwivedie.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Amit Dwivedi
 *
 */
public class TransientExample {

    public static void main(String[] args) {

        try {
            Collar collar = new Collar(10);
            Collar1 collar1 = new Collar1("Red", collar);
            System.out.println(collar1);

            FileOutputStream stream = new FileOutputStream("collar.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
            objectOutputStream.writeObject(collar1);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("collar.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            collar1 = (Collar1) inputStream.readObject();
            System.out.println(collar1);
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Collar {
    private int weigth;

    public Collar(int weigth) {
        this.weigth = weigth;
        System.out.println("Collar constructor runs...");
    }

    @Override
    public String toString() {
        return "Collar [weigth=" + weigth + "]";
    }

}

class Collar1 implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 9203169291856324270L;

    private String color;
    private transient Collar collar;

    public Collar1(String color, Collar collar) {
        this.color = color;
        this.collar = collar;
        System.out.println("Collar constructor runs...");
    }

    @Override
    public String toString() {
        return "Collar1 [color=" + color + ", collar=" + collar + "]";
    }

}
