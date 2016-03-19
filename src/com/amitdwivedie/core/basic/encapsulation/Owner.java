package com.amitdwivedie.core.basic.encapsulation;

class Owner {
    public static void main(String k[]) {
        Visitor v = new Visitor();
        Dog d = new Dog();

        int Knock = Integer.parseInt(k[0]);
        v.setKnock(Knock);
        //d.setBark(v.getKnock("Knock"));
        int SayBark = d.getBark();
        for (int i = 0; i < SayBark; i++) {
            System.out.println("WOF");
        }
    }
}