package com.amitdwivedie.core.basic.oops.Array;

class ReferanceType {
    int i;

    ReferanceType(int i) {
        this.i = i;

        // this.i=i; //all are printed zero

    }

    void print() {
        System.out.println(i);
    }

    public static void main(String kk[]) {
        ReferanceType a[] = new ReferanceType[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = new ReferanceType(7);
            a[i].print();
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = new ReferanceType(i);
            a[i].print();
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = new ReferanceType(i + 10);
            a[i].print();
        }
    }
}
