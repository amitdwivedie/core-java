package com.amitdwivedie.core.basic.oops.Interface;

interface AAA {
    // int i; // we must have to initialize the value of datatype
    int j = 10;

}

public class FinalInterfaceTest implements AAA {

    public static void main(String g[]) {
        System.out.println(j);
    }
}