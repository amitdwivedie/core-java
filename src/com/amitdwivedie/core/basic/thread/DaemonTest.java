package com.amitdwivedie.core.basic.thread;

class Child02 extends Thread {
    public void run() {
        int i = 0;

        while (true) {
            i++;

            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }

            System.out.println("Daemon :" + i);
        }
    }
}

class DaemonTest {
    public static void main(String g[]) {
        Child02 ch1 = new Child02();
        ch1.setName("Daemon");
        ch1.setDaemon(true);
        System.out.println(ch1.getPriority());
        ch1.start();

        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
            }

            System.out.println("main :" + i);
        }
    }
}
