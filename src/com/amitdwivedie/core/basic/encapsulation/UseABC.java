package com.amitdwivedie.core.basic.encapsulation;

class UseABC {
    public static void main(String g[]) {
        ABC a = new ABC();
        a.setValue(10);
        int j = a.getValue();
        System.out.println(j);
    }
}