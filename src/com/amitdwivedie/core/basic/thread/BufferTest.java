package com.amitdwivedie.core.basic.thread;

class BufferTest {
    public static void main(String g[]) {
        System.out.println("main thread is Started ... ");

        Buffer br = new Buffer();

        ProducerThread produce = new ProducerThread(br);
        ConsumerThread consume = new ConsumerThread(br);

        // consume.start(); // if we call it first it going to waiting & produce
        // first runs.......

        produce.start();
        consume.start();

        /*
         * try { produce.join(); consume.join(); } catch(Exception e) {}
         */

        System.out.println("main thread is completed ... ");
    }
}
