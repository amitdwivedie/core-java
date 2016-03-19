package com.amitdwivedie.core.basic.exception;

class MathTest {
    public static void main(String kk[]) {
        int i = 0, j = 0, div = 0;

        System.out.println("*** MAIN IS STARTED ***");

        try {
            i = Integer.parseInt(kk[0]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            i = 2;

        } finally {
            System.out.println("this is finally of inner try...");
        }

        try {
            j = Integer.parseInt(kk[1]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            j = 1;
        } finally {
            System.out.println("this is finally of outer try...");
        }

        int add = Math.addition(i, j);
        System.out.println("ADDITION IS :::>" + add);

        int sub = Math.substraction(i, j);
        System.out.println("SUBSTRACTION IS :::>" + sub);

        int mul = Math.multiplication(i, j);
        System.out.println("MULTIPLICATION IS :::>" + mul);

        try {
            div = Math.division(i, j);
        } catch (Exception e) {
            div = Math.division(i, 1);
        }
        System.out.println("DIVISION IS :::>" + div);

        System.out.println("*** MAIN IS COMPLETED ***");
    }
}