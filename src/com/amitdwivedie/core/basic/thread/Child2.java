package com.amitdwivedie.core.basic.thread;

class Child2 extends Thread {
    public void run() {
        A a = new A();
        a.disp();
    }
}