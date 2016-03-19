package com.amitdwivedie.core.basic.thread;

class StackTest1 {
    public static void main(String g[]) {
        System.out.println("main Thread is Started ...");
        System.out.println(
                "push & pop Thread are going to be created by main ...");

        Stack1 st = new Stack1();

        PushThread push = new PushThread(st);
        PopThread pop = new PopThread(st);

        System.out.println("Starting push & pop Thread ... ");

        push.start();
        pop.start();

        try {
            push.join();
            pop.join();
        } catch (Exception e) {
        }

        System.out.println("main is completed ...");

    }

}
