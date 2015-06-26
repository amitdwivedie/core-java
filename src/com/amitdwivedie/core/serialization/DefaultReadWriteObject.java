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
public class DefaultReadWriteObject {

    public static void main(String[] args) {
        try {
            Test2 test2 = new Test2("Test2", 10);
            Test1 test1 = new Test1("Test1", test2);
            System.out.println(test1);

            FileOutputStream stream = new FileOutputStream("collar.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    stream);
            objectOutputStream.writeObject(test1);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("collar.ser");
            ObjectInputStream inputStream = new ObjectInputStream(
                    fileInputStream);
            test1 = (Test1) inputStream.readObject();
            System.out.println(test1);
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Test1 implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String name;
    private transient Test2 test2;

    public Test1(String name, Test2 test2) {
        this.name = name;
        this.test2 = test2;
    }

    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeObject(test2.getName());
            os.writeInt(test2.getVal());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream oi) {
        try {
            oi.defaultReadObject();
            test2 = new Test2((String) oi.readObject(), oi.readInt());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test1 [name=" + name + ", test2=" + test2 + "]";
    }

}

class Test2 {
    private String name;
    private int val;

    public Test2(String name, int val) {
        this.name = name;
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Test2 [name=" + name + ", val=" + val + "]";
    }

}
