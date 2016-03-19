package com.amitdwivedie.core.basic.oops.ENUMS;

enum CoffeeSize {
    BIG(8), HUGE(10), OVERWHELMING(16);
    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
        return ounces;
    }
}

class Copffee {
    CoffeeSize size;

    public static void main(String g[]) {
        Copffee drinks = new Copffee();
        drinks.size = CoffeeSize.BIG;

        Copffee drinks1 = new Copffee();
        drinks1.size = CoffeeSize.OVERWHELMING;

        System.out.println(drinks.size.getOunces());
        for (CoffeeSize cs : CoffeeSize.values()) {
            System.out.println(cs + " " + cs.getOunces());
        }
    }
}
