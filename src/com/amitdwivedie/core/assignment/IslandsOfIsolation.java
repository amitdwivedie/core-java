package com.amitdwivedie.core.assignment;

/**
 * An instance variable that has a reference of a instance variable of same
 * class. if all references of these two objects are removed. We have no way to
 * access these objects.this scenario is called islands of isolation. Garbage
 * collection delete such objects too.
 * 
 * @author Amit Dwivedi
 * 
 */
public class IslandsOfIsolation {

    IslandsOfIsolation isolation;

    public static void main(String[] args) {

        IslandsOfIsolation isolation1 = new IslandsOfIsolation();
        IslandsOfIsolation isolation2 = new IslandsOfIsolation();
        IslandsOfIsolation isolation3 = new IslandsOfIsolation();

        isolation1.isolation = isolation2;
        isolation2.isolation = isolation3;
        isolation3.isolation = isolation1;

        isolation1 = null;
        isolation2 = null;
        isolation3 = null;

    }
}
