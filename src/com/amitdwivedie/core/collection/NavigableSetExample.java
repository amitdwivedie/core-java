package com.amitdwivedie.core.collection;

import java.util.TreeSet;

/**
 * @author Amit Dwivedi
 *
 */
public class NavigableSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> times = new TreeSet<Integer>();
        times.add(1205);
        times.add(1515);
        times.add(1105);
        times.add(1635);
        times.add(1725);
        times.add(1840);
        times.add(1310);
        times.add(1355);
        times.add(1800);
        times.add(1745);
        times.add(1245);
        times.add(1405);
        times.add(1515);

        // By using java 5
        TreeSet<Integer> headSet = new TreeSet<Integer>();
        headSet = (TreeSet<Integer>) times.headSet(1600);
        System.out.println("HeadSet - " + headSet);
        System.out.println(headSet.last());

        TreeSet<Integer> tailSet = new TreeSet<Integer>();
        tailSet = (TreeSet<Integer>) times.tailSet(1800);
        System.out.println("TrailSet - " + tailSet);
        System.out.println(tailSet.first());

        // By using java 6
        System.out.println("Lower value than 1600 " + times.lower(1600));
        System.out.println("Higher value than 1800 " + times.higher(1800));

        System.out.println("Ceiling value - " + times.ceiling(1525));
        System.out.println("Floor value - " + times.floor(1810));

        System.out.println("TreeSet - " + times);
        System.out.println("TreeSet decending order- " + times.descendingSet());
    }
}
