package com.amitdwivedie.core.collection;

/**
 * @author Amit Dwivedi
 *
 */
public class EqualTest {

    public static void main(String[] args) {
        Eqals eqals1 = new Eqals(10);
        Eqals eqals2 = new Eqals(10);
        if (eqals1.equals(eqals2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    }
}

class Eqals {

    private int equalsVal;

    public Eqals(int equalsVal) {
        this.equalsVal = equalsVal;
    }

    public int getEqualsVal() {
        return equalsVal;
    }

    public boolean equals(Object object) {
        if ((object instanceof Eqals)
                && (((Eqals) object).getEqualsVal() == this.equalsVal)) {
            return true;
        }
        return false;
    }
}
