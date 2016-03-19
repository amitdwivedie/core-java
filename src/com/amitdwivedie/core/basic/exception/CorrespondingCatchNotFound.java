package com.amitdwivedie.core.basic.exception;

class CorrespondingCatchNotFound {
    public static void main(String g[]) {
        try {
            int i = 6 / 0;
        } catch (NullPointerException e) {
            System.out.println("hello");
        } finally {
            System.out.println("finally");
        }
        System.out.println("main");
    }
}