package com.amitdwivedie.core.basic.reflection;

class Student {

    public Student() {
        System.out.println("Public Constructor");
    }

    protected Student(int i) {
        System.out.println("Protected Constructor");
    }

    Student(int i, int j) {
        System.out.println("Default Constructor");
    }

    private Student(String name) {
        System.out.println("Private Constructor");
    }

    public void show(int i, String name) {
        System.out.println("Show Method");
        System.out.println("value is :" + i);
        System.out.println("name is :" + name);
    }

    private void disp() {
        System.out.println("Disp Method");
    }
}
