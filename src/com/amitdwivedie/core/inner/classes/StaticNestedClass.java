package com.amitdwivedie.core.inner.classes;


/**
 * @author Amit Dwivedi
 *
 */
public class StaticNestedClass {

    public static void main(String[] args) {
        StaticOuter.StaticInner inner = new StaticOuter.StaticInner();
        inner.innerMethod();
        inner.innerStaticMethod();
        
        StaticOuter outer = new StaticOuter();
        StaticOuter.show();
        outer.display();
    }
}

class StaticOuter {
    int x = 10;

    static void show() {
        System.out.println("Static show method of Outer class.");
    }

    void display() {
        System.out.println("NonStatic display method of Outer class.");
    }

    static class StaticInner {
        int y = 10;
        
        public void innerMethod(){
            show();
            StaticOuter outer1 = new StaticOuter();
            outer1.display();
            System.out.println(outer1.x);
            System.out.println(y);
        }
        
        public void innerStaticMethod(){
            show();
            System.out.println(y);
        }
    }
}
