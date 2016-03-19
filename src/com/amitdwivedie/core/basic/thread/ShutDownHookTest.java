package com.amitdwivedie.core.basic.thread;

class Shut extends Thread {
    public void run() {
        System.out.println("byeeeeee !!! ");
    }
}

class ShutDownHookTest {
    public static void main(String g[]) {
        Shut s = new Shut();
        Runtime rt = Runtime.getRuntime();
        rt.addShutdownHook(s);

        for (int i = 0; i < 15; i++) {
            // try{Thread.sleep(2000);}catch(Exception e){}
            System.out.println("main" + i);
        }
    }
}