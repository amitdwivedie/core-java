package com.amitdwivedie.core.basic.thread;

class Man {
    int i;

}

class Boy extends Thread {
    Man m;
    ThreadLocal tlocal;

    public Boy(Man m, ThreadLocal tlocal) {
        this.m = m;
        this.tlocal = tlocal;
    }

    public void run() {
        String t = Thread.currentThread().getName();
        synchronized (tlocal) {
            if (t.equals("t1")) {
                m.i = 10;
            } else {
                m.i = 20;
            }
            tlocal.set(m.i);

            System.out.println("data of" + t + " " + tlocal.get());
        }

    }

}

class ThreadLocalTest1 {
    public static void main(String g[]) {

        ThreadLocal tlocal = new ThreadLocal();
        Man m = new Man();

        Boy ch1 = new Boy(m, tlocal);
        Boy ch2 = new Boy(m, tlocal);

        ch1.setName("t1");
        ch2.setName("t2");

        ch1.start();
        ch2.start();
    }

}
