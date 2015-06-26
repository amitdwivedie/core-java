package com.amitdwivedie.core.declartion;

/**
 * @author Amit DWivedi
 * 
 */
public enum Enums {

    SMALL(8), LARGE(10), EXTRALARGE(15) {
        public String getLid() {
            return "LID";
        }
    };

    private int ounce;

    Enums(int ounce) {
        this.ounce = ounce;
    }

    public int getOunce() {
        return ounce;
    }

    public String getLid() {
        return "lid";
    }
}

class Coffee {
    public static void main(String[] args) {
        for (Enums coffee : Enums.values()) {
            System.out.println("Coffee " + coffee);
            System.out.println("Ounce " + coffee.getOunce());
            System.out.println("Lid " + coffee.getLid());
        }
    }
}