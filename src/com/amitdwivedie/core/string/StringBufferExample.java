package com.amitdwivedie.core.string;

/**
 * StringBuffer class is thread safe
 * 
 * @author Amit Dwivedi
 *
 */
public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("abc");
        buffer.append("def").insert(3, "-").reverse();
        System.out.println(buffer);
    }
}
