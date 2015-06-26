package com.amitdwivedie.core.operator;

/**
 * @author Amit Dwivedi
 *
 */
import java.util.Date;

/**
 * Two reference variable refer to same object then references will be ==
 * 
 * @author amit
 * 
 */
public class ReferenceCompare {

    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date();
        Date date2 = date;

        System.out.println(date == date1);
        System.out.println(date == date2);
    }
}
