package com.amitdwivedie.core.basic.oops.Interface;

interface I1 {
    void show();
}

class MagicTest1 implements I1 {
    public String toString() {
        return "HELLO";
    }

    public void show() {
        System.out.println("Show");

    }

    public static void main(String g[]) {
        I1 ref = new MagicTest1();
        ref.show();
        // ref.toString();
        System.out.println(ref.toString());
    }
}
