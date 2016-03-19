package com.amitdwivedie.core.basic.collection;

import java.util.*;

class RollComp implements Comparator {
    public int compare(Object o1, Object o2) {
        Student sti = (Student) o1;
        Student sta = (Student) o2;

        if (sti.roll < sta.roll)
            return -1;
        else if (sti.roll > sta.roll)
            return 1;
        else
            return 0;
    }
}