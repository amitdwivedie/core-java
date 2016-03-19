package com.amitdwivedie.core.basic.io;

import java.io.*;

class ListDrives {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for (int i = 0; i < roots.length; i++) {
            System.out.println("Drive:" + roots[i]);
        }
    }
}
