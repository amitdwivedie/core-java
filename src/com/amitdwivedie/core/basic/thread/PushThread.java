package com.amitdwivedie.core.basic.thread;

class PushThread extends Thread {
    Stack1 st;

    public PushThread(Stack1 st) {
        this.st = st;
    }

    public void run() {
        for (int i = 0; i < 10; i++)
            st.push(i + 5);
    }

}