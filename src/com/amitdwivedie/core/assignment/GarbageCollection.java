package com.amitdwivedie.core.assignment;

import java.util.Date;

/**
 * @author Amit Dwivedi
 *
 */
public class GarbageCollection {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        
        System.out.println("Total JVM memory " + runtime.totalMemory());
        System.out.println("Free JVM memory before " + runtime.freeMemory());
        
        Date date;
        for (int i = 0; i < 100000; i++) {
            date = new Date();
            date = null;
            
        }
        
        System.out.println("Free JVM memory after  " + runtime.freeMemory());
        
        runtime.gc();
        
        System.out.println("Total JVM memory after GC " + runtime.totalMemory());
    }
}
