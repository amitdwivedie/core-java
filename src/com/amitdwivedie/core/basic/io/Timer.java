package com.amitdwivedie.core.basic.io;

class Timer {
    static long st, et;

    public static void startTimer() {
        st = System.nanoTime();
    }

    public static void stopTimer() {
        et = System.nanoTime();
        System.out.println("Execution Time :" + (et - st) + "ns");
    }
}
