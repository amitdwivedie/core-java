package com.amitdwivedie.core.basic.thread;

class ThreadTest {
    static {
        Thread t = Thread.currentThread();
        System.out.println("Name is: " + t.getName());

    }

    public static void main(String g[]) {
        System.out.println("main Thread is started...");

        Thread t = Thread.currentThread();
        System.out.println("Name is: " + t.getName());
        System.out.println("Priority is: " + t.getPriority());
        System.out.println("Name is: " + t.getState());
        t.setName("myThread");
        t.setPriority(7);

        try {
            Thread.sleep(2000);

        } catch (Exception e) {
        }
        System.out.println("Name is: " + t.getName());
        System.out.println("Priority is: " + t.getPriority());
        System.out.println("Name is: " + t.getState());
        System.out.println("main is completed...");
    }
}
