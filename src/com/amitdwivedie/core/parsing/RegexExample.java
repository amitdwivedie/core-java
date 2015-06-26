package com.amitdwivedie.core.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Amit Dwivedi
 *
 */
public class RegexExample {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("abaaaba");

        while (matcher.find()) {
            System.out.println("Matching index - " + matcher.start());
            System.out.println("Matched Result - " + matcher.toMatchResult());
            System.out.println("Pattern - " + matcher.pattern());
        }

    }
}
