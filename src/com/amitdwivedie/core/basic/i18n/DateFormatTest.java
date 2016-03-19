package com.amitdwivedie.core.basic.i18n;

import java.text.*;
import java.util.*;

class DateFormatTest {
    public static void main(String g[]) {
        Locale l = new Locale(g[0], g[1]);

        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, l);
        String num = df.format(new Date());
        System.out.println(num);

        DateFormat tf = DateFormat.getTimeInstance(DateFormat.SHORT, l);
        String numt = tf.format(new Date());
        System.out.println(numt);
    }
}
