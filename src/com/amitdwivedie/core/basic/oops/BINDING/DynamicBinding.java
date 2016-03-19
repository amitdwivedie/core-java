package com.amitdwivedie.core.basic.oops.BINDING;

class A11 {

    void show() {
        System.out.println("show of A11");
    }

}

class B11 extends A11 {
    void show() {
        System.out.println("show of B11");
    }

}

class DynamicBinding {
    public static void main(String g[]) {
        A11 a1 = new B11();
        a1.show();

    }
}