package com.amitdwivedie.core.basic.exception;

import java.io.*;

class ReThrowException {

    void doStuff() throws IOException {
        try {
            throw new IOException();
        } catch (IOException me) {
            throw me;
        }
    }
}