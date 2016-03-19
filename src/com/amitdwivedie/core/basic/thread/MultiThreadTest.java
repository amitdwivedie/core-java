package com.amitdwivedie.core.basic.thread;

class MultiThreadTest {
    public static void main(String g[]) {
        System.out.println("main Thread is Started...");

        Child1 ch1 = new Child1();
        System.out.println("Name of Ch1 before assign Child1 " + ch1.getName());
        ch1.setName("Child1");

        Child2 ch2 = new Child2();
        System.out.println("Name of Ch2 before assign Child2 " + ch2.getName());
        ch2.setName("Child2");

        ch1.start();
        ch2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("this is main...");
        }
        System.out.println("main Thread completed...");

    }
}
