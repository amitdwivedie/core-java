package com.amitdwivedie.core.basic.i18n;

import java.text.*;
import java.util.*;

class FormatTest {
    public static void main(String g[]) {
        Locale l = new Locale(g[0], g[1]);
        NumberFormat nfn = NumberFormat.getNumberInstance(l);
        String num = nfn.format(123456.78);
        System.out.println(num);

        NumberFormat nfc = NumberFormat.getCurrencyInstance(l);
        String numc = nfc.format(123456.789);
        System.out.println(numc);

        NumberFormat nfp = NumberFormat.getPercentInstance(l);
        String nump = nfp.format(123456.7890);
        System.out.println(nump);
    }
}
