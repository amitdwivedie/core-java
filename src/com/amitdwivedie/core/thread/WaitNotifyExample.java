package com.amitdwivedie.core.thread;

/**
 * @author Amit Dwivedi
 *
 */
public class WaitNotifyExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Reader reader1 = new Reader(calculator);
        Reader reader2 = new Reader(calculator);
        Reader reader3 = new Reader(calculator);

        reader1.start();
        reader2.start();
        reader3.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        calculator.start();
    }
}

class Reader extends Thread {

    Calculator calculator;

    public Reader(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        synchronized (calculator) {
            try {
                System.out.println("Waiting for calculation...");
                calculator.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total is " + calculator.total);
        }
    }
}

class Calculator extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notifyAll();
        }
    }
}