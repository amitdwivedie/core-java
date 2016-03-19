package com.amitdwivedie.core.basic.oops.ENUMS;

enum Books {
    MyBook, HisBook, YourBook;
};

public class BOOKTest {
    public static void main(String args[]) {
        for (Books b : Books.values()) {
            System.out.println(b);
            System.out.println(b.ordinal());
        }
    }
}
