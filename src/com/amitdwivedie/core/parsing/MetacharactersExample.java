package com.amitdwivedie.core.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Amit Dwivedi
 *
 */
public class MetacharactersExample {

    public static void main(String[] args) {

        System.out.println("**************Regex for Digit*******************");
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("ab45a7a8aba109");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching index - " + matcher.start());
            System.out.println("Matched Result - " + matcher.toMatchResult());
        }

        System.out.println("**************Regex for Whitespace*******************");
        pattern = Pattern.compile("\\s");
        matcher = pattern.matcher("aba a aba bd");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching index - " + matcher.start());
            System.out.println("Matched Result - " + matcher.toMatchResult());
        }

        System.out.println("**************Regex for Word character*******************");
        pattern = Pattern.compile("\\w");
        matcher = pattern.matcher("ab12 a902 Abd_a 90aba");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching index - " + matcher.start());
            System.out.println("Matched Result - " + matcher.toMatchResult());
        }
        
        System.out.println("**************Regex for [] *******************");
        pattern = Pattern.compile("[ab0]");
        matcher = pattern.matcher("ab12 a902 Abd_a 90aba");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching index - " + matcher.start());
            System.out.println("Matched Result - " + matcher.toMatchResult());
        }
        
        System.out.println("**************Regex for [] with - *******************");
        pattern = Pattern.compile("[a-c0-9]");
        matcher = pattern.matcher("ab12 a902 Abd_a 90aba");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching index - " + matcher.start());
            System.out.println("Matched Result - " + matcher.toMatchResult());
        }

        
        System.out.println("**************Regex for [] with ^ *******************");
        pattern = Pattern.compile("[^a-c0-9]");
        matcher = pattern.matcher("ab12 a902 Abd_a 90aba");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching index - " + matcher.start());
            System.out.println("Matched Result - " + matcher.toMatchResult());
        }
    }
}
