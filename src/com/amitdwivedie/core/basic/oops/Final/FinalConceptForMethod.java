package com.amitdwivedie.core.basic.oops.Final;

class FinalConceptForMethod {

    // final static int i;
    final int j;

    {
        j = 10;
    }

    void show() {
        final int a;
        {
            a = 19;
        }
        System.out.println(a);
    }

    public static void main(String g[]) {
        FinalConceptForMethod fc = new FinalConceptForMethod();
        fc.show();
        System.out.println(fc.j);
        // System.out.println(i); // variable might not be initailized compile
        // time error
        // we must have to intialize final static variable in same line
        // otherwise it gives compile time error

    }

}