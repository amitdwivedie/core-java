package com.amitdwivedie.core.basic.oops.POLYMORPHISM;

class PolyRemote {
    public void changeChannel() {
    }

    public void changeColor() {
    }

    public void changeVolume() {
    }
}

class Tv11 extends PolyRemote1 {
    public void changeChannel() {
        System.out.println("CHANNEL OF TV11 IS CHANGED");
    }

    public void changeColor() {
        System.out.println("COLOR OF TV11 IS CHANGED");
    }

    public void changeVolume() {
        System.out.println("VOLUME OF TV11 IS CHANGED");
    }

}

class Tv22 extends PolyRemote1 {
    public void changeChannel() {
        System.out.println("CHANNEL OF TV22 IS CHANGED");
    }

    public void changeColor() {
        System.out.println("COLOR OF TV22 IS CHANGED");
    }

    public void changeVolume() {
        System.out.println("VOLUME OF TV22 IS CHANGED");
    }

}

class Tv33 extends PolyRemote1 {
    public void changeChannel() {
        System.out.println("CHANNEL OF TV33 IS CHANGED");
    }

    public void changeColor() {
        System.out.println("COLOR OF TV33 IS CHANGED");
    }

    public void changeVolume() {
        System.out.println("VOLUME OF TV33 IS CHANGED");
    }

}

class PolyRemoteAssignAtRunTime {
    public static void main(String g[]) {
        PolyRemote1 pr = null;
        try {
            Class c = Class.forName(g[0]);
            pr = (PolyRemote1) c.newInstance();
            pr.changeChannel();
            pr.changeColor();
            pr.changeVolume();
        } catch (Exception e) {
        }

    }
}