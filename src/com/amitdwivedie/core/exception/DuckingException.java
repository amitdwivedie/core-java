package com.amitdwivedie.core.exception;

/**
 * ducking the exception means the exception that never caught that will cause
 * the application to stop running.
 * 
 * @author Amit Dwivedi
 * 
 */
public class DuckingException {

    public static void main(String[] args) {
        divide();
    }

    private static void divide() {
        int i = 10 / 0;
    }
}
