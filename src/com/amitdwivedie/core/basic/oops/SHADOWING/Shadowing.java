package com.amitdwivedie.core.basic.oops.SHADOWING;

class Shadowing {
    int i = 10;

    void show(Shadowing s1) {
        // i=20; if u declare like that then it means we assign the new value of
        // i.
        int i = 20;
        System.out.println(i);
        System.out.println(s1.i);
    }

    public static void main(String g[]) {
        Shadowing s = new Shadowing();
        s.show(s);
    }
}