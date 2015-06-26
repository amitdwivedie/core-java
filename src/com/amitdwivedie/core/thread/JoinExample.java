package com.amitdwivedie.core.thread;

/**
 * @author Amit Dwivedi
 *
 */
public class JoinExample {

    public static void main(String[] args) {
        Join join = new Join();

        Thread thread1 = new Thread(join, "Join_thread _1");
        Thread thread2 = new Thread(join, "Join_thread _2");
        Thread thread3 = new Thread(join, "Join_thread _3");
        Thread thread4 = new Thread(join, "Join_thread _4");
        Thread thread5 = new Thread(join, "Join_thread _5");

        try {
            thread1.start();
            thread1.join();

            thread2.start();
            thread2.join();

            thread3.start();
            thread3.join();

            thread4.start();
            thread4.join();

            thread5.start();
            thread5.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Join implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Current running thread - "
                    + Thread.currentThread().getName() + " with count - " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println();

    }

}
