package com.amitdwivedie.core.basic.collection;

import java.util.*;

class StackTest {
    public static void main(String g[]) {
        Stack st = new Stack();
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");
        st.push("5");
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.peek());
    }
}