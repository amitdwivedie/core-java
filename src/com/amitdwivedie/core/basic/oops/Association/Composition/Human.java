package com.amitdwivedie.core.basic.oops.Association.Composition;

class Human {
    Brain brain;
    Heart heart;

    Human() {
        brain = new Brain();
        heart = new Heart();
        System.out.println("Human");
    }

    public static void main(String g[]) {
        Human h = new Human();
    }
}
