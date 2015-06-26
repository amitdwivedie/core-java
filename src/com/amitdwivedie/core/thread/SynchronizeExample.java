package com.amitdwivedie.core.thread;

/**
 * @author Amit Dwivedi
 *
 */
public class SynchronizeExample {

    public static void main(String[] args) {
        Synchronize synchronize = new Synchronize();

        Thread thread1 = new Thread(synchronize, "Sync_1");
        Thread thread2 = new Thread(synchronize, "Sync_2");

        thread1.start();
        thread2.start();
    }
}

class Synchronize implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            sync();
            pop();
            show();
            display();
        }

    }

    public static synchronized void sync() {
        System.out.println("Synchronized static method of thread "
                + Thread.currentThread().getName());
    }

    public static void pop() {
        synchronized (Synchronize.class) {
            System.out.println("Static synchronized block of thread "
                    + Thread.currentThread().getName());
        }
    }

    public synchronized void show() {
        System.out.println("Synchronized show method of thread "
                + Thread.currentThread().getName());
    }

    public void display() {
        synchronized (this) {
            System.out.println("Synchronized block of thread "
                    + Thread.currentThread().getName());
        }
    }

}