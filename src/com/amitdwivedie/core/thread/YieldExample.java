package com.amitdwivedie.core.thread;

/**
 * @author Amit Dwivedi
 *
 */
public class YieldExample {

    public static void main(String[] args) {
        Yield yield = new Yield();

        Thread thread1 = new Thread(yield, "Yield_1");
        Thread thread2 = new Thread(yield, "Yield_2");

        thread1.start();
        thread2.start();
    }
}

class Yield implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Current running thread - "
                    + Thread.currentThread().getName() + " with count - " + i);
            
            try {
                Thread.yield();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}