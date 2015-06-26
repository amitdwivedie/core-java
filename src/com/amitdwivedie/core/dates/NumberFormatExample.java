package com.amitdwivedie.core.dates;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Amit Dwivedi
 *
 */
public class NumberFormatExample {

    public static void main(String[] args) {
        float number = 123.45679f;
        Locale locale = new Locale("fr");
        
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(locale);
        numberFormats[2] = NumberFormat.getCurrencyInstance();
        numberFormats[3] = NumberFormat.getCurrencyInstance(locale);
        
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(number));
        }
    }
}
