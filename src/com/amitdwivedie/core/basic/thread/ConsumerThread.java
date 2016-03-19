package com.amitdwivedie.core.basic.thread;

class ConsumerThread extends Thread {
    Buffer br;

    public ConsumerThread(Buffer br) {
        this.br = br;
    }

    public void run() {
        for (int i = 0; i < 10; i++)
            br.consume();
    }
}
