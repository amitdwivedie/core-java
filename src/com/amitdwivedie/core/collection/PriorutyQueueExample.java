package com.amitdwivedie.core.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Amit Dwivedi
 *
 */
public class PriorutyQueueExample implements Comparator<Integer> {

    public static void main(String[] args) {
        int[] ia = { 1, 5, 3, 7, 9, 8 };
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        for (int i : ia) {
            priorityQueue.offer(i);
        }

        for (int i : ia) {
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println("Size " + priorityQueue.size());

        PriorutyQueueExample queueExample = new PriorutyQueueExample();
        PriorityQueue<Integer> priority = new PriorityQueue<Integer>(10,
                queueExample);
        for (int i : ia) {
            priority.offer(i);
        }
        System.out.println("Size " + priority.size());
        System.out.println("Peek " + priority.peek());
        System.out.println("Size " + priority.size());
        System.out.println("Poll " + priority.poll());
        System.out.println("Size " + priority.size());

        for (int i : ia) {
            System.out.print(priority.poll() + " ");
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
