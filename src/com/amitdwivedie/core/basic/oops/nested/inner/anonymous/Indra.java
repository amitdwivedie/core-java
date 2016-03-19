package com.amitdwivedie.core.basic.oops.nested.inner.anonymous;

interface Ij {
    void tiger();
}

class Indra {
    Ij ij = new Ij() {
        public void tiger() {
            System.out.println("Indra the Tiger");
        }
    };

    void show() {
        System.out.println("Show");
    }

    void disp(Indra a) {
        a.show();
    }

    public static void main(String g[]) {
        Indra a = new Indra();
        a.show();
        a.ij.tiger();

        a.disp(new Indra() {
            void show() {
                System.out.println("INRDA");
            }
        });
    }
}
