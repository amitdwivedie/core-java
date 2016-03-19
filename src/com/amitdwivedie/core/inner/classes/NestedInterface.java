package com.amitdwivedie.core.inner.classes;

/**
 * @author amit
 *
 */
public interface NestedInterface {
    
    void show();
    public interface NestedInterface1{
        void show();
        void display();
    }

}

class  NestedInterfaceTest implements NestedInterface, NestedInterface.NestedInterface1{

    @Override
    public void show() {
        System.out.println("show");
        
    }

    @Override
    public void display() {
        System.out.println("display");
        
    }
    
}
