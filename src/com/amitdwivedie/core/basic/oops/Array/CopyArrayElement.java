package com.amitdwivedie.core.basic.oops.Array;


/*
The System class has an arraycopy method that you can use to efficiently copy data from one array into another:

public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);
*/

class CopyArrayElement {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
                't', 'e', 'd' };

        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyFrom));
        System.out.println(new String(copyTo));
    }
}
