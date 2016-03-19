package com.amitdwivedie.core.basic.thread;

class Common {
    int i;
}

class Child01 extends Thread {
    Common c;
    ThreadLocal buffer;

    Child01(Common c, ThreadLocal buffer) {
        this.c = c;
        this.buffer = buffer;
    }

    public void run() {
        String t = Thread.currentThread().getName();

        synchronized (c) // synchronized(buffer)
        {
            if (t.equals("t1")) {
                c.i = 10;
            } else {
                c.i = 20;
            }
            buffer.set(c.i);

        }
        System.out.println("data of " + t + " :" + buffer.get());

    }
}

class ThreadLocalTest {
    public static void main(String g[]) {
        ThreadLocal buffer = new ThreadLocal();
        Common c = new Common();

        Child01 ch1 = new Child01(c, buffer);
        Child01 ch2 = new Child01(c, buffer);

        ch1.setName("t1");
        ch2.setName("t2");

        ch1.start();
        ch2.start();
    }
}