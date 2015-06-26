package com.amitdwivedie.core.string;

/**
 * @author Amit Dwivedi
 *
 */
public class StringExample {

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);

        str.concat("def");
        System.out.println(str);

        String string = new String("new");
        System.out.println(string);
        System.out.println(string.concat("-value"));

        String test = "0123456789";
        System.out.println(test.charAt(7));
        System.out.println(test.substring(1, 4));
        System.out.println(test.indexOf('8'));
        System.out.println(test.replace('0', '-'));
        System.out.println(test.endsWith("9"));
    }
}
