package com.amitdwivedie.core.basic.oops.nested.inner.local;

class Outer1 {
    Outer1() {
        class In11 {
            void disp() {
                System.out.println("INNER CLASS OF CONSTRUCTOR");
            }
        }
        In11 i = new In11();
        i.disp();

    }

    void show() {
        class In22 {
            void disp1() {
                System.out.println("INNER CLASS OF SHOW METHOD");
            }
        }
        In22 i1 = new In22();
        i1.disp1();

    }

    {
        class In33 {
            void disp2() {
                System.out.println("INNER CLASS OF INIT METHOD");
            }
        }
        In33 i2 = new In33();
        i2.disp2();
    }

    public static void main(String gh[]) {
        Outer1 o = new Outer1();
        o.show();
        // a.disp1();

        // ac.disp1();
    }
}
