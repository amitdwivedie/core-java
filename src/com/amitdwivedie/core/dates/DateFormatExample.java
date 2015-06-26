package com.amitdwivedie.core.dates;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author Amit Dwivedi
 *
 */
public class DateFormatExample {

    public static void main(String[] args) {
        Date date = new Date();

        DateFormat[] dateFormat = new DateFormat[7];
        dateFormat[0] = DateFormat.getInstance();
        dateFormat[1] = DateFormat.getDateInstance();
        dateFormat[2] = DateFormat.getDateTimeInstance();
        dateFormat[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormat[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormat[6] = DateFormat.getDateInstance(DateFormat.FULL);
        
        for (DateFormat df : dateFormat) {
            System.out.println(df.format(date));
        }
        
        
        /*DateFormat format = DateFormat.getDateTimeInstance();
        try {
            System.out.println(format.parse(date.toString()));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }
}
