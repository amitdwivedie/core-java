package com.amitdwivedie.core.basic.oops.Interface;

interface I001 {
    int i = 10;

    void disp();

}

interface I002 {
    int i = 30;
    int j = 20;

    void show();

    void disp();
}

interface I003 extends I001, I002 {
    int k = 40;

    void nat();
}

class InterfaceTest2 implements I003 {
    public void show() {
        System.out.println("show");
    }

    public void disp() {
        System.out.println("disp");
    }

    public void nat() {
        System.out.println("What a beautifull day Today !!!");
    }

    public static void main(String g[]) {
        // System.out.println(i); //error

        System.out.println(I001.i);
        System.out.println(I002.i);
        System.out.println(j);
        System.out.println(k);

        // I001 x=new InterfaceTest2();
        // I002 x=new InterfaceTest2();
        I003 x = new InterfaceTest2();
        x.show();
        x.disp();
        x.nat();
    }
}
