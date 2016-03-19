package com.amitdwivedie.core.basic.thread;

class A {
    void show() {
        System.out.println(
                "in show Thread is: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++)
            System.out.println("show");
    }

    void disp() {
        System.out.println(
                "in disp Thread is: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++)
            System.out.println("disp");
    }
}
