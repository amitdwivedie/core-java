package com.amitdwivedie.core.thread;

/**
 * @author Amit Dwivedi
 *
 */
public class RunnableTest {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "MyRunnable");
        thread.start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("My Runnable...");
        System.out.println("Name of the thread - " + Thread.currentThread().getName());
        System.out.println("Name of the thread - " + Thread.currentThread().getName());
        System.out.println("ID of the thread - " + Thread.currentThread().getId());
        System.out.println("Name of the thread - " + Thread.currentThread().getName());
        System.out.println("Priority of the thread - " + Thread.currentThread().getPriority());
    }
    
}