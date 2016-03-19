package com.amitdwivedie.core.basic.exception;

import java.io.*;

class MyException extends Exception {

    void someMethod() throws MyException {
        doStuff();
    }

    void doStuff() throws MyException {
        try {
            throw new MyException();
        } catch (MyException me) {
            throw me;
        }
    }
}