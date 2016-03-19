package com.amitdwivedie.core.basic.thread;

class LazyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        try {
            Thread.sleep(10000);
            // Thread.sleep(100);
            System.out.println("1");
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("Thread is interrupted ... & feeling Fresh ...");
        }
        System.out.println("Thread is again Ready to Work ...");
    }
}

class JoinInterrupt {
    public static void main(String g[]) {
        System.out.println("main Thread Started ...");

        LazyThread lazy = new LazyThread();
        lazy.setName("lazy");
        lazy.start();
        System.out.println(lazy.isInterrupted());
        System.out.println("main give the chance to lazy ... ");
        try {
            lazy.join(3000); // main suspended for 30000ms then if cpu assign
                             // the cycle to Lazy thread then it execute other
                             // wise not;
        } catch (Exception e) {
        }
        System.out.println("lazy is too lazy , interrupting ...");
        lazy.interrupted();
        System.out.println(lazy.isInterrupted());
        System.out.println("main Thread completed ");
    }
}
