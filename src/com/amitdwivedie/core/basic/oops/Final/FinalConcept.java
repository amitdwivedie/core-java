package com.amitdwivedie.core.basic.oops.Final;

class FinalConcept {

    final int i;

    FinalConcept() {
        i = 20;
        System.out.println("con");
        System.out.println(i);
    }

    {
        // i=10;
        System.out.println("ins");
        // System.out.println(i);
    }

    public static void main(String g[]) {

        FinalConcept fc = new FinalConcept();
        System.out.println(fc.i);
    }

}