package com.amitdwivedie.core.inner.classes;

import com.amitdwivedie.core.inner.classes.Outer.Inner;

/**
 * @author Amit Dwivedi
 *
 */
public class InnerExample {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerStuff();
        outer.show();
        outer.display();

        Inner inner = outer.new Inner();
        inner.innerStuff();
        inner.accessOuterInstance();
    }

}

class Outer {
    private int i = 10;

    public void outerStuff() {
        System.out.println("Value of private varible i - " + i);
    }

    class Inner {
        private int i = 20;
        private int j = 30;

        public void innerStuff() {
            System.out.println("Value of private outer varible i - "
                    + Outer.this.i);
            System.out.println("Value of private inner varible i - " + i);
            System.out.println("Value of private inner varible j - " + j);
        }

        public void accessOuterInstance() {
            System.out.println("Inner class Instance - " + this);
            System.out.println("Outer class Instance inside inner - "
                    + Outer.this);
        }
    }

    public void show() {
        Inner inner = new Inner();
        inner.innerStuff();
    }

    public void display() {
        Inner inner = new Inner();
        System.out
                .println("Direct Access of private variables of inner class in outer class "
                        + inner.i + " - " + inner.j);
    }
}
