package com.amitdwivedie.core.basic.exception;

import java.io.*;

class Stuff {

    void dostuff() /* throws IOException */ {
        try {
            doMore();
        } catch (IOException e) {

        }
    }

    void doMore() throws IOException {
        throw new IOException();
    }
}