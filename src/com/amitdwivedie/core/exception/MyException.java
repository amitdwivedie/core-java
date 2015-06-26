package com.amitdwivedie.core.exception;

/**
 * @author Amit Dwivedi
 *
 */
public class MyException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 565314257097170474L;

    void method1() throws MyException {
        method2();
    }

    void method2() throws MyException {
        try {
            throw new MyException();
        } catch (MyException e) {
            throw e;
        }
    }
}

class TestException {

    void show() throws MyException {
        throw new MyException();
    }

}
