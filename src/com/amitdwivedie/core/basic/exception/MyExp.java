package com.amitdwivedie.core.basic.exception;

class MyExp extends NumberFormatException {
    String msg;

    public String toString() {
        return "MyExp::" + msg;
    }

    MyExp() {
        // super("this is My Exception");

        msg = "this is my Exception";
    }

    MyExp(String msg) {
        // super(msg);

        this.msg = msg;
    }
}
