package com.amitdwivedie.core.basic.socket;

import java.io.*;

class Student implements Serializable, St {
    String name;
    int age;

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void show() {
        System.out.println("Name is =" + name);
        System.out.println("Age is =" + age);
    }
}