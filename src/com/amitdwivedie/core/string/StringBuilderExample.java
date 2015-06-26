package com.amitdwivedie.core.string;

/**
 * @author Amit Dwivedi
 *
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("amit");
        builder.append(" ");
        builder.append("dwivedi");
        
        System.out.println(builder);
        System.out.println(builder.indexOf(" "));
        System.out.println(builder.insert(4, "-"));
        System.out.println(builder.reverse());
    }
}
