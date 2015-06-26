package com.amitdwivedie.core.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author Amit Dwivedi
 *
 */
public class ReluctantQualifiers {

    public static void main(String[] args) {
        System.out
                .println("*********************** *==> zero or more  *******************");
        Pattern pattern = Pattern.compile(".*xx");
        Matcher matcher = pattern.matcher("yyxxxyxx ysxx");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        System.out
                .println("*********************** *?==> zero or more  *******************");
        pattern = Pattern.compile(".*?xx");
        matcher = pattern.matcher("yyxxxyxx");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        System.out
                .println("*********************** +?==> one or more *******************");
        pattern = Pattern.compile(".+?xx");
        matcher = pattern.matcher("yyxxxyxx");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        System.out
                .println("*********************** ?==> zero or one *******************");
        pattern = Pattern.compile(".??xx");
        matcher = pattern.matcher("yyxxxyxx");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        pattern = Pattern.compile("a?");
        matcher = pattern.matcher("baba");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

    }
}
