package com.amitdwivedie.core.basic.exception;

class A {
    void show() {
        try {
            // MyExp me=new MyExp();

            MyExp me = new MyExp("hello...shit");

            throw me;
        } catch (MyExp m) {
            System.out.println(m);
        }
    }

    public static void main(String g[]) {
        int length = g.length;

        try {
            if (length >= 2) {
                int i = Integer.parseInt(g[0]);
                int j = Integer.parseInt(g[1]);
            } else {
                ArrayIndexOutOfBoundsException ae = new ArrayIndexOutOfBoundsException();

                System.out.println("plz give the both arguments");
                throw ae;

                // System.out.println("hello"); // this statment never executed
                // hence compiler give run time error;
            }
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

            System.out.println(e.getMessage());
        }

        A a = new A();

        a.show();
    }
}
