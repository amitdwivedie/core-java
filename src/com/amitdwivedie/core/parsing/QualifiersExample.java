package com.amitdwivedie.core.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Amit Dwivedi
 *
 */
public class QualifiersExample {

    public static void main(String[] args) {
        System.out
                .println("*********************** Find Hexadecimal Number *******************");
        Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher("12 0x 0x12 0XdF 0xFGH 0XAdF");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        System.out
                .println("*********************** Find All files with proj1 *******************");
        pattern = Pattern.compile("proj1([^,])*");
        matcher = pattern
                .matcher("proj1,proj3.txt,proj1sch.txt,proj1.pdf,proj3.java,proj21.java,proj1.txt,proj1.java");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

        System.out
                .println("*********************** Find 10 digit phone number *******************");
        pattern = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d\\d\\d\\d");
        matcher = pattern
                .matcher("9876543210 987-6543210 98765432101 987A6543210 987906543210 987-6543210 987 6543210");

        System.out.println("Pattern - " + matcher.pattern());
        while (matcher.find()) {
            System.out.println("Matching value - " + matcher.group());
        }

    }
}
