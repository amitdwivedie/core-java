package com.amitdwivedie.core.basic.oops.nested.Interface;

class Outer {
    interface In {
        void disp();

    }
    // }

    static class Imp implements Outer.In {
        public void disp() {
            System.out.println("DISP OF IMP");
        }

        public static void main(String g[]) {
            Imp ref = new Imp();
            ref.disp();
        }
    }

    interface I1 {
        void show();
    }

    interface I2 {
        void disp();
    }
    // }

    static class Imp1 implements Outer.I1 {
        public void show() {
            System.out.println("SHOW OF IMP1");
        }

        public static void main(String g[]) {
            Imp1 ref1 = new Imp1();
            ref1.show();
        }
    }

    static class Imp2 implements Outer.I1, Outer.I2 {
        public void disp() {
            System.out.println("DISP OF IMP2");
        }

        public void show() {
            System.out.println("SHOW OF IMP2");
        }

        public static void main(String g[]) {
            Imp2 ref2 = new Imp2();
            ref2.disp();
            ref2.show();
        }
    }
}