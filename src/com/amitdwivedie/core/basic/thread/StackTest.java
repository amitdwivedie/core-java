package com.amitdwivedie.core.basic.thread;

class StackTest {
    public static void main(String g[]) {
        Stack st = new Stack();

        for (int i = 0; i < 10; i++)
            st.push(i + 5);

        for (int i = 0; i < 10; i++)
            st.pop();
    }
}

class Stack {
    int element[] = new int[5];
    int top = -1;

    public void push(int i) {
        System.out.println(i + "is going to push ...");
        if (top >= 4) {
            System.out.println("Stack is overflow...");

        } else {
            top++;
            element[top] = i;
            System.out.println(i + "pushed...");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack is under flow...");

        } else {
            System.out.println(element[top] + "is going to pop...");
            System.out.println(element[top] + "is  poped...");
            top--;

        }

    }
}