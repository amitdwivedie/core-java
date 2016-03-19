package com.amitdwivedie.core.basic.thread;

class MultiThreadTest1 {
    public static void main(String g[]) {
        System.out.println("main Thread is Started...");

        Child11 ch1 = new Child11();
        // Runnable ch1=new Child11(); // we can also create thread by using
        // Runnable
        Thread t1 = new Thread(ch1, "t1");

        Child22 ch2 = new Child22();
        Thread t2 = new Thread(ch2, "t2");

        // t1.setName("t1");
        // t2.setName("t2");

        t1.start();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("this is main...");
        }
        System.out.println("main Thread completed...");

    }
}
