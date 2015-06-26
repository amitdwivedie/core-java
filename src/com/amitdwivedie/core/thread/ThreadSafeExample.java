package com.amitdwivedie.core.thread;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class ThreadSafeExample {

    private List<String> names = Collections
            .synchronizedList(new LinkedList<String>());

    public synchronized void add(String name) {
        names.add(name);

    }

    public synchronized String removeFirst() {
        if (names.size() > 0) {
            return names.remove(0);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        final ThreadSafeExample example = new ThreadSafeExample();
        example.add("amit");

        class NameDropper extends Thread {

            public void run() {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                String name = example.removeFirst();
                System.out.println(name);
            }
        }

        NameDropper dropper1 = new NameDropper();
        NameDropper dropper2 = new NameDropper();

        dropper1.start();
        dropper2.start();
    }
}
