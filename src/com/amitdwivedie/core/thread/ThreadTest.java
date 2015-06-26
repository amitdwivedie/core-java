package com.amitdwivedie.core.thread;

/**
 * @author Amit Dwivedi
 *
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread{
    
    public void run(){
        System.out.println("My Thread running...");
        System.out.println("Name of the thread - "
                + Thread.currentThread().getName());
        System.out.println("ID of the thread - "
                + Thread.currentThread().getId());
    }
}