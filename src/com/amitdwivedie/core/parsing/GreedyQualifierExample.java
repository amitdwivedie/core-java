package com.amitdwivedie.core.parsing;

/**
 * @author Amit Dwivedi
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyQualifierExample {

    public static void main(String[] args) {
        System.out
                .println("*********************** *==> zero or more  *******************");
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern
                .matcher("aaaabc b aaaccbcsabas acjs abdw ssb");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        System.out
                .println("*********************** +==> one or more *******************");
        pattern = Pattern.compile("a+b");
        matcher = pattern.matcher("aaaabc b aaaccbcsabas acjs abdw ssb");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        System.out
                .println("*********************** ?==> zero or one *******************");
        pattern = Pattern.compile("a?b");
        matcher = pattern.matcher("aaaabc b aaaccbcsabas acjs abdw ssb ab aab");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        System.out
                .println("*********************** Predefined dot *******************");
        pattern = Pattern.compile("a.c");
        matcher = pattern.matcher("ac abc abbc a c asbdsc a4c");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }
    }
}
