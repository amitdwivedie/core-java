package com.amitdwivedie.core.basic.oops.GEN;

class UseOfConstructorForEmp {
    String name;
    int age, sal, id;

    UseOfConstructorForEmp() {
        System.out.println("DEFAULT CONSTRUCTOR");
    }

    UseOfConstructorForEmp(String n, int a, int s, int i) {
        name = n;
        age = a;
        sal = s;
        id = i;
    }

    void showDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
        System.out.println(id);

    }

    void updateValue(int a, int s) {
        age = a;
        sal = s;
    }

    void doTask() {
        System.out.println("task is completed");
    }

    public static void main(String g[]) {
        System.out.println("main is started");

        System.out.println("*** creation of e1 object ***");
        UseOfConstructorForEmp e1 = new UseOfConstructorForEmp("sonu", 15,
                15000, 100);

        System.out.println("*** creation of e2 object ***");
        UseOfConstructorForEmp e2 = new UseOfConstructorForEmp("monu", 20,
                20000, 101);

        System.out.println("*** Details of e1 ***");
        e1.showDetails();

        System.out.println("*** Details of e2 ***");
        e2.showDetails();

        System.out.println("*** updating e1 ***");
        e1.updateValue(25, 10000);

        System.out.println("*** Details of e1 after updatation ***");
        e1.showDetails();
        e1.doTask();

        System.out.println("*** updating e2 ***");
        e2.updateValue(30, 15000);

        System.out.println("*** Details of e2 after updatation ***");
        e2.showDetails();
        e2.doTask();

        System.out.println("main is completed");
    }

}