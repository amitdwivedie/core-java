package com.amitdwivedie.core.basic.io;

class Student implements java.io.Serializable {
    int age, roll;
    int marks;

    public Student(int a, int r, int m) {
        age = a;
        roll = r;
        marks = m;
    }
}