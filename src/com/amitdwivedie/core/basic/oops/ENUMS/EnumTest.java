package com.amitdwivedie.core.basic.oops.ENUMS;

enum Animal {
    DOG("woof"), CAT("meow "), FISH("burble");
    String sound;

    Animal(String s) {
        this.sound = s;
    }
}

class EnumTest {
    static Animal a;

    public static void main(String g[]) {
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}
