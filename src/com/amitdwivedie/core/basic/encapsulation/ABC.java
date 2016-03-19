package com.amitdwivedie.core.basic.encapsulation;

class ABC {
    private int i;

    public void setValue(int i) {
        this.i = i;
    }

    public int getValue() {
        i = i * 2;
        return i;
    }

}