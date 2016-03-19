package com.amitdwivedie.core.basic.oops.Association.Aggregation;

class car {
    Engine engine;
    MusicSystem musicSystem;

    car() {
        engine = new Engine(); // composition
        System.out.println("car");
    }

    void show() {
        System.out.println("show");
        musicSystem = new MusicSystem(); // Aggregation
    }

    public static void main(String g[]) {
        car c = new car();
        c.show();
    }

}

class Engine {
    Engine() {
        System.out.println("Engine");
    }
}

class MusicSystem {
    MusicSystem() {
        System.out.println("MusicSystem");
    }
}