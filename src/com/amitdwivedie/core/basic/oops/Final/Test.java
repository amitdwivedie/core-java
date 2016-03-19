package com.amitdwivedie.core.basic.oops.Final;

public class Test {
    final int someInt;

    {
        System.out.println(getSomeInt());
    }

    int getSomeInt() {
        System.out.println(someInt);
        return someInt;
    }

    public Test() {
        someInt = 2;
        System.out.println(someInt);
    }

    public static void main(String[] args) {
        new Test();
    }
}