package com.amitdwivedie.core.basic.oops.Array;

class AnonymousArray {
    static int add(int i[]) {
        // for(int a=0;a<(new int[]{10,20,30,40,50}).length;a++)
        for (int a = 0; a < i.length; a++) {
            System.out.println(i[a]);
        }
        return i[0];
    }

    static char show(char b[]) {
        // b[]=new char[4];
        b[0] = 'a';
        b[1] = 'm';
        b[2] = 'i';
        b[3] = 't';
        for (int i = 0; i < 4; i++) {
            System.out.println(b[i]);
        }

        return b[0];
    }

    public static void main(String k[]) {

        add(new int[] { 10, 20, 30, 40, 50 });
        show(new char[4]); // weldone baby

    }
}
