package com.amitdwivedie.core.inner.classes;

public interface NestedClass {

    void show();
    
    /*
     * This class will be treated as static nested class.
     */
    class Test{
        public void testNestedClass(){
            System.out.println("Nested class inside interface");
        }
    }
}

class NestedClassTest{
    public static void main(String[] args) {
        NestedClass.Test test = new NestedClass.Test();
        test.testNestedClass();
    }
}
