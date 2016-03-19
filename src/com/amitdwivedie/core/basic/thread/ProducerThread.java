package com.amitdwivedie.core.basic.thread;

class ProducerThread extends Thread {
    Buffer br;

    public ProducerThread(Buffer br) {
        this.br = br;
    }

    public void run() {
        for (int i = 0; i < 10; i++)
            br.produce(i + 5);
    }
}
