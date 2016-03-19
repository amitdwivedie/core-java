package com.amitdwivedie.core.basic.collection;

import java.util.*;

class NameComp implements Comparator {
    public int compare(Object o1, Object o2) {
        Student sti = (Student) o1;
        Student sta = (Student) o2;

        // System.out.println(sti.name);
        // System.out.println(sta.name);

        if (sti.name.compareTo(sta.name) < 0)
            return -1;
        else if (sti.name.compareTo(sta.name) > 0)
            return 1;
        else
            return 0;
    }
}
