package com.amitdwivedie.core.basic.i18n;

import java.util.*;

class LocaleTest {
    public static void main(String g[]) {
        Locale l = Locale.getDefault();
        System.out.println(l.getLanguage());
        System.out.println(l.getDisplayLanguage());
        System.out.println(l.getCountry());
        System.out.println(l.getDisplayCountry());

        Locale ll[] = Locale.getAvailableLocales();
        for (Locale l1 : ll)
            System.out.println(l1.getDisplayName());
    }
}
