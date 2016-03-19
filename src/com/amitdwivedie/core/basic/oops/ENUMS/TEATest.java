package com.amitdwivedie.core.basic.oops.ENUMS;

enum TEA {
    BIG(8), HUGE(10), OVERWHELMING(16) { // start a code that defines a body of
                                         // constant

        public String getCode() // override the method define in TEA
        {
            System.out.println("BODY OF OVERWHELMING");
            return "A";
        }
    };

    TEA(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
        return ounces;
    }

    public String getCode() {
        System.out.println("BODY OF TEA");
        return "B";
    }
}

public class TEATest {
    TEA size;

    public static void main(String g[]) {
        TEATest t = new TEATest();
        t.size = TEA.OVERWHELMING;

        System.out.println(t.size.getCode());

        t.size = TEA.HUGE;
        System.out.println(t.size.getCode());

        for (TEA tea : TEA.values()) {
            System.out.println(tea);
            System.out.println(tea.ordinal());
        }

    }
}
