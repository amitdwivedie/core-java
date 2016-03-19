package com.amitdwivedie.core.basic.oops.Final;

class FinalTest1 {
    final void show() {
        System.out.println("Show of FinalTest1");
    }
}

class B1 extends FinalTest1 {
    /*
     * void show() //show method cann't be override { System.out.println(
     * "Show of B1"); }
     */
}