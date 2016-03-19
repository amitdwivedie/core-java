package com.amitdwivedie.core.basic.oops.Interface;

interface I01 {
    void show();
}

interface I02 {
    void show();

    void disp();

}

class InterfaceTest1 implements I01, I02 {
    public void show() {
        System.out.println("Show of InterfaceTest1");
    }

    public void disp() {
        System.out.println("disp of InterfaceTest1");
    }

    public static void main(String g[]) {
        // I01 i=new InterfaceTest1();// give error because disp is not in there

        I02 i1 = new InterfaceTest1();
        i1.show();
        i1.disp();

        InterfaceTest1 a = new InterfaceTest1();
        a.show();
        a.disp();
    }

}