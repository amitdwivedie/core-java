package com.amitdwivedie.core.basic.thread;

class PopThread extends Thread {
    Stack1 st;

    public PopThread(Stack1 st) {
        this.st = st;
    }

    public void run() {
        for (int i = 0; i < 10; i++)
            st.pop();
    }

}