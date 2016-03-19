package com.amitdwivedie.core.basic.encapsulation;

class Encap {
    private int i;

    public void setValue(int j) {
        this.i = j;
        // i=j;
    }

    public int getValue() {
        i = i * 2;
        return i;
    }
}