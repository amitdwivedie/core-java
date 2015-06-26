package com.amitdwivedie.core.dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Amit Dwivedi
 *
 */
public class LocaleExample {

    public static void main(String[] args) {
        Date date = new Date();
        Locale italy = new Locale("it", "IT");
        Locale brazil = new Locale("pt", "BR");
        Locale india = new Locale("en", "IN");

        Calendar calendar = Calendar.getInstance(italy);
        calendar.set(2010, 11, 13);
        System.out.println("Italy Calendar " + calendar.getTime());
        
        calendar = Calendar.getInstance(brazil);
        calendar.set(2010, 11, 13);
        System.out.println("Brazil Calendar " + calendar.getTime());
        
        calendar = Calendar.getInstance(india);
        calendar.set(2010, 11, 13);
        System.out.println("India Calendar " + calendar.getTime());
        
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, italy);
        System.out.println("Italy Date Format - " + dateFormat.format(date));
        
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, brazil);
        System.out.println("Brazil Date Format - " + dateFormat.format(date));
        
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, india);
        System.out.println("India Date Format - " + dateFormat.format(date));
    }
}
