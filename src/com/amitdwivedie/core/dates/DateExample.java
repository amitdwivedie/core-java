package com.amitdwivedie.core.dates;

import java.util.Date;

/**
 * @author Amit Dwivedi
 *
 */
public class DateExample {

    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println("Date - " + date);
        System.out.println("Time - " + date.getTime());
        System.out.println("Seconds - " + date.getSeconds());
        System.out.println("Minutes - " + date.getMinutes());
        System.out.println("Hours - " + date.getHours());
        System.out.println("Day - " + date.getDay());
        System.out.println("Year - " + date.getYear());
        System.out.println("Date - " + date.getDate());
        
        date.setTime(date.getTime() + 3600000);
        System.out.println("Date - " + date);
    }
}
