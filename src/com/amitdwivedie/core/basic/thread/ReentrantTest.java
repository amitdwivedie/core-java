package com.amitdwivedie.core.basic.thread;

import java.util.concurrent.locks.*;

class Morning {
    ReentrantLock l = new ReentrantLock();

    public void goodMorning() {
        for (int i = 0; i < 5; i++) {
            try {
                l.lock();
                System.out.println(Thread.currentThread().getName());
                System.out.print("Good ");
                System.out.println(" Morning");
            } finally {
                l.unlock();
            }
        }
    }
}

class Child extends Thread {
    Morning m;

    Child(Morning m) {
        this.m = m;
    }

    public void run() {
        m.goodMorning();
    }
}

class ReentrantTest {
    public static void main(String g[]) {

        Morning m = new Morning();

        Child ch1 = new Child(m);
        Child ch2 = new Child(m);

        ch1.start();
        ch2.start();
    }
}
