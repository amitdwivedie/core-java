package com.amitdwivedie.core.dates;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Amit Dwivedi
 *
 */
public class CalendarExample {

    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        System.out.println("Date - " + calendar.getTime());
        System.out.println("First Day of a week - " + calendar.getFirstDayOfWeek());
        System.out.println("Sunday - " + Calendar.SUNDAY);
        System.out.println("WeeksInWeekYear - " + calendar.getWeeksInWeekYear());
        System.out.println("WeekYear - " + calendar.getWeekYear());
        
        calendar.add(Calendar.MONTH, 1);
        System.out.println("Added one month - " + calendar.getTime());
        
        calendar.add(Calendar.DAY_OF_WEEK, 1);
        System.out.println("Day added in week - " + calendar.getTime());
        
        calendar.roll(Calendar.MONTH, 9);
        System.out.println("Month added - " + calendar.getTime());
    }
}
