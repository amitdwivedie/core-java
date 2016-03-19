package com.amitdwivedie.core.basic.thread;

class Stack1 {
    static int element[] = new int[5];
    static int top = -1;
    String s1 = "abc";

    // public synchronized void push(int i)
    public void push(int i) {
        // synchronized(s1)
        synchronized (String.class) {
            System.out.println(i + "is going to push ...");
            if (top >= 4) {
                System.out.println("Stack is overflow...");

            } else {
                top++;
                element[top] = i;
                System.out.println(i + "pushed...");
            }
        }
    }

    // public synchronized void pop()
    public void pop() {
        // synchronized(s1)
        synchronized (String.class) {
            if (top < 0) {
                System.out.println("Stack is under flow...");

            } else {
                System.out.println(element[top] + "is going to pop...");
                System.out.println(element[top] + "is  poped...");
                top--;

            }
        }

    }
}