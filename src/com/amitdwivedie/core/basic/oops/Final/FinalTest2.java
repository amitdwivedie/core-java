package com.amitdwivedie.core.basic.oops.Final;

class FinalTest2 {
    final int i = 10;
    final int j; // blank final
    final int k;

    FinalTest2() {
        j = 20;
    }

    {
        k = 30;
    }

    public static void main(String g[]) {
        FinalTest2 f = new FinalTest2();
        // j=20; //we cann't here the value of j
        System.out.println(f.i);
        System.out.println(f.j);
        System.out.println(f.k);
    }
}