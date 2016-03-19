package com.amitdwivedie.core.basic.thread;

class Child1 extends Thread {
    public void run() {
        A a = new A();
        a.show();
    }
}
