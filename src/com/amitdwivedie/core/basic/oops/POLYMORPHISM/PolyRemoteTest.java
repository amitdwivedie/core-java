package com.amitdwivedie.core.basic.oops.POLYMORPHISM;

class PolyRemote1 {
    public void changeChannel() {
    }

    public void changeColor() {
    }

    public void changeVolume() {
    }
}

class Tv1 extends PolyRemote {
    public void changeChannel() {
        System.out.println("CHANNEL OF TV1 IS CHANGED");
    }

    public void changeColor() {
        System.out.println("COLOR OF TV1 IS CHANGED");
    }

    public void changeVolume() {
        System.out.println("VOLUME OF TV1 IS CHANGED");
    }

}

class Tv2 extends PolyRemote {
    public void changeChannel() {
        System.out.println("CHANNEL OF TV2 IS CHANGED");
    }

    public void changeColor() {
        System.out.println("COLOR OF TV2 IS CHANGED");
    }

    public void changeVolume() {
        System.out.println("VOLUME OF TV2 IS CHANGED");
    }

}

class Tv3 extends PolyRemote {
    public void changeChannel() {
        System.out.println("CHANNEL OF TV3 IS CHANGED");
    }

    public void changeColor() {
        System.out.println("COLOR OF TV3 IS CHANGED");
    }

    public void changeVolume() {
        System.out.println("VOLUME OF TV3 IS CHANGED");
    }

}

class PolyRemoteTest {
    public static void main(String g[]) {
        PolyRemote pr = new Tv1();
        pr.changeChannel();
        pr.changeColor();
        pr.changeVolume();

        pr = new Tv2();
        pr.changeChannel();
        pr.changeColor();
        pr.changeVolume();

        pr = new Tv3();
        pr.changeChannel();
        pr.changeColor();
        pr.changeVolume();

    }
}