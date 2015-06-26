package com.amitdwivedie.core.thread;

/**
 * @author Amit Dwivedi
 *
 */
public class SleepExample {
    public static void main(String[] args) {
        Sleep sleep = new Sleep();

        Thread thread1 = new Thread(sleep, "Thread-1");
        Thread thread2 = new Thread(sleep, "Thread-2");
        Thread thread3 = new Thread(sleep, "Thread-3");
        Thread thread4 = new Thread(sleep, "Thread-4");
        Thread thread5 = new Thread(sleep, "Thread-5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }

}

class Sleep implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Current running thread - "
                    + Thread.currentThread().getName() + " with count - " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
